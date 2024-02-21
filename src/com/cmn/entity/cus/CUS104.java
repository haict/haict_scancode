package com.cmn.entity.cus;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS104 extends CUSRequest<CUS104.DataImp> {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_104;
	static {
		CUSBeanFactory.getInstance().register(type, new CUS104());
	}

	@XStreamAlias("Data")
	public static class DataImp extends Data{
		private static final long serialVersionUID = 1L;

		public DataImp(){}
		
		@XStreamAlias("Ma_DV")
		private String maDV;
		@XStreamAlias("KyHieu_CT")
		private String kyHieu_CT;
		public String getMaDV() {
			return maDV;
		}
		public void setMaDV(String maDV) {
			this.maDV = maDV;
		}
		public String getKyHieu_CT() {
			return kyHieu_CT;
		}
		public void setKyHieu_CT(String kyHieu_CT) {
			this.kyHieu_CT = kyHieu_CT;
		}
		public String getSoCT() {
			return soCT;
		}
		public void setSoCT(String soCT) {
			this.soCT = soCT;
		}

		@XStreamAlias("So_CT")
		private String soCT;

	}

	public CUSBeanImp<CUS104.DataImp> init() {
		CUS104 bean = new CUS104();
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
