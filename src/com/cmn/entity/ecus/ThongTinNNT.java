/**
 * 
 */
package com.cmn.entity.ecus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cmn.cus.CUSDateTimeConverter01;
import com.cmn.entity.cus.CUS202.CTNo;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

/**
 * @author Administrator
 *
 */
public class ThongTinNNT {
	@XStreamAlias("So_CMT")
	private String  soCMT;		
	
	@XStreamAlias("Ho_Ten")
	private String hoTen;
	
	@XStreamAlias("NgaySinh")
	private String ngaySinh;
	
	@XStreamAlias("NguyenQuan")
	private String nguyenQuan;		
	

	@XStreamImplicit(itemFieldName = "ThongTinLienHe")
	private List<THongTinLienHe> thongtinlienhes = new ArrayList<THongTinLienHe>();
	
	@XStreamAlias("ChungThuSo")
	private ChungThuSo chungThuSo;	
	
	@XStreamAlias("ThongTinTaiKhoan")
	private ThongTinTaiKhoan thongTinTaiKhoan;

	public String getSoCMT() {
		return soCMT;
	}

	public void setSoCMT(String soCMT) {
		this.soCMT = soCMT;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getNguyenQuan() {
		return nguyenQuan;
	}

	public void setNguyenQuan(String nguyenQuan) {
		this.nguyenQuan = nguyenQuan;
	}


	/**
	 * @return the thongtinlienhes
	 */
	public List<THongTinLienHe> getThongtinlienhes() {
		return thongtinlienhes;
	}

	/**
	 * @param thongtinlienhes the thongtinlienhes to set
	 */
	public void setThongtinlienhes(List<THongTinLienHe> thongtinlienhes) {
		this.thongtinlienhes = thongtinlienhes;
	}

	public ChungThuSo getChungThuSo() {
		return chungThuSo;
	}

	public void setChungThuSo(ChungThuSo chungThuSo) {
		this.chungThuSo = chungThuSo;
	}

	public ThongTinTaiKhoan getThongTinTaiKhoan() {
		return thongTinTaiKhoan;
	}

	public void setThongTinTaiKhoan(ThongTinTaiKhoan thongTinTaiKhoan) {
		this.thongTinTaiKhoan = thongTinTaiKhoan;
	}
}
