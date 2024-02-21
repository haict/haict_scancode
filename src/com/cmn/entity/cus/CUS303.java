package com.cmn.entity.cus;

import java.util.ArrayList;
import java.util.List;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS303 extends CUSRequest<CUS303.DataImp> {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_303;
	static {
		CUSBeanFactory.getInstance().register(type, new CUS303());
	}

	@XStreamAlias("Error")
	private Error error;
	
	@XStreamAlias("Data")
	public static class DataImp extends Data{
		private static final long serialVersionUID = 1L;

		public DataImp(){}
		
		@XStreamAlias("Ma_NH_PH")
		private String ma_nh_ph;
		
		@XStreamAlias("Ten_NH_PH")
		private String ten_nh_ph;
		
		@XStreamAlias("KyHieu_CT")
		private String kyhieu_ct;
		
		@XStreamAlias("So_CT")
		private String so_ct;
		
		@XStreamAlias("Ngay_CT")
		private String ngay_ct;
		
		@XStreamAlias("Ngay_BN")
		private String ngay_bn;
		
		@XStreamAlias("Ngay_BC")
		private String ngay_bc;
		
		@XStreamAlias("So_HS")
		private String so_hs;
		
		@XStreamAlias("Ma_DVQL")
		private String ma_dvql;
		
		@XStreamAlias("Ten_DVQL")
		private String ten_dvql;
		
		@XStreamAlias("KyHieu_CT_PT")
		private String kyhieu_ct_pt;
		
		@XStreamAlias("So_CT_PT")
		private String so_ct_pt;
		
		@XStreamAlias("Nam_CT_PT")
		private String nam_ct_pt;			

		@XStreamAlias("NguoiNopTien")
		private NguoiNopTien nguoiNopTien;
		
		@XStreamAlias("ThongTin_NopTien")
		private ThongTin_NopTien thongTin_NopTien;
		
		@XStreamImplicit(itemFieldName = "ChungTu_CT")
		private List<ChungTu_CT> chungTu_CT = new ArrayList<ChungTu_CT>();
		
		@XStreamAlias("TaiKhoan_NopTien")
		private TaiKhoan_NopTien taiKhoan_NopTien;

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
		 * @return the ngay_bn
		 */
		public String getNgay_bn() {
			return ngay_bn;
		}

		/**
		 * @param ngay_bn the ngay_bn to set
		 */
		public void setNgay_bn(String ngay_bn) {
			this.ngay_bn = ngay_bn;
		}

		/**
		 * @return the ngay_bc
		 */
		public String getNgay_bc() {
			return ngay_bc;
		}

		/**
		 * @param ngay_bc the ngay_bc to set
		 */
		public void setNgay_bc(String ngay_bc) {
			this.ngay_bc = ngay_bc;
		}

		/**
		 * @return the so_hs
		 */
		public String getSo_hs() {
			return so_hs;
		}

		/**
		 * @param so_hs the so_hs to set
		 */
		public void setSo_hs(String so_hs) {
			this.so_hs = so_hs;
		}

		/**
		 * @return the ma_dvql
		 */
		public String getMa_dvql() {
			return ma_dvql;
		}

		/**
		 * @param ma_dvql the ma_dvql to set
		 */
		public void setMa_dvql(String ma_dvql) {
			this.ma_dvql = ma_dvql;
		}

		/**
		 * @return the ten_dvql
		 */
		public String getTen_dvql() {
			return ten_dvql;
		}

		/**
		 * @param ten_dvql the ten_dvql to set
		 */
		public void setTen_dvql(String ten_dvql) {
			this.ten_dvql = ten_dvql;
		}

		/**
		 * @return the kyhieu_ct_pt
		 */
		public String getKyhieu_ct_pt() {
			return kyhieu_ct_pt;
		}

		/**
		 * @param kyhieu_ct_pt the kyhieu_ct_pt to set
		 */
		public void setKyhieu_ct_pt(String kyhieu_ct_pt) {
			this.kyhieu_ct_pt = kyhieu_ct_pt;
		}

		/**
		 * @return the so_ct_pt
		 */
		public String getSo_ct_pt() {
			return so_ct_pt;
		}

		/**
		 * @param so_ct_pt the so_ct_pt to set
		 */
		public void setSo_ct_pt(String so_ct_pt) {
			this.so_ct_pt = so_ct_pt;
		}

		/**
		 * @return the nam_ct_pt
		 */
		public String getNam_ct_pt() {
			return nam_ct_pt;
		}

		/**
		 * @param nam_ct_pt the nam_ct_pt to set
		 */
		public void setNam_ct_pt(String nam_ct_pt) {
			this.nam_ct_pt = nam_ct_pt;
		}

		/**
		 * @return the nguoiNopTien
		 */
		public NguoiNopTien getNguoiNopTien() {
			return nguoiNopTien;
		}

		/**
		 * @param nguoiNopTien the nguoiNopTien to set
		 */
		public void setNguoiNopTien(NguoiNopTien nguoiNopTien) {
			this.nguoiNopTien = nguoiNopTien;
		}

		/**
		 * @return the thongTin_NopTien
		 */
		public ThongTin_NopTien getThongTin_NopTien() {
			return thongTin_NopTien;
		}

		/**
		 * @param thongTin_NopTien the thongTin_NopTien to set
		 */
		public void setThongTin_NopTien(ThongTin_NopTien thongTin_NopTien) {
			this.thongTin_NopTien = thongTin_NopTien;
		}

		public List<ChungTu_CT> getChungTu_CT() {
			return chungTu_CT;
		}

		public void setChungTu_CT(List<ChungTu_CT> chungTu_CT) {
			this.chungTu_CT = chungTu_CT;
		}

		/**
		 * @return the taiKhoan_NopTien
		 */
		public TaiKhoan_NopTien getTaiKhoan_NopTien() {
			return taiKhoan_NopTien;
		}

		/**
		 * @param taiKhoan_NopTien the taiKhoan_NopTien to set
		 */
		public void setTaiKhoan_NopTien(TaiKhoan_NopTien taiKhoan_NopTien) {
			this.taiKhoan_NopTien = taiKhoan_NopTien;
		}
	}
	
	public CUSBeanImp<CUS303.DataImp> init() {
		CUS303 bean = new CUS303();
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

