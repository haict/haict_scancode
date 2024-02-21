package com.cmn.entity.cus;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS502 extends CUSDelete {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_502;
	static {
		CUSBeanFactory.getInstance().register(type, new CUS502());
	}

	@Override
	public CUSMessage getType() {
		return type;
	}
	
	@XStreamAlias("Error")
	private Error error;

	@Override
	public CUSBean init() {
		CUS502 bean = new CUS502();
		bean.data = new DataImp();
		bean.error = new Error();
		return bean;
	}

	@Override
	public void addDefaultImplementation(XStream xstream) {
		// TODO Auto-generated method stub

	}

}
