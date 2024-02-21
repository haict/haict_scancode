package com.cmn.entity.cus;



import java.io.Serializable;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS215 extends CUSResponse<CUS215.DataImp> {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_215;

	public CUS215() {
	}

	static {
		CUSBeanFactory.getInstance().register(type, new CUS215());
	}

	@Override
	public CUSBeanImp<CUS215.DataImp> init() {
		CUS215 bean = new CUS215();
		bean.data = new CUS215.DataImp();
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
		
	
		@XStreamAlias("NGAY_THAY_DOI_DK")
		private String ngay_thay_doi_dk;
		
		@XStreamAlias("NGAY_THAY_DOI_KT")
		private String ngay_thay_doi_kt;
		
		@XStreamAlias("NGAY_HOAN_THANH_KT")
		private String ngay_hoan_thanh_kt;
		
		@XStreamAlias("NGAY_THONG_QUAN")
		private String ngay_thong_quan;

		@XStreamAlias("MA_PHAN_LOAI_KT")
		private String ma_phan_loai_kt;
		
		
		@XStreamAlias("MA_DAI_LY_HQ")
		private String ma_dai_ly_hq;
		
		@XStreamAlias("TEN_DAI_LY_HQ")
		private String ten_dai_ly_hq;
		
		@XStreamAlias("SO_HOUSE_AWB")
		private String so_house_awb;
		
		@XStreamAlias("SO_LUONG")
		private String so_luong;

		@XStreamAlias("TONG_TRONG_LUONG")
		private String tong_trong_luong;
		
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
		
		@XStreamAlias("TONG_TRI_GIA_TINH_THUE")
		private String tong_tri_gia_tinh_thue;
		
		@XStreamAlias("MA_TIEN_TE_TRI_GIA_TINH_THUE")
		private String ma_tien_te_tri_gia_tinh_thue;
		
	
		@XStreamAlias("NGUOI_XUAT_KHAU")
		private Nguoi_xuat_khau nguoi_xuat_khau;
		
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
		 * @return the so_house_awb
		 */
		public String getSo_house_awb() {
			return so_house_awb;
		}

		/**
		 * @param so_house_awb the so_house_awb to set
		 */
		public void setSo_house_awb(String so_house_awb) {
			this.so_house_awb = so_house_awb;
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
		 * @return the ma_tien_te_tri_gia_tinh_thue
		 */
		public String getMa_tien_te_tri_gia_tinh_thue() {
			return ma_tien_te_tri_gia_tinh_thue;
		}

		/**
		 * @param ma_tien_te_tri_gia_tinh_thue the ma_tien_te_tri_gia_tinh_thue to set
		 */
		public void setMa_tien_te_tri_gia_tinh_thue(String ma_tien_te_tri_gia_tinh_thue) {
			this.ma_tien_te_tri_gia_tinh_thue = ma_tien_te_tri_gia_tinh_thue;
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
		
		//nguoi xuat khau
		public class Nguoi_xuat_khau implements Serializable {
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
		//nguoi nhap khau
		public class Nguoi_nhap_khau implements Serializable {
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
	}
	

	@Override
	public void addDefaultImplementation(XStream xstream) {
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}
}
