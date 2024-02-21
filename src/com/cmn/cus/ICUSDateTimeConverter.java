package com.cmn.cus;

import com.thoughtworks.xstream.converters.Converter;

public interface ICUSDateTimeConverter extends Converter {
	public static final String DATE_01 = "yyyy-MM-dd";
	public static final String DATE_02 = "yyyy/MM/dd";
}
