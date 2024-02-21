/**
 * 
 */

/**
 * @author Administrator
 *
 */
package com.fmt.utils.HQ.signer;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.Security;
import java.security.Signature;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import com.fmt.utils.HQ.signer.Base64Utils;


public class SignatureVerifier {
    protected static final String X509_CERTIFICATE_TYPE = "X.509";
    protected static final String CERT_CHAIN_ENCODING = "PkiPath";
    protected static final String DIGITAL_SIGNATURE_ALGORITHM_NAME = "SHA1withRSA";
    protected static final String CERT_CHAIN_VALIDATION_ALGORITHM = "PKIX";

    protected X509Certificate[] rootCerts;
    protected X509Certificate[] trustedCerts;
    protected HashMap crlMap;

    public void verifyFileSignsture(byte[] fileData, String signature, String certChain, BigInteger[] certSerialNumber) throws Exception{
        //validate signature
        if(signature == null || signature.length() == 0) {
        	throw new Exception( "Hồ sơ không có chữ ký điện tử");
        } 
        verifyFileSignature(certSerialNumber, fileData, signature, certChain);
    }
    public void verifyFileSignature(
                        BigInteger[] certSerialNumber, 
                        byte[] doc, 
                        String signatureBase64Encoded,
                        String certChainBase64Encoded) throws Exception {
                            
        byte[] signature = Base64Utils.base64Decode(signatureBase64Encoded);
        CertPath certPath = loadCertPathFromBase64String(certChainBase64Encoded);
        List certsInChain = certPath.getCertificates();
        X509Certificate[] certChain = (X509Certificate[])certsInChain.toArray(new X509Certificate[0]);
        X509Certificate cert = certChain[0];

        //Verifies given digital singature
        if(!verifyDocumentSignature(doc, cert, signature))
        {
        	throw new Exception("Chữ ký điện tử không đúng");
        }
        verifyCertificationChain(new Date(), certSerialNumber, certChain);
    }
    /**
     * Verifies given digital singature. Checks if given signature is obtained by
     * signing given document with the private key, corresponing to given public key.
     */
    public boolean verifyDocumentSignature(byte[] aDocument, PublicKey aPublicKey, byte[] aSignature) throws GeneralSecurityException {
        Signature signatureAlgorithm =  Signature.getInstance(DIGITAL_SIGNATURE_ALGORITHM_NAME);
        signatureAlgorithm.initVerify(aPublicKey);
        signatureAlgorithm.update(aDocument);
        boolean valid = signatureAlgorithm.verify(aSignature);
        return valid;
    }

    /**
     * Verifies given digital singature. Checks if given signature is obtained by
     * signing given document with the private key, corresponing to given certificate.
     */
    public boolean verifyDocumentSignature(byte[] aDocument,  X509Certificate aCertificate, byte[] aSignature)  throws GeneralSecurityException {
        PublicKey publicKey = aCertificate.getPublicKey();
        boolean valid = verifyDocumentSignature(aDocument, publicKey, aSignature);
        return valid;
    }
    public boolean checkRevokedFromCrlFile(X509Certificate cert) throws CertificateException, FileNotFoundException, CRLException
    {
        String issuerDN = cert.getIssuerDN().getName();
//      System.out.println("issuerDN 1: "+issuerDN);
        X509CRL crl = (X509CRL) crlMap.get(issuerDN);
        if(null == crl) {
          String[] issuerDNList = issuerDN.split(",");
          issuerDN="";
          int a=1;
          int b= issuerDNList.length;
          for(int i =0;i<b;i++){
              if(a==b){
                issuerDN+=issuerDNList[0];
              }
              else{
                issuerDN+=issuerDNList[b-a]+", ";
              }
              a++;
          }
//        System.out.println("issuerDN 2: "+issuerDN);    
          crl = (X509CRL) crlMap.get(issuerDN);
          if(null == crl) {
            return false;
          }
        }
        return (crl.isRevoked(cert));
    }

