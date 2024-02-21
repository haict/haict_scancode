/**
 * 
 */
package com.cmn.entity.ecus;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

/**
 * @author Administrator
 *
 */
public class ThongTinDK {
	@XStreamAlias("So_HS")
	private String soHS;
	
	@XStreamAlias("Loai_HS")
	private Short loaiHS;
	
	@XStreamAlias("Ma_DV")
	private String maDV;
	
	@XStreamAlias("Ten_DV")
	private String tenDV;
	
	@XStreamAlias("DiaChi")
	private String diaChi;
	
	@XStreamAlias("Ngay_HL_UQ")
	private String ngay_HL_UQ;
	
	@XStreamAlias("Ngay_HHL_UQ")
	private String ngay_HHL_UQ;
	
	@XStreamAlias("ThongTin_NNT")
	private ThongTinNNT thongTin_NNT;
			

	public String getSoHS() {
		return soHS;
	}

	public void setSoHS(String soHS) {
		this.soHS = soHS;
	}

	public Short getLoaiHS() {
		return loaiHS;
	}

	public void setLoaiHS(Short loaiHS) {
		this.loaiHS = loaiHS;
	}

	public String getMaDV() {
		return maDV;
	}

	public void setMaDV(String maDV) {
		this.maDV = maDV;
	}

	public String getTenDV() {
		return tenDV;
	}

	public void setTenDV(String tenDV) {
		this.tenDV = tenDV;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	

	public String getNgay_HL_UQ() {
		return ngay_HL_UQ;
	}

	public void setNgay_HL_UQ(String ngay_HL_UQ) {
		this.ngay_HL_UQ = ngay_HL_UQ;
	}

	public String getNgay_HHL_UQ() {
		return ngay_HHL_UQ;
	}

	public void setNgay_HHL_UQ(String ngay_HHL_UQ) {
		this.ngay_HHL_UQ = ngay_HHL_UQ;
	}

	public ThongTinNNT getThongTin_NNT() {
		return thongTin_NNT;
	}

	public void setThongTin_NNT(ThongTinNNT thongTin_NNT) {
		this.thongTin_NNT = thongTin_NNT;
	}

}
