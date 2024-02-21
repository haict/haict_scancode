package com.cmn;

import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;

import com.cmn.cus.CUSAdapter;
import com.cmn.entity.cus.CUS101;
import com.cmn.entity.cus.CUS201;
import com.cmn.entity.cus.CUS301;
import com.cmn.entity.cus.CUSBean;
import com.cmn.entity.cus.CUSBeanFactory;
import com.cmn.entity.cus.ICUSResponse;

public class Facade {
	private CUSBeanFactory factory = CUSBeanFactory.getInstance();
	
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.doBusiness();
	}
	
	public void doBusiness() {
		CUS301 request = (CUS301) factory.get(CUSMessage.CUS_301);
		ICUSResponse response = (ICUSResponse) factory.get(CUSMessage.CUS_200);
//		CUSBean response201 = factory.get(CUSMessage.CUS_201);
//		CUSBean response206 = factory.get(CUSMessage.CUS_206);
		
		CUS301.DataImp data = (CUS301.DataImp) request.getData();
		data.setMaDV("maDV");
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		data.setNgayBC(date);
		data.setNgayBN(date);
		calendar.set(Calendar.YEAR, 2000);
		data.setNgayCT(calendar.getTime());
		
		//CUSAdapter adapter = new CUSAdapter();
		try {
			//adapter.query(request, response);
			if(CUSMessage.CUS_299.getCode().equals(response.getHeader().getMessageType())){
				System.out.println("catch 299 message");
			} else {
				if(CUSMessage.CUS_201.getCode().equals(response.getHeader().getMessageType())){
					System.out.println("catch 201 message");
//					CUS201.DataImp dataResponse = (CUS201.DataImp) response201.getData();
//					System.out.println(dataResponse.getItems().get(0).getMaDV());				
//				} else if(CUSMessage.CUS_206.getCode().equals(response.getHeader().getMessageType())){
//					System.out.println("catch 206 message");
//					CUS206.DataImp dataResponse = (CUS206.DataImp) response206.getData();
//					System.out.println(dataResponse.getMa_hq());	
				} else {
					throw new Exception("Wrong response MessageType");
				}
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
