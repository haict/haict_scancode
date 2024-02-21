/**
 * 
 */
package com.cmn.entity.cus;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author Administrator
 *
 */
public class Nguoi_xuat_khau {
	
	@XStreamAlias("MA_SO_THUE")
	private String ma_so_thue;
	
	@XStreamAlias("TEN")
	private String ten;		
	
	@XStreamAlias("DIA_CHI_1")
	private String dia_chi_1;
	
	/**
	 * @return the ma_so_thue
	 */
	public String getMa_so_thue() {
		return ma_so_thue;
	}
	/**
	 * @param ma_so_thue the ma_so_thue to set
	 */
	public void setMa_so_thue(String ma_so_thue) {
		this.ma_so_thue = ma_so_thue;
	}
	/**
	 * @return the ten
	 */
	public String getTen() {
		return ten;
	}
	/**
	 * @param ten the ten to set
	 */
	public void setTen(String ten) {
		this.ten = ten;
	}
	/**
	 * @return the dia_chi_1
	 */
	public String getDia_chi_1() {
		return dia_chi_1;
	}
	/**
	 * @param dia_chi_1 the dia_chi_1 to set
	 */
	public void setDia_chi_1(String dia_chi_1) {
		this.dia_chi_1 = dia_chi_1;
	}
	
}
