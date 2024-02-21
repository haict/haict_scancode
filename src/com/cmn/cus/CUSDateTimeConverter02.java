package com.cmn.cus;

import com.thoughtworks.xstream.converters.Converter;

public class CUSDateTimeConverter02 extends CUSDateTimeConverter implements Converter{
	private static final String format = ICUSDateTimeConverter.DATE_02;

	@Override
	protected String getFormat() {
		return format;
	}

}
