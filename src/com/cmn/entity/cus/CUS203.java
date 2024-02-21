package com.cmn.entity.cus;

import java.util.ArrayList;
import java.util.List;

import com.cmn.CUSMessage;
import com.cmn.entity.cus.CUS201.CTNo;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS203 extends CUSResponse<CUS203.DataImp> {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_203;

	public CUS203() {
	}

	static {
		CUSBeanFactory.getInstance().register(type, new CUS203());
	}

	@Override
	public CUSBeanImp<CUS203.DataImp> init() {
		CUS203 bean = new CUS203();
		bean.data = new CUS203.DataImp();
		return bean;
	}

	@Override
	public CUSMessage getType() {
		return type;
	}

	@XStreamAlias("Data")
	public static class DataImp extends Data {
		private static final long serialVersionUID = 1L;

		public DataImp() {
		}
		
		@XStreamAlias("So_HS")
		private String so_hs;	
		
		@XStreamAlias("Ma_DVQL")
		private String ma_dvql;	
		
		@XStreamAlias("Ten_DVQL")
		private String ten_dvql;
		
		@XStreamAlias("KyHieu_CT")
		private String kyhieu_ct;
		
		@XStreamAlias("So_CT")
		private String so_ct;		
		
		@XStreamAlias("Nam_CT")
		private String nam_ct;
		
		@XStreamAlias("NguoiNopTien")
		private NguoiNopTien nguoiNopTien;
		
		@XStreamAlias("ThongTin_NopTien")
		private ThongTin_NopTien thongTin_NopTien;
		
		@XStreamImplicit(itemFieldName = "ChiTiet_CT")
		private List<ChungTu_CT> chungTu_CT = new ArrayList<ChungTu_CT>();
		
		@XStreamImplicit(itemFieldName="TaiKhoan_NopTien")
		private List<TaiKhoan_NopTien> taiKhoan_NopTien;

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
		 * @return the nam_ct
		 */
		public String getNam_ct() {
			return nam_ct;
		}

		/**
		 * @param nam_ct the nam_ct to set
		 */
		public void setNam_ct(String nam_ct) {
			this.nam_ct = nam_ct;
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
		public List<TaiKhoan_NopTien> getTaiKhoan_NopTien() {
			return taiKhoan_NopTien;
		}

		/**
		 * @param taiKhoan_NopTien the taiKhoan_NopTien to set
		 */
		public void setTaiKhoan_NopTien(List<TaiKhoan_NopTien> taiKhoan_NopTien) {
			this.taiKhoan_NopTien = taiKhoan_NopTien;
		}
		
	}

	@Override
	public void addDefaultImplementation(XStream xstream) {
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}
}

