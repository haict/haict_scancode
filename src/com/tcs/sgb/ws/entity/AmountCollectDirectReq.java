package com.tcs.sgb.ws.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "ttspTranID", "srcAcct", "destAcct", "branchCode", "typeTTSP", "indirectCitadCode",
		"directCitadCode", "debitAmt", "debitCcy", "creditBranch", "orderBy", "sendingAdd", "benAcct", "benCust",
		"receiveAddr", "chargeType", "chargeAmt", "vatAmt", "paymentDetails", "chargeType1", "chargeAmt1", "vatAmt1",
		"makerId", "checkerId", "ttspDate" })
public class AmountCollectDirectReq {
	@JsonProperty("TtspTranID")
	private String ttspTranID;
	@JsonProperty("SrcAcct")
	private String srcAcct;
	@JsonProperty("DestAcct")
	private String destAcct;
	@JsonProperty("BranchCode")
	private String branchCode;
	@JsonProperty("TypeTTSP")
	private String typeTTSP;
	@JsonProperty("IndirectCitadCode")
	private String indirectCitadCode;
	@JsonProperty("DirectCitadCode")
	private String directCitadCode;
	@JsonProperty("DebitAmt")
	private String debitAmt;
	@JsonProperty("DebitCcy")
	private String debitCcy;
	@JsonProperty("CreditBranch")
	private String creditBranch;
	@JsonProperty("OrderBy")
	private String orderBy;
	@JsonProperty("SendingAdd")
	private String sendingAdd;
	@JsonProperty("BenAcct")
	private String benAcct;
	@JsonProperty("BenCust")
	private String benCust;
	@JsonProperty("ReceiveAddr")
	private String receiveAddr;
	@JsonProperty("ChargeType")
	private String chargeType;
	@JsonProperty("ChargeAmt")
	private String chargeAmt;
	@JsonProperty("VatAmt")
	private String vatAmt;
	@JsonProperty("PaymentDetails")
	private String paymentDetails;
	@JsonProperty("ChargeType1")
	private String chargeType1;
	@JsonProperty("ChargeAmt1")
	private String chargeAmt1;
	@JsonProperty("VatAmt1")
	private String vatAmt1;
	@JsonProperty("MakerId")
	private String makerId;
	@JsonProperty("CheckerId")
	private String checkerId;
	@JsonProperty("TtspDate")
	private String ttspDate;

	public String getTtspTranID() {
		return ttspTranID;
	}

	public void setTtspTranID(String ttspTranID) {
		this.ttspTranID = ttspTranID;
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

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getTypeTTSP() {
		return typeTTSP;
	}

	public void setTypeTTSP(String typeTTSP) {
		this.typeTTSP = typeTTSP;
	}

	public String getIndirectCitadCode() {
		return indirectCitadCode;
	}

	public void setIndirectCitadCode(String indirectCitadCode) {
		this.indirectCitadCode = indirectCitadCode;
	}

	public String getDirectCitadCode() {
		return directCitadCode;
	}

	public void setDirectCitadCode(String directCitadCode) {
		this.directCitadCode = directCitadCode;
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

	public String getBenAcct() {
		return benAcct;
	}

	public void setBenAcct(String benAcct) {
		this.benAcct = benAcct;
	}

	public String getBenCust() {
		return benCust;
	}

	public void setBenCust(String benCust) {
		this.benCust = benCust;
	}

	public String getReceiveAddr() {
		return receiveAddr;
	}

	public void setReceiveAddr(String receiveAddr) {
		this.receiveAddr = receiveAddr;
	}

	public String getChargeType() {
		return chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public String getChargeAmt() {
		return chargeAmt;
	}

	public void setChargeAmt(String chargeAmt) {
		this.chargeAmt = chargeAmt;
	}

	public String getVatAmt() {
		return vatAmt;
	}

	public void setVatAmt(String vatAmt) {
		this.vatAmt = vatAmt;
	}

	public String getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public String getChargeType1() {
		return chargeType1;
	}

	public void setChargeType1(String chargeType1) {
		this.chargeType1 = chargeType1;
	}

	public String getChargeAmt1() {
		return chargeAmt1;
	}

	public void setChargeAmt1(String chargeAmt1) {
		this.chargeAmt1 = chargeAmt1;
	}

	public String getVatAmt1() {
		return vatAmt1;
	}

	public void setVatAmt1(String vatAmt1) {
		this.vatAmt1 = vatAmt1;
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

	public String getTtspDate() {
		return ttspDate;
	}

	public void setTtspDate(String ttspDate) {
		this.ttspDate = ttspDate;
	}

}
