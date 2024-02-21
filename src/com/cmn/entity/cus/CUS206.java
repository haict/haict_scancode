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
public class CUS206 extends CUSResponse<CUS206.DataImp> {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_206;

	public CUS206() {
	}

	static {
		CUSBeanFactory.getInstance().register(type, new CUS206());
	}

	@Override
	public CUSBeanImp<CUS206.DataImp> init() {
		CUS206 bean = new CUS206();
		bean.data = new CUS206.DataImp();
		return bean;
	}

	@Override
	public CUSMessage getType() {
		return type;
	}

	@XStreamAlias("Data")
	public static class DataImp extends Data {
		private static final long serialVersionUID = 1L;
		
		@XStreamAlias("MA_HQ")
		private String ma_hq;
		
		@XStreamAlias("TEN_HQ")
		private String ten_hq;
		
		@XStreamAlias("MA_LH")
		private String ma_lh;
		
		@XStreamAlias("MA_XN")
		private String ma_xn;							
		
		@XStreamAlias("NGAY_DK")
		private String ngay_dk;
		
		@XStreamAlias("SO_TK")
		private String so_tk;							
		
		@XStreamAlias("NGUOI_UY_THAC_XUAT_KHAU")
		private String nguoi_uy_thac_xuat_khau;
		
		@XStreamAlias("MA_DAI_LY_HQ")
		private String ma_dai_ly_hq;
		
		@XStreamAlias("TEN_DAI_LY_HQ")
		private String ten_dai_ly_hq;
		
		@XStreamAlias("SO_VAN_DON_1")
		private String so_van_don_1;
		
		@XStreamAlias("SO_VAN_DON_2")
		private String so_van_don_2;
		
		@XStreamAlias("SO_VAN_DON_3")
		private String so_van_don_3;
		
		@XStreamAlias("SO_VAN_DON_4")
		private String so_van_don_4;
		
		@XStreamAlias("SO_VAN_DON_5")
		private String so_van_don_5;
		
		@XStreamAlias("SO_LUONG")
		private String so_luong;
		
		@XStreamAlias("DVT_SO_LUONG")
		private String dvt_so_luong;
		
		@XStreamAlias("TONG_TRONG_LUONG")
		private String tong_trong_luong;
		
		@XStreamAlias("DVT_TONG_TRONG_LUONG")
		private String dvt_tong_trong_luong;
		
		@XStreamAlias("MA_DIA_DIEM_LUU_KHO")
		private String ma_dia_diem_luu_kho;
		
		@XStreamAlias("TEN_DIA_DIEM_LUU_KHO")
		private String ten_dia_diem_luu_kho;
		
		@XStreamAlias("MA_DIA_DIEM_DO_HANG")
		private String ma_dia_diem_do_hang;
		
		@XStreamAlias("TEN_DIA_DIEM_DO_HANG")
		private String ten_dia_diem_do_hang;
		
		@XStreamAlias("MA_DIA_DIEM_XEP_HANG")
		private String ma_dia_diem_xep_hang;
		
		@XStreamAlias("TEN_DIA_DIEM_XEP_HANG")
		private String ten_dia_diem_xep_hang;
		
		@XStreamAlias("MA_PHUONG_TIEN_VC")
		private String ma_phuong_tien_vc;
		
		@XStreamAlias("TEN_PHUONG_TIEN_VC")
		private String ten_phuong_tien_vc;
		
		@XStreamAlias("NGAY_HANG_DEN")
		private String ngay_hang_den;
		
		@XStreamAlias("NGAY_DUOC_PHEP_NHAP_KHO_DAU_TIEN")
		private String ngay_duoc_phep_nhap_kho_dau_tien;
		
		@XStreamAlias("SO_HOA_DON")
		private String so_hoa_don;
		
		@XStreamAlias("NGAY_PHAT_HANH")
		private String ngay_phat_hanh;
		
		@XStreamAlias("PHUONG_THUC_THANH_TOAN")
		private String phuong_thuc_thanh_toan;	
		
		@XStreamAlias("TONG_TRI_GIA_HOA_DON")
		private String tong_tri_gia_hoa_don;
		
