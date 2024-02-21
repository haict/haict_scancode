/**
 * 
 */
package com.cmn.entity.cus;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author Administrator
 *
 */
public class Thue_xuat_khau {
	
	@XStreamAlias("TRI_GIA_TINH_THUE")
	private String tri_gia_tinh_thue;
	
	@XStreamAlias("TIEN_THUE")
	private String tien_thue;	
	
	@XStreamAlias("MA_TIEN_TE")
	private String ma_tien_te;

	/**
	 * @return the tri_gia_tinh_thue
	 */
	public String getTri_gia_tinh_thue() {
		return tri_gia_tinh_thue;
	}

	/**
	 * @param tri_gia_tinh_thue the tri_gia_tinh_thue to set
	 */
	public void setTri_gia_tinh_thue(String tri_gia_tinh_thue) {
		this.tri_gia_tinh_thue = tri_gia_tinh_thue;
	}

	/**
	 * @return the tien_thue
	 */
	public String getTien_thue() {
		return tien_thue;
	}

	/**
	 * @param tien_thue the tien_thue to set
	 */
	public void setTien_thue(String tien_thue) {
		this.tien_thue = tien_thue;
	}

	/**
	 * @return the ma_tien_te
	 */
	public String getMa_tien_te() {
		return ma_tien_te;
	}

	/**
	 * @param ma_tien_te the ma_tien_te to set
	 */
	public void setMa_tien_te(String ma_tien_te) {
		this.ma_tien_te = ma_tien_te;
	}	

}
