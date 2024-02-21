/**
 * 
 */
package com.cmn.entity.ecus;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author Administrator
 *
 */
public class ThongTinDinhKem {
	@XStreamAlias("STT")
	private Integer stt;		
	
	@XStreamAlias("Ten_CTDK")
	private String tenCTDK;
	
	@XStreamAlias("Ten_File")
	private String tenFile;
	
	@XStreamAlias("Noi_Dung")
	private String noiDung;

	public Integer getStt() {
		return stt;
	}

	public void setStt(Integer stt) {
		this.stt = stt;
	}

	public String getTenCTDK() {
		return tenCTDK;
	}

	public void setTenCTDK(String tenCTDK) {
		this.tenCTDK = tenCTDK;
	}

	public String getTenFile() {
		return tenFile;
	}

	public void setTenFile(String tenFile) {
		this.tenFile = tenFile;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
}
