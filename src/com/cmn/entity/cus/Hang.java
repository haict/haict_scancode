/**
 * 
 */
package com.cmn.entity.cus;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author Administrator
 *
 */
public class Hang {
	@XStreamAlias("MA_HANG")
	private String ma_hang;		
	
	@XStreamAlias("TEN_HANG")
	private String ten_hang;
	
	@XStreamAlias("THUE_XUAT_KHAU")
	private Thue_xuat_khau thue_xuat_khau;

	/**
	 * @return the ma_hang
	 */
	public String getMa_hang() {
		return ma_hang;
	}

	/**
	 * @param ma_hang the ma_hang to set
	 */
	public void setMa_hang(String ma_hang) {
		this.ma_hang = ma_hang;
	}

	/**
	 * @return the ten_hang
	 */
	public String getTen_hang() {
		return ten_hang;
	}

	/**
	 * @param ten_hang the ten_hang to set
	 */
	public void setTen_hang(String ten_hang) {
		this.ten_hang = ten_hang;
	}

	/**
	 * @return the thue_xuat_khau
	 */
	public Thue_xuat_khau getThue_xuat_khau() {
		return thue_xuat_khau;
	}

	/**
	 * @param thue_xuat_khau the thue_xuat_khau to set
	 */
	public void setThue_xuat_khau(Thue_xuat_khau thue_xuat_khau) {
		this.thue_xuat_khau = thue_xuat_khau;
	}		
	
}
