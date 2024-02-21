package com.tcs.sgb.ws.entity;

public class AmountBalOnlineResp {
	private String res_code;
	private String acctNo;
	private String acctCCY;
	private String acctBranch;
	private String limitBal;
	private String actualBal;
	private String collectAmt;
	private String spendAmt;

	public String getRes_code() {
		return res_code;
	}

	public void setRes_code(String res_code) {
		this.res_code = res_code;
	}

	public String getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public String getAcctCCY() {
		return acctCCY;
	}

	public void setAcctCCY(String acctCCY) {
		this.acctCCY = acctCCY;
	}

	public String getAcctBranch() {
		return acctBranch;
	}

	public void setAcctBranch(String acctBranch) {
		this.acctBranch = acctBranch;
	}

	public String getLimitBal() {
		return limitBal;
	}

	public void setLimitBal(String limitBal) {
		this.limitBal = limitBal;
	}

	public String getActualBal() {
		return actualBal;
	}

	public void setActualBal(String actualBal) {
		this.actualBal = actualBal;
	}

	public String getCollectAmt() {
		return collectAmt;
	}

	public void setCollectAmt(String collectAmt) {
		this.collectAmt = collectAmt;
	}

	public String getSpendAmt() {
		return spendAmt;
	}

	public void setSpendAmt(String spendAmt) {
		this.spendAmt = spendAmt;
	}

}