		@XStreamAlias("NGUYEN_TE_TONG_TRI_GIA_HOA_DON")
		private String nguyen_te_tong_tri_gia_hoa_don;
		
		@XStreamAlias("TONG_TRI_GIA_TINH_THUE")
		private String tong_tri_gia_tinh_thue;
		
		@XStreamAlias("GIAY_PHEP_XUAT_NHAP_KHAU_1")
		private String giay_phep_xuat_nhap_khau_1;
		
		@XStreamAlias("GIAY_PHEP_XUAT_NHAP_KHAU_2")
		private String giay_phep_xuat_nhap_khau_2;
		
		@XStreamAlias("GIAY_PHEP_XUAT_NHAP_KHAU_3")
		private String giay_phep_xuat_nhap_khau_3;
		
		@XStreamAlias("GIAY_PHEP_XUAT_NHAP_KHAU_4")
		private String giay_phep_xuat_nhap_khau_4;
		
		@XStreamAlias("GIAY_PHEP_XUAT_NHAP_KHAU_5")
		private String giay_phep_xuat_nhap_khau_5;							
		
		@XStreamAlias("NGUOI_XUAT_KHAU")
		private Nguoi_xuat_khau nguoi_xuat_khau;
		
		@XStreamAlias("NGUOI_UY_THAC_XNK")
		private Nguoi_uy_thac_xnk nguoi_uy_thac_xnk;
		
		@XStreamAlias("NGUOI_NHAP_KHAU")
		private Nguoi_nhap_khau nguoi_nhap_khau;
		
		@XStreamAlias("TT_HANG")
		private Tt_hang tt_hang;

		/**
		 * @return the ma_hq
		 */
		public String getMa_hq() {
			return ma_hq;
		}

		/**
		 * @param ma_hq the ma_hq to set
		 */
		public void setMa_hq(String ma_hq) {
			this.ma_hq = ma_hq;
		}

		/**
		 * @return the ten_hq
		 */
		public String getTen_hq() {
			return ten_hq;
		}

		/**
		 * @param ten_hq the ten_hq to set
		 */
		public void setTen_hq(String ten_hq) {
			this.ten_hq = ten_hq;
		}

		/**
		 * @return the ma_lh
		 */
		public String getMa_lh() {
			return ma_lh;
		}

		/**
		 * @param ma_lh the ma_lh to set
		 */
		public void setMa_lh(String ma_lh) {
			this.ma_lh = ma_lh;
		}

		/**
		 * @return the ma_xn
		 */
		public String getMa_xn() {
			return ma_xn;
		}

		/**
		 * @param ma_xn the ma_xn to set
		 */
		public void setMa_xn(String ma_xn) {
			this.ma_xn = ma_xn;
		}

		/**
		 * @return the ngay_dk
		 */
		public String getNgay_dk() {
			return ngay_dk;
		}

		/**
		 * @param ngay_dk the ngay_dk to set
		 */
		public void setNgay_dk(String ngay_dk) {
			this.ngay_dk = ngay_dk;
		}

		/**
		 * @return the so_tk
		 */
		public String getSo_tk() {
			return so_tk;
		}

		/**
		 * @param so_tk the so_tk to set
		 */
		public void setSo_tk(String so_tk) {
			this.so_tk = so_tk;
		}

		/**
		 * @return the nguoi_uy_thac_xuat_khau
		 */
		public String getNguoi_uy_thac_xuat_khau() {
			return nguoi_uy_thac_xuat_khau;
		}

		/**
		 * @param nguoi_uy_thac_xuat_khau the nguoi_uy_thac_xuat_khau to set
		 */
		public void setNguoi_uy_thac_xuat_khau(String nguoi_uy_thac_xuat_khau) {
			this.nguoi_uy_thac_xuat_khau = nguoi_uy_thac_xuat_khau;
		}

		/**
		 * @return the ma_dai_ly_hq
		 */
		public String getMa_dai_ly_hq() {
			return ma_dai_ly_hq;
		}

