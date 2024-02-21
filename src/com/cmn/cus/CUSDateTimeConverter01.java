package com.cmn.cus;

import com.thoughtworks.xstream.converters.Converter;

public class CUSDateTimeConverter01 extends CUSDateTimeConverter implements Converter{
	private static final String format = ICUSDateTimeConverter.DATE_01;

	@Override
	protected String getFormat() {
		return format;
	}

}
