package com.tcs.sgb.ws.utils;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertPath;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.ZonedDateTime;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util {
	private static final Logger logger = LoggerFactory.getLogger(Util.class);

	private static final SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

	public static Date string2Date(String dateString) {
		Date date = null;
		try {
			if (StringUtils.isNotBlank(dateString))
				date = formatter.parse(dateString);
			else
				return null;
		} catch (ParseException e) {
			logger.error(e.getMessage(), e);
		}
		return date;
	}

	public static java.sql.Date string2SqlDate(String dateString) {

		Date parsed = null;
		try {
			if (StringUtils.isNotBlank(dateString))
				parsed = formatter.parse(dateString);
			else
				return null;
		} catch (ParseException e) {
			logger.error(e.getMessage(), e);
		}

		return new java.sql.Date(parsed.getTime());

	}

	public static DayOfWeek getNextTimeRun(ZonedDateTime startTime, List<DayOfWeek> runDays) {
		DayOfWeek startDay = startTime.getDayOfWeek();
		Optional<DayOfWeek> nextDay = runDays.stream().filter(day -> day.compareTo(startDay) == 0).findFirst();
		if (nextDay.isPresent())
			return nextDay.get();
		else
			return runDays.get(0);
	}

	public static String encoderBase64(String str) {
		String encodedString = Base64.getEncoder().encodeToString(str.getBytes());
		return encodedString;
	}

	public static String decoderBase64(String str) {
		byte[] decodedBytes = Base64.getDecoder().decode(str.getBytes());
		String decodedString = new String(decodedBytes);
		return decodedString;
	}

	public static boolean executeVerifyByte(byte[] dlieuByte, byte[] ckyDTu, String certChainBase64Encoded)
			throws Exception {
		boolean kquaXThuc = false;
//    	String kquaXThuc = "";
		// X509Certificate x509Cert = null;
		try {
			// neu dung CertPath doan nay
			CertPath certPath = loadCertPathFromBase64String(certChainBase64Encoded);
			List certsInChain = certPath.getCertificates();
			X509Certificate[] certChain = (X509Certificate[]) certsInChain.toArray(new X509Certificate[0]);
			X509Certificate x509Cert = certChain[0]; // get publickey TCT

			// neu truyền luôn publickey TCT doan nay
//      byte[] x509CertEncode = Base64.getDecoder().decode(contentCTSBase64);     
//            CertificateFactory cf = CertificateFactory.getInstance("X.509");                          
//            x509Cert = (X509Certificate) cf.generateCertificate(new ByteArrayInputStream(x509CertEncode));   

			FileInputStream fileInputStream;
			Signature signatureAlgorithm;
			signatureAlgorithm = Signature.getInstance("SHA256withRSA");
			CertificateFactory fact = CertificateFactory.getInstance("X.509");

//    		fileInputStream = new FileInputStream("C:\\Users\\HUY\\Downloads\\FPT998_SHA256.cer");
//    		X509Certificate cert = (X509Certificate) fact.generateCertificate(fileInputStream);            
//    		System.out.println("aaa:"+cert.getPublicKey().toString());
			kquaXThuc = getSignatureVerify(dlieuByte, ckyDTu, x509Cert);
//            System.out.println("kquaXThucByte: "+kquaXThucByte);            
//            if(kquaXThucByte==true){
//                kquaXThuc =  "Chữ ký điện tử hợp lệ";      
//            }else{
//                kquaXThuc =  "Chữ ký điện tử không hợp lệ";
//            }
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return kquaXThuc;
	}

	public static boolean getSignatureVerify(byte[] contentFile, byte[] ckyDTu, X509Certificate x509Cert)
			throws Exception {
		String sigAlgName = "SHA256withRSA";
		if (x509Cert.getSigAlgName().equals("SHA1withRSA")) {
			sigAlgName = "SHA1withRSA";
		}

		boolean kquaVerified = true;
		try {
			PublicKey publicKey = x509Cert.getPublicKey();
			Signature verify = Signature.getInstance(sigAlgName);
			verify.initVerify(publicKey);
			verify.update(contentFile);
			kquaVerified = verify.verify(ckyDTu);
			if (kquaVerified) {
				kquaVerified = true;
			} else {
				kquaVerified = false;
			}
		} catch (NoSuchAlgorithmException e) {
			kquaVerified = false;
			e.getLocalizedMessage();
		} catch (InvalidKeyException e) {
			kquaVerified = false;
			e.getLocalizedMessage();
		} catch (SignatureException e) {
			kquaVerified = false;
			e.printStackTrace();
		}
		return kquaVerified;
	}

	/**
	 * Loads a certification chain from given Base64-encoded string, containing
	 * ASN.1 DER formatted chain, stored with PkiPath encoding.
	 */
	public static CertPath loadCertPathFromBase64String(String aCertChainBase64Encoded)
			throws CertificateException, IOException {
		byte[] certChainEncoded = Base64.getDecoder().decode(aCertChainBase64Encoded);
		CertificateFactory cf = CertificateFactory.getInstance("X.509");
		InputStream certChainStream = new ByteArrayInputStream(certChainEncoded);
		CertPath certPath;
		try {
			certPath = cf.generateCertPath(certChainStream, "PkiPath");
		} finally {
			certChainStream.close();
		}
		return certPath;
	}

	public static byte[] digest(byte[] input) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			throw new IllegalArgumentException(e);
		}
		byte[] result = md.digest(input);
		return result;
	}

	private static String bytesToHex(byte[] bytes) {
		StringBuilder sb = new StringBuilder();
		for (byte b : bytes) {
			sb.append(String.format("%02x", b));
		}
		return sb.toString().toUpperCase();
	}

	public static void main(String[] args) {

		String pText = "123456";
		byte[] md5InBytes = null;
		try {
			md5InBytes = digest(pText.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(bytesToHex(md5InBytes));
	}

	public static String genMd5(String str) throws UnsupportedEncodingException {
		byte[] md5InBytes = null;
		try {
			md5InBytes = digest(str.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return bytesToHex(md5InBytes);
	}

}
