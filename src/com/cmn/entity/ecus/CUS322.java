package com.cmn.entity.ecus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
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
public class CUS322 extends CUSResponse<CUS322.DataImp>{
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_322;
	public CUS322(){}
	static {
		CUSBeanFactory.getInstance().register(type, new CUS322());
	}
	public CUSBeanImp<CUS322.DataImp> init() {
		CUS322 bean = new CUS322();
		bean.data = new CUS322.DataImp();
		return bean;
	}
	public CUSMessage getType() {
		return type;
	}
	
	@XStreamAlias("Data")
	public static class DataImp extends Data{
		private static final long serialVersionUID = 1L;
		public DataImp(){}
		
		@XStreamAlias("Ma_NH_TH")
		private String maNHTH;
		@XStreamAlias("Ten_NH_TH")
		private String tenNHTH;
		@XStreamAlias("TaiKhoan_TH")
		private String tkhoanTH;
		@XStreamAlias("Ten_TaiKhoan_TH")
		private String tenTaiKhoanTH;
		
		@XStreamAlias("Ma_LoaiPhi")
		private String maLoaiPhi;
		@XStreamAlias("Ten_LoaiPhi")
		private String tenLoaiPhi;
		@XStreamAlias("Ma_DV_ThuPhi")
		private String maDVThuPhi;
		@XStreamAlias("Ten_DV_ThuPhi")
		private String tenDVThuPhi;
		@XStreamAlias("Ma_CQT_DV_ThuPhi")
		private String maCQT;
		
		@XStreamAlias("Ma_DV")
		private String maDV;
		@XStreamAlias("Ten_DV")
		private String tenDV;	
		@XStreamAlias("Chuong_NS")
		private String chuongNS;
		@XStreamAlias("DiaChi")
		private String diaChi;
		@XStreamAlias("TKKB")
		private String tkKB;
		@XStreamAlias("Ten_TKKB")
		private String tenTKKB;
		@XStreamAlias("Ma_KB")
		private String maKB;
		@XStreamAlias("Ten_KB")
		private String tenKB;
		@XStreamAlias("ThongTinKhac")
		private String ttKhac;
		
		@XStreamImplicit(itemFieldName = "ThongTinChungTu_NP")
		private List<ThongTinChungTu_NP> thongTinCTNPs = new ArrayList<ThongTinChungTu_NP>();
		public String getMaNHTH() {
			return maNHTH;
		}

		public void setMaNHTH(String maNHTH) {
			this.maNHTH = maNHTH;
		}

		public String getTenNHTH() {
			return tenNHTH;
		}

		public void setTenNHTH(String tenNHTH) {
			this.tenNHTH = tenNHTH;
		}

		public String getTkhoanTH() {
			return tkhoanTH;
		}

		public void setTkhoanTH(String tkhoanTH) {
			this.tkhoanTH = tkhoanTH;
		}

		public String getTenTaiKhoanTH() {
			return tenTaiKhoanTH;
		}

		public void setTenTaiKhoanTH(String tenTaiKhoanTH) {
			this.tenTaiKhoanTH = tenTaiKhoanTH;
		}

		public String getMaLoaiPhi() {
			return maLoaiPhi;
		}

		public void setMaLoaiPhi(String maLoaiPhi) {
			this.maLoaiPhi = maLoaiPhi;
		}

		public String getTenLoaiPhi() {
			return tenLoaiPhi;
		}

		public void setTenLoaiPhi(String tenLoaiPhi) {
			this.tenLoaiPhi = tenLoaiPhi;
		}

		public String getMaDVThuPhi() {
			return maDVThuPhi;
		}

		public void setMaDVThuPhi(String maDVThuPhi) {
			this.maDVThuPhi = maDVThuPhi;
		}

		public String getTenDVThuPhi() {
			return tenDVThuPhi;
		}

		public void setTenDVThuPhi(String tenDVThuPhi) {
			this.tenDVThuPhi = tenDVThuPhi;
		}

		public String getMaCQT() {
			return maCQT;
		}

		public void setMaCQT(String maCQT) {
			this.maCQT = maCQT;
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

		public String getChuongNS() {
			return chuongNS;
		}

		public void setChuongNS(String chuongNS) {
			this.chuongNS = chuongNS;
		}

		public String getDiaChi() {
			return diaChi;
		}

		public void setDiaChi(String diaChi) {
			this.diaChi = diaChi;
		}

		public String getTkKB() {
			return tkKB;
		}

		public void setTkKB(String tkKB) {
			this.tkKB = tkKB;
		}

		public String getTenTKKB() {
			return tenTKKB;
		}

		public void setTenTKKB(String tenTKKB) {
			this.tenTKKB = tenTKKB;
		}

		public String getMaKB() {
			return maKB;
		}

		public void setMaKB(String maKB) {
			this.maKB = maKB;
		}

		public String getTenKB() {
			return tenKB;
		}

		public void setTenKB(String tenKB) {
			this.tenKB = tenKB;
		}

		public String getTtKhac() {
			return ttKhac;
		}

		public void setTtKhac(String ttKhac) {
			this.ttKhac = ttKhac;
		}

		public List<ThongTinChungTu_NP> getThongTinCTNPs() {
			return thongTinCTNPs;
		}

		public void setThongTinCTNPs(List<ThongTinChungTu_NP> thongTinCTNPs) {
			this.thongTinCTNPs = thongTinCTNPs;
		}
	}
	
	@XStreamAlias("ThongTinChungTu_NP")
	public static class ThongTinChungTu_NP implements Serializable{
		private static final long serialVersionUID = 1L;
		@XStreamAlias("ID_CT")
		private String idCT;
		@XStreamAlias("So_CT")
		private String soCT;
		@XStreamAlias("KyHieu_CT")
		private String khieuCT;
		@XStreamAlias("Ngay_CT")
		private Date ngayCT;
		@XStreamAlias("TieuMuc")
		private String tmuc;
		@XStreamAlias("SoTien")
		private Double soTien;
		@XStreamAlias("DienGiai")
		private String dienGiai;
		public String getIdCT() {
			return idCT;
		}
		public void setIdCT(String idCT) {
			this.idCT = idCT;
		}
		public String getSoCT() {
			return soCT;
		}
		public void setSoCT(String soCT) {
			this.soCT = soCT;
		}
		public String getKhieuCT() {
			return khieuCT;
		}
		public void setKhieuCT(String khieuCT) {
			this.khieuCT = khieuCT;
		}
		public Date getNgayCT() {
			return ngayCT;
		}
		public void setNgayCT(Date ngayCT) {
			this.ngayCT = ngayCT;
		}
		public Double getSoTien() {
			return soTien;
		}
		public void setSoTien(Double soTien) {
			this.soTien = soTien;
		}
		public String getDienGiai() {
			return dienGiai;
		}
		public void setDienGiai(String dienGiai) {
			this.dienGiai = dienGiai;
		}
		public String getTmuc() {
			return tmuc;
		}
		public void setTmuc(String tmuc) {
			this.tmuc = tmuc;
		}
		
	}
	@Override
	public void addDefaultImplementation(XStream xstream) {
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}
	
}
