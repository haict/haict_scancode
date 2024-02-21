package com.cmn.entity.ecus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cmn.CUSMessage;
import com.cmn.cus.CUSDateTimeConverter01;
import com.cmn.cus.CUSDoubleConverter;
import com.cmn.entity.cus.CUSBeanFactory;
import com.cmn.entity.cus.CUSBeanImp;
import com.cmn.entity.cus.CUSRequest;
import com.cmn.entity.cus.Data;
//import com.cmn.entity.cus.Error;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS321 extends CUSRequest<CUS321.DataImp> {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_321;
	static {
		CUSBeanFactory.getInstance().register(type, new CUS321());
	}
	/*
	 * @XStreamAlias("Error") private Error error;
	 */
	
	@XStreamAlias("Data")
	public static class DataImp extends Data{
		private static final long serialVersionUID = 1L;

		public DataImp(){}
		
		@XStreamAlias("Ma_NH_PH")
		private String maNHPH;
		@XStreamAlias("Ten_NH_PH")
		private String tenNHPH;
		@XStreamAlias("Ma_NH_TH")
		private String maNHTH;
		@XStreamAlias("Ten_NH_TH")
		private String tenNHTH;
		
		@XStreamAlias("Ma_LoaiPhi")
		private String maLoaiPhi;
		@XStreamAlias("Ten_LoaiPhi")
		private String tenLoaiPhi;
		@XStreamAlias("Ma_DV_ThuPhi")
		private String maDVThuPhi;
		@XStreamAlias("Ten_DV_ThuPhi")
		private String tenDVThuPhi;
		@XStreamAlias("Ma_CQT_DV_ThuPhi")
		private String maCQT;
		
		@XStreamAlias("So_CT")
		private String soCT;
		@XStreamAlias("KyHieu_CT")
		private String kyHieuCT;
		@XStreamAlias("Ngay_CT")
		@XStreamConverter(value = CUSDateTimeConverter01.class)
		private Date ngayCT;
		
		@XStreamAlias("Ma_DV")
		private String maDV;
		@XStreamAlias("Ten_DV")
		private String tenDV;	
		@XStreamAlias("Chuong_NS")
		private String chuongNS;
		@XStreamAlias("DiaChi")
		private String diaChi;
		
		@XStreamAlias("TKKB")
		private String tkKB;
		@XStreamAlias("Ten_TKKB")
		private String tenTKKB;
		@XStreamAlias("Ma_KB")
		private String maKB;
		@XStreamAlias("Ten_KB")
		private String tenKB;
		@XStreamAlias("ThongTinKhac")
		private String ttKhac;
		
		@XStreamConverter(value = CUSDoubleConverter.class)
		@XStreamAlias("SoTien_TO")
		private Double soTienTO;
		
		@XStreamImplicit(itemFieldName = "ThongTinChungTu_NP")
		private List<ThongTinChungTu_NP> thongTinCTNPs = new ArrayList<ThongTinChungTu_NP>();
		public List<ThongTinChungTu_NP> getThongTinCTNPs() {
			if(thongTinCTNPs == null) {
				return new ArrayList<CUS321.ThongTinChungTu_NP>();
			}
			return thongTinCTNPs;
		}
		public void setThongTinCTNPs(List<ThongTinChungTu_NP> thongTinCTNPs) {
			this.thongTinCTNPs = thongTinCTNPs;
		}
		public String getMaNHPH() {
			return maNHPH;
		}
		public void setMaNHPH(String maNHPH) {
			this.maNHPH = maNHPH;
		}
		public String getTenNHPH() {
			return tenNHPH;
		}
		public void setTenNHPH(String tenNHPH) {
			this.tenNHPH = tenNHPH;
		}
		public String getMaNHTH() {
			return maNHTH;
		}
		public void setMaNHTH(String maNHTH) {
			this.maNHTH = maNHTH;
		}
		public String getTenNHTH() {
			return tenNHTH;
		}
		public void setTenNHTH(String tenNHTH) {
			this.tenNHTH = tenNHTH;
		}
		public String getMaLoaiPhi() {
			return maLoaiPhi;
		}
		public void setMaLoaiPhi(String maLoaiPhi) {
			this.maLoaiPhi = maLoaiPhi;
		}
		public String getTenLoaiPhi() {
			return tenLoaiPhi;
		}
		public void setTenLoaiPhi(String tenLoaiPhi) {
			this.tenLoaiPhi = tenLoaiPhi;
		}
		public String getMaDVThuPhi() {
			return maDVThuPhi;
		}
		public void setMaDVThuPhi(String maDVThuPhi) {
			this.maDVThuPhi = maDVThuPhi;
		}
		public String getTenDVThuPhi() {
			return tenDVThuPhi;
		}
		public void setTenDVThuPhi(String tenDVThuPhi) {
			this.tenDVThuPhi = tenDVThuPhi;
		}
		public String getMaCQT() {
			return maCQT;
		}
		public void setMaCQT(String maCQT) {
			this.maCQT = maCQT;
		}
		public String getSoCT() {
			return soCT;
		}
		public void setSoCT(String soCT) {
			this.soCT = soCT;
		}
		public String getKyHieuCT() {
			return kyHieuCT;
		}
		public void setKyHieuCT(String kyHieuCT) {
			this.kyHieuCT = kyHieuCT;
		}
		public Date getNgayCT() {
			return ngayCT;
		}
		public void setNgayCT(Date ngayCT) {
			this.ngayCT = ngayCT;
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
		public String getChuongNS() {
			return chuongNS;
		}
		public void setChuongNS(String chuongNS) {
			this.chuongNS = chuongNS;
		}
		public String getDiaChi() {
			return diaChi;
		}
		public void setDiaChi(String diaChi) {
			this.diaChi = diaChi;
		}
		public String getTkKB() {
			return tkKB;
		}
		public void setTkKB(String tkKB) {
			this.tkKB = tkKB;
		}
		public String getTenTKKB() {
			return tenTKKB;
		}
		public void setTenTKKB(String tenTKKB) {
			this.tenTKKB = tenTKKB;
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
		public String getTtKhac() {
			return ttKhac;
		}
		public void setTtKhac(String ttKhac) {
			this.ttKhac = ttKhac;
		}
		public Double getSoTienTO() {
			return soTienTO;
		}
		public void setSoTienTO(Double soTienTO) {
			this.soTienTO = soTienTO;
		}
	}
	
	@XStreamAlias("ThongTinChungTu_NP")
	public static class ThongTinChungTu_NP implements Serializable{
		private static final long serialVersionUID = 1L;
		@XStreamAlias("ID_CT")
		private String idCT;
		@XStreamAlias("So_CT_TBNP")
		private String soCT;
		@XStreamAlias("KyHieu_CT_TBNP")
		private String khieuCT;
		
		@XStreamAlias("Ngay_CT_TBNP")
		@XStreamConverter(value = CUSDateTimeConverter01.class)
		private Date ngayCT;
		@XStreamAlias("TieuMuc")
		private String tmuc;
		@XStreamAlias("SoTien")
		@XStreamConverter(value = CUSDoubleConverter.class)
		private Double soTien;
		@XStreamAlias("DienGiai")
		private String dienGiai;
		public String getIdCT() {
			return idCT;
		}
		public void setIdCT(String idCT) {
			this.idCT = idCT;
		}
		public String getSoCT() {
			return soCT;
		}
		public void setSoCT(String soCT) {
			this.soCT = soCT;
		}
		public String getKhieuCT() {
			return khieuCT;
		}
		public void setKhieuCT(String khieuCT) {
			this.khieuCT = khieuCT;
		}
		public Date getNgayCT() {
			return ngayCT;
		}
		public void setNgayCT(Date ngayCT) {
			this.ngayCT = ngayCT;
		}
		public Double getSoTien() {
			return soTien;
		}
		public void setSoTien(Double soTien) {
			this.soTien = soTien;
		}
		public String getDienGiai() {
			return dienGiai;
		}
		public void setDienGiai(String dienGiai) {
			this.dienGiai = dienGiai;
		}
		public String getTmuc() {
			return tmuc;
		}
		public void setTmuc(String tmuc) {
			this.tmuc = tmuc;
		}
		
	}
	
	public CUSBeanImp<CUS321.DataImp> init() {
		CUS321 bean = new CUS321();
		bean.data = new DataImp();
//		bean.error = new Error();
		return bean;
	}

	public CUSMessage getType() {
		return type;
	}

	@Override
	public void addDefaultImplementation(XStream xstream) {
//		xstream.addDefaultImplementation(DataImp.class, AData.class);
	}
	
}
