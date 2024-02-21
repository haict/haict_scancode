package com.cmn.entity.ecus;

import com.cmn.CUSMessage;
import com.cmn.entity.cus.CUSBeanFactory;
import com.cmn.entity.cus.CUSBeanImp;
import com.cmn.entity.cus.CUSRequest;
import com.cmn.entity.cus.Data;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS110 extends CUSRequest<CUS110.DataImp> {
	@XStreamOmitField
	public static final CUSMessage type = CUSMessage.CUS_110;
	static {
		CUSBeanFactory.getInstance().register(type, new CUS110());
	}

	@XStreamAlias("Data")
	public static class DataImp extends Data{
		private static final long serialVersionUID = 1L;

		public DataImp(){}
		
		@XStreamAlias("ID_CT")
		private String id_ct;
		@XStreamAlias("Ma_LoaiPhi")
		private String ma_LoaiPhi;
		@XStreamAlias("Ma_DV_ThuPhi")
		private String ma_DV_ThuPhi;
		
		@XStreamAlias("Ma_DV")
		private String maDV;
		
		@XStreamAlias("So_CT_NP")
		private String so_CT_NP;

		@XStreamAlias("KyHieu_CT_NP")
		private String kyHieu_CT_NP;
		@XStreamAlias("Ngay_CT_NP")
		private String ngay_CT_NP;

		public String getId_ct() {
			return id_ct;
		}
		public void setId_ct(String id_ct) {
			this.id_ct = id_ct;
		}
		public String getMa_LoaiPhi() {
			return ma_LoaiPhi;
		}
		public void setMa_LoaiPhi(String ma_LoaiPhi) {
			this.ma_LoaiPhi = ma_LoaiPhi;
		}
		public String getMa_DV_ThuPhi() {
			return ma_DV_ThuPhi;
		}
		public void setMa_DV_ThuPhi(String ma_DV_ThuPhi) {
			this.ma_DV_ThuPhi = ma_DV_ThuPhi;
		}
		public String getSo_CT_NP() {
			return so_CT_NP;
		}
		public void setSo_CT_NP(String so_CT_NP) {
			this.so_CT_NP = so_CT_NP;
		}
		public String getKyHieu_CT_NP() {
			return kyHieu_CT_NP;
		}
		public void setKyHieu_CT_NP(String kyHieu_CT_NP) {
			this.kyHieu_CT_NP = kyHieu_CT_NP;
		}
		public String getNgay_CT_NP() {
			return ngay_CT_NP;
		}
		public void setNgay_CT_NP(String ngay_CT_NP) {
			this.ngay_CT_NP = ngay_CT_NP;
		}
		public String getMaDV() {
			return maDV;
		}
		public void setMaDV(String maDV) {
			this.maDV = maDV;
		}
	}

	public CUSBeanImp<CUS110.DataImp> init() {
		CUS110 bean = new CUS110();
		bean.data = new DataImp();
		return bean;
	}

	public CUSMessage getType() {
		return type;
	}

	public void addDefaultImplementation(XStream xstream) {
		// TODO Auto-generated method stub
		
	}
	
}
