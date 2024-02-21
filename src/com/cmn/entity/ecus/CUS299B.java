package com.cmn.entity.ecus;

import com.cmn.CUSMessage;
import com.cmn.entity.cus.CUSBeanFactory;
import com.cmn.entity.cus.CUSBeanImp;
import com.cmn.entity.cus.CUSRequest;
import com.cmn.entity.cus.Data;
import com.cmn.entity.cus.Error;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS299B extends CUSRequest<CUS299B.DataImp> {

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_299B;

	public CUS299B() {
	}

	static {
		CUSBeanFactory.getInstance().register(type, new CUS299B());
	}

	@Override
	public CUSBeanImp<CUS299B.DataImp> init() {
		CUS299B bean = new CUS299B();
		bean.error = new Error();
		bean.data = new CUS299B.DataImp();
		return bean;
	}

	@Override
	public CUSMessage getType() {
		return type;
	}

	@XStreamAlias("Error")
	private Error error;
	
	@XStreamAlias("Data")
	public static class DataImp extends Data {
		private static final long serialVersionUID = 1L;

		public DataImp() {
		}
	}

	@Override
	public void addDefaultImplementation(XStream xstream) {
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}

}
