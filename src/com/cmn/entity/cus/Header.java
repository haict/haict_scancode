package com.cmn.entity.cus;

import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("header")
public class Header {
	@XStreamOmitField
	private static final String APPLICATION_NAME = "Payment";
	@XStreamOmitField
	private static final String APPLICATION_VERSION = "3.0";
	@XStreamAlias("Application_Name")
	private String applicationName = APPLICATION_NAME;
	@XStreamAlias("Application_Version")
	private String applicationVersion = APPLICATION_VERSION;
	@XStreamAlias("Sender_Code")
	private String senderCode;
	@XStreamAlias("Sender_Name")
	private String senderName;
	@XStreamAlias("Message_Version")
	private String messageVersion;
	@XStreamAlias("Message_Type")
	private String messageType;
	@XStreamAlias("Message_Name")
	private String messageName;
	@XStreamAlias("Transaction_Date")
	private Date transactionDate;
	@XStreamAlias("Transaction_ID")
	private String transactionId;
	@XStreamAlias("Request_ID")
	private String requestId;
	public String getApplicationName() {
		return applicationName;
	}
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	public String getApplicationVersion() {
		return applicationVersion;
	}
	public void setApplicationVersion(String applicationVersion) {
		this.applicationVersion = applicationVersion;
	}
	public String getSenderCode() {
		return senderCode;
	}
	public void setSenderCode(String senderCode) {
		this.senderCode = senderCode;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getMessageVersion() {
		return messageVersion;
	}
	public void setMessageVersion(String messageVersion) {
		this.messageVersion = messageVersion;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getMessageName() {
		return messageName;
	}
	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}
	
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	
	
}
