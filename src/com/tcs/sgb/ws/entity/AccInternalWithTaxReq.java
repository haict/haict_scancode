package com.tcs.sgb.ws.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"authCode", "debitAcct","debitAmt", "debitCcy", "creditAcct","debitBranch","creditBranch","orderBy","sendingAdd","paymentDetails","makerId","checkerId"})
public class AccInternalWithTaxReq {
	@JsonProperty("AuthCode")
	private String authCode;
	@JsonProperty("DebitAcct")
	private String debitAcct;
	@JsonProperty("DebitAmt")
	private String debitAmt;
	@JsonProperty("DebitCcy")
	private String debitCcy;
	@JsonProperty("CreditAcct")
	private String creditAcct;
	@JsonProperty("DebitBranch")
	private String debitBranch;
	@JsonProperty("CreditBranch")
	private String creditBranch;
	@JsonProperty("OrderBy")
	private String orderBy;
	@JsonProperty("SendingAdd")
	private String sendingAdd;
	@JsonProperty("PaymentDetails")
	private String paymentDetails;
	@JsonProperty("MakerId")
	private String makerId;
	@JsonProperty("CheckerId")
	private String checkerId;
	
	
	public String getAuthCode() {
		return authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public String getDebitAcct() {
		return debitAcct;
	}
	public void setDebitAcct(String debitAcct) {
		this.debitAcct = debitAcct;
	}
	public String getDebitAmt() {
		return debitAmt;
	}
	public void setDebitAmt(String debitAmt) {
		this.debitAmt = debitAmt;
	}
	public String getDebitCcy() {
		return debitCcy;
	}
	public void setDebitCcy(String debitCcy) {
		this.debitCcy = debitCcy;
	}
	public String getCreditAcct() {
		return creditAcct;
	}
	public void setCreditAcct(String creditAcct) {
		this.creditAcct = creditAcct;
	}
	public String getDebitBranch() {
		return debitBranch;
	}
	public void setDebitBranch(String debitBranch) {
		this.debitBranch = debitBranch;
	}
	public String getCreditBranch() {
		return creditBranch;
	}
	public void setCreditBranch(String creditBranch) {
		this.creditBranch = creditBranch;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public String getSendingAdd() {
		return sendingAdd;
	}
	public void setSendingAdd(String sendingAdd) {
		this.sendingAdd = sendingAdd;
	}
	public String getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	public String getMakerId() {
		return makerId;
	}
	public void setMakerId(String makerId) {
		this.makerId = makerId;
	}
	public String getCheckerId() {
		return checkerId;
	}
	public void setCheckerId(String checkerId) {
		this.checkerId = checkerId;
	}
}
