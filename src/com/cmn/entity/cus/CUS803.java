package com.cmn.entity.cus;

import java.util.ArrayList;
import java.util.List;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS803 extends CUSRequest<CUS803.DataImp>{
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_803;
	static {
		CUSBeanFactory.getInstance().register(type, new CUS803());
	}

	@XStreamAlias("Error")
	private Error error;
	
	@Override
	public CUSBeanImp<CUS803.DataImp> init() {
		CUS803 bean = new CUS803();
		bean.data = new DataImp();
		bean.error = new Error();
		return bean;
	}

	@Override
	public CUSMessage getType() {
		return type;
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
		@XStreamAlias("KyHieu_CT")
		private String kyHieuCt;
		@XStreamAlias("So_CT")
		private String soCt;
		@XStreamAlias("Ngay_CT")
		private String ngayCt;
		@XStreamAlias("Loai_CT")
		private String loaiCt;
		@XStreamAlias("Ngay_BN")
		private String ngayBn;
		@XStreamAlias("Ngay_BC")
		private String ngayBc;
		
		@XStreamAlias("So_HS")
		private String soHs;
		@XStreamAlias("Ma_DVQL")
		private String maDvql;
		@XStreamAlias("Ten_DVQL")
		private String tenDvql;
		@XStreamAlias("KyHieu_CT_PT")
		private String kyHieuCtPt;
		@XStreamAlias("So_CT_PT")
		private String soCtPt;
		@XStreamAlias("Nam_CT_PT")
		private String namCtPt;
		
		@XStreamAlias("NguoiNopTien")
		private NguoiNopTien nguoiNopTien = new NguoiNopTien();

		@XStreamAlias("ThongTin_NopTien")
		private ThongTinNopTien thongTinNopTien = new ThongTinNopTien();
		
		@XStreamImplicit(itemFieldName = "ChungTu_CT")
		private List<ChungTu_CT> chungTu_CT = new ArrayList<ChungTu_CT>();
		
		@XStreamAlias("TaiKhoan_NopTien")
		private TaiKhoanNopTien taiKhoanNopTien = new TaiKhoanNopTien();

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

		public String getSoHs() {
			return soHs;
		}

		public void setSoHs(String soHs) {
			this.soHs = soHs;
		}

		public String getMaDvql() {
			return maDvql;
		}

		public void setMaDvql(String maDvql) {
			this.maDvql = maDvql;
		}

		public String getTenDvql() {
			return tenDvql;
		}

		public void setTenDvql(String tenDvql) {
			this.tenDvql = tenDvql;
		}

		public String getKyHieuCtPt() {
			return kyHieuCtPt;
		}

		public void setKyHieuCtPt(String kyHieuCtPt) {
			this.kyHieuCtPt = kyHieuCtPt;
		}

		public String getSoCtPt() {
			return soCtPt;
		}

		public void setSoCtPt(String soCtPt) {
			this.soCtPt = soCtPt;
		}

		public String getNamCtPt() {
			return namCtPt;
		}

		public void setNamCtPt(String namCtPt) {
			this.namCtPt = namCtPt;
		}

		public NguoiNopTien getNguoiNopTien() {
			return nguoiNopTien;
		}

		public void setNguoiNopTien(NguoiNopTien nguoiNopTien) {
			this.nguoiNopTien = nguoiNopTien;
		}

		public ThongTinNopTien getThongTinNopTien() {
			return thongTinNopTien;
		}

		public void setThongTinNopTien(ThongTinNopTien thongTinNopTien) {
			this.thongTinNopTien = thongTinNopTien;
		}

		public List<ChungTu_CT> getChungTu_CT() {
			return chungTu_CT;
		}

		public void setChungTu_CT(List<ChungTu_CT> chungTu_CT) {
			this.chungTu_CT = chungTu_CT;
		}

		public TaiKhoanNopTien getTaiKhoanNopTien() {
			return taiKhoanNopTien;
		}

		public void setTaiKhoanNopTien(TaiKhoanNopTien taiKhoanNopTien) {
			this.taiKhoanNopTien = taiKhoanNopTien;
		}
	}
	
	public static class NguoiNopTien {
		@XStreamAlias("Ma_ST")
		private String maSt;
		@XStreamAlias("Ten_DV")
		private String tenDv;
		@XStreamAlias("DiaChi")
		private String diaChi;
		@XStreamAlias("TT_Khac")
		private String tTKhac;
		
		public String getMaSt() {
			return maSt;
		}
		public void setMaSt(String maSt) {
			this.maSt = maSt;
		}
		public String getTenDv() {
			return tenDv;
		}
		public void setTenDv(String tenDv) {
			this.tenDv = tenDv;
		}
		public String getDiaChi() {
			return diaChi;
		}
		public void setDiaChi(String diaChi) {
			this.diaChi = diaChi;
		}
		public String gettTKhac() {
			return tTKhac;
		}
		public void settTKhac(String tTKhac) {
			this.tTKhac = tTKhac;
		}
	}
	
	public static class ThongTinNopTien {
		@XStreamAlias("Ma_NT")
		private String maNt;
		@XStreamAlias("TyGia")
		private String tyGia;
		@XStreamAlias("TongTien_NT")
		private String tongTienNt;
		@XStreamAlias("TongTien_VND")
		private String tongTienVnd;
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
		public String getTongTienNt() {
			return tongTienNt;
		}
		public void setTongTienNt(String tongTienNt) {
			this.tongTienNt = tongTienNt;
		}
		public String getTongTienVnd() {
			return tongTienVnd;
		}
		public void setTongTienVnd(String tongTienVnd) {
			this.tongTienVnd = tongTienVnd;
		}
	}
	
	public static class ChungTuCT {
		@XStreamAlias("STT")
		private String stt;
		@XStreamAlias("NDKT")
		private String ndkt;
		@XStreamAlias("Ten_NDKT")
		private String tenNdkt;
		@XStreamAlias("SoTien_NT")
		private String soTienNt;
		@XStreamAlias("SoTien_VND")
		private String soTienVnd;
		@XStreamAlias("GhiChu")
		private String ghiChu;
		public String getStt() {
			return stt;
		}
		public void setStt(String stt) {
			this.stt = stt;
		}
		public String getNdkt() {
			return ndkt;
		}
		public void setNdkt(String ndkt) {
			this.ndkt = ndkt;
		}
		public String getTenNdkt() {
			return tenNdkt;
		}
		public void setTenNdkt(String tenNdkt) {
			this.tenNdkt = tenNdkt;
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
		public String getGhiChu() {
			return ghiChu;
		}
		public void setGhiChu(String ghiChu) {
			this.ghiChu = ghiChu;
		}
	}

	public static class TaiKhoanNopTien {
		@XStreamAlias("Ma_NH_TH")
		private String maNhTh;
		@XStreamAlias("Ten_NH_TH")
		private String tenNhTh;
		@XStreamAlias("TaiKhoan_TH")
		private String taiKhoanTh;
		@XStreamAlias("Ten_TaiKhoan_TH")
		private String tenTaiKhoanTh;
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
	}
	
	@Override
	public void addDefaultImplementation(XStream xstream) {		
	}	
}
