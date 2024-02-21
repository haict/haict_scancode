package com.cmn.entity.cus;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS503 extends CUSDelete {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_503;
	static {
		CUSBeanFactory.getInstance().register(type, new CUS503());
	}

	public CUSMessage getType() {
		return type;
	}
	
	@Override
	public CUSBean init() {
		CUS503 bean = new CUS503();
		bean.data = new DataImp();
		return bean;
	}
	
	@Override
	public void addDefaultImplementation(XStream xstream) {
		// TODO Auto-generated method stub
		
	}
}

