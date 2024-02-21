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
public class CUS208 extends CUSResponse<CUS208.DataImp> {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_208;

	public CUS208() {
	}

	static {
		CUSBeanFactory.getInstance().register(type, new CUS208());
	}

	@Override
	public CUSBeanImp<CUS208.DataImp> init() {
		CUS208 bean = new CUS208();
		bean.data = new CUS208.DataImp();
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

		@XStreamAlias("Ma_LH")
		private String ma_lh;	
		
		@XStreamAlias("Ten_LH")
		private String ten_lh;	
		
		@XStreamAlias("SN_AH")
		private String ma_cu;

		/**
		 * @return the ma_lh
		 */
		public String getMa_lh() {
			return ma_lh;
		}

		/**
		 * @param ma_lh the ma_lh to set
		 */
		public void setMa_lh(String ma_lh) {
			this.ma_lh = ma_lh;
		}

		/**
		 * @return the ten_lh
		 */
		public String getTen_lh() {
			return ten_lh;
		}

		/**
		 * @param ten_lh the ten_lh to set
		 */
		public void setTen_lh(String ten_lh) {
			this.ten_lh = ten_lh;
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
		
	}
	
	

	@Override
	public void addDefaultImplementation(XStream xstream) {
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}
}
