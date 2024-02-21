/**
 * 
 */
package com.cmn.entity.cus;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author Administrator
 *
 */
public class ThongTin_NopTien {
	@XStreamAlias("Ma_NT")
	private String ma_nt;
	
	@XStreamAlias("TyGia")
	private String tygia;
	
	@XStreamAlias("TongTien_NT")
	private String tongtien_nt;
	
	@XStreamAlias("TongTien_VND")
	private String tongtien_vnd;
	
	/**
	 * @return the ma_nt
	 */
	public String getMa_nt() {
		return ma_nt;
	}

	/**
	 * @param ma_nt the ma_nt to set
	 */
	public void setMa_nt(String ma_nt) {
		this.ma_nt = ma_nt;
	}

	/**
	 * @return the tygia
	 */
	public String getTygia() {
		return tygia;
	}

	/**
	 * @param tygia the tygia to set
	 */
	public void setTygia(String tygia) {
		this.tygia = tygia;
	}

	/**
	 * @return the tongtien_nt
	 */
	public String getTongtien_nt() {
		return tongtien_nt;
	}

	/**
	 * @param tongtien_nt the tongtien_nt to set
	 */
	public void setTongtien_nt(String tongtien_nt) {
		this.tongtien_nt = tongtien_nt;
	}

	/**
	 * @return the tongtien_vnd
	 */
	public String getTongtien_vnd() {
		return tongtien_vnd;
	}

	/**
	 * @param tongtien_vnd the tongtien_vnd to set
	 */
	public void setTongtien_vnd(String tongtien_vnd) {
		this.tongtien_vnd = tongtien_vnd;
	}
}
