package com.cmn.entity.cus;

import com.fmt.utils.HQ.signer.HQConstant;

public abstract class CUSRequest<T extends Data> extends CUSBeanImp<T> implements ICUSRequest{

	public CUSRequest() {
		header.setApplicationName("Payment");
		header.setApplicationVersion("3.0");
		header.setSenderCode(HQConstant.Sender_Code);
		header.setSenderName(HQConstant.Sender_Name);
		header.setMessageVersion("3.0");
//		header.setMessageType(getType().getCode());
//		header.setMessageName(getType().getName());		
//		header.setTransactionDate(Calendar.getInstance().getTime());
//		header.setTransactionId(new UUIDGenerator().toString());
	}
	
}