		/**
		 * @param ma_dai_ly_hq the ma_dai_ly_hq to set
		 */
		public void setMa_dai_ly_hq(String ma_dai_ly_hq) {
			this.ma_dai_ly_hq = ma_dai_ly_hq;
		}

		/**
		 * @return the ten_dai_ly_hq
		 */
		public String getTen_dai_ly_hq() {
			return ten_dai_ly_hq;
		}

		/**
		 * @param ten_dai_ly_hq the ten_dai_ly_hq to set
		 */
		public void setTen_dai_ly_hq(String ten_dai_ly_hq) {
			this.ten_dai_ly_hq = ten_dai_ly_hq;
		}

		/**
		 * @return the so_van_don_1
		 */
		public String getSo_van_don_1() {
			return so_van_don_1;
		}

		/**
		 * @param so_van_don_1 the so_van_don_1 to set
		 */
		public void setSo_van_don_1(String so_van_don_1) {
			this.so_van_don_1 = so_van_don_1;
		}

		/**
		 * @return the so_van_don_2
		 */
		public String getSo_van_don_2() {
			return so_van_don_2;
		}

		/**
		 * @param so_van_don_2 the so_van_don_2 to set
		 */
		public void setSo_van_don_2(String so_van_don_2) {
			this.so_van_don_2 = so_van_don_2;
		}

		/**
		 * @return the so_van_don_3
		 */
		public String getSo_van_don_3() {
			return so_van_don_3;
		}

		/**
		 * @param so_van_don_3 the so_van_don_3 to set
		 */
		public void setSo_van_don_3(String so_van_don_3) {
			this.so_van_don_3 = so_van_don_3;
		}

		/**
		 * @return the so_van_don_4
		 */
		public String getSo_van_don_4() {
			return so_van_don_4;
		}

		/**
		 * @param so_van_don_4 the so_van_don_4 to set
		 */
		public void setSo_van_don_4(String so_van_don_4) {
			this.so_van_don_4 = so_van_don_4;
		}

		/**
		 * @return the so_van_don_5
		 */
		public String getSo_van_don_5() {
			return so_van_don_5;
		}

		/**
		 * @param so_van_don_5 the so_van_don_5 to set
		 */
		public void setSo_van_don_5(String so_van_don_5) {
			this.so_van_don_5 = so_van_don_5;
		}

		/**
		 * @return the so_luong
		 */
		public String getSo_luong() {
			return so_luong;
		}

		/**
		 * @param so_luong the so_luong to set
		 */
		public void setSo_luong(String so_luong) {
			this.so_luong = so_luong;
		}

		/**
		 * @return the dvt_so_luong
		 */
		public String getDvt_so_luong() {
			return dvt_so_luong;
		}

		/**
		 * @param dvt_so_luong the dvt_so_luong to set
		 */
		public void setDvt_so_luong(String dvt_so_luong) {
			this.dvt_so_luong = dvt_so_luong;
		}

		/**
		 * @return the tong_trong_luong
		 */
		public String getTong_trong_luong() {
			return tong_trong_luong;
		}

		/**
		 * @param tong_trong_luong the tong_trong_luong to set
		 */
		public void setTong_trong_luong(String tong_trong_luong) {
			this.tong_trong_luong = tong_trong_luong;
		}

		/**
		 * @return the dvt_tong_trong_luong
		 */
		public String getDvt_tong_trong_luong() {
			return dvt_tong_trong_luong;
		}

		/**
		 * @param dvt_tong_trong_luong the dvt_tong_trong_luong to set
		 */
		public void setDvt_tong_trong_luong(String dvt_tong_trong_luong) {
			this.dvt_tong_trong_luong = dvt_tong_trong_luong;
		}

		/**
		 * @return the ma_dia_diem_luu_kho
		 */
		public String getMa_dia_diem_luu_kho() {
			return ma_dia_diem_luu_kho;
		}

		/**
		 * @param ma_dia_diem_luu_kho the ma_dia_diem_luu_kho to set
		 */
		public void setMa_dia_diem_luu_kho(String ma_dia_diem_luu_kho) {
			this.ma_dia_diem_luu_kho = ma_dia_diem_luu_kho;
		}

