package com.cmn.entity.ecus;

import com.cmn.CUSMessage;
import com.cmn.entity.cus.CUSBeanFactory;
import com.cmn.entity.cus.CUSBeanImp;
import com.cmn.entity.cus.CUSRequest;
import com.cmn.entity.cus.Data;
import com.cmn.entity.cus.Error;
import com.cmn.entity.cus.IError;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS213 extends CUSRequest<CUS213.DataImp>{
	@XStreamOmitField
	public static final CUSMessage type = CUSMessage.CUS_213;
	
	public CUS213(){}
	
	static {
		CUSBeanFactory.getInstance().register(type, new CUS213());
	}	
	
	public CUSBeanImp<CUS213.DataImp> init() {
		CUS213 bean = new CUS213();
		bean.data = new CUS213.DataImp();
		bean.error = new Error();
		return bean;
	}
	
	public CUSMessage getType() {
		return type;
	}
	
	@XStreamAlias("Error")
	private Error error;
	
	@XStreamAlias("Data")
	public static class DataImp extends Data {
		private static final long serialVersionUID = 1L;
		
		@XStreamAlias("Loai_TD_TraLoi")
		private Short loaiTDTraLoi;
		
		@XStreamAlias("Ma_KQ_XL")
		private Short maKQXL;
		
		@XStreamAlias("NoiDung_XL")
		private String noiDungXL;

		public Short getLoaiTDTraLoi() {
			return loaiTDTraLoi;
		}

		public void setLoaiTDTraLoi(Short loaiTDTraLoi) {
			this.loaiTDTraLoi = loaiTDTraLoi;
		}

		public Short getMaKQXL() {
			return maKQXL;
		}

		public void setMaKQXL(Short maKQXL) {
			this.maKQXL = maKQXL;
		}

		public String getNoiDungXL() {
			return noiDungXL;
		}
		
		public void setNoiDungXL(String noiDungXL) {
			this.noiDungXL = noiDungXL;
		}						
	}
	
	@Override
	public void addDefaultImplementation(XStream xstream) {
//		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}

	/**
	 * @return the error
	 */
	public Error getError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(Error error) {
		this.error = error;
	}
	
}
