package com.cmn.entity.cus;

import java.util.HashMap;
import java.util.Map;

import com.cmn.CUSMessage;
import com.cmn.IFactory;

public class CUSBeanFactory implements IFactory<CUSMessage, CUSBean>{
	static {
		try {
			Class.forName("com.cmn.entity.cus.CUS101");
			Class.forName("com.cmn.entity.cus.CUS102");
			Class.forName("com.cmn.entity.cus.CUS103");
			Class.forName("com.cmn.entity.cus.CUS104");
			Class.forName("com.cmn.entity.cus.CUS105");
			Class.forName("com.cmn.entity.cus.CUS106");
			Class.forName("com.cmn.entity.cus.CUS107");
			Class.forName("com.cmn.entity.ecus.CUS108");
			Class.forName("com.cmn.entity.cus.CUS200");
			Class.forName("com.cmn.entity.cus.CUS201");
			Class.forName("com.cmn.entity.cus.CUS202");
			Class.forName("com.cmn.entity.cus.CUS203");
			Class.forName("com.cmn.entity.cus.CUS204");
			Class.forName("com.cmn.entity.cus.CUS205");
			Class.forName("com.cmn.entity.cus.CUS206");
 			Class.forName("com.cmn.entity.cus.CUS207");
			Class.forName("com.cmn.entity.cus.CUS208");
			Class.forName("com.cmn.entity.cus.CUS209");
			Class.forName("com.cmn.entity.cus.CUS210");
			Class.forName("com.cmn.entity.cus.CUS211");
			Class.forName("com.cmn.entity.cus.CUS212");
			Class.forName("com.cmn.entity.ecus.CUS213");
			Class.forName("com.cmn.entity.cus.CUS214");
			Class.forName("com.cmn.entity.cus.CUS215");
			Class.forName("com.cmn.entity.cus.CUS216");
			Class.forName("com.cmn.entity.ecus.CUS217");
			Class.forName("com.cmn.entity.cus.CUS299");
			Class.forName("com.cmn.entity.cus.CUS301");
			Class.forName("com.cmn.entity.cus.CUS302");
			Class.forName("com.cmn.entity.cus.CUS303");
			Class.forName("com.cmn.entity.ecus.CUS304");
			Class.forName("com.cmn.entity.ecus.CUS305");
			Class.forName("com.cmn.entity.ecus.CUS311");
			Class.forName("com.cmn.entity.ecus.CUS314");
			Class.forName("com.cmn.entity.ecus.CUS314R");
			Class.forName("com.cmn.entity.ecus.CUS312");	
			Class.forName("com.cmn.entity.ecus.CUS313");
			Class.forName("com.cmn.entity.cus.CUS401");
			Class.forName("com.cmn.entity.cus.CUS402");
			Class.forName("com.cmn.entity.cus.CUS403");
			Class.forName("com.cmn.entity.cus.CUS501");
			Class.forName("com.cmn.entity.cus.CUS502");
			Class.forName("com.cmn.entity.cus.CUS503");
			Class.forName("com.cmn.entity.cus.CUS504");
			Class.forName("com.cmn.entity.cus.CUS505");
			Class.forName("com.cmn.entity.cus.CUS506");
			Class.forName("com.cmn.entity.cus.CUS800");
			Class.forName("com.cmn.entity.cus.CUS801");
			Class.forName("com.cmn.entity.cus.CUS802");
			Class.forName("com.cmn.entity.cus.CUS803");
			Class.forName("com.cmn.entity.cus.CUS804");
			Class.forName("com.cmn.entity.cus.CUS805");
			Class.forName("com.cmn.entity.cus.CUS806");
			Class.forName("com.cmn.entity.cus.CUS807");
			Class.forName("com.cmn.entity.cus.CUS808");
			Class.forName("com.cmn.entity.cus.CUS809");
			Class.forName("com.cmn.entity.cus.CUS810");
			Class.forName("com.cmn.entity.cus.CUS851");
			Class.forName("com.cmn.entity.cus.CUS852");
			Class.forName("com.cmn.entity.cus.CUS853");
			Class.forName("com.cmn.entity.cus.CUS854");
			Class.forName("com.cmn.entity.cus.CUS855");
			Class.forName("com.cmn.entity.cus.CUS856");
			Class.forName("com.cmn.entity.cus.CUS857");
			Class.forName("com.cmn.entity.cus.CUS858");
			Class.forName("com.cmn.entity.cus.CUS859");
			Class.forName("com.cmn.entity.cus.CUS860");
			Class.forName("com.cmn.entity.cus.CUS90X");
			Class.forName("com.cmn.entity.cus.CUS900");
			Class.forName("com.cmn.entity.cus.CUS95X");
			Class.forName("com.cmn.entity.cus.CUSResponseImp");
			Class.forName("com.cmn.entity.ecus.CUS200B");
			Class.forName("com.cmn.entity.ecus.CUS299B");
			Class.forName("com.cmn.entity.ecus.CUS110");
			Class.forName("com.cmn.entity.ecus.CUS320");
			Class.forName("com.cmn.entity.ecus.CUS321");
			Class.forName("com.cmn.entity.ecus.CUS322");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static CUSBeanFactory instance;
	private Map<CUSMessage, CUSBean> repository = new HashMap<CUSMessage, CUSBean>();
	
	private CUSBeanFactory(){}
	
	public static CUSBeanFactory getInstance() {
		if(instance == null) {
			synchronized (CUSBeanFactory.class) {
				if(instance == null) {
					instance = new CUSBeanFactory();
				}
			}
		}
		return instance;
	}

	public void register(CUSMessage type, CUSBean bean) {
		repository.put(type, bean);
	}
	
	public CUSBean get(CUSMessage type) {
		CUSBean bean = null;
		if(repository.containsKey(type)) {
			bean = repository.get(type).init();
		}
		return bean;
	}
}
