package com.cmn.entity.cus;

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
public class CUS857 extends CUSResponse<CUS857.DataImp>{
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_857;
	static {
		CUSBeanFactory.getInstance().register(type, new CUS857());
	}
	
	@Override
	public CUSMessage getType() {
		// TODO Auto-generated method stub
		return type;
	}
	
	@Override
	public CUSBean init() {
		CUS857 bean = new CUS857();
		bean.data = new CUS857.DataImp();
		return bean;
	}
	@XStreamAlias("Data")
	public static class DataImp extends Data{
		private static final long serialVersionUID = 1L;
		
		@XStreamAlias("Ma_NH_DC")
		private String maNhDc;
		@XStreamAlias("Ngay_DC")
		private String ngayDc;
		@XStreamImplicit(itemFieldName="Transactions")
		private List<Transactions> transactions = new ArrayList<Transactions>();
		@XStreamAlias("Error")
		private Error error;
		public DataImp(){}

		public String getMaNhDc() {
			return maNhDc;
		}

		public void setMaNhDc(String maNhDc) {
			this.maNhDc = maNhDc;
		}

		public String getNgayDc() {
			return ngayDc;
		}

		public void setNgayDc(String ngayDc) {
			this.ngayDc = ngayDc;
		}

		public List<Transactions> getTransactions() {
			return transactions;
		}

		public void setTransactions(List<Transactions> transactions) {
			this.transactions = transactions;
		}

		public Error getError() {
			return error;
		}

