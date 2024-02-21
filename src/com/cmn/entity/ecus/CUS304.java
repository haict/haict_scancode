package com.cmn.entity.ecus;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cmn.CUSMessage;
import com.cmn.cus.CUSDateTimeConverter01;
import com.cmn.cus.CUSDoubleConverter;
import com.cmn.entity.cus.CUSBeanFactory;
import com.cmn.entity.cus.CUSBeanImp;
import com.cmn.entity.cus.CUSResponse;
import com.cmn.entity.cus.Data;
import com.cmn.entity.cus.TaiKhoan_NopTien;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS304 extends CUSResponse<CUS304.DataImp>{
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_304;
	public CUS304(){}
	static {
		CUSBeanFactory.getInstance().register(type, new CUS304());
	}
	public CUSBeanImp<CUS304.DataImp> init() {
		CUS304 bean = new CUS304();
		bean.data = new CUS304.DataImp();
		return bean;
	}
	public CUSMessage getType() {
		return type;
	}
	
	@XStreamAlias("Data")
	public static class DataImp extends Data{
		private static final long serialVersionUID = 1L;

		public DataImp(){}
		
		@XStreamAlias("ThongTinChungTu")
		private ThongTinChungTu thongTinChungTu;
		@XStreamAlias("ThongTinGiaoDich")
		private ThongTinGiaoDich thongTinGiaoDich;

		public ThongTinChungTu getThongTinChungTu() {
			return thongTinChungTu;
		}
		public void setThongTinChungTu(ThongTinChungTu thongTinChungTu) {
			this.thongTinChungTu = thongTinChungTu;
		}
		public ThongTinGiaoDich getThongTinGiaoDich() {
			return thongTinGiaoDich;
		}
		public void setThongTinGiaoDich(ThongTinGiaoDich thongTinGiaoDich) {
			this.thongTinGiaoDich = thongTinGiaoDich;
		}								
	}
	@XStreamAlias("ThongTinChungTu")	
	public static class ThongTinChungTu implements Serializable{
		private static final long serialVersionUID = 1L;
		@XStreamAlias("NgayLap_CT")
		//@XStreamConverter(value = CUSDateTimeConverter01.class)
		private Date ngayLapCT;
		
		@XStreamAlias("NgayTruyen_CT")
		private Date ngayTruyenCT;
		
		@XStreamAlias("Ma_DV")
		private String maDV;
		
		@XStreamAlias("Ma_Chuong")
		private Integer maChuong;
		
		@XStreamAlias("Ten_DV")
		private String tenDV;
		
		@XStreamAlias("Ma_KB")
		private String maKB;
		
		@XStreamAlias("Ten_KB")
		private String tenKB;
		
		@XStreamAlias("TKKB")
		private String tKKB;
		
		@XStreamAlias("Ma_NTK")
		private Integer maNTK;
		
		@XStreamAlias("Ma_HQ_PH")
		private String maHQPH;
		
		@XStreamAlias("Ma_HQ_CQT")
		private String maHQCQT;
		
		@XStreamAlias("KyHieu_CT")
		private String kyHieuCT;
		
		@XStreamAlias("So_CT")
		private String soCT;
		
		@XStreamAlias("Loai_CT")
		private Short loaiCT;
		
		@XStreamAlias("Ngay_BN")
		//@XStreamConverter(value = CUSDateTimeConverter01.class)
		private Date ngayBN;
		
		@XStreamAlias("Ngay_CT")
		//@XStreamConverter(value = CUSDateTimeConverter01.class)
		private Date ngayCT;
		
		@XStreamAlias("Ma_NT")		
		private String maNT;
		
		@XStreamConverter(value = CUSDoubleConverter.class)
		@XStreamAlias("Ty_Gia")
		private Double tyGia;
		
		@XStreamConverter(value = CUSDoubleConverter.class)
		@XStreamAlias("SoTien_TO")
		private Double soTienTO;
		
		@XStreamAlias("DienGiai")		
		private String dienGiai;			
		
		@XStreamImplicit(itemFieldName = "GNT_CT")
		private List<GNTCT> gntcts = new ArrayList<GNTCT>();

		public Date getNgayLapCT() {
			return ngayLapCT;
		}

		public void setNgayLapCT(Date ngayLapCT) {
			this.ngayLapCT = ngayLapCT;
		}

		public Date getNgayTruyenCT() {
			return ngayTruyenCT;
		}

		public void setNgayTruyenCT(Date ngayTruyenCT) {
			this.ngayTruyenCT = ngayTruyenCT;
		}

		public String getMaDV() {
			return maDV;
		}

		public void setMaDV(String maDV) {
			this.maDV = maDV;
		}

		public Integer getMaChuong() {
			return maChuong;
		}

		public void setMaChuong(Integer maChuong) {
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

		public Integer getMaNTK() {
			return maNTK;
		}

		public void setMaNTK(Integer maNTK) {
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

		public Short getLoaiCT() {
			return loaiCT;
		}

		public void setLoaiCT(Short loaiCT) {
			this.loaiCT = loaiCT;
		}

		public Date getNgayBN() {
			return ngayBN;
		}

		public void setNgayBN(Date ngayBN) {
			this.ngayBN = ngayBN;
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

		public List<GNTCT> getGntcts() {
			return gntcts;
		}

		public void setGntcts(List<GNTCT> gntcts) {
			this.gntcts = gntcts;
		}				
	}
	@XStreamAlias("ThongTinGiaoDich")
	public static class ThongTinGiaoDich implements Serializable{
		private static final long serialVersionUID = 1L;
		
		@XStreamAlias("NguoiNopTien")
		private NguoiNopTien nguoiNopTien;
		
		@XStreamAlias("TaiKhoan_NopTien")
		private TaiKhoan_NopTien taiKhoanNopTien;

		public NguoiNopTien getNguoiNopTien() {
			return nguoiNopTien;
		}

		public void setNguoiNopTien(NguoiNopTien nguoiNopTien) {
			this.nguoiNopTien = nguoiNopTien;
		}

		public TaiKhoan_NopTien getTaiKhoanNopTien() {
			return taiKhoanNopTien;
		}

		public void setTaiKhoanNopTien(TaiKhoan_NopTien taiKhoanNopTien) {
			this.taiKhoanNopTien = taiKhoanNopTien;
		}							
	}
	
	@XStreamAlias("GNT_CT")
	public static class GNTCT implements Serializable{
		private static final long serialVersionUID = 1L;
		@XStreamAlias("ID_HS")
		private String idHS;
		@XStreamAlias("TTButToan")
		private Integer tTButToan;
		@XStreamAlias("Ma_HQ")
		private String maHQ;
		@XStreamAlias("Ma_LH")
		private String maLH;
		@XStreamAlias("Nam_DK")
		private Short namDK;
		@XStreamAlias("Ngay_DK")
		private Date ngayDK;
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
		public String getIdHS() {
			return idHS;
		}
		public void setIdHS(String idHS) {
			this.idHS = idHS;
		}		
		public Date getNgayDK() {
			return ngayDK;
		}
		public void setNgayDK(Date ngayDK) {
			this.ngayDK = ngayDK;
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
	@XStreamAlias("NguoiNopTien")
	public static class NguoiNopTien implements Serializable{
		private static final long serialVersionUID = 1L;	
		@XStreamAlias("Ma_ST")
		private String maST;
		@XStreamAlias("So_CMT")
		private String soCMT;
		@XStreamAlias("Ten_NNT")
		private String tenNNT;
		@XStreamAlias("DiaChi")
		private String diaChi;
		@XStreamAlias("TT_Khac")
		private String ttKhac;
		public String getMaST() {
			return maST;
		}
		public void setMaST(String maST) {
			this.maST = maST;
		}
		public String getSoCMT() {
			return soCMT;
		}
		public void setSoCMT(String soCMT) {
			this.soCMT = soCMT;
		}
		public String getTenNNT() {
			return tenNNT;
		}
		public void setTenNNT(String tenNNT) {
			this.tenNNT = tenNNT;
		}
		public String getDiaChi() {
			return diaChi;
		}
		public void setDiaChi(String diaChi) {
			this.diaChi = diaChi;
		}
		public String getTtKhac() {
			return ttKhac;
		}
		public void setTtKhac(String ttKhac) {
			this.ttKhac = ttKhac;
		}				
	}	

	@Override
	public void addDefaultImplementation(XStream xstream) {
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}
	
}