		/**
		 * @return the ten_dia_diem_luu_kho
		 */
		public String getTen_dia_diem_luu_kho() {
			return ten_dia_diem_luu_kho;
		}

		/**
		 * @param ten_dia_diem_luu_kho the ten_dia_diem_luu_kho to set
		 */
		public void setTen_dia_diem_luu_kho(String ten_dia_diem_luu_kho) {
			this.ten_dia_diem_luu_kho = ten_dia_diem_luu_kho;
		}

		/**
		 * @return the ma_dia_diem_do_hang
		 */
		public String getMa_dia_diem_do_hang() {
			return ma_dia_diem_do_hang;
		}

		/**
		 * @param ma_dia_diem_do_hang the ma_dia_diem_do_hang to set
		 */
		public void setMa_dia_diem_do_hang(String ma_dia_diem_do_hang) {
			this.ma_dia_diem_do_hang = ma_dia_diem_do_hang;
		}

		/**
		 * @return the ten_dia_diem_do_hang
		 */
		public String getTen_dia_diem_do_hang() {
			return ten_dia_diem_do_hang;
		}

		/**
		 * @param ten_dia_diem_do_hang the ten_dia_diem_do_hang to set
		 */
		public void setTen_dia_diem_do_hang(String ten_dia_diem_do_hang) {
			this.ten_dia_diem_do_hang = ten_dia_diem_do_hang;
		}

		/**
		 * @return the ma_dia_diem_xep_hang
		 */
		public String getMa_dia_diem_xep_hang() {
			return ma_dia_diem_xep_hang;
		}

		/**
		 * @param ma_dia_diem_xep_hang the ma_dia_diem_xep_hang to set
		 */
		public void setMa_dia_diem_xep_hang(String ma_dia_diem_xep_hang) {
			this.ma_dia_diem_xep_hang = ma_dia_diem_xep_hang;
		}

		/**
		 * @return the ten_dia_diem_xep_hang
		 */
		public String getTen_dia_diem_xep_hang() {
			return ten_dia_diem_xep_hang;
		}

		/**
		 * @param ten_dia_diem_xep_hang the ten_dia_diem_xep_hang to set
		 */
		public void setTen_dia_diem_xep_hang(String ten_dia_diem_xep_hang) {
			this.ten_dia_diem_xep_hang = ten_dia_diem_xep_hang;
		}

		/**
		 * @return the ma_phuong_tien_vc
		 */
		public String getMa_phuong_tien_vc() {
			return ma_phuong_tien_vc;
		}

		/**
		 * @param ma_phuong_tien_vc the ma_phuong_tien_vc to set
		 */
		public void setMa_phuong_tien_vc(String ma_phuong_tien_vc) {
			this.ma_phuong_tien_vc = ma_phuong_tien_vc;
		}

		/**
		 * @return the ten_phuong_tien_vc
		 */
		public String getTen_phuong_tien_vc() {
			return ten_phuong_tien_vc;
		}

		/**
		 * @param ten_phuong_tien_vc the ten_phuong_tien_vc to set
		 */
		public void setTen_phuong_tien_vc(String ten_phuong_tien_vc) {
			this.ten_phuong_tien_vc = ten_phuong_tien_vc;
		}

		/**
		 * @return the ngay_hang_den
		 */
		public String getNgay_hang_den() {
			return ngay_hang_den;
		}

		/**
		 * @param ngay_hang_den the ngay_hang_den to set
		 */
		public void setNgay_hang_den(String ngay_hang_den) {
			this.ngay_hang_den = ngay_hang_den;
		}

		/**
		 * @return the ngay_duoc_phep_nhap_kho_dau_tien
		 */
		public String getNgay_duoc_phep_nhap_kho_dau_tien() {
			return ngay_duoc_phep_nhap_kho_dau_tien;
		}

