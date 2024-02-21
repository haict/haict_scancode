package com.cmn.entity.cus;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS107 extends CUSRequest<CUS107.DataImp> {
	@XStreamOmitField
	public static final CUSMessage type = CUSMessage.CUS_107;
	static {
		CUSBeanFactory.getInstance().register(type, new CUS107());
	}

	@XStreamAlias("Data")
	public static class DataImp extends Data{
		private static final long serialVersionUID = 1L;

		public DataImp(){}
		
		@XStreamAlias("Transaction_Req")
		private String transaction_Req;

		public String getTransaction_Req() {
			return transaction_Req;
		}

		public void setTransaction_Req(String transaction_Req) {
			this.transaction_Req = transaction_Req;
		}
	}

	public CUSBeanImp<CUS107.DataImp> init() {
		CUS107 bean = new CUS107();
		bean.data = new DataImp();
		return bean;
	}

	public CUSMessage getType() {
		return type;
	}

	public void addDefaultImplementation(XStream xstream) {
		// TODO Auto-generated method stub
		
	}
	
}
