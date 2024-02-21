package com.cmn.entity.cus;

public interface ICUSResponse extends CUSBean{
	public Error getError();
	public Signature getSign();
}
