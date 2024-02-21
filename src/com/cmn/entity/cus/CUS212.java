package com.cmn.entity.cus;

import java.util.Date;
import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS212 extends CUSResponse<CUS212.DataImp>{
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_212;

	public CUS212() {
	}

	static {
		CUSBeanFactory.getInstance().register(type, new CUS212());
	}

	@Override
	public CUSBeanImp<CUS212.DataImp> init() {
		CUS212 bean = new CUS212();
		bean.data = new CUS212.DataImp();
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
		@XStreamAlias("KQ_TraCuu")
		private String kqTraCuu;
		

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

		public String getKqTraCuu() {
			return kqTraCuu;
		}

		public void setKqTraCuu(String kqTraCuu) {
			this.kqTraCuu = kqTraCuu;
		}
	}

	@Override
	public void addDefaultImplementation(XStream xstream) {
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}
}
