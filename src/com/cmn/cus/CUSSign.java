package com.cmn.cus;

import com.cmn.sec.Sign;

public class CUSSign extends Sign{
	private static final String configFilePath = "CUSSign.properties";
	
	private static Sign instance;
	private CUSSign(String type) throws Exception {
		super();
	}

	@Override
	protected String getConfigFilePath() {
		return configFilePath;
	}

	public static Sign getInstance(String type) throws Exception {
		try{
		if(instance == null) {
			synchronized (CUSSign.class) {
				if(instance == null) {
					instance = new CUSSign(type);
				}
			}
		}
		return instance;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
	}
}
