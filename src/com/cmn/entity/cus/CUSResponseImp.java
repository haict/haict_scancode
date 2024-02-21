package com.cmn.entity.cus;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUSResponseImp extends CUSResponse<CUSResponseImp.DataImp> {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_RESPONSE;

	public CUSResponseImp() {
	}

	static {
		CUSBeanFactory.getInstance().register(type, new CUSResponseImp());
	}

	@Override
	public CUSBeanImp<CUSResponseImp.DataImp> init() {
		CUSResponseImp bean = new CUSResponseImp();
		bean.data = new CUSResponseImp.DataImp();
		return bean;
	}

	@Override
	public CUSMessage getType() {
		return type;
	}

	@XStreamAlias("Data")
	public static class DataImp extends Data {
		private static final long serialVersionUID = 1L;
	}

	@Override
	public void addDefaultImplementation(XStream xstream) {
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}
}
