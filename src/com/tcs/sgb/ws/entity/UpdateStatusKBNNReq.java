package com.tcs.sgb.ws.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "ttspTranID", "ttspDate" ,"trans_from", "trans_id", "ft_no", "code", "name"})
public class UpdateStatusKBNNReq {
	@JsonProperty("TtspTranID")
	private String ttspTranID;	
	@JsonProperty("TtspDate")
	private String ttspDate;
	@JsonProperty("trans_From")
	private String trans_from;
	@JsonProperty("trans_ID")
	private String trans_id;
	@JsonProperty("ft_No")
	private String ft_no;
	@JsonProperty("code")
	private String code;
	@JsonProperty("name")
	private String name;
	public String getTtspTranID() {
		return ttspTranID;
	}
	public void setTtspTranID(String ttspTranID) {
		this.ttspTranID = ttspTranID;
	}
	public String getTtspDate() {
		return ttspDate;
	}
	public void setTtspDate(String ttspDate) {
		this.ttspDate = ttspDate;
	}
	public String getTrans_from() {
		return trans_from;
	}
	public void setTrans_from(String trans_from) {
		this.trans_from = trans_from;
	}
	public String getTrans_id() {
		return trans_id;
	}
	public void setTrans_id(String trans_id) {
		this.trans_id = trans_id;
	}
	public String getFt_no() {
		return ft_no;
	}
	public void setFt_no(String ft_no) {
		this.ft_no = ft_no;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}		
}
