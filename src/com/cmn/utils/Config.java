package com.cmn.utils;

import java.util.ResourceBundle;

public class Config
{
	static{
		System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
	}
	
	//File path
	//private static final String FILE_NAME = "propertyVIB_New";
	private static final String FILE_NAME = "propertyCom";
	//
    public static final String ENCRYPT_CERT = ResourceBundle.getBundle(FILE_NAME).getString("encryptCert").trim();
    public static final String VERIFY_CERT = ResourceBundle.getBundle(FILE_NAME).getString("verifyCert").trim();
    public static final String SIGN_CERT = ResourceBundle.getBundle(FILE_NAME).getString("signCert").trim();
    public static final String SEARCH_CERT = ResourceBundle.getBundle(FILE_NAME).getString("searchCert").trim();
    public static final String KEY_STORE_PATH = ResourceBundle.getBundle(FILE_NAME).getString("keyStorePath").trim();
    public static final String KEY_STORE_PSW = ResourceBundle.getBundle(FILE_NAME).getString("keyStorePsw").trim();
    public static final String DECRYPT_PRIVATE_ALIAS = ResourceBundle.getBundle(FILE_NAME).getString("decryptPrivateAlias").trim();
    public static final String DECRYPT_PRIVATE_PSW = ResourceBundle.getBundle(FILE_NAME).getString("decryptPrivatePsw").trim();
    public static final String SIGN_PRIVATE_ALIAS = ResourceBundle.getBundle(FILE_NAME).getString("signPrivateAlias").trim();
    public static final String SIGN_PRIVATE_PSW = ResourceBundle.getBundle(FILE_NAME).getString("signPrivatePsw").trim();
    public static final String MTI = ResourceBundle.getBundle(FILE_NAME).getString("mti").trim();
    public static final String TRANS_CODE_TV = ResourceBundle.getBundle(FILE_NAME).getString("transCode_TV").trim();
    public static final String TRANS_CODE_KS = ResourceBundle.getBundle(FILE_NAME).getString("transCode_KS").trim();
    public static final String TRANS_CODE_HUY = ResourceBundle.getBundle(FILE_NAME).getString("transCode_HUY").trim();
    public static final String TRANS_SUB_CODE_TV = ResourceBundle.getBundle(FILE_NAME).getString("transSubCode_TV").trim();
    public static final String TRANS_SUB_CODE_KS = ResourceBundle.getBundle(FILE_NAME).getString("transSubCode_KS").trim();
    public static final String TRANS_SUB_CODE_HUY = ResourceBundle.getBundle(FILE_NAME).getString("transSubCode_HUY").trim();
    public static final String CHANNEL_TYPE = ResourceBundle.getBundle(FILE_NAME).getString("channelType").trim();
    public static final String PARTNER_NO = ResourceBundle.getBundle(FILE_NAME).getString("partnerNo").trim();
    public static final String MAKER_ID = ResourceBundle.getBundle(FILE_NAME).getString("makerId").trim();
    public static final String LOCAL_MACHINE = ResourceBundle.getBundle(FILE_NAME).getString("localMachine").trim();
    public static final String LOCAL_IP_ADDRESS = ResourceBundle.getBundle(FILE_NAME).getString("localIPAddress").trim();
    public static final String TRANS_TYPE = ResourceBundle.getBundle(FILE_NAME).getString("transtype").trim();
    public static final String CCYCD = ResourceBundle.getBundle(FILE_NAME).getString("ccycd").trim();
    public static final String EGATEWS = ResourceBundle.getBundle(FILE_NAME).getString("egatews").trim();
    
    //Bank gateway config
    public static final String BGW_HQ_TTDT = ResourceBundle.getBundle(FILE_NAME).getString("bgw.hq.ttdt").trim();
    public static final String BGW_HQ_DCDT = ResourceBundle.getBundle(FILE_NAME).getString("bgw.hq.dcdt").trim();
    public static final String BGW_TCT = ResourceBundle.getBundle(FILE_NAME).getString("bgw.tct").trim();
    public static final String BGW_HQ_TIMEOUT = ResourceBundle.getBundle(FILE_NAME).getString("bgw.hq.timeout").trim();    
    public Config()
    {
    }
}
