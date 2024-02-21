/**
 * 
 */
package com.cmn.entity.cus;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author Administrator
 *
 */
public class NguoiNopTien {
	@XStreamAlias("Ma_ST")
	private String ma_st;
	
	/*@XStreamAlias("Ten_DV")
	private String ten_dv;*/
	
	@XStreamAlias("Ten_NNT")
	private String ten_nnt;
	
	@XStreamAlias("DiaChi")
	private String diachi;		
	
	@XStreamAlias("TT_Khac")
	private String tt_khac;

	/**
	 * @return the ma_st
	 */
	public String getMa_st() {
		return ma_st;
	}

	/**
	 * @param ma_st the ma_st to set
	 */
	public void setMa_st(String ma_st) {
		this.ma_st = ma_st;
	}

	/**
	 * @return the diachi
	 */
	public String getDiachi() {
		return diachi;
	}

	/**
	 * @param diachi the diachi to set
	 */
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	/**
	 * @return the tt_khac
	 */
	public String getTt_khac() {
		return tt_khac;
	}

	/**
	 * @param tt_khac the tt_khac to set
	 */
	public void setTt_khac(String tt_khac) {
		this.tt_khac = tt_khac;
	}

	/**
	 * @return the ten_nnt
	 */
	public String getTen_nnt() {
		return ten_nnt;
	}

	/**
	 * @param ten_nnt the ten_nnt to set
	 */
	public void setTen_nnt(String ten_nnt) {
		this.ten_nnt = ten_nnt;
	}
}
