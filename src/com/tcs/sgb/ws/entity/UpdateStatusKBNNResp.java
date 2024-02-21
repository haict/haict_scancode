package com.tcs.sgb.ws.entity;

public class UpdateStatusKBNNResp {
	private String errCode;
	private String ttspTranID;	
	private String bank_Tran_Date;	

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getTtspTranID() {
		return ttspTranID;
	}

	public void setTtspTranID(String ttspTranID) {
		this.ttspTranID = ttspTranID;
	}
	public String getBank_Tran_Date() {
		return bank_Tran_Date;
	}

	public void setBank_Tran_Date(String bank_Tran_Date) {
		this.bank_Tran_Date = bank_Tran_Date;
	}

}
