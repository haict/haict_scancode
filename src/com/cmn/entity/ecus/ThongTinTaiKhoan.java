/**
 * 
 */
package com.cmn.entity.ecus;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author Administrator
 *
 */
public class ThongTinTaiKhoan {
	@XStreamAlias("Ma_NH_TH")
	private String maNHTH;		
	
	@XStreamAlias("Ten_NH_TH")
	private String tenNHTH;
	
	@XStreamAlias("TaiKhoan_TH")
	private String taiKhoanTH;
	
	@XStreamAlias("Ten_TaiKhoan_TH")
	private String tenTKTH;

	public String getMaNHTH() {
		return maNHTH;
	}

	public void setMaNHTH(String maNHTH) {
		this.maNHTH = maNHTH;
	}

	public String getTenNHTH() {
		return tenNHTH;
	}

	public void setTenNHTH(String tenNHTH) {
		this.tenNHTH = tenNHTH;
	}

	public String getTaiKhoanTH() {
		return taiKhoanTH;
	}

	public void setTaiKhoanTH(String taiKhoanTH) {
		this.taiKhoanTH = taiKhoanTH;
	}

	public String getTenTKTH() {
		return tenTKTH;
	}

	public void setTenTKTH(String tenTKTH) {
		this.tenTKTH = tenTKTH;
	}				
}
