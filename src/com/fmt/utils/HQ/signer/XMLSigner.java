package com.fmt.utils.HQ.signer;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.keyinfo.X509IssuerSerial;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.crypto.dsig.spec.XPathFilterParameterSpec;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPathExpression;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLSigner {
	
	public byte[] signXMLFile(byte[] fileData, PrivateKey privateKey,
			Certificate[] certificateChain, String tagRef, String tagSign)
			throws Exception {

		// Create a DOM XMLSignatureFactory that will be used to generate the
		// enveloped signature
		XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");

		// Create a Reference to the enveloped document (in this case we are
		// signing the whole document, so a URI of "" signifies that) and
		// also specify the SHA1 digest algorithm and the ENVELOPED Transform.
		String ndungSign = "";
		if (tagRef != null && !tagRef.equalsIgnoreCase("")) {
			ndungSign = "#" + tagRef;
		}
		Reference ref = fac.newReference(ndungSign, fac.newDigestMethod(
				DigestMethod.SHA1, null), Collections.singletonList(fac
				.newTransform(Transform.ENVELOPED,
						(TransformParameterSpec) null)), null, null);
		// Create the SignedInfo
		SignedInfo si = fac
				.newSignedInfo(fac.newCanonicalizationMethod(
						CanonicalizationMethod.INCLUSIVE_WITH_COMMENTS,
						(C14NMethodParameterSpec) null), fac
						.newSignatureMethod(SignatureMethod.RSA_SHA1, null),
						Collections.singletonList(ref));
		X509Certificate certChain = (X509Certificate) certificateChain[0];
		KeyInfoFactory kif = fac.getKeyInfoFactory();
		java.util.List x509Content = new java.util.ArrayList();
		x509Content.add(certChain.getSubjectX500Principal().getName());
		x509Content.add(certChain);
		X509Data xd = kif.newX509Data(x509Content);
		// Create a KeyInfo and add the KeyValue to it
		KeyInfo ki = kif.newKeyInfo(Collections.singletonList(xd));

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
		dbf.setAttribute("http://javax.xml.XMLConstants/property/accessExternalSchema", "");
		dbf.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
		dbf.setNamespaceAware(true);
		Document doc = dbf.newDocumentBuilder().parse(
				new ByteArrayInputStream(fileData));
		// Create a DOMSignContext and specify the DSA PrivateKey and
		// location of the resulting XMLSignature's parent element
		Node elmSign = null;
		if (tagSign != null && !tagSign.equalsIgnoreCase("")) {
			elmSign = doc.getElementsByTagName(tagSign).item(0);
		} else
			elmSign = doc.getDocumentElement();
		DOMSignContext dsc = new DOMSignContext(privateKey, elmSign);
		// Create the XMLSignature (but don't sign it yet)
		XMLSignature signature = fac.newXMLSignature(si, ki);
		// Marshal, generate (and sign) the enveloped signature
		signature.sign(dsc);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		Result result = new StreamResult(out);
		TransformerFactory factory = TransformerFactory.newInstance();
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalSchema", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
		Transformer transformer = factory.newTransformer();
		transformer.transform(new DOMSource(doc), result);
		return out.toByteArray();
	}

	public static String convertDateToString(java.util.Date d, String format) {
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		return convertDateToString(c, format);
	}

	public static String convertDateToString(Calendar d, String format) {
		String dd = Integer.toString(d.get(Calendar.DATE));
		String mm = Integer.toString(d.get(Calendar.MONTH) + 1);
		String yyyy = Integer.toString(d.get(Calendar.YEAR));
		String hh = Integer.toString(d.get(Calendar.HOUR_OF_DAY));
		String mi = Integer.toString(d.get(Calendar.MINUTE));
		String ss = Integer.toString(d.get(Calendar.SECOND));
		String ms = Integer.toString(d.get(Calendar.MILLISECOND));

		if (dd.length() == 1) {
			dd = "0" + dd;
		}
		if (mm.length() == 1) {
			mm = "0" + mm;
		}
		if (hh.length() == 1) {
			hh = "0" + hh;
		}
		if (mi.length() == 1) {
			mi = "0" + mi;
		}
		if (ss.length() == 1) {
			ss = "0" + ss;
		}
		if (ms.length() == 1) {
			ms = "0" + ms;
		}
		if ("DD".equalsIgnoreCase(format)) {
			return dd;
		} else if ("MM".equalsIgnoreCase(format)) {
			return mm;
		} else if ("YYYY".equalsIgnoreCase(format)) {
			return yyyy;
		} else if ("MM/YYYY".equals(format)) {
			return mm + "/" + yyyy;
		} else if ("DD/MM/YYYY".equals(format)) {
			return dd + "/" + mm + "/" + yyyy;
		} else if ("DD/MM/YYYY HH:MI:SS".equals(format)) {
			return dd + "/" + mm + "/" + yyyy + " " + hh + ":" + mi + ":" + ss;
		} else if ("DDMMYYYY HH:MI:SS".equals(format)) {
			return dd + "" + mm + "" + yyyy + " " + hh + ":" + mi + ":" + ss;
		} else if ("DDMMYYYYHH24MISS".equals(format)) {
			return dd + mm + yyyy + hh + mi + ss;
		} else if ("DDMMYYYYHH24MISSMS".equals(format)) {
			return dd + mm + yyyy + hh + mi + ss + ms;
		} else if ("DDMMYYYY".equals(format)) {
			return dd + mm + yyyy;
		} else if ("MMYYYY".equals(format)) {
			return mm + yyyy;
		} else if ("DD-MMM-YYYY HH:MI:SS".equals(format)) {
			SimpleDateFormat format2 = new SimpleDateFormat(
					"dd-MMM-yyyy HH:mm:ss");
			return format2.format(d.getTime());
		} else if ("YYYYMMDDHH24MISSMS".equals(format)) {
			return yyyy + mm + dd + hh + mi + ss + ms;
		} else if ("yyyyDDDHHmmss".equals(format)) {
			SimpleDateFormat format2 = new SimpleDateFormat(format);
			return format2.format(d.getTime());
		}
		return null;
	}

	public static Calendar convertStringToDate(String strDate, String format) {
		String dateValue;
		String timeValue;
		String[] dElement;
		String[] tElement;
		Calendar cal = null;
		if ("DD/MM/YYYY".equals(format)) {
			dElement = strDate.split("/");
			cal = Calendar.getInstance();
			cal.set(Calendar.DAY_OF_MONTH, new Integer(dElement[0]).intValue());
			cal.set(Calendar.MONTH, new Integer(dElement[1]).intValue() - 1);
			cal.set(Calendar.YEAR, new Integer(dElement[2]).intValue());
		} else if ("DD/MM/YYYY HH:MI:SS".equals(format)) {
			dateValue = strDate.substring(0, strDate.indexOf(" "));
			timeValue = strDate.substring(strDate.indexOf(" ") + 1);
			dElement = dateValue.split("/");
			tElement = timeValue.split(":");
			cal = Calendar.getInstance();
			cal.set(Calendar.DAY_OF_MONTH, new Integer(dElement[0]).intValue());
			cal.set(Calendar.MONTH, new Integer(dElement[1]).intValue() - 1);
			cal.set(Calendar.YEAR, new Integer(dElement[2]).intValue());
			cal.set(Calendar.HOUR_OF_DAY, new Integer(tElement[0]).intValue());
			cal.set(Calendar.MINUTE, new Integer(tElement[1]).intValue());
			cal.set(Calendar.SECOND, new Integer(tElement[2]).intValue());
		}

		return cal;
	}

	public static Calendar convertStringToDate(String strDate, String format,
			String timezoneID) {
		Calendar cal = convertStringToDate(strDate, format);
		cal.setTimeZone(TimeZone.getTimeZone(timezoneID));
		return cal;
	}

	public static String convertDateToString(Date d) {
		String dStr;
		String yyyy;
		String mm;
		String dd;

		if (d == null)
			return null;

		dStr = d.toString();
		yyyy = dStr.substring(0, 4);
		mm = dStr.substring(5, 7);
		dd = dStr.substring(8);

		return dd + "/" + mm + "/" + yyyy;
	}
	
	public static byte[] signXMLFileXPath1(byte[] fileData, PrivateKey privateKey,
			Certificate[] certificateChain, String xPath, String tagSign)
			throws Exception {
		final String path = xPath;//tagPath;
		//final String path = "ancestor-or-self::BODY";
		// Instantiate the document to be signed
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		dbFactory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
		dbFactory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalSchema", "");
		dbFactory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
		dbFactory.setNamespaceAware(true);
		Document doc = dbFactory.newDocumentBuilder().parse(
				new ByteArrayInputStream(fileData));

		// prepare signature factory
		/*String providerName = System.getProperty("jsr105Provider",
				"org.jcp.xml.dsig.internal.dom.XMLDSigRI");*/

		/*final XMLSignatureFactory sigFactory = XMLSignatureFactory.getInstance(
				"DOM", (Provider) Class.forName(providerName).newInstance());*/
		//final XMLSignatureFactory sigFactory = XMLSignatureFactory.getInstance("DOM");
		final XMLSignatureFactory sigFactory = XMLSignatureFactory.getInstance("DOM", new org.apache.jcp.xml.dsig.internal.dom.XMLDSigRI()); 
		String referenceURI = null;
		XPathExpression expr = null;
		NodeList nodes;
		List transforms = null;

		/*XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		// Find the node to be signed by PATH
		expr = xpath.compile(path);
		nodes = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
		if (nodes.getLength() < 1) {
			throw new Exception("KhÃ´ng tá»“n tÃ i path cáº§n kÃ½.");
		}*/
		referenceURI = ""; // Empty string means whole document
		//jdk 1.6 highter
		/*transforms = new ArrayList<Transform>() {
			{
				add(sigFactory.newTransform(Transform.XPATH,
						new XPathFilterParameterSpec(path)));
				add(sigFactory.newTransform(Transform.ENVELOPED,
						(TransformParameterSpec) null));
			}
		};*/
		
		//jdk 1.4
		transforms = new ArrayList() {
			{
				add(sigFactory.newTransform(Transform.XPATH,
						new XPathFilterParameterSpec(path)));
				/*add(sigFactory.newTransform(Transform.ENVELOPED,
						(TransformParameterSpec) null));*/
			}
		};
		
		X509Certificate cert = (X509Certificate) certificateChain[0];
		//hoangnt10
		PublicKey publicKey = cert.getPublicKey();
		
		// Create a Reference to the enveloped document
		Reference ref = sigFactory.newReference(referenceURI,
				sigFactory.newDigestMethod(DigestMethod.SHA1, null),
				transforms, null, null);

		// Create the SignedInfo
		SignedInfo signedInfo = sigFactory.newSignedInfo(sigFactory
				.newCanonicalizationMethod(
						CanonicalizationMethod.INCLUSIVE_WITH_COMMENTS,
						(C14NMethodParameterSpec) null), sigFactory
				.newSignatureMethod(SignatureMethod.RSA_SHA1, null),
				Collections.singletonList(ref));

		// Create a KeyValue containing the RSA PublicKey
		KeyInfoFactory keyInfoFactory = sigFactory.getKeyInfoFactory();
		List<Object> x509Content = new ArrayList<Object>();
//		x509Content.add(cert.getSubjectX500Principal().getName() + "|TGKY="
//				+ convertDateToString(new Date(), "DDMMYYYYHH24MISS"));
		 //x509Content.add(cert.getSubjectX500Principal().getName()+"|TGKY="+IHTKKUtils.convertDateToString(new
		// Date(), "DD/MM/YYYY HH:MI:SS"));
		
		final X509IssuerSerial issuer = keyInfoFactory.newX509IssuerSerial(cert.getIssuerX500Principal().getName(), cert.getSerialNumber());
		x509Content.add(issuer);
		x509Content.add(cert);
		X509Data xd = keyInfoFactory.newX509Data(x509Content);
//		KeyValue keyValue = keyInfoFactory.newKeyValue(publicKey);
		
		//hoangnt10
		List abc = new ArrayList();
//		abc.add(keyValue);
		abc.add(xd);
		
		// Create a KeyInfo and add the KeyValue to it
		KeyInfo keyInfo = keyInfoFactory.newKeyInfo(Arrays.asList(abc.toArray()));
		//keyInfo.
		
		// Create a DOMSignContext and specify the RSA PrivateKey and
		// location of the resulting XMLSignature's parent element
		DOMSignContext dsc = new DOMSignContext(privateKey,
				doc.getElementsByTagName(tagSign).item(0));

		// Create the XMLSignature (but don't sign it yet)
		XMLSignature signature = sigFactory
				.newXMLSignature(signedInfo, keyInfo);

		
		// Marshal, generate (and sign) the enveloped signature
		signature.sign(dsc);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		Result result = new StreamResult(out);
		TransformerFactory factory1 = TransformerFactory.newInstance();
		factory1.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
		factory1.setAttribute("http://javax.xml.XMLConstants/property/accessExternalSchema", "");
		factory1.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
		Transformer transformer = factory1.newTransformer();
		transformer.transform(new DOMSource(doc), result);
		return out.toByteArray();
	}
}