		public void setError(Error error) {
			this.error = error;
		}
		
	}	
	public static class Transactions {
		@XStreamAlias("Transaction_ID")
		private String transactionId;
		@XStreamAlias("ThongTinChungTu")
		private ThongTinChungTu thongTinChungTu = new ThongTinChungTu();		
		@XStreamAlias("ThongTinGiaoDich")
		private ThongTinGiaoDich ThongTinGiaoDich = new ThongTinGiaoDich();
		@XStreamAlias("KQ_DC")
		private String kqDc;
		public String getTransactionId() {
			return transactionId;
		}
		public void setTransactionId(String transactionId) {
			this.transactionId = transactionId;
		}
		public ThongTinChungTu getThongTinChungTu() {
			return thongTinChungTu;
		}
		public void setThongTinChungTu(ThongTinChungTu thongTinChungTu) {
			this.thongTinChungTu = thongTinChungTu;
		}
		public ThongTinGiaoDich getThongTinGiaoDich() {
			return ThongTinGiaoDich;
		}
		public void setThongTinGiaoDich(ThongTinGiaoDich thongTinGiaoDich) {
			ThongTinGiaoDich = thongTinGiaoDich;
		}
		public String getKqDc() {
			return kqDc;
		}
		public void setKqDc(String kqDc) {
			this.kqDc = kqDc;
		}				
	}
	public static class ThongTinChungTu{
		@XStreamAlias("NgayLap_CT")
		@XStreamConverter(value = CUSDateTimeConverter01.class)
		private Date ngayLapCT;
		@XStreamAlias("NgayTruyen_CT")
		private Date ngayTruyenCT;
		@XStreamAlias("Ma_DV")
		private String maDv;
		@XStreamAlias("Ma_Chuong")
		private String maChuong;
		@XStreamAlias("Ten_DV")
		private String tenDv;
		@XStreamAlias("Ma_KB")
		private String maKb;
		@XStreamAlias("Ten_KB")
		private String tenKb;
		@XStreamAlias("TKKB")
		private String tkkb;
		@XStreamAlias("Ma_NTK")
		private String maNtk;
		@XStreamAlias("Ma_HQ_PH")
		private String maHqPh;
		@XStreamAlias("Ma_HQ_CQT")
		private String maHqCqt;
		@XStreamAlias("KyHieu_CT")
		private String kyHieuCt;
		@XStreamAlias("So_CT")
		private String soCt;
		@XStreamAlias("Loai_CT")
		private String loaiCt;
		@XStreamAlias("Ngay_BN")
		@XStreamConverter(value = CUSDateTimeConverter01.class)
		private Date ngayBN;
		/*@XStreamAlias("Ngay_BC")
		@XStreamConverter(value = CUSDateTimeConverter01.class)
		private Date ngayBC;*/
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
		@XStreamImplicit(itemFieldName="GNT_CT")
		private List<GntCt> gntCt = new ArrayList<GntCt>();
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
		public String getMaDv() {
			return maDv;
		}
		public void setMaDv(String maDv) {
			this.maDv = maDv;
		}
		public String getMaChuong() {
			return maChuong;
		}
		public void setMaChuong(String maChuong) {
			this.maChuong = maChuong;
		}
		public String getTenDv() {
			return tenDv;
		}
		public void setTenDv(String tenDv) {
			this.tenDv = tenDv;
		}
		public String getMaKb() {
			return maKb;
		}
		public void setMaKb(String maKb) {
			this.maKb = maKb;
		}
		public String getTenKb() {
			return tenKb;
		}
		public void setTenKb(String tenKb) {
			this.tenKb = tenKb;
		}
		public String getTkkb() {
			return tkkb;
		}
		public void setTkkb(String tkkb) {
			this.tkkb = tkkb;
		}
		public String getMaNtk() {
			return maNtk;
		}
		public void setMaNtk(String maNtk) {
			this.maNtk = maNtk;
		}
		public String getMaHqPh() {
			return maHqPh;
		}
		public void setMaHqPh(String maHqPh) {
			this.maHqPh = maHqPh;
		}
		public String getMaHqCqt() {
			return maHqCqt;
		}
		public void setMaHqCqt(String maHqCqt) {
			this.maHqCqt = maHqCqt;
		}
		public String getKyHieuCt() {
			return kyHieuCt;
		}
		public void setKyHieuCt(String kyHieuCt) {
			this.kyHieuCt = kyHieuCt;
		}
		public String getSoCt() {
			return soCt;
		}
		public void setSoCt(String soCt) {
			this.soCt = soCt;
		}
		public String getLoaiCt() {
			return loaiCt;
		}
		public void setLoaiCt(String loaiCt) {
			this.loaiCt = loaiCt;
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
		public List<GntCt> getGntCt() {
			return gntCt;
		}
		public void setGntCt(List<GntCt> gntCt) {
			this.gntCt = gntCt;
		}
	}							
	public static class GntCt {		
		@XStreamAlias("ID_HS")
		private String idHS;
		@XStreamAlias("TTButToan")
		private String ttbuttoan;
		@XStreamAlias("Ma_HQ")
		private String maHq;
		@XStreamAlias("Ma_LH")
		private String maLh;
		@XStreamAlias("Nam_DK")
		private String namDk;
		@XStreamAlias("So_TK")
		private String soTk;
		@XStreamAlias("Ma_LT")
		private String maLt;
		@XStreamImplicit(itemFieldName="ToKhai_CT")
		private List<ToKhaiCt> toKhaiCt = new ArrayList<ToKhaiCt>();
		
		public String getIdHS() {
			return idHS;
		}

		public void setIdHS(String idHS) {
			this.idHS = idHS;
		}

		public String getTtbuttoan() {
			return ttbuttoan;
		}

		public void setTtbuttoan(String ttbuttoan) {
			this.ttbuttoan = ttbuttoan;
		}

		public String getMaHq() {
			return maHq;
		}

		public void setMaHq(String maHq) {
			this.maHq = maHq;
		}

		public String getMaLh() {
			return maLh;
		}

		public void setMaLh(String maLh) {
			this.maLh = maLh;
		}

		public String getNamDk() {
			return namDk;
		}

		public void setNamDk(String namDk) {
			this.namDk = namDk;
		}

		public String getSoTk() {
			return soTk;
		}

		public void setSoTk(String soTk) {
			this.soTk = soTk;
		}

		public String getMaLt() {
			return maLt;
		}

		public void setMaLt(String maLt) {
			this.maLt = maLt;
		}

		public List<ToKhaiCt> getToKhaiCt() {
			return toKhaiCt;
		}

		public void setToKhaiCt(List<ToKhaiCt> toKhaiCt) {
			this.toKhaiCt = toKhaiCt;
		}
	}
	
