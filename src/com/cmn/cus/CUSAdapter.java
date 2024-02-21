package com.cmn.cus;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.rmi.RemoteException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.apache.axis.utils.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.cmn.CUSMessage;
import com.cmn.entity.cus.CUS101;
import com.cmn.entity.cus.CUS102;
import com.cmn.entity.cus.CUS201;
import com.cmn.entity.cus.CUS202;
import com.cmn.entity.cus.CUS301;
import com.cmn.entity.cus.CUS302;
import com.cmn.entity.cus.CUSBean;
import com.cmn.entity.cus.CUSBeanFactory;
import com.cmn.entity.cus.CUSBeanImp;
import com.cmn.entity.cus.ICUSRequest;
import com.cmn.entity.cus.ICUSResponse;
import com.cmn.entity.ecus.CUS311;
import com.cmn.entity.ecus.CUS313;
import com.cmn.sec.SignVerify;
import com.fmt.utils.HQ.signer.HQConstant;
import com.fmt.utils.HQ.signer.UUIDGenerator;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.basic.DateConverter;
import com.thoughtworks.xstream.converters.reflection.FieldDictionary;
import com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider;
import com.thoughtworks.xstream.converters.reflection.SortableFieldKeySorter;
import com.thoughtworks.xstream.io.naming.NoNameCoder;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.mapper.MapperWrapper;

import bgw.services172.hq.WSDCHQProxy;
import bgw.services172.hq.WSHQProxy;

public class CUSAdapter {
	private static Logger logger = LogManager.getLogger(CUSAdapter.class);
	private XStream xstream;
	public CUSAdapter() {
		super();
		initXStream();
	}
	public CUSAdapter(String[] thamso) {
		try{
			HQConstant.BGW_HQ_DCDT = thamso[0];
			HQConstant.BGW_HQ_TTDT = thamso[1];
			HQConstant.BGW_TCT = thamso[2];
			HQConstant.FOLDER_XML = thamso[3];
			HQConstant.PASSWORD_PFX = thamso[4];
			HQConstant.PATH_CER = thamso[5];
			HQConstant.PATH_PFX = thamso[6];
			HQConstant.Sender_Code = thamso[7];
			HQConstant.Sender_Name = thamso[8];
			HQConstant.PATH_CER_HQ = thamso[9]; //dung de verify CKS cua HQ
			HQConstant.BGW_HQ_TTDT247 = thamso[10];
			HQConstant.BGW_HQ_DCDT247 = thamso[11];
		}catch(Exception e){
			logger.error(e);
			e.printStackTrace();
		}
		initXStream();
	}
	private void initXStream() {
		SortableFieldKeySorter sorter = new SortableFieldKeySorter();
		sorter.registerFieldOrder(CUSBeanImp.class, new String[] { "header","data", "error", "sign" });
		
		xstream = new XStream(new PureJavaReflectionProvider(new FieldDictionary(sorter)), new DomDriver("UTF_8",new NoNameCoder())) {
			@Override
			protected MapperWrapper wrapMapper(MapperWrapper next) {
				return new MapperWrapper(next) {
					@SuppressWarnings("rawtypes")
					@Override
					public boolean shouldSerializeMember(Class definedIn,String fieldName) {
						if (definedIn == Object.class) {
							return false;
						}						
						return super.shouldSerializeMember(definedIn, fieldName);
					}
				};
			}
		};
		xstream.setMode(XStream.NO_REFERENCES);
		xstream.aliasSystemAttribute(null, "class");
		String formatDateTime = "yyyy-MM-dd'T'HH:mm:ss";
		String formatDate = "yyyy-MM-dd";
		String[] acceptableFormats = { formatDateTime, formatDate };
		xstream.registerConverter(new DateConverter(formatDateTime,
				acceptableFormats, TimeZone.getTimeZone("GMT+7")));			
		
	}

	public void query(ICUSRequest request, CUSBean... responses)
			throws RemoteException, Exception {
		WSHQProxy proxy = new WSHQProxy();
		//bgw.services.hq.TTDTPortalSoapProxy proxy = new bgw.services.hq.TTDTPortalSoapProxy();
		request.getHeader().setMessageType(request.getType().getCode());
		request.getHeader().setMessageName(request.getType().getName());
		request.getHeader().setSenderCode(HQConstant.Sender_Code);
		request.getHeader().setSenderName(HQConstant.Sender_Name);
		request.getHeader().setTransactionId(new UUIDGenerator().toString());
		request.getHeader().setTransactionDate(Calendar.getInstance().getTime());
		
		xstream.processAnnotations(request.getClass());
		String mRequest = xstream.toXML(request);
		String signedRequest = CUSSign.getInstance("").sign(mRequest);
		SaveMessage(signedRequest, "HQ", request);
		System.out.println(signedRequest);
		String mResponse = proxy.WSProcess(CUSSign.getInstance("").getPublicKey(), signedRequest);
		if(StringUtils.isEmpty(mResponse)) {
			throw new Exception("Response message is null or empty");
		}
		for(int i = 0; i < responses.length; i++) {
			xstream.processAnnotations(responses[i].getClass());
			responses[i].addDefaultImplementation(xstream);
			xstream.fromXML(mResponse, responses[i]);
		}
		System.out.println(mResponse);
		
		//hoangnt10: verify
	   //SignVerify.verifyXML(mResponse,HQConstant.PATH_CER_HQ);
		SaveMessage(mResponse, "HQ", responses[0]);
	}
	
