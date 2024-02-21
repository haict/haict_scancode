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
public class CUS200B extends CUSRequest<CUS200B.DataImp> {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_200B;

	public CUS200B() {
	}

	static {
		CUSBeanFactory.getInstance().register(type, new CUS200B());
	}

	@Override
	public CUSBeanImp<CUS200B.DataImp> init() {
		CUS200B bean = new CUS200B();
		bean.error = new Error();
		bean.data = new CUS200B.DataImp();
		return bean;
	}
	
	public void setError(Error error) {
		this.error = error;
	}

	@Override
	public CUSMessage getType() {
		return type;
	}

	@XStreamAlias("Error")
	private Error error;
	
	public Error getError(){
		return this.error;
	}
	
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
