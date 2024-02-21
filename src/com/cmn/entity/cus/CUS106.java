package com.cmn.entity.cus;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS106 extends CUSRequest<CUS106.DataImp> {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_106;
	static {
		CUSBeanFactory.getInstance().register(type, new CUS106());
	}

	@XStreamAlias("Data")
	public static class DataImp extends Data{
		private static final long serialVersionUID = 1L;

		public DataImp(){}
		
		@XStreamAlias("Loai_DM")
		private String loai_DM;
		
		@XStreamAlias("Ma_DV")
		private String ma_DV;

		/**
		 * @return the loai_DM
		 */
		public String getLoai_DM() {
			return loai_DM;
		}

		/**
		 * @param loai_DM the loai_DM to set
		 */
		public void setLoai_DM(String loai_DM) {
			this.loai_DM = loai_DM;
		}

		/**
		 * @return the ma_DV
		 */
		public String getMa_DV() {
			return ma_DV;
		}

		/**
		 * @param ma_DV the ma_DV to set
		 */
		public void setMa_DV(String ma_DV) {
			this.ma_DV = ma_DV;
		}
		
	}

	public CUSBeanImp<CUS106.DataImp> init() {
		CUS106 bean = new CUS106();
		bean.data = new DataImp();
		return bean;
	}

	public CUSMessage getType() {
		return type;
	}

	public void addDefaultImplementation(XStream xstream) {
		
	}
	
}
