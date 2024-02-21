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
public class CUS108 extends CUSRequest<CUS108.DataImp> {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_108;
	static {
		CUSBeanFactory.getInstance().register(type, new CUS108());
	}

	@XStreamAlias("Data")
	public static class DataImp extends Data{
		private static final long serialVersionUID = 1L;

		public DataImp(){}

		@XStreamAlias("Ma_DV")
		private String ma_DV;

		
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

	public CUSBeanImp<CUS108.DataImp> init() {
		CUS108 bean = new CUS108();
		bean.data = new DataImp();
		bean.error = new Error();
		
		return bean;
	}

	public CUSMessage getType() {
		return type;
	}
	@XStreamAlias("Error")
	private Error error;
	

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}
	
public void addDefaultImplementation(XStream xstream) {
		
	}
}
