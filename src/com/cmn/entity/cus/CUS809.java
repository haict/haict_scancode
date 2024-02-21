package com.cmn.entity.cus;

import java.util.ArrayList;
import java.util.List;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS809 extends CUSRequest<CUS809.DataImp> {

	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_809;

	static {
		CUSBeanFactory.getInstance().register(type, new CUS809());
	}

	@XStreamAlias("Error")
	private Error error;

	public CUSMessage getType() {
		return type;
	}

	public CUSBean init() {
		CUS809 bean = new CUS809();
		bean.data = new DataImp();
		bean.error = new Error();
		return bean;
	}

	public void addDefaultImplementation(XStream xstream) {
	}

	@XStreamAlias("Data")
	public static class DataImp extends Data {
		private static final long serialVersionUID = 1L;
		@XStreamAlias("Ma_NH_DC")
		private String maNhDc;
		@XStreamAlias("Ngay_DC")
		private String ngayDc;
		@XStreamImplicit(itemFieldName = "Transactions")
		private List<Transactions> transactions = new ArrayList<Transactions>();

		public String getMaNhDc() {
			return maNhDc;
		}

		public List<Transactions> getTransactions() {
			return transactions;
		}

		public void setTransactions(List<Transactions> transactions) {
			this.transactions = transactions;
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
	}

	public static class Transactions {
		@XStreamAlias("Transaction_ID")
		private String transactionId;
		@XStreamAlias("Ma_NH_TH")
		private String maNhTh;
		@XStreamAlias("Ten_NH_TH")
		private String tenNhTh;
		@XStreamAlias("TaiKhoan_TH")
		private String taiKhoanTh;
		@XStreamAlias("Ten_TaiKhoan_TH")
		private String tenTaiKhoanTh;
		@XStreamAlias("Ma_LoaiPhi")
		private String maLoaiPhi;
		@XStreamAlias("Ten_LoaiPhi")
		private String tenLoaiPhi;
		@XStreamAlias("Ma_DV_ThuPhi")
		private String maDvThuPhi;
		@XStreamAlias("Ten_DV_ThuPhi")
		private String tenDvThuPhi;
		@XStreamAlias("Ma_CQT_DV_ThuPhi")
		private String maCqtDvThuPhi;
		@XStreamAlias("Ma_DV")
		private String maDv;
		@XStreamAlias("Ten_DV")
		private String tenDv;
		@XStreamAlias("Chuong_NS")
		private String chuongNs;
		@XStreamAlias("DiaChi")
		private String diaChi;
		@XStreamAlias("TKKB")
		private String tkkb;
		@XStreamAlias("Ten_TKKB")
		private String tenTkkb;
		@XStreamAlias("Ma_KB")
		private String maKb;
		@XStreamAlias("Ten_KB")
		private String tenKb;
		@XStreamAlias("ThongTinKhac")
		private String thongTinKhac;
		@XStreamImplicit(itemFieldName = "ThongTinChungChungTu_NP")
		private List<ThongTinChungTu_NP> thongTinChungTuNp = new ArrayList<ThongTinChungTu_NP>();

		public String getTransactionId() {
			return transactionId;
		}

		public void setTransactionId(String transactionId) {
			this.transactionId = transactionId;
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

		public String getTaiKhoanTh() {
			return taiKhoanTh;
		}

		public void setTaiKhoanTh(String taiKhoanTh) {
			this.taiKhoanTh = taiKhoanTh;
		}

		public String getTenTaiKhoanTh() {
			return tenTaiKhoanTh;
		}

		public void setTenTaiKhoanTh(String tenTaiKhoanTh) {
			this.tenTaiKhoanTh = tenTaiKhoanTh;
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

		public String getMaDvThuPhi() {
			return maDvThuPhi;
		}

		public void setMaDvThuPhi(String maDvThuPhi) {
			this.maDvThuPhi = maDvThuPhi;
		}

		public String getTenDvThuPhi() {
			return tenDvThuPhi;
		}

		public void setTenDvThuPhi(String tenDvThuPhi) {
			this.tenDvThuPhi = tenDvThuPhi;
		}

		public String getMaCqtDvThuPhi() {
			return maCqtDvThuPhi;
		}

		public void setMaCqtDvThuPhi(String maCqtDvThuPhi) {
			this.maCqtDvThuPhi = maCqtDvThuPhi;
		}

		public String getMaDv() {
			return maDv;
		}

		public void setMaDv(String maDv) {
			this.maDv = maDv;
		}

		public String getTenDv() {
			return tenDv;
		}

		public void setTenDv(String tenDv) {
			this.tenDv = tenDv;
		}

		public String getChuongNs() {
			return chuongNs;
		}

		public void setChuongNs(String chuongNs) {
			this.chuongNs = chuongNs;
		}

		public String getDiaChi() {
			return diaChi;
		}

		public void setDiaChi(String diaChi) {
			this.diaChi = diaChi;
		}

		public String getTkkb() {
			return tkkb;
		}

		public void setTkkb(String tkkb) {
			this.tkkb = tkkb;
		}

		public String getTenTkkb() {
			return tenTkkb;
		}

		public void setTenTkkb(String tenTkkb) {
			this.tenTkkb = tenTkkb;
		}

		public String getMaKb() {
			return maKb;
		}

		public List<ThongTinChungTu_NP> getThongTinChungTuNp() {
			return thongTinChungTuNp;
		}

		public void setThongTinChungTuNp(List<ThongTinChungTu_NP> thongTinChungTuNp) {
			this.thongTinChungTuNp = thongTinChungTuNp;
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

		public String getThongTinKhac() {
			return thongTinKhac;
		}

		public void setThongTinKhac(String thongTinKhac) {
			this.thongTinKhac = thongTinKhac;
		}

	}

	public static class ThongTinChungTu_NP {
		@XStreamAlias("ID_CT")
		private String idCt;
		@XStreamAlias("So_CT")
		private String soCt;
		@XStreamAlias("KyHieu_CT")
		private String kyHieuCt;
		@XStreamAlias("Ngay_CT")
		private String ngayCt;
		@XStreamAlias("TieuMuc")
		private String tieuMuc;
		@XStreamAlias("SoTien")
		private String soTien;
		@XStreamAlias("DienGiai")
		private String dienGiai;

		public String getIdCt() {
			return idCt;
		}

		public void setIdCt(String idCt) {
			this.idCt = idCt;
		}

		public String getSoCt() {
			return soCt;
		}

		public void setSoCt(String soCt) {
			this.soCt = soCt;
		}

		public String getKyHieuCt() {
			return kyHieuCt;
		}

		public void setKyHieuCt(String kyHieuCt) {
			this.kyHieuCt = kyHieuCt;
		}

		public String getNgayCt() {
			return ngayCt;
		}

		public void setNgayCt(String ngayCt) {
			this.ngayCt = ngayCt;
		}

		public String getTieuMuc() {
			return tieuMuc;
		}

		public void setTieuMuc(String tieuMuc) {
			this.tieuMuc = tieuMuc;
		}

		public String getSoTien() {
			return soTien;
		}

		public void setSoTien(String soTien) {
			this.soTien = soTien;
		}

		public String getDienGiai() {
			return dienGiai;
		}

		public void setDienGiai(String dienGiai) {
			this.dienGiai = dienGiai;
		}
	}
}
