package com.cmn.entity.cus;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class ChungTu_CT {
	@XStreamAlias("STT")
	private String stt;
	
	@XStreamAlias("NDKT")
	private String ndkt;
	
	@XStreamAlias("Ten_NDKT")
	private String ten_ndkt;
	
	@XStreamAlias("SoTien_NT")
	private String sotien_nt;
	
	@XStreamAlias("SoTien_VND")
	private String sotien_vnd;
	
	@XStreamAlias("GhiChu")
	private String ghichu;

	/**
	 * @return the stt
	 */
	public String getStt() {
		return stt;
	}

	/**
	 * @param stt the stt to set
	 */
	public void setStt(String stt) {
		this.stt = stt;
	}

	/**
	 * @return the ndkt
	 */
	public String getNdkt() {
		return ndkt;
	}

	/**
	 * @param ndkt the ndkt to set
	 */
	public void setNdkt(String ndkt) {
		this.ndkt = ndkt;
	}

	/**
	 * @return the ten_ndkt
	 */
	public String getTen_ndkt() {
		return ten_ndkt;
	}

	/**
	 * @param ten_ndkt the ten_ndkt to set
	 */
	public void setTen_ndkt(String ten_ndkt) {
		this.ten_ndkt = ten_ndkt;
	}

	/**
	 * @return the sotien_nt
	 */
	public String getSotien_nt() {
		return sotien_nt;
	}

	/**
	 * @param sotien_nt the sotien_nt to set
	 */
	public void setSotien_nt(String sotien_nt) {
		this.sotien_nt = sotien_nt;
	}

	/**
	 * @return the sotien_vnd
	 */
	public String getSotien_vnd() {
		return sotien_vnd;
	}

	/**
	 * @param sotien_vnd the sotien_vnd to set
	 */
	public void setSotien_vnd(String sotien_vnd) {
		this.sotien_vnd = sotien_vnd;
	}

	/**
	 * @return the ghichu
	 */
	public String getGhichu() {
		return ghichu;
	}

	/**
	 * @param ghichu the ghichu to set
	 */
	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}
}
