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
public class CUS320 extends CUSResponse<CUS320.DataImp>{
	@XStreamOmitField
	public static final CUSMessage type = CUSMessage.CUS_320;
	
	public CUS320(){}
	
	static {
		CUSBeanFactory.getInstance().register(type, new CUS320());
	}	
	
	public CUSBeanImp<CUS320.DataImp> init() {
		CUS320 bean = new CUS320();
		bean.data = new CUS320.DataImp();
		return bean;
	}
	
	public CUSMessage getType() {
		return type;
	}
	
	@XStreamAlias("Data")
	public static class DataImp extends Data {
		private static final long serialVersionUID = 1L;

//		public DataImp(){}
		
		@XStreamImplicit(itemFieldName = "ThongTinChungTu")
		private List<ThongTinChungTu> ThongTinChungTu = new ArrayList<ThongTinChungTu>();

		public List<ThongTinChungTu> getThongTinChungTu() {
			return ThongTinChungTu;
		}

		public void setThongTinChungTu(List<ThongTinChungTu> thongTinChungTu) {
			ThongTinChungTu = thongTinChungTu;
		}
		
			
	}
	
	@XStreamAlias("ThongTinChungTu")
	public static class ThongTinChungTu implements Serializable{
		private static final long serialVersionUID = 1L;
		@XStreamAlias("ID_CT")
		private String id_ct;
		@XStreamAlias("So_TK_HQ")
		private String so_tk_hq;
		@XStreamAlias("Ma_LH")
		private String ma_lh;
		@XStreamAlias("Ngay_TK_HQ")
		private String ngay_tk_hq;
		@XStreamAlias("Ma_HQ")
		private String ma_hq;
		@XStreamAlias("So_TK_NP")
		private String so_tk_np;
		@XStreamAlias("Ngay_TK_NP")
		private String ngay_tk_np;
		@XStreamAlias("So_CT")
		private String so_ct;
		@XStreamAlias("KyHieu_CT")
		private String kyhieu_ct;
		@XStreamAlias("Ngay_CT")
		private String ngay_ct;
		@XStreamAlias("Ma_DV")
		private String ma_dv;
		@XStreamAlias("Ten_DV")
		private String ten_dv;
		@XStreamAlias("Chuong_NS")
		private String chuong_ns;
		@XStreamAlias("TieuMuc")
		private String tieumuc;
		@XStreamAlias("DiaChi")
		private String diachi;
		@XStreamAlias("Ma_LoaiPhi")
		private String ma_loaiphi;
		@XStreamAlias("Ma_CQT_DV_ThuPhi")
		private String ma_cqt_dv_thuphi;
		@XStreamAlias("Ten_LoaiPhi")
		private String ten_loaiphi;
		@XStreamAlias("Ma_DV_ThuPhi")
		private String ma_dv_thuphi;
		@XStreamAlias("Ten_DV_ThuPhi")
		private String ten_dv_thuphi;
		@XStreamAlias("TKKB")
		private String tKKB;
		@XStreamAlias("Ten_TKKB")
		private String ten_tkkb;
		@XStreamAlias("Ma_KB")
		private String maKB;
		@XStreamAlias("Ten_KB")
		private String tenKB;
		@XStreamAlias("SoTien_TO")
		private Double soTien_TO;
		@XStreamAlias("DienGiai")
		private String dienGiai;
		
		@XStreamImplicit(itemFieldName = "ThongTinNopTien")
		private List<ThongTinNopTien> ThongTinNopTien = new ArrayList<ThongTinNopTien>();



		public String getId_ct() {
			return id_ct;
		}



		public void setId_ct(String id_ct) {
			this.id_ct = id_ct;
		}



		public String getSo_tk_hq() {
			return so_tk_hq;
		}



		public void setSo_tk_hq(String so_tk_hq) {
			this.so_tk_hq = so_tk_hq;
		}



		public String getDienGiai() {
			return dienGiai;
		}



		public void setDienGiai(String dienGiai) {
			this.dienGiai = dienGiai;
		}



		public String getMa_lh() {
			return ma_lh;
		}



		public void setMa_lh(String ma_lh) {
			this.ma_lh = ma_lh;
		}



		public String getNgay_tk_hq() {
			return ngay_tk_hq;
		}



		public void setNgay_tk_hq(String ngay_tk_hq) {
			this.ngay_tk_hq = ngay_tk_hq;
		}



		public String getMa_hq() {
			return ma_hq;
		}



		public void setMa_hq(String ma_hq) {
			this.ma_hq = ma_hq;
		}



		public String getSo_tk_np() {
			return so_tk_np;
		}



		public void setSo_tk_np(String so_tk_np) {
			this.so_tk_np = so_tk_np;
		}



		public String getNgay_tk_np() {
			return ngay_tk_np;
		}



		public void setNgay_tk_np(String ngay_tk_np) {
			this.ngay_tk_np = ngay_tk_np;
		}



		public String getSo_ct() {
			return so_ct;
		}



		public void setSo_ct(String so_ct) {
			this.so_ct = so_ct;
		}



		public String getKyhieu_ct() {
			return kyhieu_ct;
		}



		public void setKyhieu_ct(String kyhieu_ct) {
			this.kyhieu_ct = kyhieu_ct;
		}



