package com.cmn.entity.ecus;

import com.cmn.CUSMessage;
import com.cmn.entity.cus.CUSBeanFactory;
import com.cmn.entity.cus.CUSBeanImp;
import com.cmn.entity.cus.CUSResponse;
import com.cmn.entity.cus.Data;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS313 extends CUSResponse<CUS313.DataImp>{
	@XStreamOmitField
	public static final CUSMessage type = CUSMessage.CUS_313;
	public CUS313(){}
	
	static {
		CUSBeanFactory.getInstance().register(type, new CUS313());
	}	
	
	public CUSBeanImp<CUS313.DataImp> init() {
		CUS313 bean = new CUS313();
		bean.data = new CUS313.DataImp();
		return bean;
	}
	
	public CUSMessage getType() {
		return type;
	}
	
	@XStreamAlias("Data")
	public static class DataImp extends Data {
		private static final long serialVersionUID = 1L;
		
		@XStreamAlias("So_HS")
		private String soHS;
		

		public String getSoHS() {
			return soHS;
		}

		public void setSoHS(String soHS) {
			this.soHS = soHS;
		}
			
	}
	
	@Override
	public void addDefaultImplementation(XStream xstream) {
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}
}
