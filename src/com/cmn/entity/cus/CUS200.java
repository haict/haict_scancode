package com.cmn.entity.cus;

import java.util.Date;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS200 extends CUSResponse<CUS200.DataImp> {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_200;

	public CUS200() {
	}

	static {
		CUSBeanFactory.getInstance().register(type, new CUS200());
	}

	@Override
	public CUSBeanImp<CUS200.DataImp> init() {
		CUS200 bean = new CUS200();
		bean.data = new CUS200.DataImp();
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
		private Date ngayTNCT;

		public String getSoTNCT() {
			return soTNCT;
		}

		public void setSoTNCT(String soTNCT) {
			this.soTNCT = soTNCT;
		}

		public Date getNgayTNCT() {
			return ngayTNCT;
		}

		public void setNgayTNCT(Date ngayTNCT) {
			this.ngayTNCT = ngayTNCT;
		}
	}

	@Override
	public void addDefaultImplementation(XStream xstream) {
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}
	
}