	public static class ToKhaiCt {
		@XStreamAlias("Ma_ST")
		private String maSt;
		@XStreamAlias("NDKT")
		private String ndkt;
		@XStreamAlias("SoTien_NT")
		@XStreamConverter(value = CUSDoubleConverter.class)
		private Double soTienNt;
		@XStreamAlias("SoTien_VND")
		@XStreamConverter(value = CUSDoubleConverter.class)
		private Double soTienVnd;

		public String getMaSt() {
			return maSt;
		}

		public void setMaSt(String maSt) {
			this.maSt = maSt;
		}

		public String getNdkt() {
			return ndkt;
		}

		public void setNdkt(String ndkt) {
			this.ndkt = ndkt;
		}

		public Double getSoTienNt() {
			return soTienNt;
		}

		public void setSoTienNt(Double soTienNt) {
			this.soTienNt = soTienNt;
		}

		public Double getSoTienVnd() {
			return soTienVnd;
		}

		public void setSoTienVnd(Double soTienVnd) {
			this.soTienVnd = soTienVnd;
		}
	}
	public static class TaiKhoan_NopTien {
		@XStreamAlias("Ma_NH_TH")
		private String ma_nh_th;
		
		@XStreamAlias("Ten_NH_TH")
		private String ten_nh_th;
		
		@XStreamAlias("TaiKhoan_TH")
		private String taikhoan_th;
		
		@XStreamAlias("Ten_TaiKhoan_TH")
		private String ten_taikhoan_th;

		public String getMa_nh_th() {
			return ma_nh_th;
		}

		public void setMa_nh_th(String ma_nh_th) {
			this.ma_nh_th = ma_nh_th;
		}

		public String getTen_nh_th() {
			return ten_nh_th;
		}

		public void setTen_nh_th(String ten_nh_th) {
			this.ten_nh_th = ten_nh_th;
		}

		public String getTaikhoan_th() {
			return taikhoan_th;
		}

		public void setTaikhoan_th(String taikhoan_th) {
			this.taikhoan_th = taikhoan_th;
		}

		public String getTen_taikhoan_th() {
			return ten_taikhoan_th;
		}

		public void setTen_taikhoan_th(String ten_taikhoan_th) {
			this.ten_taikhoan_th = ten_taikhoan_th;
		}				
	}
	public static class NguoiNopTien {
		@XStreamAlias("Ma_ST")
		private String ma_st;		
		
		@XStreamAlias("So_CMT")
		private String so_cmt;
		
		@XStreamAlias("Ten_NNT")
		private String ten_nnt;
		
		@XStreamAlias("DiaChi")
		private String diachi;		
		
		@XStreamAlias("TT_Khac")
		private String tt_khac;

		public String getMa_st() {
			return ma_st;
		}

		public void setMa_st(String ma_st) {
			this.ma_st = ma_st;
		}

		public String getSo_cmt() {
			return so_cmt;
		}

		public void setSo_cmt(String so_cmt) {
			this.so_cmt = so_cmt;
		}

		public String getTen_nnt() {
			return ten_nnt;
		}

		public void setTen_nnt(String ten_nnt) {
			this.ten_nnt = ten_nnt;
		}

		public String getDiachi() {
			return diachi;
		}

		public void setDiachi(String diachi) {
			this.diachi = diachi;
		}

		public String getTt_khac() {
			return tt_khac;
		}

		public void setTt_khac(String tt_khac) {
			this.tt_khac = tt_khac;
		}		
	}
	public static class ThongTinGiaoDich{
		@XStreamAlias("NguoiNopTien")
		private NguoiNopTien NguoiNopTien;
		@XStreamAlias("TaiKhoan_NopTien")
		private TaiKhoan_NopTien TaiKhoan_NopTien;
		public NguoiNopTien getNguoiNopTien() {
			return NguoiNopTien;
		}
		public void setNguoiNopTien(NguoiNopTien nguoiNopTien) {
			NguoiNopTien = nguoiNopTien;
		}
		public TaiKhoan_NopTien getTaiKhoan_NopTien() {
			return TaiKhoan_NopTien;
		}
		public void setTaiKhoan_NopTien(TaiKhoan_NopTien taiKhoan_NopTien) {
			TaiKhoan_NopTien = taiKhoan_NopTien;
		}			
	}
	@Override
	public void addDefaultImplementation(XStream xstream) {
		// TODO Auto-generated method stub
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}
}
