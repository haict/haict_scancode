package com.cmn.entity.cus;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Error implements IError{
	@XStreamAlias("ErrorMessage")
	private String message = "";
	@XStreamAlias("ErrorNumber")
	private Integer number = 0;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	
}
