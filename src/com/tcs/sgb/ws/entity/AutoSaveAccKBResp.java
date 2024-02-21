package com.tcs.sgb.ws.entity;

import java.util.List;

public class AutoSaveAccKBResp {
	private String res_code;
	private String firstBal;
	private String firstCCY;
	private String prevBal;
	private String prevCCY;
	private String actualBal;
	private List<DetailStatement> listStatement;
	
	public String getRes_code() {
		return res_code;
	}

	public void setRes_code(String res_code) {
		this.res_code = res_code;
	}

	public String getFirstBal() {
		return firstBal;
	}

	public void setFirstBal(String firstBal) {
		this.firstBal = firstBal;
	}

	public String getFirstCCY() {
		return firstCCY;
	}

	public void setFirstCCY(String firstCCY) {
		this.firstCCY = firstCCY;
	}

	public String getPrevBal() {
		return prevBal;
	}

	public void setPrevBal(String prevBal) {
		this.prevBal = prevBal;
	}

	public String getPrevCCY() {
		return prevCCY;
	}

	public void setPrevCCY(String prevCCY) {
		this.prevCCY = prevCCY;
	}

	public String getActualBal() {
		return actualBal;
	}

	public void setActualBal(String actualBal) {
		this.actualBal = actualBal;
	}

	public List<DetailStatement> getListStatement() {
		return listStatement;
	}

	public void setListStatement(List<DetailStatement> listStatement) {
		this.listStatement = listStatement;
	}


}
