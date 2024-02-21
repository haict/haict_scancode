package com.cmn.utils;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class DateUtils {
	private static Logger logger = LogManager.getLogger(DateUtils.class);
	private static final String THIS = "DateUtils";

	public static String convertDateToString(java.util.Date date, String datePattern) {

		if (date == null) {
			return null;
		} else {

			final String loc = THIS + ".dateToString(" + date + "," + datePattern + ")";
			try {
				DateFormat fmt = new SimpleDateFormat(datePattern);
				fmt.setTimeZone(TimeZone.getTimeZone("GMT+7"));
				return fmt.format(date);
			} catch (Exception e) {
				logger.info(loc + " - " + e.toString());
				return "";
			}
		}
	}

	public static Date getTimeByTimezone(String time) throws Exception{//HH:mm
		try {
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			df.setTimeZone(TimeZone.getTimeZone("GMT+7"));
			String strDate = df.format(new Date());
			if(time!=null & time.length()>0){
				strDate = strDate.substring(0,11)+ time + ":00";
			}
			SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			return df1.parse(strDate);
		} catch (Exception e) {
			logger.error(e);
			throw e;
		}
	}
	
	public static Date getDateCurrent() throws Exception{//HH:mm
		try {
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			df.setTimeZone(TimeZone.getTimeZone("GMT+7"));
			String strDate = df.format(new Date());
			
			SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			return df1.parse(strDate);
		} catch (Exception e) {
			logger.error(e);
			throw e;
		}
	}
	
	public static String convertDate(String date, String fromFormar, String toFormat) throws Exception{//HH:mm
		try {
			SimpleDateFormat df = new SimpleDateFormat(fromFormar);
			df.setTimeZone(TimeZone.getTimeZone("GMT+7"));
			Date strDate = df.parse(date);
			SimpleDateFormat df1 = new SimpleDateFormat(toFormat);
			df1.setTimeZone(TimeZone.getTimeZone("GMT+7"));
			return df1.format(strDate);
		} catch (Exception e) {
			logger.error(e);
			throw e;
		}
	}
}
