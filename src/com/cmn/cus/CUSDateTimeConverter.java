package com.cmn.cus;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.basic.DateConverter;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public abstract class CUSDateTimeConverter extends DateConverter implements ICUSDateTimeConverter {
	private Locale locale;
	
//	public CUSDateTimeConverter(String format) {
//		super();
//		this.format = format;
//	}

	@Override
	public void marshal(Object value, HierarchicalStreamWriter writer,
			MarshallingContext context) {
		Date date = (Date) value;
        DateFormat formatter = new SimpleDateFormat(getFormat());
        writer.setValue(formatter.format(date));
	}

	@Override
	public Object unmarshal(HierarchicalStreamReader reader,
			UnmarshallingContext context) {
		// TODO Auto-generated method stub
		return null;
	}

//	@SuppressWarnings("rawtypes")
//	@Override
//	public boolean canConvert(Class type) {
//		return Calendar.class.isAssignableFrom(type);
//	}
	
	protected abstract String getFormat();

}
