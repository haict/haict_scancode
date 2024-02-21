package com.cmn.entity.cus;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS205 extends CUSResponse<CUS205.DataImp> {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_205;

	public CUS205() {
	}

	static {
		CUSBeanFactory.getInstance().register(type, new CUS205());
	}

	@Override
	public CUSBeanImp<CUS205.DataImp> init() {
		CUS205 bean = new CUS205();
		bean.data = new CUS205.DataImp();
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
		
		@XStreamAlias("SO_TK_DAU_TIEN")
		private String so_tk_dau_tien;
		
		@XStreamAlias("SO_TK_TAM_NHAP_TX")
		private String so_tk_tam_nhap_tx;
		
		@XStreamAlias("THOI_HAN_TAI_NHAP_TAI_XUAT")
		private String thoi_han_tai_nhap_tai_xuat;
		
		@XStreamAlias("NGAY_THAY_DOI_DK")
		private String ngay_thay_doi_dk;
		
		@XStreamAlias("NGAY_THAY_DOI_KT")
		private String ngay_thay_doi_kt;
		
		@XStreamAlias("NGAY_HOAN_THANH_KT")
		private String ngay_hoan_thanh_kt;
		
		@XStreamAlias("NGAY_THONG_QUAN")
		private String ngay_thong_quan;
		
		@XStreamAlias("NGAY_HH_QUA_KVGS")
		private String ngay_hh_qua_kvgs;
		
		@XStreamAlias("MA_PHAN_LOAI_KT")
		private String ma_phan_loai_kt;
		
		@XStreamAlias("MA_DAI_LY_HQ")
		private String ma_dai_ly_hq;
		
		@XStreamAlias("TEN_DAI_LY_HQ")
		private String ten_dai_ly_hq;
		
		@XStreamAlias("SO_VAN_DON_1")
		private String so_van_don_1;
		
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
		
		@XStreamAlias("MA_DIA_DIEM_NHAN_HANG_CUOI_CUNG")
		private String ma_dia_diem_nhan_hang_cuoi_cung;
		
		@XStreamAlias("TEN_DIA_DIEM_NHAN_HANG_CUOI_CUNG")
		private String ten_dia_diem_nhan_hang_cuoi_cung;
		
		@XStreamAlias("MA_DIA_DIEM_XEP_HANG")
		private String ma_dia_diem_xep_hang;
		
		@XStreamAlias("TEN_DIA_DIEM_XEP_HANG")
		private String ten_dia_diem_xep_hang;
		
		@XStreamAlias("MA_PHUONG_TIEN_VC")
		private String ma_phuong_tien_vc;
		
		@XStreamAlias("TEN_PHUONG_TIEN_VC")
		private String ten_phuong_tien_vc;
		
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
		
		@XStreamAlias("MA_DIA_DIEM_XEP_HANG_LEN_XE_CHO_HANG_1")
		private String ma_dia_diem_xep_hang_len_xe_cho_hang_1;
		
		@XStreamAlias("MA_DIA_DIEM_XEP_HANG_LEN_XE_CHO_HANG_2")
		private String ma_dia_diem_xep_hang_len_xe_cho_hang_2;
		
		@XStreamAlias("MA_DIA_DIEM_XEP_HANG_LEN_XE_CHO_HANG_3")
		private String ma_dia_diem_xep_hang_len_xe_cho_hang_3;
		
		@XStreamAlias("MA_DIA_DIEM_XEP_HANG_LEN_XE_CHO_HANG_4")
		private String ma_dia_diem_xep_hang_len_xe_cho_hang_4;
		
		@XStreamAlias("MA_DIA_DIEM_XEP_HANG_LEN_XE_CHO_HANG_5")
		private String ma_dia_diem_xep_hang_len_xe_cho_hang_5;
		
		@XStreamAlias("TEN_DIA_DIEM_XEP_HANG_LEN_XE_CHO_HANG")
		private String ten_dia_diem_xep_hang_len_xe_cho_hang;
		
		@XStreamAlias("TT_HANG")
		private Tt_hang tt_hang;
		
		@XStreamAlias("NGUOI_XUAT_KHAU")
		private Nguoi_xuat_khau nguoi_xuat_khau;
		
		@XStreamAlias("NGUOI_UY_THAC_XNK")
		private Nguoi_uy_thac_xnk nguoi_uy_thac_xnk;
		
		@XStreamAlias("NGUOI_NHAP_KHAU")
		private Nguoi_nhap_khau nguoi_nhap_khau;

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
		 * @return the so_tk_dau_tien
		 */
		public String getSo_tk_dau_tien() {
			return so_tk_dau_tien;
		}

		/**
		 * @param so_tk_dau_tien the so_tk_dau_tien to set
		 */
		public void setSo_tk_dau_tien(String so_tk_dau_tien) {
			this.so_tk_dau_tien = so_tk_dau_tien;
		}

		/**
		 * @return the so_tk_tam_nhap_tx
		 */
		public String getSo_tk_tam_nhap_tx() {
			return so_tk_tam_nhap_tx;
		}

		/**
		 * @param so_tk_tam_nhap_tx the so_tk_tam_nhap_tx to set
		 */
		public void setSo_tk_tam_nhap_tx(String so_tk_tam_nhap_tx) {
			this.so_tk_tam_nhap_tx = so_tk_tam_nhap_tx;
		}

		/**
		 * @return the thoi_han_tai_nhap_tai_xuat
		 */
		public String getThoi_han_tai_nhap_tai_xuat() {
			return thoi_han_tai_nhap_tai_xuat;
		}

		/**
		 * @param thoi_han_tai_nhap_tai_xuat the thoi_han_tai_nhap_tai_xuat to set
		 */
		public void setThoi_han_tai_nhap_tai_xuat(String thoi_han_tai_nhap_tai_xuat) {
			this.thoi_han_tai_nhap_tai_xuat = thoi_han_tai_nhap_tai_xuat;
		}

		/**
		 * @return the ngay_thay_doi_dk
		 */
		public String getNgay_thay_doi_dk() {
			return ngay_thay_doi_dk;
		}

		/**
		 * @param ngay_thay_doi_dk the ngay_thay_doi_dk to set
		 */
		public void setNgay_thay_doi_dk(String ngay_thay_doi_dk) {
			this.ngay_thay_doi_dk = ngay_thay_doi_dk;
		}

		/**
		 * @return the ngay_thay_doi_kt
		 */
		public String getNgay_thay_doi_kt() {
			return ngay_thay_doi_kt;
		}

		/**
		 * @param ngay_thay_doi_kt the ngay_thay_doi_kt to set
		 */
		public void setNgay_thay_doi_kt(String ngay_thay_doi_kt) {
			this.ngay_thay_doi_kt = ngay_thay_doi_kt;
		}

		/**
		 * @return the ngay_hoan_thanh_kt
		 */
		public String getNgay_hoan_thanh_kt() {
			return ngay_hoan_thanh_kt;
		}

		/**
		 * @param ngay_hoan_thanh_kt the ngay_hoan_thanh_kt to set
		 */
		public void setNgay_hoan_thanh_kt(String ngay_hoan_thanh_kt) {
			this.ngay_hoan_thanh_kt = ngay_hoan_thanh_kt;
		}

		/**
		 * @return the ngay_thong_quan
		 */
		public String getNgay_thong_quan() {
			return ngay_thong_quan;
		}

		/**
		 * @param ngay_thong_quan the ngay_thong_quan to set
		 */
		public void setNgay_thong_quan(String ngay_thong_quan) {
			this.ngay_thong_quan = ngay_thong_quan;
		}

		/**
		 * @return the ngay_hh_qua_kvgs
		 */
		public String getNgay_hh_qua_kvgs() {
			return ngay_hh_qua_kvgs;
		}

		/**
		 * @param ngay_hh_qua_kvgs the ngay_hh_qua_kvgs to set
		 */
		public void setNgay_hh_qua_kvgs(String ngay_hh_qua_kvgs) {
			this.ngay_hh_qua_kvgs = ngay_hh_qua_kvgs;
		}

		/**
		 * @return the ma_phan_loai_kt
		 */
		public String getMa_phan_loai_kt() {
			return ma_phan_loai_kt;
		}

		/**
		 * @param ma_phan_loai_kt the ma_phan_loai_kt to set
		 */
		public void setMa_phan_loai_kt(String ma_phan_loai_kt) {
			this.ma_phan_loai_kt = ma_phan_loai_kt;
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
		 * @return the ma_dia_diem_nhan_hang_cuoi_cung
		 */
		public String getMa_dia_diem_nhan_hang_cuoi_cung() {
			return ma_dia_diem_nhan_hang_cuoi_cung;
		}

		/**
		 * @param ma_dia_diem_nhan_hang_cuoi_cung the ma_dia_diem_nhan_hang_cuoi_cung to set
		 */
		public void setMa_dia_diem_nhan_hang_cuoi_cung(String ma_dia_diem_nhan_hang_cuoi_cung) {
			this.ma_dia_diem_nhan_hang_cuoi_cung = ma_dia_diem_nhan_hang_cuoi_cung;
		}

		/**
		 * @return the ten_dia_diem_nhan_hang_cuoi_cung
		 */
		public String getTen_dia_diem_nhan_hang_cuoi_cung() {
			return ten_dia_diem_nhan_hang_cuoi_cung;
		}

		/**
		 * @param ten_dia_diem_nhan_hang_cuoi_cung the ten_dia_diem_nhan_hang_cuoi_cung to set
		 */
		public void setTen_dia_diem_nhan_hang_cuoi_cung(String ten_dia_diem_nhan_hang_cuoi_cung) {
			this.ten_dia_diem_nhan_hang_cuoi_cung = ten_dia_diem_nhan_hang_cuoi_cung;
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
		 * @return the ma_dia_diem_xep_hang_len_xe_cho_hang_1
		 */
		public String getMa_dia_diem_xep_hang_len_xe_cho_hang_1() {
			return ma_dia_diem_xep_hang_len_xe_cho_hang_1;
		}

		/**
		 * @param ma_dia_diem_xep_hang_len_xe_cho_hang_1 the ma_dia_diem_xep_hang_len_xe_cho_hang_1 to set
		 */
		public void setMa_dia_diem_xep_hang_len_xe_cho_hang_1(String ma_dia_diem_xep_hang_len_xe_cho_hang_1) {
			this.ma_dia_diem_xep_hang_len_xe_cho_hang_1 = ma_dia_diem_xep_hang_len_xe_cho_hang_1;
		}

		/**
		 * @return the ma_dia_diem_xep_hang_len_xe_cho_hang_2
		 */
		public String getMa_dia_diem_xep_hang_len_xe_cho_hang_2() {
			return ma_dia_diem_xep_hang_len_xe_cho_hang_2;
		}

		/**
		 * @param ma_dia_diem_xep_hang_len_xe_cho_hang_2 the ma_dia_diem_xep_hang_len_xe_cho_hang_2 to set
		 */
		public void setMa_dia_diem_xep_hang_len_xe_cho_hang_2(String ma_dia_diem_xep_hang_len_xe_cho_hang_2) {
			this.ma_dia_diem_xep_hang_len_xe_cho_hang_2 = ma_dia_diem_xep_hang_len_xe_cho_hang_2;
		}

		/**
		 * @return the ma_dia_diem_xep_hang_len_xe_cho_hang_3
		 */
		public String getMa_dia_diem_xep_hang_len_xe_cho_hang_3() {
			return ma_dia_diem_xep_hang_len_xe_cho_hang_3;
		}

		/**
		 * @param ma_dia_diem_xep_hang_len_xe_cho_hang_3 the ma_dia_diem_xep_hang_len_xe_cho_hang_3 to set
		 */
		public void setMa_dia_diem_xep_hang_len_xe_cho_hang_3(String ma_dia_diem_xep_hang_len_xe_cho_hang_3) {
			this.ma_dia_diem_xep_hang_len_xe_cho_hang_3 = ma_dia_diem_xep_hang_len_xe_cho_hang_3;
		}

		/**
		 * @return the ma_dia_diem_xep_hang_len_xe_cho_hang_4
		 */
		public String getMa_dia_diem_xep_hang_len_xe_cho_hang_4() {
			return ma_dia_diem_xep_hang_len_xe_cho_hang_4;
		}

		/**
		 * @param ma_dia_diem_xep_hang_len_xe_cho_hang_4 the ma_dia_diem_xep_hang_len_xe_cho_hang_4 to set
		 */
		public void setMa_dia_diem_xep_hang_len_xe_cho_hang_4(String ma_dia_diem_xep_hang_len_xe_cho_hang_4) {
			this.ma_dia_diem_xep_hang_len_xe_cho_hang_4 = ma_dia_diem_xep_hang_len_xe_cho_hang_4;
		}

		/**
		 * @return the ma_dia_diem_xep_hang_len_xe_cho_hang_5
		 */
		public String getMa_dia_diem_xep_hang_len_xe_cho_hang_5() {
			return ma_dia_diem_xep_hang_len_xe_cho_hang_5;
		}

		/**
		 * @param ma_dia_diem_xep_hang_len_xe_cho_hang_5 the ma_dia_diem_xep_hang_len_xe_cho_hang_5 to set
		 */
		public void setMa_dia_diem_xep_hang_len_xe_cho_hang_5(String ma_dia_diem_xep_hang_len_xe_cho_hang_5) {
			this.ma_dia_diem_xep_hang_len_xe_cho_hang_5 = ma_dia_diem_xep_hang_len_xe_cho_hang_5;
		}

		/**
		 * @return the ten_dia_diem_xep_hang_len_xe_cho_hang
		 */
		public String getTen_dia_diem_xep_hang_len_xe_cho_hang() {
			return ten_dia_diem_xep_hang_len_xe_cho_hang;
		}

		/**
		 * @param ten_dia_diem_xep_hang_len_xe_cho_hang the ten_dia_diem_xep_hang_len_xe_cho_hang to set
		 */
		public void setTen_dia_diem_xep_hang_len_xe_cho_hang(String ten_dia_diem_xep_hang_len_xe_cho_hang) {
			this.ten_dia_diem_xep_hang_len_xe_cho_hang = ten_dia_diem_xep_hang_len_xe_cho_hang;
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
	}

	@Override
	public void addDefaultImplementation(XStream xstream) {
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}
}
