package com.fmt.utils;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class Encryptor {
	private static final String	ALGORITHM			= "AES";
	private static final String	defaultSecretKey	= "TCSEncryptor";
	private Key					secretKeySpec;

	public Encryptor() throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException {
		this(null);
	}

	public Encryptor(String secretKey) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, UnsupportedEncodingException {
		this.secretKeySpec = generateKey(secretKey);
	}

	public String encrypt(String plainText) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
		Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
		cipher.init(1, this.secretKeySpec);
		byte[] encrypted = cipher.doFinal(plainText.getBytes("UTF-8"));
		return asHexString(encrypted);
	}

	public String decrypt(String encryptedString) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException {
		Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
		cipher.init(2, this.secretKeySpec);
		byte[] original = cipher.doFinal(toByteArray(encryptedString));
		return new String(original);
	}

	private Key generateKey(String secretKey) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		if (secretKey == null) {
			secretKey = "TCSEncryptor";
		}
		byte[] key = secretKey.getBytes("UTF-8");
		MessageDigest sha = MessageDigest.getInstance("SHA-1");
		key = sha.digest(key);
		key = Arrays.copyOf(key, 16);

		KeyGenerator kgen = KeyGenerator.getInstance("AES");
		kgen.init(128);

		return new SecretKeySpec(key, "AES");
	}

	private final String asHexString(byte[] buf) {
		StringBuffer strbuf = new StringBuffer(buf.length * 2);
		for (int i = 0; i < buf.length; i++) {
			if ((buf[i] & 0xFF) < 16) {
				strbuf.append("0");
			}
			strbuf.append(Long.toString(buf[i] & 0xFF, 16));
		}
		return strbuf.toString();
	}

	private final byte[] toByteArray(String hexString) {
		int arrLength = hexString.length() >> 1;
		byte[] buf = new byte[arrLength];
		for (int ii = 0; ii < arrLength; ii++) {
			int index = ii << 1;
			String l_digit = hexString.substring(index, index + 2);
			buf[ii] = ((byte) Integer.parseInt(l_digit, 16));
		}
		return buf;
	}

	public static void main(String[] args) throws Exception {
		Encryptor aes2 = new Encryptor();
//		System.out.println(aes2.decrypt("be7cc559445839877d46c4f79327b35798b0401133d1b4361fcc2154db4bd84df26aeac0bd08c517b67713f70d3b0430f0f3214b1305037e6f41180b7218d3b894b7bc915ac818694fd9faf78ea1a659"));
//		System.out.println(aes2.decrypt("c25a79c993ae15d2a48ee8467661272d"));
		
		System.out.println(aes2.encrypt("79602001"));
		System.out.println(aes2.encrypt("NH TNHH MOT THANH VIEN ANZ VN"));
		System.out.println(aes2.decrypt("b9fd4077c4ccd1ec0d5cbb3dbdbfb46c"));
		
		
		if ((args.length == 2)) {
			String strReturn = "";
			Encryptor aes = new Encryptor();
			if ("0".equals(args[0])) {
				strReturn = aes.encrypt(args[1]);
			} else {
				strReturn = aes.decrypt(args[1]);
			}
			System.out.println(strReturn);
		} else {
			System.out.println("Phai nhap 2 tham so");
		}

	}
}