    public void verifyCertificationChain(Date dValidity, BigInteger[] certSerialNumber, X509Certificate[] certChain) throws Exception 
                                                                            {
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        CertPath certPath;
        X509Certificate cert = null;
        for (int i = 0; i < certSerialNumber.length; i++) {
            if(certSerialNumber[i].equals(certChain[0].getSerialNumber())) {
                cert = certChain[0];
                break;
            }
        }
        if (cert == null) {          
        	throw new Exception("Chứng thư số chưa được đăng ký với cơ quan Thuế");
        }
        try {
             cert.checkValidity(dValidity);
        }catch(CertificateExpiredException  ex) {
        	throw new Exception( "Chứng thư số đã hết hạn");
        }catch(CertificateNotYetValidException ex) {
        	throw new Exception("Chứng thư số chưa có hiệu lực");
        }
        // 20140925: Doanh-TCT bao bo
        /*if(checkRevokedFromCrlFile(cert)) {
        	throw new Exception( "Chứng thư số đã bị thu hồi");
        }*/

        if (certChain.length < 2) {
            verifyCertificate(cert);
            return;
        }
        
        CertificateFactory certFactory = CertificateFactory.getInstance(X509_CERTIFICATE_TYPE);
        certPath =  certFactory.generateCertPath(Arrays.asList(certChain));
        try {
            // Create a set of trust anchors from given trusted root CA certificates
            HashSet trustAnchors = new HashSet();
            for (int i = 0; i < rootCerts.length; i++) {
                TrustAnchor trustAnchor = new TrustAnchor(rootCerts[i], null);
                trustAnchors.add(trustAnchor);
            }
    
            // Create a certification chain validator and a set of parameters for it
            PKIXParameters certPathValidatorParams = new PKIXParameters(trustAnchors);
            certPathValidatorParams.setRevocationEnabled(false);
            CertPathValidator chainValidator =  CertPathValidator.getInstance(CertPathValidator.getDefaultType(), new org.bouncycastle.jce.provider.BouncyCastleProvider());
            CertPath certChainForValidation;
            // Remove the root CA certificate from the end of the chain. This is required
            // by the validation algorithm because by convention the trust anchor
            // certificates should not be a part of the chain that is validated

            certChainForValidation = removeLastCertFromCertChain(certPath);
            // Execute the certification chain validation
          try{
              chainValidator.validate(certChainForValidation, certPathValidatorParams);
          } catch(CertPathValidatorException certPathEx) {
            certPathEx.printStackTrace();
          }

        }catch (GeneralSecurityException ex) {
            ex.printStackTrace();
            throw new Exception( "Chứng thư số không hợp pháp");
        }
    }
    public void verifyCertificate(X509Certificate aCertificate) throws Exception{
        // Check if the certificate is signed by some of the given trusted certificates
        for (int i = 0; i < trustedCerts.length; i++) {
            X509Certificate trustedCert = trustedCerts[i];
            try {
                aCertificate.verify(trustedCert.getPublicKey());
                return;
                // Found parent certificate. Certificate is verified to be valid
            }
            catch (GeneralSecurityException ex) {
                // Certificate is not signed by current trustedCert. Try the next one
            }
        }

        throw new Exception("Chứng thư số không hợp pháp");
    }

    /**
     * Removes the last certificate from given certification chain.
     * @return given cert chain without the last certificate in it.
     */
    private CertPath removeLastCertFromCertChain(CertPath aCertChain) throws CertificateException {
        List certs = aCertChain.getCertificates();
        int certsCount = certs.size();
        List certsWithoutLast = certs.subList(0, certsCount-1);
        CertificateFactory cf = CertificateFactory.getInstance(X509_CERTIFICATE_TYPE);
        CertPath certChainWithoutLastCert = cf.generateCertPath(certsWithoutLast);
        return certChainWithoutLastCert;
    }

    /**
     * Loads a certification chain from given Base64-encoded string, containing
     * ASN.1 DER formatted chain, stored with PkiPath encoding.
     */
    public static CertPath loadCertPathFromBase64String(String aCertChainBase64Encoded) throws CertificateException, IOException {
        byte[] certChainEncoded = Base64Utils.base64Decode(aCertChainBase64Encoded);
        CertificateFactory cf = CertificateFactory.getInstance(X509_CERTIFICATE_TYPE);
        InputStream certChainStream = new ByteArrayInputStream(certChainEncoded);
        CertPath certPath;
        try {
            certPath = cf.generateCertPath(certChainStream, CERT_CHAIN_ENCODING);
        } finally {
            certChainStream.close();
        }
        return certPath;
    }
    /**
     * Loads X.509 certificate from DER-encoded binary stream.
     */
    public static X509Certificate loadX509CertificateFromStream(InputStream aCertStream) throws CertificateException {
        CertificateFactory cf = CertificateFactory.getInstance(X509_CERTIFICATE_TYPE);
        X509Certificate cert = (X509Certificate)cf.generateCertificate(aCertStream);
        return cert;
    }

    public static X509Certificate[] getCertificateList(String certDirPath) throws IOException, GeneralSecurityException {

        // Get a list of all files in the given directory
        File dir = new File(certDirPath);
        File[] fList = dir.listFiles();
        int count = fList.length;
        File rootCertFile;
        InputStream certStream;
        ArrayList certArr = new ArrayList();
        
        for(int i = 0; i < count; ++i) {
           rootCertFile = fList[i];
           if(!rootCertFile.isDirectory()) {
               certStream = new FileInputStream(rootCertFile);
               try {
                   X509Certificate trustedCertificate =  loadX509CertificateFromStream(certStream);
                   certArr.add(trustedCertificate);
               } catch (CertificateException certEx) {
                 certEx.printStackTrace();
               } finally {
                   certStream.close();
               }
           }
       }
       return (X509Certificate[])certArr.toArray(new X509Certificate[0]);
    }
       
     /**
      * Loads X.509 certificate from DER-encoded binary file (.CER file).
      */
     public X509Certificate loadX509CertificateFromCERFile(String aFileName)  throws GeneralSecurityException, IOException {
         FileInputStream fis = new FileInputStream(aFileName);
         X509Certificate cert = null;
         try {
             cert = loadX509CertificateFromStream(fis);
         } finally {
             fis.close();
         }
         return cert;
     }
    public void setTrustedCerts(X509Certificate[] trustedCerts) {
      this.trustedCerts = trustedCerts;
    }
  
    public void setRootCerts(X509Certificate[] rootCerts) {
      this.rootCerts = rootCerts;
    }

    public void setCrlMap(HashMap crlMap) {
        this.crlMap = crlMap;
    }
}