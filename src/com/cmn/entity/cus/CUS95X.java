package com.cmn.entity.cus;

import java.util.ArrayList;
import java.util.List;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

public class CUS95X extends CUSResponse<CUS95X.DataImp> {
	
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_95X;
	static {
		CUSBeanFactory.getInstance().register(type, new CUS95X());
	}

	public CUSBeanImp<CUS95X.DataImp> init() {
		CUS95X bean = new CUS95X();
		bean.data = new DataImp();
		return bean;
	}

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
		@XStreamAlias("Loai_TD_DC")
		private String loaiTdDc;		
		@XStreamAlias("Accept_Transactions")
		private AcceptTransactions acceptTransactions = new AcceptTransactions();
		@XStreamAlias("Reject_Transactions")
		private RejectTransactions rejectTransactions = new RejectTransactions();
		
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

		public String getLoaiTdDc() {
			return loaiTdDc;
		}

		public void setLoaiTdDc(String loaiTdDc) {
			this.loaiTdDc = loaiTdDc;
		}

		public AcceptTransactions getAcceptTransactions() {
			return acceptTransactions;
		}

		public void setAcceptTransactions(AcceptTransactions acceptTransactions) {
			this.acceptTransactions = acceptTransactions;
		}

		public RejectTransactions getRejectTransactions() {
			return rejectTransactions;
		}

		public void setRejectTransactions(RejectTransactions rejectTransactions) {
			this.rejectTransactions = rejectTransactions;
		}
	}
	
	public static class AcceptTransactions {
		
		@XStreamImplicit(itemFieldName="Transaction")
		private List<Transactions> transactions = new ArrayList<Transactions>();

		public List<Transactions> getTransactions() {
			return transactions;
		}

		public void setTransactions(List<Transactions> transactions) {
			this.transactions = transactions;
		}
	}

	public static class RejectTransactions {
		
		@XStreamImplicit(itemFieldName="Transaction")
		private List<Transactions> transactions = new ArrayList<Transactions>();
		
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

		public String getKqdc() {
			return kqDc;
		}

		public void setKqdc(String kqdc) {
			this.kqDc = kqdc;
		}
	}

	public void addDefaultImplementation(XStream xstream) {		
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}	
}

