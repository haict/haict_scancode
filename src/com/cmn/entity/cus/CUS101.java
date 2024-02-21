package com.cmn.entity.cus;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS101 extends CUSRequest<CUS101.DataImp> {
	@XStreamOmitField
	public static final CUSMessage type = CUSMessage.CUS_101;
	static {
		CUSBeanFactory.getInstance().register(type, new CUS101());
	}

	@XStreamAlias("Data")
	public static class DataImp extends Data{
		private static final long serialVersionUID = 1L;

		public DataImp(){}
		
		@XStreamAlias("Ma_DV")
		private String maDV;
		@XStreamAlias("Nam_DK")
		private String namDK;
		@XStreamAlias("So_TK")
		private String soTK;

		public String getMaDV() {
			return maDV;
		}

		public void setMaDV(String maDV) {
			this.maDV = maDV;
		}

		public String getNamDK() {
			return namDK;
		}

		public void setNamDK(String namDK) {
			this.namDK = namDK;
		}

		public String getSoTK() {
			return soTK;
		}

		public void setSoTK(String soTK) {
			this.soTK = soTK;
		}
	}

	public CUSBeanImp<CUS101.DataImp> init() {
		CUS101 bean = new CUS101();
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
