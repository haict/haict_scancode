package com.tcs.esb.entity;
public class TransactionInfo {
	private String dateTrans;
	private String amountTrans;
	private String currencyTrans;
	private String transID;
	private String transType;
	private String transDesc;
	public String getDateTrans() {
		return dateTrans;
	}
	public void setDateTrans(String dateTrans) {
		this.dateTrans = dateTrans;
	}
	public String getAmountTrans() {
		return amountTrans;
	}
	public void setAmountTrans(String amountTrans) {
		this.amountTrans = amountTrans;
	}
	public String getCurrencyTrans() {
		return currencyTrans;
	}
	public void setCurrencyTrans(String currencyTrans) {
		this.currencyTrans = currencyTrans;
	}
	public String getTransID() {
		return transID;
	}
	public void setTransID(String transID) {
		this.transID = transID;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public String getTransDesc() {
		return transDesc;
	}
	public void setTransDesc(String transDesc) {
		this.transDesc = transDesc;
	}
	
}
