package com.tcs.sgb.ws.entity;

public class DetailStatement {
	private String tranDate;
	private String cr_dr;
	private String tranAmt;
	private String tranCCY;
	private String narrative;
	private String seqNo;

	public String getTranDate() {
		return tranDate;
	}

	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}

	public String getCr_dr() {
		return cr_dr;
	}

	public void setCr_dr(String cr_dr) {
		this.cr_dr = cr_dr;
	}

	public String getTranAmt() {
		return tranAmt;
	}

	public void setTranAmt(String tranAmt) {
		this.tranAmt = tranAmt;
	}

	public String getTranCCY() {
		return tranCCY;
	}

	public void setTranCCY(String tranCCY) {
		this.tranCCY = tranCCY;
	}

	public String getNarrative() {
		return narrative;
	}

	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}

	public String getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}

}
