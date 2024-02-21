package com.cmn.entity.cus;

public interface IError {
	public static final Integer NUMBER_SUCCESS = 0;
	
	public Integer getNumber();
	public String getMessage();
}
