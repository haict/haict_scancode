package com.fmt.utils.ws.Core;

public class HachToanCoreResp {
	private HachToanResp hachToanResp;
	private ReponseError error;
	

	public ReponseError getError() {
		return error;
	}

	public void setError(ReponseError error) {
		this.error = error;
	}

	public HachToanResp getHachToanResp() {
		return hachToanResp;
	}

	public void setHachToanResp(HachToanResp hachToanResp) {
		this.hachToanResp = hachToanResp;
	}
	
}
