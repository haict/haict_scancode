package com.cmn.entity.cus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.cmn.CUSMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Customs")
public class CUS209 extends CUSResponse<CUS209.DataImp> {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_209;

	public CUS209() {
	}

	static {
		CUSBeanFactory.getInstance().register(type, new CUS209());
	}

	@Override
	public CUSBeanImp<CUS209.DataImp> init() {
		CUS209 bean = new CUS209();
		bean.data = new CUS209.DataImp();
		return bean;
	}

	@Override
	public CUSMessage getType() {
		return type;
	}

	@XStreamAlias("Data")
	public static class DataImp extends Data {
		private static final long serialVersionUID = 1L;
		
		@XStreamImplicit(itemFieldName="Item")
		private List<Item> item = new ArrayList<Item>();

		/**
		 * @return the item
		 */
		public List<Item> getItem() {
			return item;
		}

		/**
		 * @param item the item to set
		 */
		public void setItem(List<Item> item) {
			this.item = item;
		}
	}
	
	public class Item implements Serializable{
		private static final long serialVersionUID = 1L;

		@XStreamAlias("Ma_HQ")
		private String ma_hq;	
		
		@XStreamAlias("Ten_HQ")
		private String ten_hq;	
		
		@XStreamAlias("Ma_Cu")
		private String ma_cu;	
		
		@XStreamAlias("Ma_QHNS")
		private String ma_qhns;

		/**
		 * @return the ma_hq
		 */
		public String getMa_hq() {
			return ma_hq;
		}

		/**
		 * @param ma_hq the ma_hq to set
		 */
		public void setMa_hq(String ma_hq) {
			this.ma_hq = ma_hq;
		}

		/**
		 * @return the ten_hq
		 */
		public String getTen_hq() {
			return ten_hq;
		}

		/**
		 * @param ten_hq the ten_hq to set
		 */
		public void setTen_hq(String ten_hq) {
			this.ten_hq = ten_hq;
		}

		/**
		 * @return the ma_cu
		 */
		public String getMa_cu() {
			return ma_cu;
		}

		/**
		 * @param ma_cu the ma_cu to set
		 */
		public void setMa_cu(String ma_cu) {
			this.ma_cu = ma_cu;
		}

		/**
		 * @return the ma_qhns
		 */
		public String getMa_qhns() {
			return ma_qhns;
		}

		/**
		 * @param ma_qhns the ma_qhns to set
		 */
		public void setMa_qhns(String ma_qhns) {
			this.ma_qhns = ma_qhns;
		}		
	}
	
	

	@Override
	public void addDefaultImplementation(XStream xstream) {
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}
}
