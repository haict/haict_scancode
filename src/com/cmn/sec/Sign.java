package com.cmn.sec;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.keyinfo.X509IssuerSerial;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.cmn.Constants;
import com.fmt.utils.HQ.signer.Base64Utils;

public abstract class Sign implements ISign {
	private static final String CHARSET_TYPE = "UTF-8";
	private PublicKey publicKey;
	private PrivateKey privateKey;
	private Certificate[] certChain;
	protected SignParameter param;
	protected final XMLSignatureFactory signatureFactory;
	protected final KeyInfoFactory keyInfoFactory;
	
	@SuppressWarnings("restriction")
	public Sign() throws Exception {
		param = new SignParameter(getConfigFilePath(),"");
		initPrivateKeyAndCertificate();
		signatureFactory = XMLSignatureFactory.getInstance("DOM",
				new org.jcp.xml.dsig.internal.dom.XMLDSigRI());
		keyInfoFactory = signatureFactory.getKeyInfoFactory();
	}

	private void initPrivateKeyAndCertificate() throws Exception {
		KeyStore keyStore = KeyStore.getInstance("pkcs12");
//		InputStream is = getClass().getClassLoader().getResourceAsStream(param.getPrivateKeyPath());
		InputStream is = new FileInputStream(param.getPrivateKeyPath());
		keyStore.load(is, param.getPrivateKeyPassword());
		Enumeration<String> aliases = keyStore.aliases();
		if (aliases.hasMoreElements()) {
			String alias = aliases.nextElement();
			privateKey = (PrivateKey) keyStore.getKey(alias,
					param.getPrivateKeyPassword());
			certChain = keyStore.getCertificateChain(alias);
			publicKey = certChain[0].getPublicKey();
		}
		if (privateKey == null || certChain == null) {
			throw new Exception("Private key or chain of certificates is null");
		}
	}

	public String sign(byte[] xmlNoSign) throws SAXException, IOException, ParserConfigurationException, TransformerException, MarshalException, XMLSignatureException, NoSuchAlgorithmException, InvalidAlgorithmParameterException {
		DocumentBuilderFactory docBuiderFactory = DocumentBuilderFactory
				.newInstance();
		docBuiderFactory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
		docBuiderFactory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalSchema", "");
		docBuiderFactory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
		docBuiderFactory.setNamespaceAware(true);
		Document doc = docBuiderFactory.newDocumentBuilder().parse(
				new ByteArrayInputStream(xmlNoSign));
		return sign(doc);
	}

	public String sign(Document xmlNoSign) throws TransformerException, MarshalException, XMLSignatureException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, UnsupportedEncodingException {
		SignedInfo signedInfo = initSignedInfo();
		KeyInfo keyInfo = initKeyInfo();
		DOMSignContext context = new DOMSignContext(privateKey, xmlNoSign
				.getElementsByTagName(param.getTagSign()).item(0));
		XMLSignature signature = signatureFactory.newXMLSignature(signedInfo,
				keyInfo);
		signature.sign(context);

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		Result result = new StreamResult(out);
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		transformerFactory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
		transformerFactory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalSchema", "");
		transformerFactory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
		Transformer transformer = transformerFactory.newTransformer();
		//transformer.setOutputProperty(OutputKeys.STANDALONE, "no");
		transformer.transform(new DOMSource(xmlNoSign), result);
		
		return decodeUTF8(out.toByteArray());
	}

	private KeyInfo initKeyInfo() {
		KeyInfo keyInfo = null;
		X509Data x509Data = initX509Data();
		if (param.isInitKeyInfo()) {
			keyInfo = keyInfoFactory.newKeyInfo(Collections
					.singletonList(x509Data));
		}
		return keyInfo;
	}

	private X509Data initX509Data() {
		X509Data x509Data = null;
		if (param.isInitX509Data()) {
			List<Object> x509Content = new ArrayList<Object>();
			X509Certificate x509Certificate = (X509Certificate) certChain[0];
			final X509IssuerSerial x509IssuerSerial;
			if (param.isInitX509IssuerSerial()) {
				x509IssuerSerial = keyInfoFactory.newX509IssuerSerial(
						x509Certificate.getIssuerX500Principal().getName(),
						x509Certificate.getSerialNumber());
				x509Content.add(x509IssuerSerial);
			}
			if (param.isInitX509Certificate()) {
				x509Content.add(x509Certificate);
			}
			x509Data = keyInfoFactory.newX509Data(x509Content);
		}
		return x509Data;
	}

