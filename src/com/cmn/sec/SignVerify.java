package com.cmn.sec;

import java.io.File;
import java.io.StringReader;
import java.math.BigInteger;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.cmn.utils.DSNamespaceContext;
import com.cmn.utils.Util;
import com.fmt.utils.HQ.signer.Base64Utils;
import com.fmt.utils.HQ.signer.HQConstant;
import com.sun.org.apache.xml.internal.security.Init;
import com.sun.org.apache.xml.internal.security.c14n.Canonicalizer;
import com.sun.org.apache.xml.internal.security.keys.KeyInfo;
import com.sun.org.apache.xml.internal.security.signature.SignedInfo;
import com.sun.org.apache.xml.internal.security.signature.XMLSignature;

public class SignVerify {		
	public static void verifyXML(String fileData, String serialCustomPublicKey) throws Exception {
		System.out.println("Verify");
		//hoangnt10: verify chu ky trong xml
		Init.init();
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
		dbf.setAttribute("http://javax.xml.XMLConstants/property/accessExternalSchema", "");
		dbf.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
		dbf.setNamespaceAware(true);
		DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
		InputSource is = new InputSource();
	    is.setCharacterStream(new StringReader(fileData));
		Document doc = documentBuilder.parse(is);
		XPathFactory xpf = XPathFactory.newInstance();
		XPath xpath = xpf.newXPath();
		xpath.setNamespaceContext(new DSNamespaceContext());
		
		NodeList nl = doc.getElementsByTagNameNS(javax.xml.crypto.dsig.XMLSignature.XMLNS, "Signature");
		if (nl.getLength() == 0) {
            throw new Exception("Khong tim thay chu ky dien tu");
        }
		
		Element sigElement =(Element) xpath.evaluate("//ds:Signature[1]", doc, XPathConstants.NODE);
		XMLSignature xmlSignature = new XMLSignature(sigElement,"");
		KeyInfo ki = xmlSignature.getKeyInfo();
		SignedInfo si = xmlSignature.getSignedInfo();
		String dma = (String) xpath.evaluate("//ds:DigestMethod[1]/@Algorithm", sigElement, XPathConstants.STRING);
		dma = dma.replaceAll(com.sun.org.apache.xml.internal.security.utils.Constants.SignatureSpecNS, "");
		
		boolean b;
		Canonicalizer c14n = Canonicalizer.getInstance(si.getCanonicalizationMethodURI());
		
		//get digest
		String  digestStr=(String) xpath.evaluate("//ds:DigestValue[1]", sigElement, XPathConstants.STRING);
		
		byte[]  digestValue= Base64Utils.base64Decode(digestStr);
		//xoa sigElement 
		sigElement.getParentNode().removeChild(sigElement);
	 	doc.normalize();
 	    byte[] dataValue = c14n.canonicalizeSubtree(doc);
 	    //tinh lai digest
 	    byte[] dataDigestValue=Util.digest(dma,dataValue);
 	    b=Arrays.equals(digestValue,dataDigestValue);
 	    System.out.println("digestValue: "+Arrays.toString(digestValue));
	    System.out.println("dataDigestValue: "+Arrays.toString(dataDigestValue));
 	    System.out.println("verify: "+b);
 	    
 	    //hoangnt10: doi chieu voi publickey chuan
 	    if(b){
 	    	//get serial number from xml
 			String serialXml = ki.getX509Certificate().getSerialNumber().toString(16);
 			System.out.println("serialXml: "+serialXml);
 			System.out.println("customSerial: "+serialCustomPublicKey);
 			if(serialXml.equals(serialCustomPublicKey)){
 				verifyCertificationChain(Calendar.getInstance().getTime(), ki.getX509Certificate());
 			}else{
 				throw new Exception("Serial chữ ký điện tử trong thông điệp không đúng");
 			}
 	    }else{
 	    	throw new Exception("Chữ ký điện tử trong thông điệp không đúng");
 	    }
	}
	
	
	//hoangnt10
	public static void verifyXML247(String fileData, StringBuffer serialCustomPublicKey, StringBuffer customerPublicKey) throws Exception {
		System.out.println("Verify247");
		
		Init.init();
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
		dbf.setAttribute("http://javax.xml.XMLConstants/property/accessExternalSchema", "");
		dbf.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
		dbf.setNamespaceAware(true);
		DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
		InputSource is = new InputSource();
	    is.setCharacterStream(new StringReader(fileData));
		Document doc = documentBuilder.parse(is);
		XPathFactory xpf = XPathFactory.newInstance();
		XPath xpath = xpf.newXPath();
		xpath.setNamespaceContext(new DSNamespaceContext());
		
		NodeList nl = doc.getElementsByTagNameNS(javax.xml.crypto.dsig.XMLSignature.XMLNS, "Signature");
		if (nl.getLength() == 0) {
			throw new Exception("Khong tim thay chu ky dien tu");
        } if( nl.getLength() == 1){
        	verifyXML(fileData, serialCustomPublicKey.toString());
        } else{
        	boolean checkVerify = false;
			for(int i = 0; i < nl.getLength(); i++){
				try{
					Element signElement =(Element) nl.item(i);
					String refId = ((Element) signElement.getElementsByTagName("Reference").item(0)).getAttribute("URI");
					refId = refId.replace("#", "");
					if(!HQConstant.Reference_URI_HQ.equals(refId)){
						continue;
					}
					checkVerify = true;
					XPathExpression expr = xpath.compile("//*[@id=\""+ refId +"\" or @ID=\""+ refId +"\"]");
					Node data = ((NodeList) expr.evaluate(doc, XPathConstants.NODESET)).item(0);
					XMLSignature xmlSignature = new XMLSignature(signElement,"");
					
					KeyInfo ki = xmlSignature.getKeyInfo();
					X509Certificate cert = ki.getX509Certificate();
					SignedInfo si = xmlSignature.getSignedInfo();
					String dma = ((Element) signElement.getElementsByTagName("DigestMethod").item(0)).getAttribute("Algorithm");
					dma = dma.split("#")[1];
					dma = dma.substring(0,3) + "-" + dma.substring(3);
					boolean valid;
					Canonicalizer c14n = Canonicalizer.getInstance(si.getCanonicalizationMethodURI());
					
					//get digest
					String digestStr = ((Element) signElement.getElementsByTagName("DigestValue").item(0)).getTextContent();
					byte[]  digestValue= Base64Utils.base64Decode(digestStr);
					//xoa sigElement 
					signElement.getParentNode().removeChild(signElement);
				 	doc.normalize();
			 	    byte[] dataValue = c14n.canonicalizeSubtree(data);//doc
			 	    //tinh lai digest
			 	    byte[] dataDigestValue=Util.digest(dma,dataValue);
			 	    valid=Arrays.equals(digestValue,dataDigestValue);
			 	    System.out.println("digestValue: "+Arrays.toString(digestValue));
				    System.out.println("dataDigestValue: "+Arrays.toString(dataDigestValue));
			 	    System.out.println("verify: "+valid);
			 	    
			 	    //doi chieu voi publickey chuan
			 	    if(valid){
			 			String serialXml = ki.getX509Certificate().getSerialNumber().toString(16);
			 	        BigInteger bigInt = new BigInteger(serialCustomPublicKey.toString(), 16);
			 			String customSerial = bigInt.toString(16);
			 			System.out.println("serialXml: "+serialXml);
			 			System.out.println("customSerial: "+customSerial);
			 			if(serialXml.equals(customSerial)){
			 				verifyCertificationChain(Calendar.getInstance().getTime(), ki.getX509Certificate());
			 			}else{
			 				throw new Exception("Serial chữ ký điện tử trong thông điệp không đúng");
			 			}
			 	    }else{
			 	    	throw new Exception("Chữ ký điện tử trong thông điệp không đúng");
			 	    }
				}catch(Exception ex){
					throw ex;
				}
			}
			if(!checkVerify){
				throw new Exception("Không tìm thấy chữ ký số của TCHQ");
			}
        }
	}
	
	public static void verifyCertificationChain(Date dValidity, X509Certificate cert) throws Exception 
    {
		try {
			cert.checkValidity(dValidity);
		} catch (CertificateExpiredException ex) {
			throw new Exception("Chứng thư điện tử trong thông điệp đã hết hạn");
		} catch (CertificateNotYetValidException ex) {
			throw new Exception("Chứng thư điện tử trong thông điệp chưa có hiệu lực");
		}
	}
	
	
	public static void main(String[] args) {
		try {
			
			verifyXML247(readFile("D:/Temp/VPB/313.xml"), new StringBuffer("6b15ce"), new StringBuffer("6b15ce"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static String readFile(String url) {
		try {
			Scanner scanner = new Scanner(new File(url), "UTF-8");
			String text = scanner.useDelimiter("\\A").next();
			scanner.close();
			return text;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/*public static void main(String[] a){
		try {
			BigInteger bigInt = new BigInteger("7017934");
 			//String customSerial = bigInt.toString(16);
 			System.out.println(bigInt);
 			
 			System.out.println(bigInt.toString(16));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

}
