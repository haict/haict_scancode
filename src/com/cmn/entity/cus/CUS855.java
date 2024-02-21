package com.cmn.entity.cus;

import java.util.ArrayList;
import java.util.List;

import com.cmn.CUSMessage;
import com.cmn.entity.cus.CUS805.Transactions;
import com.cmn.entity.cus.CUS852.DataImp;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

public class CUS855 extends CUSResponse<CUS855.DataImp>{
	
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_855;
	static {
		CUSBeanFactory.getInstance().register(type, new CUS855());
	}
	
	@Override
	public CUSMessage getType() {
		// TODO Auto-generated method stub
		return type;
	}
	
	@Override
	public CUSBean init() {
		CUS855 bean = new CUS855();
		bean.data = new CUS855.DataImp();
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
