package com.cmn.entity.ecus;

import java.util.List;

import com.cmn.CUSMessage;
import com.cmn.entity.cus.CUSBeanFactory;
import com.cmn.entity.cus.CUSBeanImp;
import com.cmn.entity.cus.CUSResponse;
import com.cmn.entity.cus.Data;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS314 extends CUSResponse<CUS314.DataImp>{
	@XStreamOmitField
	public static final CUSMessage type = CUSMessage.CUS_314;
	public CUS314(){}
	
	static {
		CUSBeanFactory.getInstance().register(type, new CUS314());
	}	
	
	public CUSBeanImp<CUS314.DataImp> init() {
		CUS314 bean = new CUS314();
		bean.data = new CUS314.DataImp();
		return bean;
	}
	
	public CUSMessage getType() {
		return type;
	}
	
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
		
		@XStreamAlias("Ngay_HL_UQ")
		private String ngay_HL_UQ;
		
		@XStreamAlias("Ngay_HHL_UQ")
		private String ngay_HHL_UQ;
		
		@XStreamAlias("ThongTin_NNT")
		private ThongTinNNT thongTin_NNT;
				
		@XStreamImplicit(itemFieldName="ThongTinDinhKem")
		private List<ThongTinDinhKem> thongTinDinhKem;

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

		public String getNgay_HL_UQ() {
			return ngay_HL_UQ;
		}

		public void setNgay_HL_UQ(String ngay_HL_UQ) {
			this.ngay_HL_UQ = ngay_HL_UQ;
		}

		public String getNgay_HHL_UQ() {
			return ngay_HHL_UQ;
		}

		public void setNgay_HHL_UQ(String ngay_HHL_UQ) {
			this.ngay_HHL_UQ = ngay_HHL_UQ;
		}

		public ThongTinNNT getThongTin_NNT() {
			return thongTin_NNT;
		}

		public void setThongTin_NNT(ThongTinNNT thongTin_NNT) {
			this.thongTin_NNT = thongTin_NNT;
		}

		public List<ThongTinDinhKem> getThongTinDinhKem() {
			return thongTinDinhKem;
		}

		public void setThongTinDinhKem(List<ThongTinDinhKem> thongTinDinhKem) {
			this.thongTinDinhKem = thongTinDinhKem;
		}			
	}
	
	@Override
	public void addDefaultImplementation(XStream xstream) {
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}
}
