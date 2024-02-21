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
public class CUS211 extends CUSResponse<CUS211.DataImp> {
	@XStreamOmitField
	private static final CUSMessage type = CUSMessage.CUS_211;

	public CUS211() {
	}

	static {
		CUSBeanFactory.getInstance().register(type, new CUS211());
	}

	@Override
	public CUSBeanImp<CUS211.DataImp> init() {
		CUS211 bean = new CUS211();
		bean.data = new CUS211.DataImp();
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

		@XStreamAlias("Ma_Loi")
		private String ma_loi;	
		
		@XStreamAlias("Ten_Loi")
		private String ten_loi;

		/**
		 * @return the ma_loi
		 */
		public String getMa_loi() {
			return ma_loi;
		}

		/**
		 * @param ma_loi the ma_loi to set
		 */
		public void setMa_loi(String ma_loi) {
			this.ma_loi = ma_loi;
		}

		/**
		 * @return the ten_loi
		 */
		public String getTen_loi() {
			return ten_loi;
		}

		/**
		 * @param ten_loi the ten_loi to set
		 */
		public void setTen_loi(String ten_loi) {
			this.ten_loi = ten_loi;
		}	
		
	}

	@Override
	public void addDefaultImplementation(XStream xstream) {
		xstream.addDefaultImplementation(DataImp.class, Data.class);
	}
}
