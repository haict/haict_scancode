package com.cmn.entity.cus;

import java.util.ArrayList;
import java.util.List;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS808 extends CUSRequest<CUS808.DataImp>{
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_808;
	static {
		CUSBeanFactory.getInstance().register(type, new CUS808());
	}
	@XStreamAlias("Error")
	private Error error;
	
	@Override
	public CUSBeanImp<CUS808.DataImp> init() {
		CUS808 bean = new CUS808();
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
		
		@XStreamAlias("ThongTinChungTu")
		private ThongTinChungTu thongTinChungTu = new ThongTinChungTu();
		
		@XStreamAlias("ThongTinGiaoDich")
		private ThongTinGiaoDich thongTinGiaoDich = new ThongTinGiaoDich();

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
			return thongTinGiaoDich;
		}

		public void setThongTinGiaoDich(ThongTinGiaoDich thongTinGiaoDich) {
			this.thongTinGiaoDich = thongTinGiaoDich;
		}						
	}
	public static class ThongTinChungTu{
		@XStreamAlias("So_HS")
		private String soHs;
		@XStreamAlias("Ma_DVQL")
		private String maDvql;
		@XStreamAlias("Ten_DVQL")
		private String tenDvql;
		@XStreamAlias("KyHieu_CT")
		private String kyHieuCt;
		@XStreamAlias("So_CT")
		private String soCt;
		@XStreamAlias("Nam_CT")
		private String namCt;				
		@XStreamAlias("ThongTin_NopTien")
		private ThongTinNopTien thongTinNopTien = new ThongTinNopTien();		
		@XStreamAlias("ChiTiet_CT")
		private ChungTuCT chungTu_CT = new ChungTuCT();
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
		public String getNamCt() {
			return namCt;
		}
		public void setNamCt(String namCt) {
			this.namCt = namCt;
		}
		public ThongTinNopTien getThongTinNopTien() {
			return thongTinNopTien;
		}
		public void setThongTinNopTien(ThongTinNopTien thongTinNopTien) {
			this.thongTinNopTien = thongTinNopTien;
		}
		public ChungTuCT getChungTu_CT() {
			return chungTu_CT;
		}
		public void setChungTu_CT(ChungTuCT chungTu_CT) {
			this.chungTu_CT = chungTu_CT;
		}					
	}
	public static class ThongTinGiaoDich {
		@XStreamAlias("NguoiNopTien")
		private NguoiNopTien nguoiNopTien = new NguoiNopTien();
		@XStreamAlias("TaiKhoanNopTien")
		private TaiKhoanNopTien taiKhoanNopTien = new TaiKhoanNopTien();
		public NguoiNopTien getNguoiNopTien() {
			return nguoiNopTien;
		}
		public void setNguoiNopTien(NguoiNopTien nguoiNopTien) {
			this.nguoiNopTien = nguoiNopTien;
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
		@XStreamAlias("So_CMT")
		private String soCMT;
		@XStreamAlias("Ten_NNT")
		private String tenNNT;
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
