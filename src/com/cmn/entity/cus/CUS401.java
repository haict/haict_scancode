package com.cmn.entity.cus;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS401 extends CUSRequest<CUS401.DataImp> {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_401;
	static {
		CUSBeanFactory.getInstance().register(type, new CUS401());
	}
	
	@XStreamAlias("Error")
	private Error error;
	
	@XStreamAlias("Data")
	public static class DataImp extends Data{
		private static final long serialVersionUID = 1L;

		public DataImp(){}
		
		@XStreamAlias("Ma_NH_PH")
		private String ma_nh_ph;
		
		@XStreamAlias("MST_NH_PH")
		private String mst_nh_ph;
		
		@XStreamAlias("Ten_NH_PH")
		private String ten_nh_ph;
		
		@XStreamAlias("Ma_DV")
		private String ma_dv;
		
		@XStreamAlias("Ten_DV")
		private String ten_dv;
		
		@XStreamAlias("Ma_DV_DD")
		private String ma_dv_dd;
		
		@XStreamAlias("Ten_DV_DD")
		private String ten_dv_dd;
		
		@XStreamAlias("Ma_HQ_PH")
		private String ma_hq_ph;
		
		@XStreamAlias("Ma_HQ")
		private String ma_hq;
		
		@XStreamAlias("Ma_LH")
		private String ma_lh;
		
		@XStreamAlias("So_TK")
		private String so_tk;
		
		@XStreamAlias("Ngay_DK")
		private String ngay_dk;
		
		@XStreamAlias("Ma_LT")
		private String ma_lt;
		
		@XStreamAlias("Loai_CT")
		private String loai_ct;
		
		@XStreamAlias("KyHieu_CT")
		private String kyhieu_ct;
		
		@XStreamAlias("So_CT")
		private String so_ct;
		
		@XStreamAlias("Ngay_CT")
		private String ngay_ct;
		
		@XStreamAlias("TTButToan")
		private String ttbuttoan;
		
		@XStreamAlias("SNBL")
		private String snbl;
		
		@XStreamAlias("Ngay_HL")
		private String ngay_hl;
		
		@XStreamAlias("Ngay_HHL")
		private String ngay_hhl;
		
		@XStreamAlias("SoTien")
		private String sotien;
		
		@XStreamAlias("DienGiai")
		private String diengiai;

		/**
		 * @return the ma_nh_ph
		 */
		public String getMa_nh_ph() {
			return ma_nh_ph;
		}

		/**
		 * @param ma_nh_ph the ma_nh_ph to set
		 */
		public void setMa_nh_ph(String ma_nh_ph) {
			this.ma_nh_ph = ma_nh_ph;
		}

		/**
		 * @return the mst_nh_ph
		 */
		public String getMst_nh_ph() {
			return mst_nh_ph;
		}

		/**
		 * @param mst_nh_ph the mst_nh_ph to set
		 */
		public void setMst_nh_ph(String mst_nh_ph) {
			this.mst_nh_ph = mst_nh_ph;
		}

		/**
		 * @return the ten_nh_ph
		 */
		public String getTen_nh_ph() {
			return ten_nh_ph;
		}

		/**
		 * @param ten_nh_ph the ten_nh_ph to set
		 */
		public void setTen_nh_ph(String ten_nh_ph) {
			this.ten_nh_ph = ten_nh_ph;
		}

		/**
		 * @return the ma_dv
		 */
		public String getMa_dv() {
			return ma_dv;
		}

		/**
		 * @param ma_dv the ma_dv to set
		 */
		public void setMa_dv(String ma_dv) {
			this.ma_dv = ma_dv;
		}

		/**
		 * @return the ten_dv
		 */
		public String getTen_dv() {
			return ten_dv;
		}

		/**
		 * @param ten_dv the ten_dv to set
		 */
		public void setTen_dv(String ten_dv) {
			this.ten_dv = ten_dv;
		}

		/**
		 * @return the ma_dv_dd
		 */
		public String getMa_dv_dd() {
			return ma_dv_dd;
		}

		/**
		 * @param ma_dv_dd the ma_dv_dd to set
		 */
		public void setMa_dv_dd(String ma_dv_dd) {
			this.ma_dv_dd = ma_dv_dd;
		}

		/**
		 * @return the ten_dv_dd
		 */
		public String getTen_dv_dd() {
			return ten_dv_dd;
		}

		/**
		 * @param ten_dv_dd the ten_dv_dd to set
		 */
		public void setTen_dv_dd(String ten_dv_dd) {
			this.ten_dv_dd = ten_dv_dd;
		}

		/**
		 * @return the ma_hq_ph
		 */
		public String getMa_hq_ph() {
			return ma_hq_ph;
		}

		/**
		 * @param ma_hq_ph the ma_hq_ph to set
		 */
		public void setMa_hq_ph(String ma_hq_ph) {
			this.ma_hq_ph = ma_hq_ph;
		}

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
		 * @return the ma_lt
		 */
		public String getMa_lt() {
			return ma_lt;
		}

		/**
		 * @param ma_lt the ma_lt to set
		 */
		public void setMa_lt(String ma_lt) {
			this.ma_lt = ma_lt;
		}

		/**
		 * @return the loai_ct
		 */
		public String getLoai_ct() {
			return loai_ct;
		}

		/**
		 * @param loai_ct the loai_ct to set
		 */
		public void setLoai_ct(String loai_ct) {
			this.loai_ct = loai_ct;
		}

		/**
		 * @return the kyhieu_ct
		 */
		public String getKyhieu_ct() {
			return kyhieu_ct;
		}

		/**
		 * @param kyhieu_ct the kyhieu_ct to set
		 */
		public void setKyhieu_ct(String kyhieu_ct) {
			this.kyhieu_ct = kyhieu_ct;
		}

		/**
		 * @return the so_ct
		 */
		public String getSo_ct() {
			return so_ct;
		}

		/**
		 * @param so_ct the so_ct to set
		 */
		public void setSo_ct(String so_ct) {
			this.so_ct = so_ct;
		}

		/**
		 * @return the ngay_ct
		 */
		public String getNgay_ct() {
			return ngay_ct;
		}

		/**
		 * @param ngay_ct the ngay_ct to set
		 */
		public void setNgay_ct(String ngay_ct) {
			this.ngay_ct = ngay_ct;
		}

		/**
		 * @return the ttbuttoan
		 */
		public String getTtbuttoan() {
			return ttbuttoan;
		}

		/**
		 * @param ttbuttoan the ttbuttoan to set
		 */
		public void setTtbuttoan(String ttbuttoan) {
			this.ttbuttoan = ttbuttoan;
		}

		/**
		 * @return the snbl
		 */
		public String getSnbl() {
			return snbl;
		}

		/**
		 * @param snbl the snbl to set
		 */
		public void setSnbl(String snbl) {
			this.snbl = snbl;
		}

		/**
		 * @return the ngay_hl
		 */
		public String getNgay_hl() {
			return ngay_hl;
		}

		/**
		 * @param ngay_hl the ngay_hl to set
		 */
		public void setNgay_hl(String ngay_hl) {
			this.ngay_hl = ngay_hl;
		}

		/**
		 * @return the ngay_hhl
		 */
		public String getNgay_hhl() {
			return ngay_hhl;
		}

		/**
		 * @param ngay_hhl the ngay_hhl to set
		 */
		public void setNgay_hhl(String ngay_hhl) {
			this.ngay_hhl = ngay_hhl;
		}

		/**
		 * @return the sotien
		 */
		public String getSotien() {
			return sotien;
		}

		/**
		 * @param sotien the sotien to set
		 */
		public void setSotien(String sotien) {
			this.sotien = sotien;
		}

		/**
		 * @return the diengiai
		 */
		public String getDiengiai() {
			return diengiai;
		}

		/**
		 * @param diengiai the diengiai to set
		 */
		public void setDiengiai(String diengiai) {
			this.diengiai = diengiai;
		}

	}
	
	public CUSBeanImp<CUS401.DataImp> init() {
		CUS401 bean = new CUS401();
		bean.data = new DataImp();
		bean.error = new Error();
		return bean;
	}

	public CUSMessage getType() {
		return type;
	}

	@Override
	public void addDefaultImplementation(XStream xstream) {
		// TODO Auto-generated method stub
		
	}
}