	public ICUSResponse query(ICUSRequest request) throws RemoteException, Exception {
		ICUSResponse response = null;
		WSHQProxy proxy = new WSHQProxy();
		//bgw.services.hq.TTDTPortalSoapProxy proxy = new bgw.services.hq.TTDTPortalSoapProxy();
		CUSBeanFactory CUSFactory = CUSBeanFactory.getInstance();
		request.getHeader().setMessageType(request.getType().getCode());
		request.getHeader().setMessageName(request.getType().getName());
		request.getHeader().setSenderCode(HQConstant.Sender_Code);
		request.getHeader().setSenderName(HQConstant.Sender_Name);
		request.getHeader().setTransactionId(new UUIDGenerator().toString());
		request.getHeader().setTransactionDate(Calendar.getInstance().getTime());
		
		xstream.processAnnotations(request.getClass());
		String signedRequest = null;
		try {
			String mRequest = xstream.toXML(request);
			signedRequest = CUSSign.getInstance("").sign(mRequest);
		} catch (Exception e) {
			e.printStackTrace();
		}
		SaveMessage(signedRequest, "HQ", request);
//		String mResponse = "";
		String mResponse = proxy.WSProcess(CUSSign.getInstance("").getPublicKey(), signedRequest);
		
		  /*if(request.getHeader().getMessageType().equals("110")) { mResponse =
		  getMessageFromFile("C:\\TCS\\MB\\XML\\320.xml"); }*/
		 
		
	
		System.out.println("A:"+mResponse);
		if(StringUtils.isEmpty(mResponse)) {
			throw new Exception("Response message is null or empty");
		}
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalSchema", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
		DocumentBuilder builder = factory.newDocumentBuilder();
		ByteArrayInputStream input =  new ByteArrayInputStream(mResponse.getBytes("UTF-8"));
		Document doc = builder.parse(input);
		XPathFactory xPathfactory = XPathFactory.newInstance();
		XPath xpath = xPathfactory.newXPath();
		XPathExpression expr = xpath.compile("/Customs/Header/Message_Type/text()");
		
		String type = expr.evaluate(doc, XPathConstants.STRING).toString();
		response = (ICUSResponse) CUSFactory.get(CUSMessage.getCUSMessage(type));
		xstream.processAnnotations(response.getClass());
		response.addDefaultImplementation(xstream);
		
		xstream.fromXML(mResponse, response);
		SaveMessage(mResponse, "HQ", response);
		
		//hoangnt10: verify xml
		//SignVerify.verifyXML(mResponse,HQConstant.PATH_CER_HQ);
		return response;
	}
	
	public ICUSResponse queryGuiLai(ICUSRequest request) throws RemoteException, Exception {
		ICUSResponse response = null;
		WSHQProxy proxy = new WSHQProxy();
		//bgw.services.hq.TTDTPortalSoapProxy proxy = new bgw.services.hq.TTDTPortalSoapProxy();
		CUSBeanFactory CUSFactory = CUSBeanFactory.getInstance();
		request.getHeader().setMessageType(request.getType().getCode());
		request.getHeader().setMessageName(request.getType().getName());
		request.getHeader().setSenderCode(HQConstant.Sender_Code);
		request.getHeader().setSenderName(HQConstant.Sender_Name);
		request.getHeader().setTransactionId(new UUIDGenerator().toString());
		request.getHeader().setTransactionDate(Calendar.getInstance().getTime());
		
		xstream.processAnnotations(request.getClass());
		String signedRequest = null;
		try {
			String mRequest = xstream.toXML(request);
			signedRequest = CUSSign.getInstance("").sign(mRequest);
		} catch (Exception e) {
			e.printStackTrace();
		}
		SaveMessage(signedRequest, "HQ", request);
		String mResponse = proxy.WSProcess(CUSSign.getInstance("").getPublicKey(), signedRequest);
		
		System.out.println("A:"+mResponse);
		if(StringUtils.isEmpty(mResponse)) {
			throw new Exception("Response message is null or empty");
		}
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalSchema", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
		DocumentBuilder builder = factory.newDocumentBuilder();
		ByteArrayInputStream input =  new ByteArrayInputStream(mResponse.getBytes("UTF-8"));
		Document doc = builder.parse(input);
		XPathFactory xPathfactory = XPathFactory.newInstance();		
		XPath xpath = xPathfactory.newXPath();
		XPathExpression expr = xpath.compile("/Customs/Header/Message_Type/text()");
		
		String type = expr.evaluate(doc, XPathConstants.STRING).toString();
		response = (ICUSResponse) CUSFactory.get(CUSMessage.getCUSMessage(type));
		xstream.processAnnotations(response.getClass());
		response.addDefaultImplementation(xstream);
		
		xstream.fromXML(mResponse, response);
		SaveMessage(mResponse, "HQ", response);
		
		//hoangnt10: verify xml
		//SignVerify.verifyXML(mResponse,HQConstant.PATH_CER_HQ);
		return response;
	}
	
