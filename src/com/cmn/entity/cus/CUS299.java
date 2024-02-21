package com.cmn.entity.cus;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

public class CUS299 extends CUSResponse<CUS299.DataImp> {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_299;

	public CUS299() {
	}

	static {
		CUSBeanFactory.getInstance().register(type, new CUS299());
	}

	@Override
	public CUSBeanImp<CUS299.DataImp> init() {
		CUS299 bean = new CUS299();
		bean.data = new CUS299.DataImp();
		return bean;
	}

	@Override
	public CUSMessage getType() {
		return type;
	}

	@XStreamAlias("Data")
	public static class DataImp extends Data {
		private static final long serialVersionUID = 1L;

		public DataImp() {
		}

		@XStreamAlias("So_TN_CT")
		private String soTNCT;
		@XStreamAlias("Ngay_TN_CT")
		private String ngayTNCT;

		public String getSoTNCT() {
			return soTNCT;
		}

		public void setSoTNCT(String soTNCT) {
			this.soTNCT = soTNCT;
		}

		public String getNgayTNCT() {
			return ngayTNCT;
		}

		public void setNgayTNCT(String ngayTNCT) {
			this.ngayTNCT = ngayTNCT;
		}
	}

	@Override
	public void addDefaultImplementation(XStream xstream) {
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}

}
