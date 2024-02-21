package com.cmn.entity.ecus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.cmn.CUSMessage;
import com.cmn.entity.cus.CUSBeanFactory;
import com.cmn.entity.cus.CUSBeanImp;
import com.cmn.entity.cus.CUSResponse;
import com.cmn.entity.cus.Data;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS217 extends CUSResponse<CUS217.DataImp> {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_217;

	public CUS217() {
	}

	static {
		CUSBeanFactory.getInstance().register(type, new CUS217());
	}

	@Override
	public CUSBeanImp<CUS217.DataImp> init() {
		CUS217 bean = new CUS217();
		bean.data = new CUS217.DataImp();
		return bean;
	}

	@Override
	public CUSMessage getType() {
		return type;
	}

	@XStreamAlias("Data")
	public static class DataImp extends Data {
		private static final long serialVersionUID = 1L;

		@XStreamAlias("TrangThaiDK")
		private String TrangThaiDK;
 
		@XStreamAlias("ThongTinDK")
		private ThongTinDK thongtin_dk;

		public String getTrangThaiDK() {
			return TrangThaiDK;
		}

		public void setTrangThaiDK(String trangThaiDK) {
			TrangThaiDK = trangThaiDK;
		}

		public ThongTinDK getThongtin_dk() {
			return thongtin_dk;
		}

		public void setThongtin_dk(ThongTinDK thongtin_dk) {
			this.thongtin_dk = thongtin_dk;
		}
		
		
	}


	@Override
	public void addDefaultImplementation(XStream xstream) {
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}
}
