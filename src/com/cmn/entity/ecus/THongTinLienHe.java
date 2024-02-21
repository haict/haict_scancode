package com.cmn.entity.ecus;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class THongTinLienHe {
	@XStreamAlias("So_DT")
	private String soDT;
	
	@XStreamAlias("Email")
	private String email;

	/**
	 * @return the soDT
	 */
	public String getSoDT() {
		return soDT;
	}

	/**
	 * @param soDT the soDT to set
	 */
	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
}