		/**
		 * @param ngay_duoc_phep_nhap_kho_dau_tien the ngay_duoc_phep_nhap_kho_dau_tien to set
		 */
		public void setNgay_duoc_phep_nhap_kho_dau_tien(String ngay_duoc_phep_nhap_kho_dau_tien) {
			this.ngay_duoc_phep_nhap_kho_dau_tien = ngay_duoc_phep_nhap_kho_dau_tien;
		}

		/**
		 * @return the so_hoa_don
		 */
		public String getSo_hoa_don() {
			return so_hoa_don;
		}

		/**
		 * @param so_hoa_don the so_hoa_don to set
		 */
		public void setSo_hoa_don(String so_hoa_don) {
			this.so_hoa_don = so_hoa_don;
		}

		/**
		 * @return the ngay_phat_hanh
		 */
		public String getNgay_phat_hanh() {
			return ngay_phat_hanh;
		}

		/**
		 * @param ngay_phat_hanh the ngay_phat_hanh to set
		 */
		public void setNgay_phat_hanh(String ngay_phat_hanh) {
			this.ngay_phat_hanh = ngay_phat_hanh;
		}

		/**
		 * @return the phuong_thuc_thanh_toan
		 */
		public String getPhuong_thuc_thanh_toan() {
			return phuong_thuc_thanh_toan;
		}

		/**
		 * @param phuong_thuc_thanh_toan the phuong_thuc_thanh_toan to set
		 */
		public void setPhuong_thuc_thanh_toan(String phuong_thuc_thanh_toan) {
			this.phuong_thuc_thanh_toan = phuong_thuc_thanh_toan;
		}

		/**
		 * @return the tong_tri_gia_hoa_don
		 */
		public String getTong_tri_gia_hoa_don() {
			return tong_tri_gia_hoa_don;
		}

		/**
		 * @param tong_tri_gia_hoa_don the tong_tri_gia_hoa_don to set
		 */
		public void setTong_tri_gia_hoa_don(String tong_tri_gia_hoa_don) {
			this.tong_tri_gia_hoa_don = tong_tri_gia_hoa_don;
		}

		/**
		 * @return the nguyen_te_tong_tri_gia_hoa_don
		 */
		public String getNguyen_te_tong_tri_gia_hoa_don() {
			return nguyen_te_tong_tri_gia_hoa_don;
		}

		/**
		 * @param nguyen_te_tong_tri_gia_hoa_don the nguyen_te_tong_tri_gia_hoa_don to set
		 */
		public void setNguyen_te_tong_tri_gia_hoa_don(String nguyen_te_tong_tri_gia_hoa_don) {
			this.nguyen_te_tong_tri_gia_hoa_don = nguyen_te_tong_tri_gia_hoa_don;
		}

		/**
		 * @return the tong_tri_gia_tinh_thue
		 */
		public String getTong_tri_gia_tinh_thue() {
			return tong_tri_gia_tinh_thue;
		}

		/**
		 * @param tong_tri_gia_tinh_thue the tong_tri_gia_tinh_thue to set
		 */
		public void setTong_tri_gia_tinh_thue(String tong_tri_gia_tinh_thue) {
			this.tong_tri_gia_tinh_thue = tong_tri_gia_tinh_thue;
		}

		/**
		 * @return the giay_phep_xuat_nhap_khau_1
		 */
		public String getGiay_phep_xuat_nhap_khau_1() {
			return giay_phep_xuat_nhap_khau_1;
		}

		/**
		 * @param giay_phep_xuat_nhap_khau_1 the giay_phep_xuat_nhap_khau_1 to set
		 */
		public void setGiay_phep_xuat_nhap_khau_1(String giay_phep_xuat_nhap_khau_1) {
			this.giay_phep_xuat_nhap_khau_1 = giay_phep_xuat_nhap_khau_1;
		}

		/**
		 * @return the giay_phep_xuat_nhap_khau_2
		 */
		public String getGiay_phep_xuat_nhap_khau_2() {
			return giay_phep_xuat_nhap_khau_2;
		}

		/**
		 * @param giay_phep_xuat_nhap_khau_2 the giay_phep_xuat_nhap_khau_2 to set
		 */
		public void setGiay_phep_xuat_nhap_khau_2(String giay_phep_xuat_nhap_khau_2) {
			this.giay_phep_xuat_nhap_khau_2 = giay_phep_xuat_nhap_khau_2;
		}

