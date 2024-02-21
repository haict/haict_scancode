package com.tcs.sgb.ws.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "ttspPreviousTranId","ttspPreviousDate", "srcAcct", "destAcct", "citadCode", "tranAmount", "tranCcy", "narrative",
		"ttspDate" })
public class ErrKCDateEndReq {
	@JsonProperty("TtspPreviousTranId")
	private String ttspPreviousTranId;
	@JsonProperty("TtspPreviousDate")
	private String ttspPreviousDate;
	@JsonProperty("SrcAcct")
	private String srcAcct;
	@JsonProperty("DestAcct")
	private String destAcct;
	@JsonProperty("CitadCode")
	private String citadCode;
	@JsonProperty("TranAmount")
	private String tranAmount;
	@JsonProperty("TranCcy")
	private String tranCcy;
	@JsonProperty("Narrative")
	private String narrative;
	@JsonProperty("TtspDate")
	private String ttspDate;
	
	
	public String getTtspPreviousTranId() {
		return ttspPreviousTranId;
	}

	public void setTtspPreviousTranId(String ttspPreviousTranId) {
		this.ttspPreviousTranId = ttspPreviousTranId;
	}

	public String getTtspPreviousDate() {
		return ttspPreviousDate;
	}

	public void setTtspPreviousDate(String ttspPreviousDate) {
		this.ttspPreviousDate = ttspPreviousDate;
	}

	public String getSrcAcct() {
		return srcAcct;
	}

	public void setSrcAcct(String srcAcct) {
		this.srcAcct = srcAcct;
	}

	public String getDestAcct() {
		return destAcct;
	}

	public void setDestAcct(String destAcct) {
		this.destAcct = destAcct;
	}

	public String getCitadCode() {
		return citadCode;
	}

	public void setCitadCode(String citadCode) {
		this.citadCode = citadCode;
	}

	public String getTranAmount() {
		return tranAmount;
	}

	public void setTranAmount(String tranAmount) {
		this.tranAmount = tranAmount;
	}

	public String getTranCcy() {
		return tranCcy;
	}

	public void setTranCcy(String tranCcy) {
		this.tranCcy = tranCcy;
	}

	public String getNarrative() {
		return narrative;
	}

	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}

	public String getTtspDate() {
		return ttspDate;
	}

	public void setTtspDate(String ttspDate) {
		this.ttspDate = ttspDate;
	}

}