		public String getNgay_ct() {
			return ngay_ct;
		}



		public void setNgay_ct(String ngay_ct) {
			this.ngay_ct = ngay_ct;
		}



		public String getMa_dv() {
			return ma_dv;
		}



		public void setMa_dv(String ma_dv) {
			this.ma_dv = ma_dv;
		}



		public String getTen_dv() {
			return ten_dv;
		}



		public void setTen_dv(String ten_dv) {
			this.ten_dv = ten_dv;
		}



		public String getChuong_ns() {
			return chuong_ns;
		}



		public void setChuong_ns(String chuong_ns) {
			this.chuong_ns = chuong_ns;
		}



		public String getTieumuc() {
			return tieumuc;
		}



		public void setTieumuc(String tieumuc) {
			this.tieumuc = tieumuc;
		}



		public String getDiachi() {
			return diachi;
		}



		public void setDiachi(String diachi) {
			this.diachi = diachi;
		}



		public String getMa_loaiphi() {
			return ma_loaiphi;
		}



		public void setMa_loaiphi(String ma_loaiphi) {
			this.ma_loaiphi = ma_loaiphi;
		}



		public String getMa_cqt_dv_thuphi() {
			return ma_cqt_dv_thuphi;
		}



		public void setMa_cqt_dv_thuphi(String ma_cqt_dv_thuphi) {
			this.ma_cqt_dv_thuphi = ma_cqt_dv_thuphi;
		}



		public String getTen_loaiphi() {
			return ten_loaiphi;
		}



		public void setTen_loaiphi(String ten_loaiphi) {
			this.ten_loaiphi = ten_loaiphi;
		}



		public String getMa_dv_thuphi() {
			return ma_dv_thuphi;
		}



		public void setMa_dv_thuphi(String ma_dv_thuphi) {
			this.ma_dv_thuphi = ma_dv_thuphi;
		}



		public String getTen_dv_thuphi() {
			return ten_dv_thuphi;
		}



		public void setTen_dv_thuphi(String ten_dv_thuphi) {
			this.ten_dv_thuphi = ten_dv_thuphi;
		}



		public String gettKKB() {
			return tKKB;
		}



		public void settKKB(String tKKB) {
			this.tKKB = tKKB;
		}



		public String getTen_tkkb() {
			return ten_tkkb;
		}



		public void setTen_tkkb(String ten_tkkb) {
			this.ten_tkkb = ten_tkkb;
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



		public Double getSoTien_TO() {
			return soTien_TO;
		}



		public void setSoTien_TO(Double soTien_TO) {
			this.soTien_TO = soTien_TO;
		}



		public List<ThongTinNopTien> getThongTinNopTien() {
			return ThongTinNopTien;
		}



		public void setThongTinNopTien(List<ThongTinNopTien> thongTinNopTien) {
			ThongTinNopTien = thongTinNopTien;
		}
		
		
		
	}
	
	@XStreamAlias("ThongTinNopTien")
	public static class ThongTinNopTien implements Serializable{
		private static final long serialVersionUID = 1L;
		@XStreamAlias("Ma_BieuCuoc")
		private String ma_bieucuoc;
		@XStreamAlias("Ten_BieuCuoc")
		private String ten_bieucuoc;
		@XStreamAlias("So_VD")
		private String so_vd;
		@XStreamAlias("So_Hieu_Container")
		private String so_Hieu_Container;
		@XStreamAlias("Don_Gia")
		private String don_Gia;
		@XStreamAlias("So_Luong")
		private String so_Luong;
		@XStreamAlias("Don_Vi_Tinh")
		private String don_Vi_Tinh;
		@XStreamAlias("Thanh_Tien")
		private Double thanh_Tien;
		public String getMa_bieucuoc() {
			return ma_bieucuoc;
		}
		public void setMa_bieucuoc(String ma_bieucuoc) {
			this.ma_bieucuoc = ma_bieucuoc;
		}
		public String getTen_bieucuoc() {
			return ten_bieucuoc;
		}
		public void setTen_bieucuoc(String ten_bieucuoc) {
			this.ten_bieucuoc = ten_bieucuoc;
		}
		public String getSo_vd() {
			return so_vd;
		}
		public void setSo_vd(String so_vd) {
			this.so_vd = so_vd;
		}
		public String getSo_Hieu_Container() {
			return so_Hieu_Container;
		}
		public void setSo_Hieu_Container(String so_Hieu_Container) {
			this.so_Hieu_Container = so_Hieu_Container;
		}
		public String getDon_Gia() {
			return don_Gia;
		}
		public void setDon_Gia(String don_Gia) {
			this.don_Gia = don_Gia;
		}
		public String getSo_Luong() {
			return so_Luong;
		}
		public void setSo_Luong(String so_Luong) {
			this.so_Luong = so_Luong;
		}
		public String getDon_Vi_Tinh() {
			return don_Vi_Tinh;
		}
		public void setDon_Vi_Tinh(String don_Vi_Tinh) {
			this.don_Vi_Tinh = don_Vi_Tinh;
		}
		public Double getThanh_Tien() {
			return thanh_Tien;
		}
		public void setThanh_Tien(Double thanh_Tien) {
			this.thanh_Tien = thanh_Tien;
		}
		
		
	}

	public void addDefaultImplementation(XStream xstream) {
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}
}
