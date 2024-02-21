package com.cmn.utils;

import java.io.FileInputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

import com.cmn.Constants;

public class Util {
	public static X509Certificate getX509Certificate(String filename)  throws Exception {
	    CertificateFactory fact = CertificateFactory.getInstance("X.509");
	    FileInputStream is = new FileInputStream (filename);
	    X509Certificate cer = (X509Certificate) fact.generateCertificate(is);
	    return cer;
	}
	public static PublicKey getPublicKey(String filename)  throws Exception {
	    X509Certificate cer = getX509Certificate(filename);
	    PublicKey key = cer.getPublicKey();
	    return key;
	}
	public static boolean algEquals(String algURI, String algName) {
	    if (algName.equalsIgnoreCase("DSA") && algURI.equalsIgnoreCase(SignatureMethod.DSA_SHA1))  		  return true;
	    else if (algName.equalsIgnoreCase("RSA") && algURI.equalsIgnoreCase(SignatureMethod.RSA_SHA1))    return true;
	    else if (algName.equalsIgnoreCase("EC") &&  algURI.equalsIgnoreCase("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha256"))  return true;
	    else    return false;
	  }
	public static byte[] digest(String dma,byte[] data) throws Exception{
		  MessageDigest md = MessageDigest.getInstance(dma);
		  md.update(data);
		  return md.digest();
    }
    public static  void prettyPrint(Document xml) throws Exception {
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		transformerFactory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
		transformerFactory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalSchema", "");
		transformerFactory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
		Transformer tf = transformerFactory.newTransformer();

		tf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		// tf.setOutputProperty(OutputKeys.INDENT, "yes");
		Writer out = new StringWriter();
		tf.transform(new DOMSource(xml), new StreamResult(out));
		System.out.println(out.toString());
	}
    
    
}
