package com.tcs.sgb.ws.entity;

public class AccInternalWithTaxResp {
	private String txnID;
	private String txnCommitTime;
	private String errCode;
	private String errMsg;

	public String getTxnID() {
		return txnID;
	}

	public void setTxnID(String txnID) {
		this.txnID = txnID;
	}

	public String getTxnCommitTime() {
		return txnCommitTime;
	}

	public void setTxnCommitTime(String txnCommitTime) {
		this.txnCommitTime = txnCommitTime;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

}
