package com.cmn.sec;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;

import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public interface ISign {
	public String sign(String xmlNoSign) throws SAXException, IOException, ParserConfigurationException, TransformerException, MarshalException, XMLSignatureException, NoSuchAlgorithmException, InvalidAlgorithmParameterException;
	public String sign(byte[] xmlNoSign) throws SAXException, IOException, ParserConfigurationException, TransformerException, MarshalException, XMLSignatureException, NoSuchAlgorithmException, InvalidAlgorithmParameterException;
	public String sign(Document document) throws TransformerException, MarshalException, XMLSignatureException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, UnsupportedEncodingException;
}
