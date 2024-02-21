/**
 * 
 */
package com.cmn.entity.cus;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author Administrator
 *
 */

public class Tt_hang {
	
	@XStreamAlias("HANG")
	private Hang hang;

	/**
	 * @return the hang
	 */
	public Hang getHang() {
		return hang;
	}

	/**
	 * @param hang the hang to set
	 */
	public void setHang(Hang hang) {
		this.hang = hang;
	}
}
