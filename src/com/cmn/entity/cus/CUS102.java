package com.cmn.entity.cus;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS102 extends CUSRequest<CUS102.DataImp> {
	@XStreamOmitField
	public static final CUSMessage type = CUSMessage.CUS_102;
	static {
		CUSBeanFactory.getInstance().register(type, new CUS102());
	}

	@XStreamAlias("Data")
	public static class DataImp extends Data{
		private static final long serialVersionUID = 1L;

		public DataImp(){}
		
		@XStreamAlias("Ma_DV")
		private String maDV;
//		@XStreamConverter(value = ToAttributedValueConverter.class, nulls={Short.class})
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

	public CUSBeanImp<CUS102.DataImp> init() {
		CUS102 bean = new CUS102();
		bean.data = new DataImp();
		return bean;
	}

	public CUSMessage getType() {
		return type;
	}

	@Override
	public void addDefaultImplementation(XStream xstream) {
		// TODO Auto-generated method stub
		
	}
	
}
