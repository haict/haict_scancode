package com.cmn.entity.cus;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public abstract class CUSResponse<T extends Data> extends CUSBeanImp<T> implements ICUSResponse{
	@XStreamAlias("Error")
	protected Error error = new Error();
	@XStreamAlias("Signature")
	protected Signature sign = new Signature();

	public Error getError() {
		return error;
	}	
	
	public Signature getSign() {
		return sign;
	}
	public String doc_id;
	public String data_id;
}
