package com.cmn.entity.cus;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Customs")
public abstract class CUSBeanImp<T extends Data> implements CUSBean {
	@XStreamAlias("Header")
	protected Header header = new Header();
	@XStreamAlias("Data")
	protected T data;	
//	@XStreamAlias("Signature")
//	protected Signature sign = new Signature();
	/*@XStreamAlias("Error")
	protected Error error;*/
	
	public CUSBeanImp() {
	}

	/*public Error getError(){
		return error;
	}*/
	
	public Header getHeader() {
		return header;
	}

	public T getData() {
		return data;
	}
	
}