		/**
		 * @return the giay_phep_xuat_nhap_khau_3
		 */
		public String getGiay_phep_xuat_nhap_khau_3() {
			return giay_phep_xuat_nhap_khau_3;
		}

		/**
		 * @param giay_phep_xuat_nhap_khau_3 the giay_phep_xuat_nhap_khau_3 to set
		 */
		public void setGiay_phep_xuat_nhap_khau_3(String giay_phep_xuat_nhap_khau_3) {
			this.giay_phep_xuat_nhap_khau_3 = giay_phep_xuat_nhap_khau_3;
		}

		/**
		 * @return the giay_phep_xuat_nhap_khau_4
		 */
		public String getGiay_phep_xuat_nhap_khau_4() {
			return giay_phep_xuat_nhap_khau_4;
		}

		/**
		 * @param giay_phep_xuat_nhap_khau_4 the giay_phep_xuat_nhap_khau_4 to set
		 */
		public void setGiay_phep_xuat_nhap_khau_4(String giay_phep_xuat_nhap_khau_4) {
			this.giay_phep_xuat_nhap_khau_4 = giay_phep_xuat_nhap_khau_4;
		}

		/**
		 * @return the giay_phep_xuat_nhap_khau_5
		 */
		public String getGiay_phep_xuat_nhap_khau_5() {
			return giay_phep_xuat_nhap_khau_5;
		}

		/**
		 * @param giay_phep_xuat_nhap_khau_5 the giay_phep_xuat_nhap_khau_5 to set
		 */
		public void setGiay_phep_xuat_nhap_khau_5(String giay_phep_xuat_nhap_khau_5) {
			this.giay_phep_xuat_nhap_khau_5 = giay_phep_xuat_nhap_khau_5;
		}

		/**
		 * @return the nguoi_xuat_khau
		 */
		public Nguoi_xuat_khau getNguoi_xuat_khau() {
			return nguoi_xuat_khau;
		}

		/**
		 * @param nguoi_xuat_khau the nguoi_xuat_khau to set
		 */
		public void setNguoi_xuat_khau(Nguoi_xuat_khau nguoi_xuat_khau) {
			this.nguoi_xuat_khau = nguoi_xuat_khau;
		}

		/**
		 * @return the nguoi_uy_thac_xnk
		 */
		public Nguoi_uy_thac_xnk getNguoi_uy_thac_xnk() {
			return nguoi_uy_thac_xnk;
		}

		/**
		 * @param nguoi_uy_thac_xnk the nguoi_uy_thac_xnk to set
		 */
		public void setNguoi_uy_thac_xnk(Nguoi_uy_thac_xnk nguoi_uy_thac_xnk) {
			this.nguoi_uy_thac_xnk = nguoi_uy_thac_xnk;
		}

		/**
		 * @return the nguoi_nhap_khau
		 */
		public Nguoi_nhap_khau getNguoi_nhap_khau() {
			return nguoi_nhap_khau;
		}

		/**
		 * @param nguoi_nhap_khau the nguoi_nhap_khau to set
		 */
		public void setNguoi_nhap_khau(Nguoi_nhap_khau nguoi_nhap_khau) {
			this.nguoi_nhap_khau = nguoi_nhap_khau;
		}

		/**
		 * @return the tt_hang
		 */
		public Tt_hang getTt_hang() {
			return tt_hang;
		}

		/**
		 * @param tt_hang the tt_hang to set
		 */
		public void setTt_hang(Tt_hang tt_hang) {
			this.tt_hang = tt_hang;
		}		
	}
	
	public class Nguoi_xuat_khau  implements Serializable{
		private static final long serialVersionUID = 1L;
		
		@XStreamAlias("MA_SO_THUE")
		private String ma_so_thue;	
		
		@XStreamAlias("TEN")
		private String ten;			
		
		@XStreamAlias("DIA_CHI_1")
		private String dia_chi_1;	
		
		@XStreamAlias("DIA_CHI_2")
		private String dia_chi_2;	
		
