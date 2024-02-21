package com.cmn.entity.cus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS214 extends CUSResponse<CUS214.DataImp> {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_214;

	public CUS214() {
	}

	static {
		CUSBeanFactory.getInstance().register(type, new CUS214());
	}

	@Override
	public CUSBeanImp<CUS214.DataImp> init() {
		CUS214 bean = new CUS214();
		bean.data = new CUS214.DataImp();
		return bean;
	}

	@Override
	public CUSMessage getType() {
		return type;
	}

	@XStreamAlias("Data")
	public static class DataImp extends Data {
		private static final long serialVersionUID = 1L;

		@XStreamAlias("Ma_DV")
		private String ma_dv;

		@XStreamAlias("Ma_Chuong")
		private String ma_chuong;

		@XStreamAlias("Ten_DV")
		private String ten_dv;

		@XStreamAlias("DiaChi")
		private String diachi;

		public String getMa_dv() {
			return ma_dv;
		}

		public void setMa_dv(String ma_dv) {
			this.ma_dv = ma_dv;
		}

		public String getMa_chuong() {
			return ma_chuong;
		}

		public void setMa_chuong(String ma_chuong) {
			this.ma_chuong = ma_chuong;
		}

		public String getTen_dv() {
			return ten_dv;
		}

		public void setTen_dv(String ten_dv) {
			this.ten_dv = ten_dv;
		}

		public String getDiachi() {
			return diachi;
		}

		public void setDiachi(String diachi) {
			this.diachi = diachi;
		}

		
	}

	@Override
	public void addDefaultImplementation(XStream xstream) {
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}
}