	public ICUSResponse queryGW(ICUSRequest request) throws RemoteException, Exception {
		ICUSResponse response = null;
		bgw.services.hq.TTDTPortalSoapProxy proxy = new bgw.services.hq.TTDTPortalSoapProxy();
		CUSBeanFactory CUSFactory = CUSBeanFactory.getInstance();
		request.getHeader().setMessageType(request.getType().getCode());
		request.getHeader().setMessageName(request.getType().getName());
		request.getHeader().setSenderCode(HQConstant.Sender_Code);
		request.getHeader().setSenderName(HQConstant.Sender_Name);
		request.getHeader().setTransactionId(new UUIDGenerator().toString());
		request.getHeader().setTransactionDate(Calendar.getInstance().getTime());
		
		xstream.processAnnotations(request.getClass());
		String signedRequest = null;
		try {
			String mRequest = xstream.toXML(request);
			signedRequest = CUSSign.getInstance("").sign(mRequest);
		} catch (Exception e) {
			e.printStackTrace();
		}
		SaveMessage(signedRequest, "HQ", request);
		String mResponse = ""; 
		if (request.getHeader().getMessageType().equals("110")) {
			mResponse = getMessageFromFile("C:\\TCS\\simulator\\320.xml");
		}else if (request.getHeader().getMessageType().equals("321")) {
			mResponse = getMessageFromFile("C:\\TCS\\simulator\\200.xml");
		} else {
			mResponse = proxy.WSProcess(CUSSign.getInstance("").getPublicKey(), signedRequest);
		}
		 
		System.out.println("A:"+mResponse);
		if(StringUtils.isEmpty(mResponse)) {
			throw new Exception("Response message is null or empty");
		}
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalSchema", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
		DocumentBuilder builder = factory.newDocumentBuilder();
		ByteArrayInputStream input =  new ByteArrayInputStream(mResponse.getBytes("UTF-8"));
		Document doc = builder.parse(input);
		XPathFactory xPathfactory = XPathFactory.newInstance();
		XPath xpath = xPathfactory.newXPath();
		XPathExpression expr = xpath.compile("/Customs/Header/Message_Type/text()");
		
		String type = expr.evaluate(doc, XPathConstants.STRING).toString();
		response = (ICUSResponse) CUSFactory.get(CUSMessage.getCUSMessage(type));
		xstream.processAnnotations(response.getClass());
		response.addDefaultImplementation(xstream);
		
		xstream.fromXML(mResponse, response);
		SaveMessage(mResponse, "HQ", response);
		
		//hoangnt10: verify xml tam thoi giam
//		SignVerify.verifyXML(mResponse,HQConstant.PATH_CER_HQ);
		return response;
	}
	
