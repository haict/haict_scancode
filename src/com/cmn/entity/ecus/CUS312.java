package com.cmn.entity.ecus;

import com.cmn.CUSMessage;
import com.cmn.cus.CUSDateTimeConverter01;
import com.cmn.entity.cus.CUSBeanFactory;
import com.cmn.entity.cus.CUSBeanImp;
import com.cmn.entity.cus.CUSRequest;
import com.cmn.entity.cus.Data;
import com.cmn.entity.cus.Error;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS312 extends CUSRequest<CUS312.DataImp>{
	@XStreamOmitField
	public static final CUSMessage type = CUSMessage.CUS_312;
	
	public CUS312(){}
	
	static {
		CUSBeanFactory.getInstance().register(type, new CUS312());
	}	
	
	public CUSBeanImp<CUS312.DataImp> init() {
		CUS312 bean = new CUS312();
		bean.data = new CUS312.DataImp();
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
		
		@XStreamAlias("So_HS")
		private String soHS;
		
		@XStreamAlias("Loai_HS")
		private Short loaiHS;
		
		@XStreamAlias("Ma_DV")
		private String maDV;
		
		@XStreamAlias("Ten_DV")
		private String tenDV;
		
		@XStreamAlias("DiaChi")
		private String diaChi;
		
		@XStreamAlias("Ngay_HL")		
		//@XStreamConverter(value = CUSDateTimeConverter01.class)
		private String ngayHL;
		
		@XStreamAlias("ThongTin_NNT")
		private ThongTinNNT thongTin_NNT;						

		public String getSoHS() {
			return soHS;
		}

		public void setSoHS(String soHS) {
			this.soHS = soHS;
		}

		public Short getLoaiHS() {
			return loaiHS;
		}

		public void setLoaiHS(Short loaiHS) {
			this.loaiHS = loaiHS;
		}

		public String getMaDV() {
			return maDV;
		}

		public void setMaDV(String maDV) {
			this.maDV = maDV;
		}

		public String getTenDV() {
			return tenDV;
		}

		public void setTenDV(String tenDV) {
			this.tenDV = tenDV;
		}

		public String getDiaChi() {
			return diaChi;
		}

		public void setDiaChi(String diaChi) {
			this.diaChi = diaChi;
		}

		public ThongTinNNT getThongTin_NNT() {
			return thongTin_NNT;
		}

		public void setThongTin_NNT(ThongTinNNT thongTin_NNT) {
			this.thongTin_NNT = thongTin_NNT;
		}		

		public String getNgayHL() {
			return ngayHL;
		}

		public void setNgayHL(String ngayHL) {
			this.ngayHL = ngayHL;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
	}
	
	@Override
	public void addDefaultImplementation(XStream xstream) {
//		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}
}
