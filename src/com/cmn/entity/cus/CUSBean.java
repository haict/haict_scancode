package com.cmn.entity.cus;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;

public interface CUSBean {
	public CUSMessage getType();	
	public Header getHeader();
	public Data getData();
//    public Error getError();
//	public Signature getSign();
	public CUSBean init();
	public void addDefaultImplementation(XStream xstream);
}
