package com.cmn.entity.cus;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS900 extends CUSRequest<CUS900.DataImp>{
	
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_900;
	static {
		CUSBeanFactory.getInstance().register(type, new CUS900());
	}
	
	@XStreamAlias("Error")
	private Error error;

	public CUSMessage getType() {
		return type;
	}
	public CUSBeanImp<CUS900.DataImp> init() {
		CUS900 bean = new CUS900();
		bean.data = new DataImp();
		bean.error = new Error();
		return bean;
	}
	
	@XStreamAlias("Data")
	public static class DataImp extends Data{
		private static final long serialVersionUID = 1L;
		@XStreamAlias("Ma_NH_DC")
		private String maNhDc;
		@XStreamAlias("Ngay_DC")
		private String ngayDc;
		@XStreamAlias("Loai_TD_DC")
		private String loaiTdDc;
		
		public DataImp(){}

		public String getMaNhDc() {
			return maNhDc;
		}

		public void setMaNhDc(String maNhDc) {
			this.maNhDc = maNhDc;
		}

		public String getNgayDc() {
			return ngayDc;
		}

		public void setNgayDc(String ngayDc) {
			this.ngayDc = ngayDc;
		}

		public String getLoaiTdDc() {
			return loaiTdDc;
		}

		public void setLoaiTdDc(String loaiTdDc) {
			this.loaiTdDc = loaiTdDc;
		}
	}
	
	@Override
	public void addDefaultImplementation(XStream xstream) {
	}
}