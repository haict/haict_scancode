package com.cmn.entity.ecus;

import java.io.Serializable;

import com.cmn.CUSMessage;
import com.cmn.cus.CUSDoubleConverter;
import com.cmn.entity.cus.CUSBeanFactory;
import com.cmn.entity.cus.CUSBeanImp;
import com.cmn.entity.cus.CUSResponse;
import com.cmn.entity.cus.Data;
import com.cmn.entity.cus.TaiKhoan_NopTien;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS305 extends CUSResponse<CUS305.DataImp>{
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_305;
	public CUS305(){}
	static {
		CUSBeanFactory.getInstance().register(type, new CUS305());
	}
	public CUSBeanImp<CUS305.DataImp> init() {
		CUS305 bean = new CUS305();
		bean.data = new CUS305.DataImp();
		return bean;
	}
	public CUSMessage getType() {
		return type;
	}
	
	@XStreamAlias("Data")
	public static class DataImp extends Data{
		private static final long serialVersionUID = 1L;

		public DataImp(){}
		
		@XStreamAlias("ThongTinChungTu")
		private ThongTinChungTu thongTinChungTu;
		@XStreamAlias("ThongTinGiaoDich")
		private ThongTinGiaoDich thongTinGiaoDich;

		public ThongTinChungTu getThongTinChungTu() {
			return thongTinChungTu;
		}
		public void setThongTinChungTu(ThongTinChungTu thongTinChungTu) {
			this.thongTinChungTu = thongTinChungTu;
		}
		public ThongTinGiaoDich getThongTinGiaoDich() {
			return thongTinGiaoDich;
		}
		public void setThongTinGiaoDich(ThongTinGiaoDich thongTinGiaoDich) {
			this.thongTinGiaoDich = thongTinGiaoDich;
		}								
	}
	@XStreamAlias("ThongTinChungTu")	
	public static class ThongTinChungTu implements Serializable{
		private static final long serialVersionUID = 1L;				
		@XStreamAlias("So_HS")
		private Long soHS;
		
		@XStreamAlias("Ma_DVQL")
		private String maDVQL;
		
		@XStreamAlias("Ten_DVQL")
		private String tenDVQL;
		
		@XStreamAlias("KyHieu_CT")
		private String kyHieuCT;
		
		@XStreamAlias("So_CT")
		private String soCT;
		
		@XStreamAlias("Nam_CT")
		private Short namCT;						
		
		@XStreamAlias("ThongTin_NopTien")
		private ThongTinNopTien thongTin_NopTien;
		
		@XStreamAlias("ChiTiet_CT")
		private ChiTietCT chiTietCT;

		public Long getSoHS() {
			return soHS;
		}

		public void setSoHS(Long soHS) {
			this.soHS = soHS;
		}

		public String getMaDVQL() {
			return maDVQL;
		}

		public void setMaDVQL(String maDVQL) {
			this.maDVQL = maDVQL;
		}
		public String getTenDVQL() {
			return tenDVQL;
		}

		public void setTenDVQL(String tenDVQL) {
			this.tenDVQL = tenDVQL;
		}

		public String getKyHieuCT() {
			return kyHieuCT;
		}

		public void setKyHieuCT(String kyHieuCT) {
			this.kyHieuCT = kyHieuCT;
		}

		public String getSoCT() {
			return soCT;
		}

		public void setSoCT(String soCT) {
			this.soCT = soCT;
		}

		public Short getNamCT() {
			return namCT;
		}

		public void setNamCT(Short namCT) {
			this.namCT = namCT;
		}

		public ThongTinNopTien getThongTin_NopTien() {
			return thongTin_NopTien;
		}

		public void setThongTin_NopTien(ThongTinNopTien thongTin_NopTien) {
			this.thongTin_NopTien = thongTin_NopTien;
		}

		public ChiTietCT getChiTietCT() {
			return chiTietCT;
		}

		public void setChiTietCT(ChiTietCT chiTietCT) {
			this.chiTietCT = chiTietCT;
		}					
	}
	@XStreamAlias("ThongTinGiaoDich")
	public static class ThongTinGiaoDich implements Serializable{
		private static final long serialVersionUID = 1L;
		
		@XStreamAlias("NguoiNopTien")
		private NguoiNopTien nguoiNopTien;
		
		@XStreamAlias("TaiKhoan_NopTien")
		private TaiKhoan_NopTien taiKhoanNopTien;

		public NguoiNopTien getNguoiNopTien() {
			return nguoiNopTien;
		}

		public void setNguoiNopTien(NguoiNopTien nguoiNopTien) {
			this.nguoiNopTien = nguoiNopTien;
		}

		public TaiKhoan_NopTien getTaiKhoanNopTien() {
			return taiKhoanNopTien;
		}

		public void setTaiKhoanNopTien(TaiKhoan_NopTien taiKhoanNopTien) {
			this.taiKhoanNopTien = taiKhoanNopTien;
		}							
	}
	
	@XStreamAlias("ThongTin_NopTien")
	public static class ThongTinNopTien implements Serializable{
		private static final long serialVersionUID = 1L;
		@XStreamAlias("Ma_NT")
		private String maNT;
		
		@XStreamConverter(value = CUSDoubleConverter.class)
		@XStreamAlias("TyGia")
		private Double tyGia;
		
		@XStreamConverter(value = CUSDoubleConverter.class)
		@XStreamAlias("TongTien_NT")
		private Double tongTienNT;
		
		@XStreamConverter(value = CUSDoubleConverter.class)
		@XStreamAlias("TongTien_VND")
		private Double tongTienVND;
	}
	
	public static class ChiTietCT implements Serializable{
		private static final long serialVersionUID = 1L;
		@XStreamAlias("STT")
		private Short stt;
		
		@XStreamAlias("NDKT")
		private String nDKT;
		
		@XStreamAlias("Ten_NDKT")
		private String tenNDKT;
		
		@XStreamConverter(value = CUSDoubleConverter.class)
		@XStreamAlias("SoTien_NT")
		private Double soTienNT;
		
		@XStreamConverter(value = CUSDoubleConverter.class)		
		@XStreamAlias("SoTien_VND")
		private Double soTienVND;
		
		@XStreamAlias("GhiChu")
		private String ghiChu;
	}
	@XStreamAlias("NguoiNopTien")
	public static class NguoiNopTien implements Serializable{
		private static final long serialVersionUID = 1L;	
		@XStreamAlias("Ma_ST")
		private String maST;
		@XStreamAlias("So_CMT")
		private String soCMT;
		@XStreamAlias("Ten_NNT")
		private String tenNNT;
		@XStreamAlias("DiaChi")
		private String diaChi;
		@XStreamAlias("TT_Khac")
		private String ttKhac;
		public String getMaST() {
			return maST;
		}
		public void setMaST(String maST) {
			this.maST = maST;
		}
		public String getSoCMT() {
			return soCMT;
		}
		public void setSoCMT(String soCMT) {
			this.soCMT = soCMT;
		}
		public String getTenNNT() {
			return tenNNT;
		}
		public void setTenNNT(String tenNNT) {
			this.tenNNT = tenNNT;
		}
		public String getDiaChi() {
			return diaChi;
		}
		public void setDiaChi(String diaChi) {
			this.diaChi = diaChi;
		}
		public String getTtKhac() {
			return ttKhac;
		}
		public void setTtKhac(String ttKhac) {
			this.ttKhac = ttKhac;
		}				
	}	

	@Override
	public void addDefaultImplementation(XStream xstream) {
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}
	
}
