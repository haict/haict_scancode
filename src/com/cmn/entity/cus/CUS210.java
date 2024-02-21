package com.cmn.entity.cus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;
import com.cmn.CUSMessage;

@XStreamAlias("Customs")
public class CUS210 extends CUSResponse<CUS210.DataImp> {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_210;

	public CUS210() {
	}

	static {
		CUSBeanFactory.getInstance().register(type, new CUS210());
	}

	@Override
	public CUSBeanImp<CUS210.DataImp> init() {
		CUS210 bean = new CUS210();
		bean.data = new CUS210.DataImp();
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

		@XStreamAlias("Ma_KB")
		private String ma_kb;	
		
		@XStreamAlias("Ten_KB")
		private String ten_kb;	
		
		/**
		 * @return the ma_hq
		 */
		public String getMa_kb() {
			return ma_kb;
		}

		/**
		 * @param ma_hq the ma_hq to set
		 */
		public void setMa_kb(String ma_kb) {
			this.ma_kb = ma_kb;
		}

		/**
		 * @return the ten_hq
		 */
		public String getTen_kb() {
			return ten_kb;
		}

		/**
		 * @param ten_hq the ten_hq to set
		 */
		public void setTen_kb(String ten_kb) {
			this.ten_kb = ten_kb;
		}
	}
	
	

	@Override
	public void addDefaultImplementation(XStream xstream) {
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}
}
