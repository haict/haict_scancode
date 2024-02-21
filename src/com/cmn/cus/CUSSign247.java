package com.cmn.cus;

import com.cmn.sec.Sign;

public class CUSSign247 extends Sign{
	private static final String configFilePath = "CUSSign.properties";
	
	private static Sign instance;
	private CUSSign247(String type) throws Exception {
		super();
	}

	@Override
	protected String getConfigFilePath() {
		return configFilePath;
	}

	public static Sign getInstance(String type) throws Exception {
		try{
		if(instance == null) {
			synchronized (CUSSign247.class) {
				if(instance == null) {
					instance = new CUSSign247(type);
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
