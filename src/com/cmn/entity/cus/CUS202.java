package com.cmn.entity.cus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS202 extends CUSResponse<CUS202.DataImp>{
	@XStreamOmitField
	public static final CUSMessage type = CUSMessage.CUS_202;
	
	public CUS202(){}
	
	static {
		CUSBeanFactory.getInstance().register(type, new CUS202());
	}	
	
	public CUSBeanImp<CUS202.DataImp> init() {
		CUS202 bean = new CUS202();
		bean.data = new CUS202.DataImp();
		return bean;
	}
	
	public CUSMessage getType() {
		return type;
	}
	
	@XStreamAlias("Data")
	public static class DataImp extends Data {
		private static final long serialVersionUID = 1L;
		
		@XStreamImplicit(itemFieldName = "Item")
		private List<Item> items = new ArrayList<Item>();
		
		public List<Item> getItems() {
			return items;
		}

		public void setItems(List<Item> items) {
			this.items = items;
		}	
	}
	
	@XStreamAlias("Item")
	public static class Item implements Serializable{
		private static final long serialVersionUID = 1L;
		@XStreamAlias("Ma_Cuc")
		private String maCuc;
		@XStreamAlias("Ten_Cuc")
		private String tenCuc;
		@XStreamAlias("Ma_HQ_PH")
		private String maHQPH;
		@XStreamAlias("Ten_HQ_PH")
		private String tenHQPH;
		@XStreamAlias("Ma_HQ_CQT")
		private String maHQCQT;
		@XStreamAlias("Ma_DV")
		private String maDV;
		@XStreamAlias("Ten_DV")
		private String tenDV;
		@XStreamAlias("Ma_Chuong")
		private String maChuong;		
		@XStreamAlias("Ma_NTK")
		private String maNTK;
		@XStreamAlias("Ten_NTK")
		private String tenNTK;
		@XStreamAlias("Ma_KB")
		private String maKB;
		@XStreamAlias("Ten_KB")
		private String tenKB;
		@XStreamAlias("TKKB")
		private String tKKB;
		@XStreamAlias("DuNo_TO")
		private Double duNoTO;		
		@XStreamImplicit(itemFieldName = "CT_No")
		private List<CTNo> cTNos = new ArrayList<CTNo>();
		public String getMaCuc() {
			return maCuc;
		}
		public void setMaCuc(String maCuc) {
			this.maCuc = maCuc;
		}
		public String getTenCuc() {
			return tenCuc;
		}
		public void setTenCuc(String tenCuc) {
			this.tenCuc = tenCuc;
		}
		public String getMaHQPH() {
			return maHQPH;
		}
		public void setMaHQPH(String maHQPH) {
			this.maHQPH = maHQPH;
		}
		public String getTenHQPH() {
			return tenHQPH;
		}
		public void setTenHQPH(String tenHQPH) {
			this.tenHQPH = tenHQPH;
		}
		public String getMaHQCQT() {
			return maHQCQT;
		}
		public void setMaHQCQT(String maHQCQT) {
			this.maHQCQT = maHQCQT;
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
		public String getMaChuong() {
			return maChuong;
		}
		public void setMaChuong(String maChuong) {
			this.maChuong = maChuong;
		}
		public String getMaNTK() {
			return maNTK;
		}
		public void setMaNTK(String maNTK) {
			this.maNTK = maNTK;
		}
		public String getTenNTK() {
			return tenNTK;
		}
		public void setTenNTK(String tenNTK) {
			this.tenNTK = tenNTK;
		}
		public String getMaKB() {
			return maKB;
		}
		public void setMaKB(String maKB) {
			this.maKB = maKB;
		}
		public String getTenKB() {
			return tenKB;
		}
		public void setTenKB(String tenKB) {
			this.tenKB = tenKB;
		}
		public String gettKKB() {
			return tKKB;
		}
		public void settKKB(String tKKB) {
			this.tKKB = tKKB;
		}
		public Double getDuNoTO() {
			return duNoTO;
		}
		public void setDuNoTO(Double duNoTO) {
			this.duNoTO = duNoTO;
		}
		public List<CTNo> getcTNos() {
			return cTNos;
		}
		public void setcTNos(List<CTNo> cTNos) {
			this.cTNos = cTNos;
		}
	}
	
	@XStreamAlias("CTNo")
	public static class CTNo implements Serializable{
		private static final long serialVersionUID = 1L;
		@XStreamAlias("Ma_HQ")
		private String maHQ;
		@XStreamAlias("Ten_HQ")
		private String tenHQ;
		@XStreamAlias("Ma_LH")
		private String maLH;
		@XStreamAlias("Ten_LH")
		private String tenLH;
		@XStreamAlias("Nam_DK")
		private Short namDK;
		@XStreamAlias("So_TK")
		private String soTK;
		@XStreamAlias("Ngay_DK")
		private Date ngayDK;		
		@XStreamAlias("Ma_LT")
		private Short maLT;
		@XStreamAlias("Ma_HTVCHH")
		private String maHTVCH;
		@XStreamAlias("Ten_HTVCHH")
		private String tenHTVCH;
		@XStreamAlias("LoaiThue")
		private String loaiThue;
		@XStreamAlias("Khoan")
		private String khoan;
		@XStreamAlias("TieuMuc")
		private String tieuMuc;
		@XStreamOmitField
		private String tenTieuMuc;
		@XStreamAlias("DuNo")
		private Double duNo;
		public String getMaHQ() {
			return maHQ;
		}
		public void setMaHQ(String maHQ) {
			this.maHQ = maHQ;
		}
		public String getTenHQ() {
			return tenHQ;
		}
		public void setTenHQ(String tenHQ) {
			this.tenHQ = tenHQ;
		}
		public String getMaLH() {
			return maLH;
		}
		public void setMaLH(String maLH) {
			this.maLH = maLH;
		}
		public String getTenLH() {
			return tenLH;
		}
		public void setTenLH(String tenLH) {
			this.tenLH = tenLH;
		}
		public Short getNamDK() {
			return namDK;
		}
		public void setNamDK(Short namDK) {
			this.namDK = namDK;
		}
		public String getSoTK() {
			return soTK;
		}
		public void setSoTK(String soTK) {
			this.soTK = soTK;
		}
		public Date getNgayDK() {
			return ngayDK;
		}
		public void setNgayDK(Date ngayDK) {
			this.ngayDK = ngayDK;
		}
		public Short getMaLT() {
			return maLT;
		}
		public void setMaLT(Short maLT) {
			this.maLT = maLT;
		}
		public String getMaHTVCH() {
			return maHTVCH;
		}
		public void setMaHTVCH(String maHTVCH) {
			this.maHTVCH = maHTVCH;
		}
		public String getTenHTVCH() {
			return tenHTVCH;
		}
		public void setTenHTVCH(String tenHTVCH) {
			this.tenHTVCH = tenHTVCH;
		}
		public String getLoaiThue() {
			return loaiThue;
		}
		public void setLoaiThue(String loaiThue) {
			this.loaiThue = loaiThue;
		}
		public String getKhoan() {
			return khoan;
		}
		public void setKhoan(String khoan) {
			this.khoan = khoan;
		}
		public String getTieuMuc() {
			return tieuMuc;
		}
		public void setTieuMuc(String tieuMuc) {
			this.tieuMuc = tieuMuc;
		}		
		public String getTenTieuMuc() {
			return tenTieuMuc;
		}
		public void setTenTieuMuc(String tenTieuMuc) {
			this.tenTieuMuc = tenTieuMuc;
		}
		public Double getDuNo() {
			return duNo;
		}
		public void setDuNo(Double duNo) {
			this.duNo = duNo;
		}
		
	}

	@Override
	public void addDefaultImplementation(XStream xstream) {
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}
}