		@XStreamAlias("DIA_CHI_3")
		private String dia_chi_3;	
		
		@XStreamAlias("DIA_CHI_4")
		private String dia_chi_4;	
		
		@XStreamAlias("MA_NUOC")
		private String ma_nuoc;

		/**
		 * @return the ma_so_thue
		 */
		public String getMa_so_thue() {
			return ma_so_thue;
		}

		/**
		 * @param ma_so_thue the ma_so_thue to set
		 */
		public void setMa_so_thue(String ma_so_thue) {
			this.ma_so_thue = ma_so_thue;
		}

		/**
		 * @return the ten
		 */
		public String getTen() {
			return ten;
		}

		/**
		 * @param ten the ten to set
		 */
		public void setTen(String ten) {
			this.ten = ten;
		}

		/**
		 * @return the dia_chi_1
		 */
		public String getDia_chi_1() {
			return dia_chi_1;
		}

		/**
		 * @param dia_chi_1 the dia_chi_1 to set
		 */
		public void setDia_chi_1(String dia_chi_1) {
			this.dia_chi_1 = dia_chi_1;
		}

		/**
		 * @return the dia_chi_2
		 */
		public String getDia_chi_2() {
			return dia_chi_2;
		}

		/**
		 * @param dia_chi_2 the dia_chi_2 to set
		 */
		public void setDia_chi_2(String dia_chi_2) {
			this.dia_chi_2 = dia_chi_2;
		}

		/**
		 * @return the dia_chi_3
		 */
		public String getDia_chi_3() {
			return dia_chi_3;
		}

		/**
		 * @param dia_chi_3 the dia_chi_3 to set
		 */
		public void setDia_chi_3(String dia_chi_3) {
			this.dia_chi_3 = dia_chi_3;
		}

		/**
		 * @return the dia_chi_4
		 */
		public String getDia_chi_4() {
			return dia_chi_4;
		}

		/**
		 * @param dia_chi_4 the dia_chi_4 to set
		 */
		public void setDia_chi_4(String dia_chi_4) {
			this.dia_chi_4 = dia_chi_4;
		}

		/**
		 * @return the ma_nuoc
		 */
		public String getMa_nuoc() {
			return ma_nuoc;
		}

		/**
		 * @param ma_nuoc the ma_nuoc to set
		 */
		public void setMa_nuoc(String ma_nuoc) {
			this.ma_nuoc = ma_nuoc;
		}
		
	}
	
	public class Nguoi_uy_thac_xnk implements Serializable{
		private static final long serialVersionUID = 1L;

		@XStreamAlias("MA_SO_THUE")
		private String ma_so_thue;	
		
		@XStreamAlias("TEN")
		private String ten;

		/**
		 * @return the ma_so_thue
		 */
		public String getMa_so_thue() {
			return ma_so_thue;
		}

		/**
		 * @param ma_so_thue the ma_so_thue to set
		 */
		public void setMa_so_thue(String ma_so_thue) {
			this.ma_so_thue = ma_so_thue;
		}

		/**
		 * @return the ten
		 */
		public String getTen() {
			return ten;
		}

		/**
		 * @param ten the ten to set
		 */
		public void setTen(String ten) {
			this.ten = ten;
		}			
		
	}
	
	public class Nguoi_nhap_khau implements Serializable{
		private static final long serialVersionUID = 1L;

		@XStreamAlias("MA_SO_THUE")
		private String ma_so_thue;			
		
		@XStreamAlias("TEN")
		private String ten;			
		
		@XStreamAlias("DIA_CHI_1")
		private String dia_chi_1;

		/**
		 * @return the ma_so_thue
		 */
		public String getMa_so_thue() {
			return ma_so_thue;
		}

		/**
		 * @param ma_so_thue the ma_so_thue to set
		 */
		public void setMa_so_thue(String ma_so_thue) {
			this.ma_so_thue = ma_so_thue;
		}

		/**
		 * @return the ten
		 */
		public String getTen() {
			return ten;
		}

