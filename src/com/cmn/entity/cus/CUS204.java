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
public class CUS204 extends CUSResponse<CUS204.DataImp> {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_204;

	public CUS204() {
	}

	static {
		CUSBeanFactory.getInstance().register(type, new CUS204());
	}

	@Override
	public CUSBeanImp<CUS204.DataImp> init() {
		CUS204 bean = new CUS204();
		bean.data = new CUS204.DataImp();
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
		
		@XStreamAlias("Ma_DV")
		private String ma_dv;	
		
		@XStreamAlias("So_CT")
		private String so_ct;	
		
		@XStreamAlias("KyHieu_CT")
		private String khct;
					
		@XStreamAlias("Ngay_CT")
		private String ngay_ct;
		
		@XStreamAlias("Ngay_HL")
		private String ngay_hl;
		
		@XStreamAlias("Ngay_HHL")
		private String ngay_hhl;
		@XStreamAlias("HanMuc")
		private String hanmuc;
		@XStreamAlias("SoDu")
		private String sodu;
		@XStreamImplicit(itemFieldName = "ChiTiet_BLC")
		private List<ChiTiet_BLC> chitietBLC = new ArrayList<ChiTiet_BLC>();

		public String getMa_dv() {
			return ma_dv;
		}
		public void setMa_dv(String ma_dv) {
			this.ma_dv = ma_dv;
		}
		public String getSo_ct() {
			return so_ct;
		}
		public void setSo_ct(String so_ct) {
			this.so_ct = so_ct;
		}
		public String getKhct() {
			return khct;
		}
		public void setKhct(String khct) {
			this.khct = khct;
		}
		public String getNgay_ct() {
			return ngay_ct;
		}
		public void setNgay_ct(String ngay_ct) {
			this.ngay_ct = ngay_ct;
		}
		public String getNgay_hl() {
			return ngay_hl;
		}
		public void setNgay_hl(String ngay_hl) {
			this.ngay_hl = ngay_hl;
		}
		public String getNgay_hhl() {
			return ngay_hhl;
		}
		public void setNgay_hhl(String ngay_hhl) {
			this.ngay_hhl = ngay_hhl;
		}
		public String getHanmuc() {
			return hanmuc;
		}
		public void setHanmuc(String hanmuc) {
			this.hanmuc = hanmuc;
		}
		public String getSodu() {
			return sodu;
		}
		public void setSodu(String sodu) {
			this.sodu = sodu;
		}
		public List<ChiTiet_BLC> getChitietBLC() {
			return chitietBLC;
		}
		public void setChitietBLC(List<ChiTiet_BLC> chitietBLC) {
			this.chitietBLC = chitietBLC;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
		
	}

	@Override
	public void addDefaultImplementation(XStream xstream) {
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}
}

