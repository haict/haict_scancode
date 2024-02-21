package com.cmn.entity.cus;

import java.util.ArrayList;
import java.util.List;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS856 extends CUSResponse<CUS856.DataImp>{
	
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_856;
	static {
		CUSBeanFactory.getInstance().register(type, new CUS856());
	}
	
	@Override
	public CUSMessage getType() {
		// TODO Auto-generated method stub
		return type;
	}
	
	@Override
	public CUSBean init() {
		CUS856 bean = new CUS856();
		bean.data = new CUS856.DataImp();
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
		@XStreamAlias("MST_NH_PH")
		private String mstNhPh;
		@XStreamAlias("Ten_NH_PH")
		private String tenNhPh;
		@XStreamAlias("Ma_DV")
		private String maDv;
		@XStreamAlias("Ten_DV")
		private String tenDv;
		@XStreamAlias("Ma_DV_DD")
		private String maDvDd;
		@XStreamAlias("Ten_DV_DD")
		private String tenDvDd;
		@XStreamAlias("Ma_HQ_KB")
		private String maHqKb;
		@XStreamAlias("So_HD")
		private String soHd;
		@XStreamAlias("Ngay_HD")
		private String ngayHd;
		@XStreamAlias("So_VD_01")
		private String soVd01;
		@XStreamAlias("Ngay_VD_01")
		private String ngayVd01;
		@XStreamAlias("So_VD_02")
		private String soVd02;
		@XStreamAlias("Ngay_VD_02")
		private String ngayVd02;
		@XStreamAlias("So_VD_03")
		private String soVd03;
		@XStreamAlias("Ngay_VD_03")
		private String ngayVd03;
		@XStreamAlias("So_VD_04")
		private String soVd04;
		@XStreamAlias("Ngay_VD_04")
		private String ngayVd04;
		@XStreamAlias("So_VD_05")
		private String soVd05;
		@XStreamAlias("Ngay_VD_05")
		private String ngayVd05;
		@XStreamAlias("Loai_CT")
		private String loaiCt;
		@XStreamAlias("KyHieu_CT")
		private String kyHieuCt;
		@XStreamAlias("So_CT")
		private String soCt;
		@XStreamAlias("Ngay_CT")
		private String ngayCt;
		@XStreamAlias("TTButToan")
		private String tTButToan;
		@XStreamAlias("SNBL")
		private String snbl;
		@XStreamAlias("Ngay_HL")
		private String ngayHl;
		@XStreamAlias("Ngay_HHL")
		private String ngayHhl;
		@XStreamAlias("SoTien")
		private String soTien;
		@XStreamAlias("DienGiai")
		private String dienGiai;
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

		public String getNgayCt() {
			return ngayCt;
		}

		public void setNgayCt(String ngayCt) {
			this.ngayCt = ngayCt;
		}

		public String getDienGiai() {
			return dienGiai;
		}

		public void setDienGiai(String dienGiai) {
			this.dienGiai = dienGiai;
		}

		public String getMstNhPh() {
			return mstNhPh;
		}

		public void setMstNhPh(String mstNhPh) {
			this.mstNhPh = mstNhPh;
		}

		public String getMaDvDd() {
			return maDvDd;
		}

		public void setMaDvDd(String maDvDd) {
			this.maDvDd = maDvDd;
		}

		public String getTenDvDd() {
			return tenDvDd;
		}

		public void setTenDvDd(String tenDvDd) {
			this.tenDvDd = tenDvDd;
		}

		public String gettTButToan() {
			return tTButToan;
		}

		public void settTButToan(String tTButToan) {
			this.tTButToan = tTButToan;
		}

		public String getSnbl() {
			return snbl;
		}

		public void setSnbl(String snbl) {
			this.snbl = snbl;
		}

		public String getNgayHl() {
			return ngayHl;
		}

		public void setNgayHl(String ngayHl) {
			this.ngayHl = ngayHl;
		}

		public String getNgayHhl() {
			return ngayHhl;
		}

		public void setNgayHhl(String ngayHhl) {
			this.ngayHhl = ngayHhl;
		}

		public String getSoTien() {
			return soTien;
		}

		public void setSoTien(String soTien) {
			this.soTien = soTien;
		}

		public String getMaHqKb() {
			return maHqKb;
		}

		public void setMaHqKb(String maHqKb) {
			this.maHqKb = maHqKb;
		}

		public String getSoHd() {
			return soHd;
		}

		public void setSoHd(String soHd) {
			this.soHd = soHd;
		}

		public String getNgayHd() {
			return ngayHd;
		}

		public void setNgayHd(String ngayHd) {
			this.ngayHd = ngayHd;
		}

		public String getSoVd01() {
			return soVd01;
		}

		public void setSoVd01(String soVd01) {
			this.soVd01 = soVd01;
		}

		public String getNgayVd01() {
			return ngayVd01;
		}

		public void setNgayVd01(String ngayVd01) {
			this.ngayVd01 = ngayVd01;
		}

		public String getSoVd02() {
			return soVd02;
		}

		public void setSoVd02(String soVd02) {
			this.soVd02 = soVd02;
		}

		public String getNgayVd02() {
			return ngayVd02;
		}

		public void setNgayVd02(String ngayVd02) {
			this.ngayVd02 = ngayVd02;
		}

		public String getSoVd03() {
			return soVd03;
		}

		public void setSoVd03(String soVd03) {
			this.soVd03 = soVd03;
		}

		public String getNgayVd03() {
			return ngayVd03;
		}

		public void setNgayVd03(String ngayVd03) {
			this.ngayVd03 = ngayVd03;
		}

		public String getSoVd04() {
			return soVd04;
		}

		public void setSoVd04(String soVd04) {
			this.soVd04 = soVd04;
		}

		public String getNgayVd04() {
			return ngayVd04;
		}

		public void setNgayVd04(String ngayVd04) {
			this.ngayVd04 = ngayVd04;
		}

		public String getSoVd05() {
			return soVd05;
		}

		public void setSoVd05(String soVd05) {
			this.soVd05 = soVd05;
		}

		public String getNgayVd05() {
			return ngayVd05;
		}

		public void setNgayVd05(String ngayVd05) {
			this.ngayVd05 = ngayVd05;
		}

		public String getKqDc() {
			return kqDc;
		}

		public void setKqDc(String kqDc) {
			this.kqDc = kqDc;
		}
	}
	
	@Override
	public void addDefaultImplementation(XStream xstream) {
		// TODO Auto-generated method stub
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}

}
