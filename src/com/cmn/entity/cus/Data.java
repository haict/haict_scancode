package com.cmn.entity.cus;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Data")
public abstract class Data implements IData, Serializable {

	private static final long serialVersionUID = 1L;

	public Data() {
		super();
	}
	
	

	
}
