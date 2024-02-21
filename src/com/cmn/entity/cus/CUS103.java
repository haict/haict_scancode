package com.cmn.entity.cus;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;
@XStreamAlias("Customs")
public class CUS103 extends CUSRequest<CUS103.DataImp> {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_103;
	static {
		CUSBeanFactory.getInstance().register(type, new CUS103());
	}

	@XStreamAlias("Data")
	public static class DataImp extends Data{
		private static final long serialVersionUID = 1L;

		public DataImp(){}
		
		@XStreamAlias("So_HS")
		private String so_hs;
		
		@XStreamAlias("Ma_DVQL")
		private String ma_dvql;
		
		@XStreamAlias("KyHieu_CT")
		private String kyhieu_ct;
		
		@XStreamAlias("So_CT")
		private String so_ct;
		
		@XStreamAlias("Nam_CT")
		private String nam_ct;

		/**
		 * @return the so_hs
		 */
		public String getSo_hs() {
			return so_hs;
		}
		/**
		 * @param so_hs the so_hs to set
		 */
		public void setSo_hs(String so_hs) {
			this.so_hs = so_hs;
		}
		/**
		 * @return the ma_dvql
		 */
		public String getMa_dvql() {
			return ma_dvql;
		}
		/**
		 * @param ma_dvql the ma_dvql to set
		 */
		public void setMa_dvql(String ma_dvql) {
			this.ma_dvql = ma_dvql;
		}
		/**
		 * @return the kyhieu_ct
		 */
		public String getKyhieu_ct() {
			return kyhieu_ct;
		}
		/**
		 * @param kyhieu_ct the kyhieu_ct to set
		 */
		public void setKyhieu_ct(String kyhieu_ct) {
			this.kyhieu_ct = kyhieu_ct;
		}
		/**
		 * @return the so_ct
		 */
		public String getSo_ct() {
			return so_ct;
		}
		/**
		 * @param so_ct the so_ct to set
		 */
		public void setSo_ct(String so_ct) {
			this.so_ct = so_ct;
		}
		/**
		 * @return the nam_ct
		 */
		public String getNam_ct() {
			return nam_ct;
		}
		/**
		 * @param nam_ct the nam_ct to set
		 */
		public void setNam_ct(String nam_ct) {
			this.nam_ct = nam_ct;
		}
	}

	public CUSBeanImp<CUS103.DataImp> init() {
		CUS103 bean = new CUS103();
		bean.data = new DataImp();
		return bean;
	}

	public CUSMessage getType() {
		return type;
	}

	@Override
	public void addDefaultImplementation(XStream xstream) {
		// TODO Auto-generated method stub
		
	}
}
