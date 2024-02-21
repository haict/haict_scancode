package com.tcs.sgb.ws.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "acctNo", "ttspDate" })
public class AmountBalOnlineReq {
	@JsonProperty("AcctNo")
	private String acctNo;
	@JsonProperty("TtspDate")
	private String ttspDate;

	public String getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public String getTtspDate() {
		return ttspDate;
	}

	public void setTtspDate(String ttspDate) {
		this.ttspDate = ttspDate;
	}

}
