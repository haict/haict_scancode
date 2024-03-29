/**
 * 
 */
package com.tcs.sgb.ws.utils;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import com.cmn.Constants;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class XMLUtils {
	private static final Logger log = LogManager.getLogger(XMLUtils.class);
	public static String document2String(Document doc, boolean prettyPrint) throws Exception {
		StringWriter writer = new StringWriter();
		TransformerFactory factory = TransformerFactory.newInstance();
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalSchema", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
		Transformer transformer = factory.newTransformer();
		
		if (prettyPrint) {
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		}
		
		transformer.transform(new DOMSource(doc), new StreamResult(writer));
		
		return writer.toString();
	}
	
	public static <T> String jaxb2String(T o) throws Exception {
		JAXBContext jc = JAXBContext.newInstance(o.getClass());

        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        
        StringWriter writer = new StringWriter();
        marshaller.marshal(o, writer);
        
        return writer.toString();
	}
	public static <T> Object jaxbString2Object(String msg, T o) throws Exception {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
		dbf.setAttribute("http://javax.xml.XMLConstants/property/accessExternalSchema", "");
		dbf.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
        dbf.setNamespaceAware(true);
        Document doc = dbf.newDocumentBuilder().parse(
        		new InputSource(new ByteArrayInputStream(msg.getBytes("utf-8"))));
        JAXBContext jaxbContext = JAXBContext.newInstance(o.getClass());
		
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		return jaxbUnmarshaller.unmarshal(doc);
	}
	public static void saveXMLFile(Document doc, String xmlFolder, String fileName){
		try {
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			transformerFactory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
			transformerFactory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalSchema", "");
			transformerFactory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			// create folder if not exist
			DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			Calendar cal = Calendar.getInstance();
			String time = "/"+dateFormat.format(cal.getTime()).toString();
			
			File file = new File(xmlFolder);
			if(!file.exists())
				file.mkdir();
			xmlFolder = xmlFolder+time;
		
			
			file = new File(xmlFolder);
			if (!file.exists()) {
				file.mkdir();
			}
			StringBuffer strBuff = new StringBuffer();
			strBuff = new StringBuffer(xmlFolder+"/").append(fileName).append("-")
					.append(System.currentTimeMillis()).append(".xml");
			StreamResult result = new StreamResult(new File(strBuff.toString()));
			transformer.transform(source, result);
		
			log.info("save xml success {}", strBuff.toString());
		} catch (Exception e) {
			log.error("save xml file error", e);
		}
	}

	public static void SaveMessage(String str,String type)  {
		BufferedWriter bw = null;
        FileWriter fw = null;
		try {
			DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			Calendar cal = Calendar.getInstance();
			String time = "/"+dateFormat.format(cal.getTime()).toString();
			
			StringBuffer strBuff = new StringBuffer();
			strBuff = new StringBuffer(SgbConstant.FOLDER_XML + type + time + "/").append("-").append(System.currentTimeMillis()).append(".txt");
			File StockOutputFile = new File(strBuff.toString());
			FileOutputStream fos = new FileOutputStream(StockOutputFile);
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String obj2JsonString(Object obj) {
		ObjectMapper mapper = new ObjectMapper();
		String logResp = "";
		try {
			logResp = mapper.writeValueAsString(obj);
		} catch (JsonProcessingException ex) {			
			log.error("parse json error", ex);
		}
		return logResp;
	}
	public static <T> Object json2Object (String msg, Class<T> o) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(msg, o);
	}
}
