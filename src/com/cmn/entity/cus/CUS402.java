package com.cmn.entity.cus;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS402 extends CUSRequest<CUS402.DataImp> {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_402;
	static {
		CUSBeanFactory.getInstance().register(type, new CUS402());
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
	
	public CUSBeanImp<CUS402.DataImp> init() {
		CUS402 bean = new CUS402();
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

