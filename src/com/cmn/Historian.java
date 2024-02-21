package com.cmn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Historian {
	private LoggerType type = LoggerType.GLOBAL;
	private Logger global = LoggerFactory.getLogger("global");
	private Logger accounting = LoggerFactory.getLogger("global.accounting");
	private Logger dailyReport = LoggerFactory.getLogger("global.dailyreport");
	private Logger communicateGip = LoggerFactory.getLogger("global.communicategip");
	
	public Historian() {
	}
	
	public Historian(LoggerType type) {
		this.type = type;
	}
	
	public void info(String arg0) {
		switch (type) {
		case GLOBAL:
			global.info(arg0);
			break;
		case ACCOUNTING:
			accounting.info(arg0);
			break;
		case DAILYREPORT:
			dailyReport.info(arg0);
			break;
		case COMMUNICATEGIP:
			communicateGip.info(arg0);
			break;		
		default:
			break;
		}		
	}

	public void info(String arg0, Object... arg1) {
		switch (type) {
		case GLOBAL:
			global.info(arg0, arg1);
			break;
		case ACCOUNTING:
			accounting.info(arg0, arg1);
			break;
		case DAILYREPORT:
			dailyReport.info(arg0, arg1);
			break;
		case COMMUNICATEGIP:
			communicateGip.info(arg0, arg1);
			break;
		default:
			break;
		}		
	}
	
	public void error(String arg0) {
		switch (type) {
		case GLOBAL:
			global.error(arg0);
			break;
		case ACCOUNTING:
			accounting.error(arg0);
			break;
		case DAILYREPORT:
			dailyReport.error(arg0);
			break;
		case COMMUNICATEGIP:
			communicateGip.error(arg0);
			break;
		default:
			break;
		}		
	}
	
	public void error(String arg0, Object... arg1) {
		switch (type) {
		case GLOBAL:
			global.error(arg0, arg1);
			break;
		case ACCOUNTING:
			accounting.error(arg0, arg1);
			break;
		case DAILYREPORT:
			dailyReport.error(arg0, arg1);
			break;
		case COMMUNICATEGIP:
			communicateGip.error(arg0, arg1);
			break;
		default:
			break;
		}		
	}
	
	public void error(Exception e) {
		StackTraceElement[] stack = e.getStackTrace();
		switch (type) {
		case GLOBAL:
			global.error(e.getMessage());
			for(StackTraceElement s : stack) {
				global.error(s.toString());
			}
			break;
		case ACCOUNTING:
			accounting.error(e.getMessage());
			for(StackTraceElement s : stack) {
				accounting.error(s.toString());
			}
			break;
		case DAILYREPORT:
			dailyReport.error(e.getMessage());
			for(StackTraceElement s : stack) {
				dailyReport.error(s.toString());
			}
			break;
		case COMMUNICATEGIP:
			communicateGip.error(e.getMessage());
			for(StackTraceElement s : stack) {
				communicateGip.error(s.toString());
			}
			break;
		default:
			break;
		}		
	}
	
	public void debug(String arg0) {
		switch (type) {
		case GLOBAL:
			global.debug(arg0);
			break;
		case ACCOUNTING:
			accounting.debug(arg0);
			break;
		case DAILYREPORT:
			dailyReport.debug(arg0);
			break;
		case COMMUNICATEGIP:
			communicateGip.debug(arg0);
			break;
		default:
			break;
		}		
	}
	
	public void debug(String arg0, Object... arg1) {
		switch (type) {
		case GLOBAL:
			global.debug(arg0, arg1);
			break;
		case ACCOUNTING:
			accounting.debug(arg0, arg1);
			break;
		case DAILYREPORT:
			dailyReport.debug(arg0, arg1);
			break;
		case COMMUNICATEGIP:
			communicateGip.debug(arg0, arg1);
			break;
		default:
			break;
		}		
	}
	
	public void debug(Exception e) {
		StackTraceElement[] stack = e.getStackTrace();
		switch (type) {
		case GLOBAL:
			global.debug(e.getMessage());
			for(StackTraceElement s : stack) {
				global.debug(s.toString());
			}
			break;
		case ACCOUNTING:
			accounting.debug(e.getMessage());
			for(StackTraceElement s : stack) {
				accounting.debug(s.toString());
			}
			break;
		case DAILYREPORT:
			dailyReport.debug(e.getMessage());
			for(StackTraceElement s : stack) {
				dailyReport.debug(s.toString());
			}
			break;
		case COMMUNICATEGIP:
			communicateGip.debug(e.getMessage());
			for(StackTraceElement s : stack) {
				communicateGip.debug(s.toString());
			}
			break;
		default:
			break;
		}		
	}

}
