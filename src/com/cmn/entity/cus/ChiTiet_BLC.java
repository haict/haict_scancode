package com.cmn.entity.cus;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class ChiTiet_BLC {
	@XStreamAlias("So_TK")
	private String so_tk;
	@XStreamAlias("Ngay_DK")
	private String ngay_dk;
	@XStreamAlias("So_SD")
	private String so_sd;
	@XStreamAlias("So_PH")
	private String so_ph;
	public String getSo_tk() {
		return so_tk;
	}
	public void setSo_tk(String so_tk) {
		this.so_tk = so_tk;
	}
	public String getNgay_dk() {
		return ngay_dk;
	}
	public void setNgay_dk(String ngay_dk) {
		this.ngay_dk = ngay_dk;
	}
	public String getSo_sd() {
		return so_sd;
	}
	public void setSo_sd(String so_sd) {
		this.so_sd = so_sd;
	}
	public String getSo_ph() {
		return so_ph;
	}
	public void setSo_ph(String so_ph) {
		this.so_ph = so_ph;
	}
	
}
