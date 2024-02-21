package com.cmn.cus;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import com.thoughtworks.xstream.converters.basic.DoubleConverter;

public class CUSDoubleConverter extends DoubleConverter {
	private static final String CUS_DOUBLE_FORMAT = "####################.####";
	
//	public static void main(String[] args) {
//		DecimalFormat df = new DecimalFormat(CUS_DOUBLE_FORMAT);
//		df.setMaximumFractionDigits(4);
//		df.setMaximumIntegerDigits(20);
//		BigDecimal d = BigDecimal.valueOf(0.585);
//		System.out.println(d);
//		System.out.println(df.format(d));
//	}

	@SuppressWarnings("rawtypes")
	@Override
	public boolean canConvert(Class type) {
		return super.canConvert(type);
	}

	@Override
	public String toString(Object obj) {
		DecimalFormat df = new DecimalFormat(CUS_DOUBLE_FORMAT);
		return df.format(obj);
	}
	
}
