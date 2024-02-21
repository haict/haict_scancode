package com.cmn.entity.ecus;

import java.util.List;

import com.cmn.CUSMessage;
import com.cmn.entity.cus.CUSBeanFactory;
import com.cmn.entity.cus.CUSBeanImp;
import com.cmn.entity.cus.CUSResponse;
import com.cmn.entity.cus.Data;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS311 extends CUSResponse<CUS311.DataImp>{
	@XStreamOmitField
	public static final CUSMessage type = CUSMessage.CUS_311;
	public CUS311(){}
	
	static {
		CUSBeanFactory.getInstance().register(type, new CUS311());
	}	
	
	public CUSBeanImp<CUS311.DataImp> init() {
		CUS311 bean = new CUS311();
		bean.data = new CUS311.DataImp();
		return bean;
	}
	
	public CUSMessage getType() {
		return type;
	}
	
	@XStreamAlias("Data")
	public static class DataImp extends Data {
		private static final long serialVersionUID = 1L;
		
		@XStreamAlias("So_HS")
		private String soHS;
		
		@XStreamAlias("Loai_HS")
		private Short loaiHS;
		
		@XStreamAlias("Ma_DV")
		private String maDV;
		
		@XStreamAlias("Ten_DV")
		private String tenDV;
		
		@XStreamAlias("DiaChi")
		private String diaChi;
		
		@XStreamAlias("ThongTin_NNT")
		private ThongTinNNT thongTin_NNT;
				
		@XStreamImplicit(itemFieldName="ThongTinDinhKem")
		private List<ThongTinDinhKem> thongTinDinhKem;

		public String getSoHS() {
			return soHS;
		}

		public void setSoHS(String soHS) {
			this.soHS = soHS;
		}

		public Short getLoaiHS() {
			return loaiHS;
		}

		public void setLoaiHS(Short loaiHS) {
			this.loaiHS = loaiHS;
		}

		public String getMaDV() {
			return maDV;
		}

		public void setMaDV(String maDV) {
			this.maDV = maDV;
		}

		public String getTenDV() {
			return tenDV;
		}

		public void setTenDV(String tenDV) {
			this.tenDV = tenDV;
		}

		public String getDiaChi() {
			return diaChi;
		}

		public void setDiaChi(String diaChi) {
			this.diaChi = diaChi;
		}

		public ThongTinNNT getThongTin_NNT() {
			return thongTin_NNT;
		}

		public void setThongTin_NNT(ThongTinNNT thongTin_NNT) {
			this.thongTin_NNT = thongTin_NNT;
		}

		public List<ThongTinDinhKem> getThongTinDinhKem() {
			return thongTinDinhKem;
		}

		public void setThongTinDinhKem(List<ThongTinDinhKem> thongTinDinhKem) {
			this.thongTinDinhKem = thongTinDinhKem;
		}			
	}
	
	@Override
	public void addDefaultImplementation(XStream xstream) {
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}
}
