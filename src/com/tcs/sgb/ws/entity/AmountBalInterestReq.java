package com.tcs.sgb.ws.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "acctNo", "fromDate", "toDate", "ttspDate" })
public class AmountBalInterestReq {
	@JsonProperty("AcctNo")
	private String acctNo;
	@JsonProperty("FromDate")
	private String fromDate;
	@JsonProperty("ToDate")
	private String toDate;
	@JsonProperty("TtspDate")
	private String ttspDate;

	public String getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getTtspDate() {
		return ttspDate;
	}

	public void setTtspDate(String ttspDate) {
		this.ttspDate = ttspDate;
	}

}
