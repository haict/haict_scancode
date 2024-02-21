package com.tcs.sgb.ws.entity;

public class AmountCollectDirectResp {
	private String res_code;
	private String ttspTranID;
	private String ref_FT;
	private String bank_Tran_Date;
	private String branchNo;

	public String getRes_code() {
		return res_code;
	}

	public void setRes_code(String res_code) {
		this.res_code = res_code;
	}

	public String getTtspTranID() {
		return ttspTranID;
	}

	public void setTtspTranID(String ttspTranID) {
		this.ttspTranID = ttspTranID;
	}

	public String getRef_FT() {
		return ref_FT;
	}

	public void setRef_FT(String ref_FT) {
		this.ref_FT = ref_FT;
	}

	public String getBank_Tran_Date() {
		return bank_Tran_Date;
	}

	public void setBank_Tran_Date(String bank_Tran_Date) {
		this.bank_Tran_Date = bank_Tran_Date;
	}

	public String getBranchNo() {
		return branchNo;
	}

	public void setBranchNo(String branchNo) {
		this.branchNo = branchNo;
	}

}
