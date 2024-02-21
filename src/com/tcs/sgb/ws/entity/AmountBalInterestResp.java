package com.tcs.sgb.ws.entity;

import java.util.List;

public class AmountBalInterestResp {
	private String res_code;
	private List<DetailInterest> detailInterest;

	public String getRes_code() {
		return res_code;
	}

	public void setRes_code(String res_code) {
		this.res_code = res_code;
	}

	public List<DetailInterest> getDetailInterest() {
		return detailInterest;
	}

	public void setDetailInterest(List<DetailInterest> detailInterest) {
		this.detailInterest = detailInterest;
	}

}
