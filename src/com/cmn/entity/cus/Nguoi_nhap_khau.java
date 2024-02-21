/**
 * 
 */
package com.cmn.entity.cus;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author Administrator
 *
 */
public class Nguoi_nhap_khau {
	@XStreamAlias("MA_SO_THUE")
	private String ma_so_thue;
	
	@XStreamAlias("TEN")
	private String ten;		
	
	@XStreamAlias("DIA_CHI_1")
	private String dia_chi_1;
	
	@XStreamAlias("DIA_CHI_2")
	private String dia_chi_2;
	
	@XStreamAlias("DIA_CHI_3")
	private String dia_chi_3;
	
	@XStreamAlias("DIA_CHI_4")
	private String dia_chi_4;
	
	@XStreamAlias("MA_NUOC")
	private String ma_nuoc;
	
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
	/**
	 * @return the dia_chi_2
	 */
	public String getDia_chi_2() {
		return dia_chi_2;
	}
	/**
	 * @param dia_chi_2 the dia_chi_2 to set
	 */
	public void setDia_chi_2(String dia_chi_2) {
		this.dia_chi_2 = dia_chi_2;
	}
	/**
	 * @return the dia_chi_3
	 */
	public String getDia_chi_3() {
		return dia_chi_3;
	}
	/**
	 * @param dia_chi_3 the dia_chi_3 to set
	 */
	public void setDia_chi_3(String dia_chi_3) {
		this.dia_chi_3 = dia_chi_3;
	}
	/**
	 * @return the dia_chi_4
	 */
	public String getDia_chi_4() {
		return dia_chi_4;
	}
	/**
	 * @param dia_chi_4 the dia_chi_4 to set
	 */
	public void setDia_chi_4(String dia_chi_4) {
		this.dia_chi_4 = dia_chi_4;
	}
	/**
	 * @return the ma_nuoc
	 */
	public String getMa_nuoc() {
		return ma_nuoc;
	}
	/**
	 * @param ma_nuoc the ma_nuoc to set
	 */
	public void setMa_nuoc(String ma_nuoc) {
		this.ma_nuoc = ma_nuoc;
	}						
	
}
