package com.cmn.entity.cus;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Customs")
public abstract class CUSDelete extends CUSRequest<CUSDelete.DataImp> {

	@XStreamAlias("Data")
	public static class DataImp extends Data{
		private static final long serialVersionUID = 1L;

		public DataImp(){}
		
		@XStreamAlias("So_TN_CT_YCH")
		private String soTNCTYCH;

		public String getSoTNCTYCH() {
			return soTNCTYCH;
		}

		public void setSoTNCTYCH(String soTNCTYCH) {
			this.soTNCTYCH = soTNCTYCH;
		}
		
	}
	
}
