/**
 * 
 */
package com.cmn.entity.ecus;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author Administrator
 *
 */
public class ChungThuSo {
	@XStreamAlias("SerialNumber")
	private String serialNumber;		
	
	@XStreamAlias("Noi_Cap")
	private String noiCap;
	
	@XStreamAlias("Ngay_HL")	
	private String ngayHL;
	
	@XStreamAlias("Ngay_HHL")
	private String ngayHHL;		
	
	@XStreamAlias("PublicKey")
	private String publicKey;

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getNoiCap() {
		return noiCap;
	}

	public void setNoiCap(String noiCap) {
		this.noiCap = noiCap;
	}

	public String getNgayHL() {
		return ngayHL;
	}

	public void setNgayHL(String ngayHL) {
		this.ngayHL = ngayHL;
	}

	public String getNgayHHL() {
		return ngayHHL;
	}

	public void setNgayHHL(String ngayHHL) {
		this.ngayHHL = ngayHHL;
	}

	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}		
}
