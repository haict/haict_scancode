package com.cmn.entity.cus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cmn.CUSMessage;
import com.cmn.cus.CUSDateTimeConverter01;
import com.cmn.cus.CUSDoubleConverter;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS301 extends CUSRequest<CUS301.DataImp> {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_301;
	static {
		CUSBeanFactory.getInstance().register(type, new CUS301());
	}
	@XStreamAlias("Error")
	private Error error;
	
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
		@XStreamAlias("Ma_DV")
		private String maDV;
		@XStreamAlias("Ma_Chuong")
		private String maChuong;
		@XStreamAlias("Ten_DV")
		private String tenDV;
		@XStreamAlias("Ma_KB")
		private String maKB;
		@XStreamAlias("Ten_KB")
		private String tenKB;
		@XStreamAlias("TKKB")
		private String tKKB;
		@XStreamAlias("Ma_NTK")
		private String maNTK;
		@XStreamAlias("Ma_HQ_PH")
		private String maHQPH;
		@XStreamAlias("Ma_HQ_CQT")
		private String maHQCQT;
		@XStreamAlias("KyHieu_CT")
		private String kyHieuCT;
		@XStreamAlias("So_CT")
		private String soCT;
		@XStreamAlias("Loai_CT")
		private Byte loaiCT;
		@XStreamAlias("So_TN_CTS")
		private String soTNCTS;
		@XStreamAlias("Ngay_TN_CTS")
		private String ngayTNCTS;
		@XStreamAlias("Ngay_BN")
		@XStreamConverter(value = CUSDateTimeConverter01.class)
		private Date ngayBN;
		@XStreamAlias("Ngay_BC")
		@XStreamConverter(value = CUSDateTimeConverter01.class)
		private Date ngayBC;
		@XStreamAlias("Ngay_CT")
		@XStreamConverter(value = CUSDateTimeConverter01.class)
		private Date ngayCT;
		@XStreamAlias("Ma_NT")
		private String maNT;
		@XStreamAlias("Ty_Gia")
		@XStreamConverter(value = CUSDoubleConverter.class)
		private Double tyGia;
		@XStreamConverter(value = CUSDoubleConverter.class)
		@XStreamAlias("SoTien_TO")
		private Double soTienTO;
		@XStreamAlias("DienGiai")
		private String dienGiai;
		@XStreamImplicit(itemFieldName = "GNT_CT")
		private List<GNTCT> gNTCTs = new ArrayList<GNTCT>();

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
		public String getMaDV() {
			return maDV;
		}
		public void setMaDV(String maDV) {
			this.maDV = maDV;
		}
		public String getMaChuong() {
			return maChuong;
		}
		public void setMaChuong(String maChuong) {
			this.maChuong = maChuong;
		}
		public String getTenDV() {
			return tenDV;
		}
		public void setTenDV(String tenDV) {
			this.tenDV = tenDV;
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
		public String getMaNTK() {
			return maNTK;
		}
		public void setMaNTK(String maNTK) {
			this.maNTK = maNTK;
		}
		public String getMaHQPH() {
			return maHQPH;
		}
		public void setMaHQPH(String maHQPH) {
			this.maHQPH = maHQPH;
		}
		public String getMaHQCQT() {
			return maHQCQT;
		}
		public void setMaHQCQT(String maHQCQT) {
			this.maHQCQT = maHQCQT;
		}
		public String getKyHieuCT() {
			return kyHieuCT;
		}
		public void setKyHieuCT(String kyHieuCT) {
			this.kyHieuCT = kyHieuCT;
		}
		public String getSoCT() {
			return soCT;
		}
		public void setSoCT(String soCT) {
			this.soCT = soCT;
		}
		public Byte getLoaiCT() {
			return loaiCT;
		}
		public void setLoaiCT(Byte loaiCT) {
			this.loaiCT = loaiCT;
		}
		public String getSoTNCTS() {
			return soTNCTS;
		}
		public void setSoTNCTS(String soTNCTS) {
			this.soTNCTS = soTNCTS;
		}
		public String getNgayTNCTS() {
			return ngayTNCTS;
		}
		public void setNgayTNCTS(String ngayTNCTS) {
			this.ngayTNCTS = ngayTNCTS;
		}
		public Date getNgayBN() {
			return ngayBN;
		}
		public void setNgayBN(Date ngayBN) {
			this.ngayBN = ngayBN;
		}
		public Date getNgayBC() {
			return ngayBC;
		}
		public void setNgayBC(Date ngayBC) {
			this.ngayBC = ngayBC;
		}
		public Date getNgayCT() {
			return ngayCT;
		}
		public void setNgayCT(Date ngayCT) {
			this.ngayCT = ngayCT;
		}
		public String getMaNT() {
			return maNT;
		}
		public void setMaNT(String maNT) {
			this.maNT = maNT;
		}
		public Double getTyGia() {
			return tyGia;
		}
		public void setTyGia(Double tyGia) {
			this.tyGia = tyGia;
		}
		public Double getSoTienTO() {
			return soTienTO;
		}
		public void setSoTienTO(Double soTienTO) {
			this.soTienTO = soTienTO;
		}
		public String getDienGiai() {
			return dienGiai;
		}
		public void setDienGiai(String dienGiai) {
			this.dienGiai = dienGiai;
		}
		public List<GNTCT> getgNTCTs() {
			return gNTCTs;
		}
		public void setgNTCTs(List<GNTCT> gNTCTs) {
			this.gNTCTs = gNTCTs;
		}
		
	}
	
	@XStreamAlias("GNT_CT")
	public static class GNTCT implements Serializable{
		private static final long serialVersionUID = 1L;
		@XStreamAlias("TTButToan")
		private Integer tTButToan;
		@XStreamAlias("Ma_HQ")
		private String maHQ;
		@XStreamAlias("Ma_LH")
		private String maLH;
		@XStreamAlias("Nam_DK")
		private Short namDK;
		@XStreamAlias("So_TK")
		private String soTK;
		@XStreamAlias("Ma_LT")
		private Byte maLT;
		@XStreamImplicit(itemFieldName = "ToKhai_CT")
		private List<ToKhaiCT> toKhaiCTs = new ArrayList<ToKhaiCT>();
		public Integer gettTButToan() {
			return tTButToan;
		}
		public void settTButToan(Integer tTButToan) {
			this.tTButToan = tTButToan;
		}
		public String getMaHQ() {
			return maHQ;
		}
		public void setMaHQ(String maHQ) {
			this.maHQ = maHQ;
		}
		public String getMaLH() {
			return maLH;
		}
		public void setMaLH(String maLH) {
			this.maLH = maLH;
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
		public Byte getMaLT() {
			return maLT;
		}
		public void setMaLT(Byte maLT) {
			this.maLT = maLT;
		}
		public List<ToKhaiCT> getToKhaiCTs() {
			return toKhaiCTs;
		}
		public void setToKhaiCTs(List<ToKhaiCT> toKhaiCTs) {
			this.toKhaiCTs = toKhaiCTs;
		}
		
	}
	
	public static class ToKhaiCT implements Serializable{
		private static final long serialVersionUID = 1L;
		@XStreamAlias("Ma_ST")
		private String maST;
		@XStreamAlias("NDKT")
		private String nDKT;
		@XStreamConverter(value = CUSDoubleConverter.class)
		@XStreamAlias("SoTien_NT")
		private Double soTienNT;
		@XStreamConverter(value = CUSDoubleConverter.class)
		@XStreamAlias("SoTien_VND")
		private Double soTienVND;
		public String getMaST() {
			return maST;
		}
		public void setMaST(String maST) {
			this.maST = maST;
		}
		public String getnDKT() {
			return nDKT;
		}
		public void setnDKT(String nDKT) {
			this.nDKT = nDKT;
		}
		public Double getSoTienNT() {
			return soTienNT;
		}
		public void setSoTienNT(Double soTienNT) {
			this.soTienNT = soTienNT;
		}
		public Double getSoTienVND() {
			return soTienVND;
		}
		public void setSoTienVND(Double soTienVND) {
			this.soTienVND = soTienVND;
		}
		
	}

	public CUSBeanImp<CUS301.DataImp> init() {
		CUS301 bean = new CUS301();
		bean.data = new DataImp();
		bean.error = new Error();
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
