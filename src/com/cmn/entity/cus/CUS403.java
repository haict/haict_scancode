package com.cmn.entity.cus;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS403 extends CUSRequest<CUS403.DataImp> {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_403;
	static {
		CUSBeanFactory.getInstance().register(type, new CUS403());
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
		
		@XStreamAlias("Ma_HQ_KB")
		private String ma_hq_kb;
		
		@XStreamAlias("So_HD")
		private String so_hd= "";
		
		@XStreamAlias("Ngay_HD")
		private String ngay_hd= "";
		
		@XStreamAlias("So_VD_01")
		private String so_vd_01 = "";
		
		@XStreamAlias("Ngay_VD_01")
		private String ngay_vd_01= "";
		
		@XStreamAlias("So_VD_02")
		private String so_vd_02= "";
		
		@XStreamAlias("Ngay_VD_02")
		private String ngay_vd_02= "";
		
		@XStreamAlias("So_VD_03")
		private String so_vd_03= "";
		
		@XStreamAlias("Ngay_VD_03")
		private String ngay_vd_03= "";
		
		@XStreamAlias("So_VD_04")
		private String so_vd_04= "";
		
		@XStreamAlias("Ngay_VD_04")
		private String ngay_vd_04= "";
		
		@XStreamAlias("So_VD_05")
		private String so_vd_05= "";
		
		@XStreamAlias("Ngay_VD_05")
		private String ngay_vd_05= "";
		
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
		 * @return the ma_hq_kb
		 */
		public String getMa_hq_kb() {
			return ma_hq_kb;
		}
		/**
		 * @param ma_hq_kb the ma_hq_kb to set
		 */
		public void setMa_hq_kb(String ma_hq_kb) {
			this.ma_hq_kb = ma_hq_kb;
		}
		/**
		 * @return the so_hd
		 */
		public String getSo_hd() {
			return so_hd;
		}
		/**
		 * @param so_hd the so_hd to set
		 */
		public void setSo_hd(String so_hd) {
			this.so_hd = so_hd;
		}
		/**
		 * @return the ngay_hd
		 */
		public String getNgay_hd() {
			return ngay_hd;
		}
		/**
		 * @param ngay_hd the ngay_hd to set
		 */
		public void setNgay_hd(String ngay_hd) {
			this.ngay_hd = ngay_hd;
		}
		/**
		 * @return the so_vd_01
		 */
		public String getSo_vd_01() {
			return so_vd_01;
		}
		/**
		 * @param so_vd_01 the so_vd_01 to set
		 */
		public void setSo_vd_01(String so_vd_01) {
			this.so_vd_01 = so_vd_01;
		}
		/**
		 * @return the ngay_vd_01
		 */
		public String getNgay_vd_01() {
			return ngay_vd_01;
		}
		/**
		 * @param ngay_vd_01 the ngay_vd_01 to set
		 */
		public void setNgay_vd_01(String ngay_vd_01) {
			this.ngay_vd_01 = ngay_vd_01;
		}
		/**
		 * @return the so_vd_02
		 */
		public String getSo_vd_02() {
			return so_vd_02;
		}
		/**
		 * @param so_vd_02 the so_vd_02 to set
		 */
		public void setSo_vd_02(String so_vd_02) {
			this.so_vd_02 = so_vd_02;
		}
		/**
		 * @return the ngay_vd_02
		 */
		public String getNgay_vd_02() {
			return ngay_vd_02;
		}
		/**
		 * @param ngay_vd_02 the ngay_vd_02 to set
		 */
		public void setNgay_vd_02(String ngay_vd_02) {
			this.ngay_vd_02 = ngay_vd_02;
		}
		/**
		 * @return the so_vd_03
		 */
		public String getSo_vd_03() {
			return so_vd_03;
		}
		/**
		 * @param so_vd_03 the so_vd_03 to set
		 */
		public void setSo_vd_03(String so_vd_03) {
			this.so_vd_03 = so_vd_03;
		}
		/**
		 * @return the ngay_vd_03
		 */
		public String getNgay_vd_03() {
			return ngay_vd_03;
		}
		/**
		 * @param ngay_vd_03 the ngay_vd_03 to set
		 */
		public void setNgay_vd_03(String ngay_vd_03) {
			this.ngay_vd_03 = ngay_vd_03;
		}
		/**
		 * @return the so_vd_04
		 */
		public String getSo_vd_04() {
			return so_vd_04;
		}
		/**
		 * @param so_vd_04 the so_vd_04 to set
		 */
		public void setSo_vd_04(String so_vd_04) {
			this.so_vd_04 = so_vd_04;
		}
		/**
		 * @return the ngay_vd_04
		 */
		public String getNgay_vd_04() {
			return ngay_vd_04;
		}
		/**
		 * @param ngay_vd_04 the ngay_vd_04 to set
		 */
		public void setNgay_vd_04(String ngay_vd_04) {
			this.ngay_vd_04 = ngay_vd_04;
		}
		/**
		 * @return the so_vd_05
		 */
		public String getSo_vd_05() {
			return so_vd_05;
		}
		/**
		 * @param so_vd_05 the so_vd_05 to set
		 */
		public void setSo_vd_05(String so_vd_05) {
			this.so_vd_05 = so_vd_05;
		}
		/**
		 * @return the ngay_vd_05
		 */
		public String getNgay_vd_05() {
			return ngay_vd_05;
		}
		/**
		 * @param ngay_vd_05 the ngay_vd_05 to set
		 */
		public void setNgay_vd_05(String ngay_vd_05) {
			this.ngay_vd_05 = ngay_vd_05;
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
	
	public CUSBeanImp<CUS403.DataImp> init() {
		CUS403 bean = new CUS403();
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

