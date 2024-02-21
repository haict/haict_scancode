package com.cmn.cus;

import com.cmn.CUSMessage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CUSProxy {
	public String service(CUSMessage responseType, String message) throws IOException {
		StringBuilder sb = new StringBuilder();
		
//		ClassLoader classLoader = this.getClass().getClassLoader();
//		InputStream is = classLoader.getResourceAsStream("msgtemplate/" + responseType.getCode() + ".xml");
//		
//		Scanner scanner = new Scanner(is, "UTF-8");
//		while (scanner.hasNextLine()) {
//			String line = scanner.nextLine();
//			sb.append(line).append("\n");
//		}
//		scanner.close();
		
		BufferedReader bufferedReader = null;
		try {
			String filePath = "C://temp//template//" + responseType.getCode() + ".xml";
			String filePath299 = "C://temp//template//299.xml";
			FileInputStream fis;
			try {
				fis = new FileInputStream(filePath);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				fis = new FileInputStream(filePath299);
			}
			
            bufferedReader = new BufferedReader(new InputStreamReader(fis, "UTF8"));
            String line;
            while((line = bufferedReader.readLine()) != null) {
            	sb.append(line);//.append("\n");
            }       
        } catch(Exception e) {
        	e.printStackTrace();        	
        } finally {
        	if(bufferedReader != null) {
        		bufferedReader.close();
        	}
        }
		
		return sb.toString();
	}
}
