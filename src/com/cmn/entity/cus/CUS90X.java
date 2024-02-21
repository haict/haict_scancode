package com.cmn.entity.cus;

import java.util.ArrayList;
import java.util.List;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS90X extends CUSRequest<CUS90X.DataImp> {
	
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_90X;
	static {
		CUSBeanFactory.getInstance().register(type, new CUS90X());
	}
	@XStreamAlias("Error")
	private Error error;
	public CUSBeanImp<CUS90X.DataImp> init() {
		CUS90X bean = new CUS90X();
		bean.data = new DataImp();
		bean.error = new Error();
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
	}

	public void addDefaultImplementation(XStream xstream) {		
	}	
}