		/**
		 * @param ten the ten to set
		 */
		public void setTen(String ten) {
			this.ten = ten;
		}

		/**
		 * @return the dia_chi_1
		 */
		public String getDia_chi_1() {
			return dia_chi_1;
		}

		/**
		 * @param dia_chi_1 the dia_chi_1 to set
		 */
		public void setDia_chi_1(String dia_chi_1) {
			this.dia_chi_1 = dia_chi_1;
		}
	}
	
	public class Tt_hang implements Serializable{
		private static final long serialVersionUID = 1L;
		@XStreamAlias("HANG")
		private Hang hang;

		/**
		 * @return the hang
		 */
		public Hang getHang() {
			return hang;
		}

		/**
		 * @param hang the hang to set
		 */
		public void setHang(Hang hang) {
			this.hang = hang;
		} 
	}
	
	public class Hang implements Serializable{
		private static final long serialVersionUID = 1L;

		@XStreamAlias("MA_HANG")
		private String ma_hang;		
		
		@XStreamAlias("TEN_HANG")
		private String ten_hang;	
		
		@XStreamAlias("NUOC_NHAP_KHAU")
		private String nuoc_nhap_khau;

		/**
		 * @return the ma_hang
		 */
		public String getMa_hang() {
			return ma_hang;
		}

		/**
		 * @param ma_hang the ma_hang to set
		 */
		public void setMa_hang(String ma_hang) {
			this.ma_hang = ma_hang;
		}

		/**
		 * @return the ten_hang
		 */
		public String getTen_hang() {
			return ten_hang;
		}

		/**
		 * @param ten_hang the ten_hang to set
		 */
		public void setTen_hang(String ten_hang) {
			this.ten_hang = ten_hang;
		}

		/**
		 * @return the nuoc_nhap_khau
		 */
		public String getNuoc_nhap_khau() {
			return nuoc_nhap_khau;
		}

		/**
		 * @param nuoc_nhap_khau the nuoc_nhap_khau to set
		 */
		public void setNuoc_nhap_khau(String nuoc_nhap_khau) {
			this.nuoc_nhap_khau = nuoc_nhap_khau;
		}

		@XStreamImplicit(itemFieldName = "THUE")
		private List<Thue> thue = new ArrayList<Thue>();

		public List<Thue> getThue() {
			return thue;
		}

		public void setThue(List<Thue> thue) {
			this.thue = thue;
		}
	}
	
	
	@XStreamAlias("Thue")
	public class Thue implements Serializable{
		private static final long serialVersionUID = 1L;
	
		@XStreamImplicit(itemFieldName = "LOAI_THUE")
		private List<String> loai_thue = new ArrayList<String>();
		
		@XStreamImplicit(itemFieldName = "TRI_GIA_TINH_THUE")
		private List<String> tri_gia_tinh_thue = new ArrayList<String>();
		
		@XStreamImplicit(itemFieldName = "TIEN_THUE")
		private List<String> tien_thue = new ArrayList<String>();
	
		@XStreamImplicit(itemFieldName = "SO_TIEN_MIEN_GIAM")
		private List<String> so_tien_mien_giam = new ArrayList<String>();

		
		public List<String> getLoai_thue() {
			return loai_thue;
		}

		public void setLoai_thue(List<String> loai_thue) {
			this.loai_thue = loai_thue;
		}

		public List<String> getTri_gia_tinh_thue() {
			return tri_gia_tinh_thue;
		}

		public void setTri_gia_tinh_thue(List<String> tri_gia_tinh_thue) {
			this.tri_gia_tinh_thue = tri_gia_tinh_thue;
		}

		public List<String> getTien_thue() {
			return tien_thue;
		}

		public void setTien_thue(List<String> tien_thue) {
			this.tien_thue = tien_thue;
		}

		public List<String> getSo_tien_mien_giam() {
			return so_tien_mien_giam;
		}

		public void setSo_tien_mien_giam(List<String> so_tien_mien_giam) {
			this.so_tien_mien_giam = so_tien_mien_giam;
		}

		
		
	}
	@Override
	public void addDefaultImplementation(XStream xstream) {
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}
}
