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
public class CUS207 extends CUSResponse<CUS207.DataImp> {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_207;

	public CUS207() {
	}

	static {
		CUSBeanFactory.getInstance().register(type, new CUS206());
	}

	@Override
	public CUSBeanImp<CUS207.DataImp> init() {
		CUS207 bean = new CUS207();
		bean.data = new CUS207.DataImp();
		return bean;
	}

	@Override
	public CUSMessage getType() {
		return type;
	}

	@XStreamAlias("Data")
	public static class DataImp extends Data {
		private static final long serialVersionUID = 1L;

		@XStreamAlias("Ma_KB")
		private String ma_kb;

		@XStreamAlias("Ten_KB")
		private String ten_kb;

		@XStreamAlias("MA_DBHC")
		private String ma_dbhc;

		@XStreamAlias("Ten_DBHC")
		private String ten_dbhc;
		
		@XStreamAlias("SHTK")
		private String shtk;

		@XStreamAlias("LOAI_TK")
		private String loai_tk;
		
		@XStreamAlias("Ma_NH_QL")
		private String ma_nh_ql;

		@XStreamAlias("Ma_NH")
		private String ma_nh;
		@XStreamAlias("Ma_CITAD_KB")
		private String ma_citad_kb;
		public String getMa_kb() {
			return ma_kb;
		}
		public void setMa_kb(String ma_kb) {
			this.ma_kb = ma_kb;
		}
		public String getTen_kb() {
			return ten_kb;
		}
		public void setTen_kb(String ten_kb) {
			this.ten_kb = ten_kb;
		}
		public String getMa_dbhc() {
			return ma_dbhc;
		}
		public void setMa_dbhc(String ma_dbhc) {
			this.ma_dbhc = ma_dbhc;
		}
		public String getTen_dbhc() {
			return ten_dbhc;
		}
		public void setTen_dbhc(String ten_dbhc) {
			this.ten_dbhc = ten_dbhc;
		}
		public String getShtk() {
			return shtk;
		}
		public void setShtk(String shtk) {
			this.shtk = shtk;
		}
		public String getLoai_tk() {
			return loai_tk;
		}
		public void setLoai_tk(String loai_tk) {
			this.loai_tk = loai_tk;
		}
		public String getMa_nh_ql() {
			return ma_nh_ql;
		}
		public void setMa_nh_ql(String ma_nh_ql) {
			this.ma_nh_ql = ma_nh_ql;
		}
		public String getMa_nh() {
			return ma_nh;
		}
		public void setMa_nh(String ma_nh) {
			this.ma_nh = ma_nh;
		}
		public String getMa_citad_kb() {
			return ma_citad_kb;
		}
		public void setMa_citad_kb(String ma_citad_kb) {
			this.ma_citad_kb = ma_citad_kb;
		}


		
		
	}

	@Override
	public void addDefaultImplementation(XStream xstream) {
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}
}