	public ICUSResponse queryDC(ICUSRequest request,ICUSResponse response1) throws RemoteException, Exception {
		WSDCHQProxy proxyDCGW = new WSDCHQProxy();
		//bgw.services.hq.DCTTDTPortalSoapProxy proxyDCGW = new bgw.services.hq.DCTTDTPortalSoapProxy();
		
		CUSBeanFactory CUSFactory = CUSBeanFactory.getInstance();
		ICUSResponse response = response1;
		request.getHeader().setMessageType(request.getType().getCode());
		request.getHeader().setMessageName(request.getType().getName());
		request.getHeader().setSenderCode(HQConstant.Sender_Code);
		request.getHeader().setSenderName(HQConstant.Sender_Name);
		request.getHeader().setTransactionDate(Calendar.getInstance().getTime());
		if(request.getHeader().getTransactionId()==null || request.getHeader().getTransactionId().length()<1){
			request.getHeader().setTransactionId(new UUIDGenerator().toString());
		}
		
		xstream.processAnnotations(request.getClass());
		String mRequest = xstream.toXML(request);
		String signedRequest = null;
		try {
			signedRequest = CUSSign.getInstance("").sign(mRequest);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		SaveMessage(signedRequest, "HQ", request);
		String mResponse = proxyDCGW.reconcileProcess(CUSSign.getInstance("").getPublicKey(), signedRequest);
		System.out.println("A:"+mResponse);
		if(StringUtils.isEmpty(mResponse)) {
			throw new Exception("Response message is null or empty");
		}
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalSchema", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
		DocumentBuilder builder = factory.newDocumentBuilder();
		ByteArrayInputStream input =  new ByteArrayInputStream(mResponse.getBytes("UTF-8"));
		Document doc = builder.parse(input);
		XPathFactory xPathfactory = XPathFactory.newInstance();
		XPath xpath = xPathfactory.newXPath();
		XPathExpression expr = xpath.compile("/Customs/Header/Message_Type/text()");
		
		String type = expr.evaluate(doc, XPathConstants.STRING).toString();
		if(type.indexOf("95") > -1){
			type = "95X";
		}
		response = (ICUSResponse) CUSFactory.get(CUSMessage.getCUSMessage(type));	
		xstream.processAnnotations(response.getClass());
		response.addDefaultImplementation(xstream);
		
		xstream.fromXML(mResponse, response);
		SaveMessage(mResponse, "HQ", response);
		
		//hoangnt10: verify
		SignVerify.verifyXML(mResponse,HQConstant.PATH_CER_HQ);
		return response;
	}
	
	public ICUSResponse queryDC(ICUSRequest request) throws RemoteException, Exception {
		ICUSResponse response = null;
		WSDCHQProxy proxyDCGW = new WSDCHQProxy();
		//bgw.services.hq.DCTTDTPortalSoapProxy proxyDCGW = new bgw.services.hq.DCTTDTPortalSoapProxy();
		
		CUSBeanFactory CUSFactory = CUSBeanFactory.getInstance();
		request.getHeader().setMessageType(request.getType().getCode());
		request.getHeader().setMessageName(request.getType().getName());
		request.getHeader().setSenderCode(HQConstant.Sender_Code);
		request.getHeader().setSenderName(HQConstant.Sender_Name);
		request.getHeader().setTransactionDate(Calendar.getInstance().getTime());
		if(request.getHeader().getTransactionId()==null || request.getHeader().getTransactionId().length()<1){
			request.getHeader().setTransactionId(new UUIDGenerator().toString());
		}
		
		xstream.processAnnotations(request.getClass());
		String mRequest = xstream.toXML(request);
		String signedRequest = null;
		try {
			signedRequest = CUSSign.getInstance("").sign(mRequest);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		SaveMessage(signedRequest, "HQ", request);
		String mResponse = proxyDCGW.reconcileProcess(CUSSign.getInstance("").getPublicKey(), signedRequest);
		System.out.println("A:"+mResponse);
		if(StringUtils.isEmpty(mResponse)) {
			throw new Exception("Response message is null or empty");
		}
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalSchema", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
		DocumentBuilder builder = factory.newDocumentBuilder();
		ByteArrayInputStream input =  new ByteArrayInputStream(mResponse.getBytes("UTF-8"));
		Document doc = builder.parse(input);
		XPathFactory xPathfactory = XPathFactory.newInstance();
		XPath xpath = xPathfactory.newXPath();
		XPathExpression expr = xpath.compile("/Customs/Header/Message_Type/text()");
		
		String type = expr.evaluate(doc, XPathConstants.STRING).toString();
		if(type.indexOf("95") > -1){
			type = "95X";
		}
		response = (ICUSResponse) CUSFactory.get(CUSMessage.getCUSMessage(type));	
		xstream.processAnnotations(response.getClass());
		response.addDefaultImplementation(xstream);
		
		xstream.fromXML(mResponse, response);
		SaveMessage(mResponse, "HQ", response);
		
		//hoangnt10: verify
		///SignVerify.verifyXML(mResponse,HQConstant.PATH_CER_HQ);
		return response;
	}
	
	
	//hoangnt10: dung cho HQ 247
	public ICUSResponse query247(ICUSRequest request) throws RemoteException, Exception {
		ICUSResponse response = null;
//		bgw.services.hq247.TTDTPortalSoapProxy proxy = new bgw.services.hq247.TTDTPortalSoapProxy();
		
		bgw.services172.hq247.WSHQ247Proxy proxy = new bgw.services172.hq247.WSHQ247Proxy();		
		CUSBeanFactory CUSFactory = CUSBeanFactory.getInstance();
		request.getHeader().setMessageType(request.getType().getCode());
		request.getHeader().setMessageName(request.getType().getName());
		request.getHeader().setSenderCode(HQConstant.Sender_Code);
		request.getHeader().setSenderName(HQConstant.Sender_Name);
		
		request.getHeader().setTransactionDate(Calendar.getInstance().getTime());
		if(!"807".equals(request.getType().getCode()) && !"800".equals(request.getType().getCode()))
		{
			request.getHeader().setTransactionId(new UUIDGenerator().toString());		
		}
		if("301".equals(request.getType().getCode())||"800".equals(request.getType().getCode())){
			request.getHeader().setApplicationVersion("3.0");
			
		}else{
			request.getHeader().setApplicationVersion("3.1");
		}
		xstream.processAnnotations(request.getClass());
		
		String signedRequest = null;
		
		try {
			String mRequest = xstream.toXML(request);
			// add tag document
			if("312".indexOf(request.getType().getCode()) > -1){			
				logger.info("sign 247");
				mRequest = mRequest.replace("<Customs>", "<Customs><Document>");
				mRequest = mRequest.replace("</Customs>", "</Document><DigitalSignatures></DigitalSignatures></Customs>");
				mRequest = trimxml(mRequest).replaceAll(">\\s*<", "><");
				signedRequest = CUSSign247.getInstance("247").sign(mRequest);
			}else if("314".indexOf(request.getType().getCode()) > -1){			
					logger.info("sign 247");
					mRequest = mRequest.replace("<Customs>", "<Customs><Document>");
					mRequest = mRequest.replace("</Customs>", "</Document><DigitalSignatures></DigitalSignatures></Customs>");
					mRequest = trimxml(mRequest).replaceAll(">\\s*<", "><");
					signedRequest = CUSSign247.getInstance("247").sign(mRequest);
			}else if("108".indexOf(request.getType().getCode()) > -1){			
				mRequest = mRequest.replace("<Customs>", "<Customs><Document>");
				mRequest = mRequest.replace("</Customs>", "</Document><DigitalSignatures></DigitalSignatures></Customs>");
				mRequest = trimxml(mRequest).replaceAll(">\\s*<", "><");
				signedRequest = CUSSign247.getInstance("247").sign(mRequest);
			}else if("807,808".indexOf(request.getType().getCode()) > -1){
				mRequest = mRequest.replace("<Customs>", "<Customs>");
				mRequest = mRequest.replace("</Customs>", "<DigitalSignatures></DigitalSignatures></Customs>");
				mRequest = trimxml(mRequest).replaceAll(">\\s*<", "><");
				signedRequest = CUSSign247.getInstance("247").sign(mRequest);
			}
			else{
				logger.info("sign HQ");
				mRequest = trimxml(mRequest).replaceAll(">\\s*<", "><");
				signedRequest = CUSSign.getInstance("").sign(mRequest);
			}
			
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
		}
		logger.info("signedRequest: "+signedRequest);
		SaveMessage(signedRequest, "HQ", request);
	
		
		
		String mResponse = proxy.WSProcess (CUSSign.getInstance("").getPublicKey(), signedRequest);
		if(StringUtils.isEmpty(mResponse)) {
			throw new Exception("Response message is null or empty");
		}
		if("312".equals(request.getHeader().getMessageType())){
			mResponse = mResponse.replaceAll("<Document>", "");
			mResponse = mResponse.replaceAll("</Document>", "");
		}
		if("314".equals(request.getHeader().getMessageType())){
			mResponse = mResponse.replaceAll("<Document>", "");
			mResponse = mResponse.replaceAll("</Document>", "");
		}
		if("108".equals(request.getHeader().getMessageType())){
			mResponse = mResponse.replaceAll("<Document>", "");
			mResponse = mResponse.replaceAll("</Document>", "");
		}
		logger.info("signedRequest: "+mResponse);
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalSchema", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
		DocumentBuilder builder = factory.newDocumentBuilder();
		ByteArrayInputStream input =  new ByteArrayInputStream(mResponse.getBytes("UTF-8"));
		Document doc = builder.parse(input);
		XPathFactory xPathfactory = XPathFactory.newInstance();
		XPath xpath = xPathfactory.newXPath();
		XPathExpression expr = xpath.compile("/Customs/Header/Message_Type/text()");
		
		String type = expr.evaluate(doc, XPathConstants.STRING).toString();
		response = (ICUSResponse) CUSFactory.get(CUSMessage.getCUSMessage(type));
		xstream.processAnnotations(response.getClass());
		response.addDefaultImplementation(xstream);
		
		xstream.fromXML(mResponse, response);
		SaveMessage(mResponse, "HQ", response);
		
		//hoangnt10: verify
		if("313".equals(response.getHeader().getMessageType())){//khong verify 313
			return response;
		}
       //TRUNGPQ10 RAO TESST
		//SignVerify.verifyXML247(mResponse, new StringBuffer(HQConstant.PATH_CER_HQ), new StringBuffer("customerPublicKey"));

		return response;
	}
	
	
	public ICUSResponse query247GW(ICUSRequest request) throws RemoteException, Exception {
		ICUSResponse response = null;
		bgw.services.hq247.TTDTPortalSoapProxy proxy = new bgw.services.hq247.TTDTPortalSoapProxy();
		CUSBeanFactory CUSFactory = CUSBeanFactory.getInstance();
		request.getHeader().setMessageType(request.getType().getCode());
		request.getHeader().setMessageName(request.getType().getName());
		request.getHeader().setSenderCode(HQConstant.Sender_Code);
		request.getHeader().setSenderName(HQConstant.Sender_Name);
		request.getHeader().setTransactionId(new UUIDGenerator().toString());
		request.getHeader().setTransactionDate(Calendar.getInstance().getTime());
		request.getHeader().setApplicationVersion("3.1");
		xstream.processAnnotations(request.getClass());
		String signedRequest = null;
		try {
			String mRequest = xstream.toXML(request);
			// add tag document
			if("312".indexOf(request.getType().getCode()) > -1){			
				System.out.println("sign 247");
				mRequest = mRequest.replace("<Customs>", "<Customs><Document>");
				mRequest = mRequest.replace("</Customs>", "</Document><DigitalSignatures></DigitalSignatures></Customs>");
				mRequest = trimxml(mRequest).replaceAll(">\\s*<", "><");
				signedRequest = CUSSign247.getInstance("247").sign(mRequest);
			}
			else{
				System.out.println("sign HQ");
				mRequest = trimxml(mRequest).replaceAll(">\\s*<", "><");
				signedRequest = CUSSign.getInstance("").sign(mRequest);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		SaveMessage(signedRequest, "HQ", request);
		
		String mResponse = proxy.WSProcess (CUSSign.getInstance("").getPublicKey(), signedRequest);
		
		if(StringUtils.isEmpty(mResponse)) {
			throw new Exception("Response message is null or empty");
		}
		if("312".equals(request.getHeader().getMessageType())){
			mResponse = mResponse.replaceAll("<Document>", "");
			mResponse = mResponse.replaceAll("</Document>", "");
		}
		System.out.println("A:"+mResponse);
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalSchema", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
		DocumentBuilder builder = factory.newDocumentBuilder();
		ByteArrayInputStream input =  new ByteArrayInputStream(mResponse.getBytes("UTF-8"));
		Document doc = builder.parse(input);
		XPathFactory xPathfactory = XPathFactory.newInstance();
		XPath xpath = xPathfactory.newXPath();
		XPathExpression expr = xpath.compile("/Customs/Header/Message_Type/text()");
		
		String type = expr.evaluate(doc, XPathConstants.STRING).toString();
		response = (ICUSResponse) CUSFactory.get(CUSMessage.getCUSMessage(type));
		xstream.processAnnotations(response.getClass());
		response.addDefaultImplementation(xstream);
		
		xstream.fromXML(mResponse, response);
		SaveMessage(mResponse, "HQ", response);
		
		if("313".equals(response.getHeader().getMessageType())){//khong verify 313
			return response;
		}
		//SignVerify.verifyXML247(mResponse, new StringBuffer(HQConstant.PATH_CER_HQ), new StringBuffer("customerPublicKey"));
		return response;
	}
	public ICUSResponse queryDC247(ICUSRequest request) throws RemoteException, Exception {
		ICUSResponse response = null;
		bgw.services.hq247.DCTTDTPortalSoapProxy proxyDCGW = new bgw.services.hq247.DCTTDTPortalSoapProxy();
		//bgw.services172.hq247.WSDCHQ247Proxy proxyDCGW = new bgw.services172.hq247.WSDCHQ247Proxy();
		
		CUSBeanFactory CUSFactory = CUSBeanFactory.getInstance();
		request.getHeader().setMessageType(request.getType().getCode());
		request.getHeader().setMessageName(request.getType().getName());
		request.getHeader().setSenderCode(HQConstant.Sender_Code);
		request.getHeader().setSenderName(HQConstant.Sender_Name);
		request.getHeader().setTransactionDate(Calendar.getInstance().getTime());
		if(request.getHeader().getTransactionId()==null || request.getHeader().getTransactionId().length()<1){
			request.getHeader().setTransactionId(new UUIDGenerator().toString());
		}
		request.getHeader().setApplicationVersion("3.1");
		xstream.processAnnotations(request.getClass());
		String mRequest = xstream.toXML(request);
		String signedRequest = null;
		try {
			if("807,808".indexOf(request.getType().getCode()) > -1){
				mRequest = mRequest.replace("<Customs>", "<Customs>");
				mRequest = mRequest.replace("</Customs>", "<DigitalSignatures></DigitalSignatures></Customs>");
				mRequest = trimxml(mRequest).replaceAll(">\\s*<", "><");
				signedRequest = CUSSign247.getInstance("247").sign(mRequest);
			}else{
				mRequest = trimxml(mRequest).replaceAll(">\\s*<", "><");
				signedRequest = CUSSign.getInstance("").sign(mRequest);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		SaveMessage(signedRequest, "HQ", request);
		String mResponse = proxyDCGW.reconcileProcess(CUSSign.getInstance("").getPublicKey(), signedRequest);
		System.out.println("A:"+mResponse);
		if(StringUtils.isEmpty(mResponse)) {
			throw new Exception("Response message is null or empty");
		}
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalSchema", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
		DocumentBuilder builder = factory.newDocumentBuilder();
		ByteArrayInputStream input =  new ByteArrayInputStream(mResponse.getBytes("UTF-8"));
		Document doc = builder.parse(input);
		XPathFactory xPathfactory = XPathFactory.newInstance();
		XPath xpath = xPathfactory.newXPath();
		XPathExpression expr = xpath.compile("/Customs/Header/Message_Type/text()");
		
		String type = expr.evaluate(doc, XPathConstants.STRING).toString();
		if(type.indexOf("95") > -1){
			type = "95X";
		}
		response = (ICUSResponse) CUSFactory.get(CUSMessage.getCUSMessage(type));	
		xstream.processAnnotations(response.getClass());
		response.addDefaultImplementation(xstream);
		
		xstream.fromXML(mResponse, response);
		SaveMessage(mResponse, "HQ", response);
		
		//hoangnt10: verify
		///SignVerify.verifyXML247(mResponse, new StringBuffer(HQConstant.PATH_CER_HQ), new StringBuffer(""));
		return response;
	}		
	public static void SaveMessage(String str,String type,CUSBean bean) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalSchema", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
		DocumentBuilder builder;
		String markData = "";
		
		try {
			if("301".equals(bean.getHeader().getMessageType())){
				CUS301.DataImp dataTemp = (com.cmn.entity.cus.CUS301.DataImp) bean.getData();
				markData = dataTemp.getSoCT();
			} else if("302".equals(bean.getHeader().getMessageType())){
				CUS302.DataImp dataTemp = (com.cmn.entity.cus.CUS302.DataImp) bean.getData();
				markData = dataTemp.getSoCT();
			} else if("101".equals(bean.getHeader().getMessageType())){
				CUS101.DataImp dataTemp = (com.cmn.entity.cus.CUS101.DataImp) bean.getData();
				markData = dataTemp.getMaDV()+"-"+dataTemp.getSoTK();
			} else if("102".equals(bean.getHeader().getMessageType())){
				CUS102.DataImp dataTemp = (com.cmn.entity.cus.CUS102.DataImp) bean.getData();
				markData = dataTemp.getMaDV()+"-"+dataTemp.getSoTK();
			} else if("201".equals(bean.getHeader().getMessageType())){
				CUS201.DataImp dataTemp = (com.cmn.entity.cus.CUS201.DataImp) bean.getData();
				markData = dataTemp.getItems().get(0).getMaDV();
			} else if("202".equals(bean.getHeader().getMessageType())){
				CUS202.DataImp dataTemp = (com.cmn.entity.cus.CUS202.DataImp) bean.getData();
				markData = dataTemp.getItems().get(0).getMaDV();
			}else if("311".equals(bean.getHeader().getMessageType()) ){
				CUS311.DataImp dataTemp = (CUS311.DataImp) bean.getData();
				markData = dataTemp.getSoHS();
			/*}else if("314".equals(bean.getHeader().getMessageType()) ){
				CUS314R.DataImp dataTemp = (CUS314R.DataImp) bean.getData();
				markData = dataTemp.getSoHS()*/;
			}else if("313".equals(bean.getHeader().getMessageType())){
				CUS313.DataImp dataTemp = (CUS313.DataImp) bean.getData();
				markData = dataTemp.getSoHS();
			} else{
				markData = bean.getHeader().getRequestId() == null ? "" : bean.getHeader().getRequestId();
			}
		} catch (Exception e) {
			e.printStackTrace();
			markData = "";
		}
		if(markData != null && markData.length()>0){
			markData = markData+"-";
		}else{
			markData = "";
		}
		
		try {
			System.out.println("markData: "+markData);
			DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			Calendar cal = Calendar.getInstance();
			String time = "/"+dateFormat.format(cal.getTime()).toString();
			
			builder = factory.newDocumentBuilder();
			InputSource is = new InputSource(new StringReader(str));
			Document doc = builder.parse(is);
			TransformerFactory transformerFactory = TransformerFactory
					.newInstance();
			transformerFactory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
			transformerFactory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalSchema", "");
			transformerFactory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			//create folder if not exist
			File file = new File(HQConstant.FOLDER_XML);
			if(!file.exists())
				file.mkdir();
			
			file = new File(HQConstant.FOLDER_XML+"/"+type);
			if(!file.exists())
				file.mkdir();
			
			file = new File(HQConstant.FOLDER_XML+"/"+type+time);
			if(!file.exists())
				file.mkdir();
			StringBuffer strBuff = new StringBuffer();
			strBuff = new StringBuffer(HQConstant.FOLDER_XML+"/"+type+time+"/").append(bean.getHeader().getMessageType()).append("_")
					.append(markData).append(bean.getHeader().getTransactionId()).append(".xml");
			System.out.println("XML --> "+strBuff.toString());
			StreamResult result = new StreamResult(new File(strBuff.toString()));
			transformer.transform(source, result);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public ICUSResponse unmarshalEC(String msg) throws RemoteException, Exception {
		CUSBeanFactory CUSFactory = CUSBeanFactory.getInstance();
		ICUSResponse response = null;				
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalSchema", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
		
		DocumentBuilder builder = factory.newDocumentBuilder();
		ByteArrayInputStream input =  new ByteArrayInputStream(msg.getBytes("UTF-8"));
		Document doc = builder.parse(input);
		XPathFactory xPathfactory = XPathFactory.newInstance();
		XPath xpath = xPathfactory.newXPath();
		XPathExpression expr = xpath.compile("/Customs/Header/Message_Type/text()");
		
		String type = expr.evaluate(doc, XPathConstants.STRING).toString();
		response = (ICUSResponse) CUSFactory.get(CUSMessage.getCUSMessage(type));
		xstream.processAnnotations(response.getClass());
		response.addDefaultImplementation(xstream);
		
		xstream.fromXML(msg, response);			
		return response;
	}
	public String sendEC(ICUSRequest request) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException, SAXException, IOException, ParserConfigurationException, TransformerException, MarshalException, XMLSignatureException, Exception{
		request.getHeader().setMessageType(request.getType().getCode());		
		request.getHeader().setSenderCode(HQConstant.Sender_Code);
		request.getHeader().setSenderName(HQConstant.Sender_Name);
		request.getHeader().setTransactionId(new UUIDGenerator().toString());
		request.getHeader().setTransactionDate(Calendar.getInstance().getTime());
		xstream.processAnnotations(request.getClass());
		String mResponse = xstream.toXML(request);
		mResponse = trimxml(mResponse).replaceAll(">\\s*<", "><");
		String signedResponse = CUSSign.getInstance("").sign(mResponse);
		SaveMessage(signedResponse, "HQ", request);
		return signedResponse;
	}
	public String[] getAttribute(String msg) throws RemoteException, Exception {
		String[] result = new String[2];
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalSchema", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
		DocumentBuilder builder = factory.newDocumentBuilder();
		ByteArrayInputStream input =  new ByteArrayInputStream(msg.getBytes("UTF-8"));
		Document doc = builder.parse(input);
		XPathFactory xPathfactory = XPathFactory.newInstance();
		XPath xpath = xPathfactory.newXPath();
		XPathExpression expr = xpath.compile("/Customs/Document/@id");		
		result[0] = expr.evaluate(doc, XPathConstants.STRING).toString();
		expr = xpath.compile("/Customs/Document/Data/@id");	
		result[1] = expr.evaluate(doc, XPathConstants.STRING).toString();		
		return result;
	}	
	public String getTransID(String msg) throws RemoteException, Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalSchema", "");
		factory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
		DocumentBuilder builder = factory.newDocumentBuilder();
		ByteArrayInputStream input =  new ByteArrayInputStream(msg.getBytes("UTF-8"));
		Document doc = builder.parse(input);
		XPathFactory xPathfactory = XPathFactory.newInstance();
		XPath xpath = xPathfactory.newXPath();
		XPathExpression expr = xpath.compile("/Customs/Document/Header/Transaction_ID/text()");		
		return expr.evaluate(doc, XPathConstants.STRING).toString();
	}
	
	public String trimxml(String input) {
	    BufferedReader reader = new BufferedReader(new StringReader(input));
	    StringBuffer result = new StringBuffer();
	    try {
	        String line;
	        while ( (line = reader.readLine() ) != null)
	            result.append(line.trim());
	        return result.toString();
	    } catch (IOException e) {
	        throw new RuntimeException(e);
	    }
	}
	private static String getMessageFromFile(String fileName) {
		String rs = "";
		try {
			File file = new File(fileName);
			if(file.exists()){
				try(InputStream is = new FileInputStream(file)){
					byte[] b  = new byte[(int) file.length()];
					int len = b.length;
					int total = 0;

					while (total < len) {
					  int result = is.read(b, total, len - total);
					  if (result == -1) {
					    break;
					  }
					  total += result;
					}
					rs = new String( b , "UTF-8");
				}				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
}