	private SignedInfo initSignedInfo() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
		SignedInfo signedInfo = null;
		Reference reference = initReference();
		if (param.isInitSignedInfo()) {
			CanonicalizationMethod canonicalizationMethod = initCanonicalizationMethod();
			SignatureMethod signatureMethod = initSignatureMethod();
			signedInfo = signatureFactory.newSignedInfo(canonicalizationMethod,
					signatureMethod, Collections.singletonList(reference));
		}
		return signedInfo;
	}

	private SignatureMethod initSignatureMethod() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
		SignatureMethod signatureMethod = null;
		if (param.isInitSignatureMethod()) {
			signatureMethod = signatureFactory.newSignatureMethod(
					SignatureMethod.RSA_SHA1, null);
		}
		return signatureMethod;
	}

	private CanonicalizationMethod initCanonicalizationMethod() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
		CanonicalizationMethod canonicalizationMethod = null;
		if (param.isInitCanonicalizationMethod()) {
			canonicalizationMethod = signatureFactory
					.newCanonicalizationMethod(
							CanonicalizationMethod.INCLUSIVE_WITH_COMMENTS,
							(C14NMethodParameterSpec) null);
		}
		return canonicalizationMethod;
	}

	private Reference initReference() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
		Reference reference = null;
		String referenceURI = "";
		if (param.isInitReference()) {
			DigestMethod digestMethod = initDigestMethod();
			List<Transform> transforms = initTransforms();
			reference = signatureFactory.newReference(referenceURI, digestMethod,
					transforms, null, null);
		}
		return reference;
	}

	private DigestMethod initDigestMethod() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
		DigestMethod digestMethod = null;
		if (param.isInitDigestMethod()) {
			digestMethod = signatureFactory.newDigestMethod(DigestMethod.SHA1,
					null);
		}
		return digestMethod;
	}

	private List<Transform> initTransforms() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
		List<Transform> transforms = null;
		if (param.isInitTransforms()) {
			transforms = new ArrayList<Transform>();
//			final String path = param.getTagPath();
//			transforms.add(signatureFactory.newTransform(Transform.XPATH,
//					new XPathFilterParameterSpec(path)));
			transforms.add(signatureFactory.newTransform(Transform.ENVELOPED,
					(TransformParameterSpec) null));
		}
		return transforms;
	}

	public String sign(String xmlNoSign) throws SAXException, IOException, ParserConfigurationException, TransformerException, MarshalException, XMLSignatureException, NoSuchAlgorithmException, InvalidAlgorithmParameterException {
		return sign(encodeUTF8(xmlNoSign));
	}

	private static String decodeUTF8(byte[] bytes) throws UnsupportedEncodingException {
		return new String(bytes, CHARSET_TYPE);
	}

	private static byte[] encodeUTF8(String string) throws UnsupportedEncodingException {
		return string.getBytes(CHARSET_TYPE);
	}

	protected abstract String getConfigFilePath();
	
	public String getPublicKey() throws UnsupportedEncodingException, CertificateEncodingException {
		/*RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKey;
		String result = rSAPublicKey.getModulus().toString(16);
		return result;*/
		
		X509Certificate x509Certificate = (X509Certificate) certChain[0];
		return Base64Utils.base64Encode(x509Certificate.getEncoded());
		//return readContentCertFile();
	}
	
	/*public static String readContentCertFile() {
		String ContentcertFile = new String();
		try {
			File certFile = new File("C:\\vib.cer");
			FileReader fileReader = new FileReader(certFile);
			BufferedReader bufferReader = new BufferedReader(fileReader);

			String begin = bufferReader.readLine();
			if (begin.equals("-----BEGIN CERTIFICATE-----") == false)
				throw new IOException("Couldn't find certificate beginning");

			boolean trucking = true;

			while (trucking) {
				String line = bufferReader.readLine();
				if (line.startsWith("-----")) {
					trucking = false;
				} else
					ContentcertFile += line;
			}
			bufferReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ContentcertFile;
	}*/
}
