package com.cmn.entity.cus;

import java.util.ArrayList;
import java.util.List;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS851 extends CUSResponse<CUS851.DataImp>{
	
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_851;
	static {
		CUSBeanFactory.getInstance().register(type, new CUS851());
	}
	
	@Override
	public CUSMessage getType() {
		// TODO Auto-generated method stub
		return type;
	}
	
	@Override
	public CUSBean init() {
		CUS851 bean = new CUS851();
		bean.data = new CUS851.DataImp();
		return bean;
	}
	
	@XStreamAlias("Data")
	public static class DataImp extends Data {
		private static final long serialVersionUID = 1L;

		@XStreamAlias("Ma_NH_DC")
		private String maNhDc;
		@XStreamAlias("Ngay_DC")
		private String ngayDc;
		@XStreamImplicit(itemFieldName="Transactions")
		private List<Transactions> transactions = new ArrayList<Transactions>();
		
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
	}
	
	public static class Transactions {
		@XStreamAlias("Transaction_ID")
		private String transactionId;
		@XStreamAlias("So_TN_CT")
		private String soTnCt;
		@XStreamAlias("Ngay_TN_CT")
		private String ngayTnCt;
		@XStreamAlias("Ma_NH_PH")
		private String maNhPh;
		@XStreamAlias("Ten_NH_PH")
		private String tenNhPh;
		@XStreamAlias("Ma_NH_TH")
		private String maNhTh;
		@XStreamAlias("Ten_NH_TH")
		private String tenNhTh;
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
		private String ngayBn;
		@XStreamAlias("Ngay_BC")
		private String ngayBc;
		@XStreamAlias("Ngay_CT")
		private String ngayCt;
		@XStreamAlias("Ma_NT")
		private String maNt;
		@XStreamAlias("Ty_Gia")
		private String tyGia;
		@XStreamAlias("SoTien_TO")
		private String soTienTo;
		@XStreamAlias("DienGiai")
		private String dienGiai;
		@XStreamImplicit(itemFieldName="GNT_CT")
		private List<GntCt> gntCt = new ArrayList<GntCt>();
		@XStreamAlias("KQ_DC")
		private String kqDc;

		public String getTransactionId() {
			return transactionId;
		}

		public void setTransactionId(String transactionId) {
			this.transactionId = transactionId;
		}

		public String getSoTnCt() {
			return soTnCt;
		}

		public void setSoTnCt(String soTnCt) {
			this.soTnCt = soTnCt;
		}

		public String getNgayTnCt() {
			return ngayTnCt;
		}

		public void setNgayTnCt(String ngayTnCt) {
			this.ngayTnCt = ngayTnCt;
		}

		public String getMaNhPh() {
			return maNhPh;
		}

		public void setMaNhPh(String maNhPh) {
			this.maNhPh = maNhPh;
		}

		public String getTenNhPh() {
			return tenNhPh;
		}

		public void setTenNhPh(String tenNhPh) {
			this.tenNhPh = tenNhPh;
		}

		public String getMaNhTh() {
			return maNhTh;
		}

		public void setMaNhTh(String maNhTh) {
			this.maNhTh = maNhTh;
		}

		public String getTenNhTh() {
			return tenNhTh;
		}

		public void setTenNhTh(String tenNhTh) {
			this.tenNhTh = tenNhTh;
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

		public String getNgayBn() {
			return ngayBn;
		}

		public void setNgayBn(String ngayBn) {
			this.ngayBn = ngayBn;
		}

		public String getNgayBc() {
			return ngayBc;
		}

		public void setNgayBc(String ngayBc) {
			this.ngayBc = ngayBc;
		}

		public String getNgayCt() {
			return ngayCt;
		}

		public void setNgayCt(String ngayCt) {
			this.ngayCt = ngayCt;
		}

		public String getMaNt() {
			return maNt;
		}

		public void setMaNt(String maNt) {
			this.maNt = maNt;
		}

		public String getTyGia() {
			return tyGia;
		}

		public void setTyGia(String tyGia) {
			this.tyGia = tyGia;
		}

		public String getSoTienTo() {
			return soTienTo;
		}

		public void setSoTienTo(String soTienTo) {
			this.soTienTo = soTienTo;
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

		public String getKqDc() {
			return kqDc;
		}

		public void setKqDc(String kqDc) {
			this.kqDc = kqDc;
		}
	}
	
	public static class GntCt {
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
		private String soTienNt;
		@XStreamAlias("SoTien_VND")
		private String soTienVnd;

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

		public String getSoTienNt() {
			return soTienNt;
		}

		public void setSoTienNt(String soTienNt) {
			this.soTienNt = soTienNt;
		}

		public String getSoTienVnd() {
			return soTienVnd;
		}

		public void setSoTienVnd(String soTienVnd) {
			this.soTienVnd = soTienVnd;
		}
	}

	@Override
	public void addDefaultImplementation(XStream xstream) {
		// TODO Auto-generated method stub
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}
}
