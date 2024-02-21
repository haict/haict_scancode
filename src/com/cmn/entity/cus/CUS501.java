package com.cmn.entity.cus;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS501 extends CUSDelete {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_501;
	static {
		CUSBeanFactory.getInstance().register(type, new CUS501());
	}
	@XStreamAlias("Error")
	private Error error;
	
	@Override
	public CUSMessage getType() {
		return type;
	}

	@Override
	public CUSBean init() {
		CUS501 bean = new CUS501();
		bean.data = new DataImp();
		bean.error = new Error();
		return bean;
	}
	@Override
	public void addDefaultImplementation(XStream xstream) {
		// TODO Auto-generated method stub

	}

}
