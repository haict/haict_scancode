package com.fmt.utils.HQ.signer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

import com.cmn.utils.Constant;


public class Signer {
	private static final Charset UTF8_CHARSET = Charset.forName("UTF-8");
	//private static String path="//CHUNGTU/NDUNG_CTU_NH/NDUNG_CTU";
	private static String[] path = new String[]{"/Customs/Data"};
	//private static String path="/DATA/SECURITY";

	public static boolean verify(String cerPath, byte[] fileByte) throws Exception{
		boolean check =false ;
		FileInputStream in = null;
		try {
			in = new FileInputStream(cerPath);
		} catch (IOException e) {
			throw new Exception("Path of certificate file is not correct");
		}		
		CertificateFactory cf = CertificateFactory.getInstance("X.509");
		X509Certificate cer = (X509Certificate) cf.generateCertificate(in);
		BigInteger[] ser = new BigInteger[1];
		ser[0] = cer.getSerialNumber();
        XMLSignatureVerifier checkVerify = new XMLSignatureVerifier();
        checkVerify.verifyXMLSignature(ser,fileByte);
        check = true;
		return check;
	}
	
	public static boolean verify(String cerPath, String str) throws Exception{
		boolean rs = false ;
		rs = verify(cerPath, encodeUTF8(str));
		return rs;
	}
	/**
	 * @author nghiapt5
	 * @param xml
	 * @return return sign of xml
	 */
	public static byte[] sign(byte[] xml) throws Exception{
		byte[] rs = null;
		String tagSign = HQConstant.BANK_TAGSIGN;
		String keyStoreFile = HQConstant.PATH_PFX;
		String keyStorePwd = HQConstant.PASSWORD_PFX;
		XMLSigner xs = new XMLSigner();
		IHTKKKeyStoreBean keyStore = IHTKKKeyStoreBean.getKeyStore(keyStoreFile, keyStorePwd);
		
		rs = xs.signXMLFileXPath1(xml, keyStore.getPrivateKey(), keyStore.getCertChain(), HQConstant.GIP_XPATH, tagSign);
		
		return rs;
	}
	public static String sign(String xml) throws Exception{
		String rs = null;
		rs = decodeUTF8(sign(encodeUTF8(xml)));
		return rs;
	}
	
	public static String sign(String xml, String pathSignPfx, String passwordPfx) throws Exception{
		String rs = null;
		/*HQConstant.FILE_PATH_SIGN_HSM_PFX = pathSignPfx;
		HQConstant.PASSWORD_OF_PFX_FILE = passwordPfx;*/
		rs = decodeUTF8(sign(encodeUTF8(xml)));
		return rs;
	}
	
	/**
	 * @author nghiapt5
	 * @param bytes
	 * @return return String from byte array using UTF8_CHARSET
	 */
	private static String decodeUTF8(byte[] bytes) {
	    try {
			return new String(bytes, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @author nghiapt5
	 * @param string
	 * @return return byte array from String using UTF8_CHARSET
	 */
	private static byte[] encodeUTF8(String string) {
	    try {
			return string.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static byte[] getByteArrayFromFile(String fileName)
			throws IOException {
		File file;
		FileInputStream fin;
		byte[] fileData;
		file = new File(fileName);
		fin = new FileInputStream(file);
		fileData = new byte[(int) file.length()];
		fin.read(fileData);
		fin.close();
		return fileData;
	}
	
	@SuppressWarnings("resource")
	public static String getPublicKey() {
		String ContentcertFile = new String();
		try {
			String pathcertFile = HQConstant.PATH_CER;
			File certFile = new File(pathcertFile);
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
	}
}