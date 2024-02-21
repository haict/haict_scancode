/**
 * 
 */
package com.cmn.entity.cus;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author Administrator
 *
 */
public class TaiKhoan_NopTien {
	@XStreamAlias("Ma_NH_TH")
	private String ma_nh_th;
	
	@XStreamAlias("Ten_NH_TH")
	private String ten_nh_th;
	
	@XStreamAlias("TaiKhoan_TH")
	private String taikhoan_th;
	
	@XStreamAlias("Ten_TaiKhoan_TH")
	private String ten_taikhoan_th;

	/**
	 * @return the ma_nh_th
	 */
	public String getMa_nh_th() {
		return ma_nh_th;
	}

	/**
	 * @param ma_nh_th the ma_nh_th to set
	 */
	public void setMa_nh_th(String ma_nh_th) {
		this.ma_nh_th = ma_nh_th;
	}

	/**
	 * @return the ten_nh_th
	 */
	public String getTen_nh_th() {
		return ten_nh_th;
	}

	/**
	 * @param ten_nh_th the ten_nh_th to set
	 */
	public void setTen_nh_th(String ten_nh_th) {
		this.ten_nh_th = ten_nh_th;
	}

	/**
	 * @return the taikhoan_th
	 */
	public String getTaikhoan_th() {
		return taikhoan_th;
	}

	/**
	 * @param taikhoan_th the taikhoan_th to set
	 */
	public void setTaikhoan_th(String taikhoan_th) {
		this.taikhoan_th = taikhoan_th;
	}

	/**
	 * @return the ten_taikhoan_th
	 */
	public String getTen_taikhoan_th() {
		return ten_taikhoan_th;
	}

	/**
	 * @param ten_taikhoan_th the ten_taikhoan_th to set
	 */
	public void setTen_taikhoan_th(String ten_taikhoan_th) {
		this.ten_taikhoan_th = ten_taikhoan_th;
	}
}
