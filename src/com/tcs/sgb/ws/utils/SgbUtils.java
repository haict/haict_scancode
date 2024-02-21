package com.tcs.sgb.ws.utils;

import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class SgbUtils {
	public static char[] SPECIAL_CHARACTERS = {  ' ', '!', '#', '$', '%',
			'*', '+', '?', '[', '\\', ']', '^',
			'`', '|', '~', 'À', 'Á', 'Â', 'Ã', 'È', 'É', 'Ê', 'Ì', 'Í', 'Ò',
			'Ó', 'Ô', 'Õ', 'Ù', 'Ú', 'Ý', 'à', 'á', 'â', 'ã', 'è', 'é', 'ê',
			'ì', 'í', 'ò', 'ó', 'ô', 'õ', 'ù', 'ú', 'ý', 'Ă', 'ă', 'Đ', 'đ',
			'Ĩ', 'ĩ', 'Ũ', 'ũ', 'Ơ', 'ơ', 'Ư', 'ư', 'Ạ', 'ạ', 'Ả', 'ả', 'Ấ',
			'ấ', 'Ầ', 'ầ', 'Ẩ', 'ẩ', 'Ẫ', 'ẫ', 'Ậ', 'ậ', 'Ắ', 'ắ', 'Ằ', 'ằ',
			'Ẳ', 'ẳ', 'Ẵ', 'ẵ', 'Ặ', 'ặ', 'Ẹ', 'ẹ', 'Ẻ', 'ẻ', 'Ẽ', 'ẽ', 'Ế',
			'ế', 'Ề', 'ề', 'Ể', 'ể', 'Ễ', 'ễ', 'Ệ', 'ệ', 'Ỉ', 'ỉ', 'Ị', 'ị',
			'Ọ', 'ọ', 'Ỏ', 'ỏ', 'Ố', 'ố', 'Ồ', 'ồ', 'Ổ', 'ổ', 'Ỗ', 'ỗ', 'Ộ',
			'ộ', 'Ớ', 'ớ', 'Ờ', 'ờ', 'Ở', 'ở', 'Ỡ', 'ỡ', 'Ợ', 'ợ', 'Ụ', 'ụ',
			'Ủ', 'ủ', 'Ứ', 'ứ', 'Ừ', 'ừ', 'Ử', 'ử', 'Ữ', 'ữ', 'Ự', 'ự', };
		
	private static char[] SPECIAL_CHARACTERS2 = {'À', 'Á', 'Â', 'Ã', 'È', 'É', 'Ê', 'Ì', 'Í', 'Ò',
				'Ó', 'Ô', 'Õ', 'Ù', 'Ú', 'Ý', 'à', 'á', 'â', 'ã', 'è', 'é', 'ê',
				'ì', 'í', 'ò', 'ó', 'ô', 'õ', 'ù', 'ú', 'ý', 'Ă', 'ă', 'Đ', 'đ',
				'Ĩ', 'ĩ', 'Ũ', 'ũ', 'Ơ', 'ơ', 'Ư', 'ư', 'Ạ', 'ạ', 'Ả', 'ả', 'Ấ',
				'ấ', 'Ầ', 'ầ', 'Ẩ', 'ẩ', 'Ẫ', 'ẫ', 'Ậ', 'ậ', 'Ắ', 'ắ', 'Ằ', 'ằ',
				'Ẳ', 'ẳ', 'Ẵ', 'ẵ', 'Ặ', 'ặ', 'Ẹ', 'ẹ', 'Ẻ', 'ẻ', 'Ẽ', 'ẽ', 'Ế',
				'ế', 'Ề', 'ề', 'Ể', 'ể', 'Ễ', 'ễ', 'Ệ', 'ệ', 'Ỉ', 'ỉ', 'Ị', 'ị',
				'Ọ', 'ọ', 'Ỏ', 'ỏ', 'Ố', 'ố', 'Ồ', 'ồ', 'Ổ', 'ổ', 'Ỗ', 'ỗ', 'Ộ',
				'ộ', 'Ớ', 'ớ', 'Ờ', 'ờ', 'Ở', 'ở', 'Ỡ', 'ỡ', 'Ợ', 'ợ', 'Ụ', 'ụ',
				'Ủ', 'ủ', 'Ứ', 'ứ', 'Ừ', 'ừ', 'Ử', 'ử', 'Ữ', 'ữ', 'Ự', 'ự', };
		
	private static String regex = "[^a-zA-Z0-9.,_\\-:;_+/ &ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠạẢảẤấẦầẨẩẪẫẬậẮắẰằẲẳẴẵẶặẸẹẺẻẼẽẾếỀềỂểỄễỆệỈỉỊịỌọỎỏỐốỒồỔổỖỗỘộỚớỜờỞởỠỡỢợỤụỦủỨứỪừỬửỮữỰự]";

	private static char[] REPLACEMENTS = { ' ', '\0', '\0', '\0', '\0', '_', '\0', '_', '\0', '\0', '_',
			'\0', '\0', '\0', '\0','A', 'A', 'A', 'A', 'E', 'E', 'E',
			'I', 'I', 'O', 'O', 'O', 'O', 'U', 'U', 'Y', 'a', 'a', 'a', 'a',
			'e', 'e', 'e', 'i', 'i', 'o', 'o', 'o', 'o', 'u', 'u', 'y', 'A',
			'a', 'D', 'd', 'I', 'i', 'U', 'u', 'O', 'o', 'U', 'u', 'A', 'a',
			'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A',
			'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'E', 'e', 'E', 'e',
			'E', 'e', 'E', 'e', 'E', 'e', 'E', 'e', 'E', 'e', 'E', 'e', 'I',
			'i', 'I', 'i', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o',
			'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O',
			'o', 'U', 'u', 'U', 'u', 'U', 'u', 'U', 'u', 'U', 'u', 'U', 'u',
			'U', 'u',  }; 

	private static char[] REPLACEMENTS2 = {'A', 'A', 'A', 'A', 'E', 'E', 'E',
			'I', 'I', 'O', 'O', 'O', 'O', 'U', 'U', 'Y', 'a', 'a', 'a', 'a',
			'e', 'e', 'e', 'i', 'i', 'o', 'o', 'o', 'o', 'u', 'u', 'y', 'A',
			'a', 'D', 'd', 'I', 'i', 'U', 'u', 'O', 'o', 'U', 'u', 'A', 'a',
			'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A',
			'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'E', 'e', 'E', 'e',
			'E', 'e', 'E', 'e', 'E', 'e', 'E', 'e', 'E', 'e', 'E', 'e', 'I',
			'i', 'I', 'i', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o',
			'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O',
			'o', 'U', 'u', 'U', 'u', 'U', 'u', 'U', 'u', 'U', 'u', 'U', 'u',
			'U', 'u',  };
	static char removeAccent(char ch) {
		int index = Arrays.binarySearch(SPECIAL_CHARACTERS, ch);
		if (index >= 0) {
			ch = REPLACEMENTS[index];
		}
		return ch;
	}
	static char removeAccent2(char ch) {
		int index = Arrays.binarySearch(SPECIAL_CHARACTERS2, ch);
		if (index >= 0) {
			ch = REPLACEMENTS2[index];
		}
		return ch;
	}
	public static String removeAccent(String s) {
		if(s == null) return "";
		if(s.equals("")) return "";
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < sb.length(); i++) {
			sb.setCharAt(i, removeAccent(sb.charAt(i)));
		}
		return sb.toString();
	}
	public static String removeAccent2(String s) {		
		if(s == null) return "";
		if(s.equals("")) return "";
		try {
			String[] tmpCharValid = SgbConstant.SPECIAL_CHARACTER_VALID.split("@@");
			String[] tmpCharReplace = SgbConstant.SPECIAL_CHARACTER_REPLACE.split("@@");
			for(int i =0; i< tmpCharValid.length; i++) {
				s = s.replace(tmpCharValid[i], tmpCharReplace[i]);
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
//		StringBuilder sb = new StringBuilder(s);
//		for (int i = 0; i < sb.length(); i++) {
//			sb.setCharAt(i, removeAccent2(sb.charAt(i)));
//			if((int)sb.charAt(i) > 126 || (int)sb.charAt(i) <32) {
//				sb.setCharAt(i, ' ');
//			}
//		}
		
		StringBuilder sb = new StringBuilder(convertTV(s));
		for (int i = 0; i < sb.length(); i++) {
			if((int)sb.charAt(i) > 126 || (int)sb.charAt(i) <32) {
				sb.setCharAt(i, ' ');
			}
		}
		return sb.toString().trim();
	}
	static String removeSpecialChar(String input){
		String _return = "";
		if (input != null){
			_return = input.replaceAll(regex, "");
		}
		return _return;
	}
	public static XMLGregorianCalendar getXMLGregorianCalendarNow() throws DatatypeConfigurationException {
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
		XMLGregorianCalendar now = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
		return now;
	}
	public static String getRandomId(){
		String result = UUID.randomUUID().toString();
		if(result.length() > 45) {
			result = result.substring(0, 45);
		}
		return result;					
	}
	public static String getTransId(String loaiCT,String soCT, String ngay_kb){
		StringBuilder result = new StringBuilder("TCS");		
		result.append(loaiCT).append(ngay_kb).append(soCT);					
		return result.toString();
	}
	public static String getTimeNow(){		
		SimpleDateFormat fmtSimple = new SimpleDateFormat ("yyyy-MM-dd'T'hh:mm:ss");		
		return fmtSimple.format(new Date());
	}
	
	public static XMLGregorianCalendar toXMLGregorianCalendar(Date date){
        GregorianCalendar gCalendar = new GregorianCalendar();
        gCalendar.setTime(date);
        XMLGregorianCalendar xmlCalendar = null;
        try {
            xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
        } catch (DatatypeConfigurationException ex) {
        	ex.printStackTrace();
        }
        return xmlCalendar;
	}
	
	/**
	 * @author hungnq1
	 * Convert to TV khong dau
	 * */
	public static String convertTV(String org) {

		if (org == null || "".equals(org))
			return "";

		org = Normalizer.normalize(org, Normalizer.Form.NFKC);

		char[] arrChar = org.toCharArray();
		char[] result = new char[arrChar.length];
		for (int i = 0; i < arrChar.length; i++) {
			switch (arrChar[i]) {
			case 'à':
			case 'á':
			case 'â':
			case 'ã':
			case 'ă':
			case 'ǎ':
			case 'ȃ':
			case 'ạ':
			case 'ả':
			case 'ấ':
			case 'ầ':
			case 'ẩ':
			case 'ẫ':
			case 'ậ':
			case 'ắ':
			case 'ằ':
			case 'ẳ':
			case 'ẵ':
			case 'ặ':
				result[i] = 'a';
				break;
			case 'è':
			case 'é':
			case 'ê':
			case 'ȇ':
			case 'ẹ':
			case 'ẻ':
			case 'ẽ':
			case 'ế':
			case 'ề':
			case 'ể':
			case 'ễ':
			case 'ệ':
				result[i] = 'e';
				break;
			case 'ì':
			case 'í':
			case 'ĩ':
			case 'ỉ':
			case 'ị':
				result[i] = 'i';
				break;
			case 'ò':
			case 'ó':
			case 'ô':
			case 'õ':
			case 'ơ':
			case 'ȏ':
			case 'ọ':
			case 'ỏ':
			case 'ố':
			case 'ồ':
			case 'ổ':
			case 'ỗ':
			case 'ộ':
			case 'ớ':
			case 'ờ':
			case 'ở':
			case 'ỡ':
			case 'ợ':
				result[i] = 'o';
				break;
			case 'ù':
			case 'ú':
			case 'ũ':
			case 'ư':
			case 'ụ':
			case 'ủ':
			case 'ứ':
			case 'ừ':
			case 'ử':
			case 'ữ':
			case 'ự':
				result[i] = 'u';
				break;
			case 'ý':
			case 'ỳ':
			case 'ỵ':
			case 'ỷ':
			case 'ỹ':
				result[i] = 'y';
				break;
			case 'đ':
				result[i] = 'd';
				break;
			case 'À':
			case 'Á':
			case 'Â':
			case 'Ã':
			case 'Ă':
			case 'Ǎ':
			case 'Ȃ':
			case 'Ạ':
			case 'Ả':
			case 'Ấ':
			case 'Ầ':
			case 'Ẩ':
			case 'Ẫ':
			case 'Ậ':
			case 'Ắ':
			case 'Ằ':
			case 'Ẳ':
			case 'Ẵ':
			case 'Ặ':
				result[i] = 'A';
				break;
			case 'È':
			case 'É':
			case 'Ê':
			case 'Ȇ':
			case 'Ẹ':
			case 'Ẻ':
			case 'Ẽ':
			case 'Ế':
			case 'Ề':
			case 'Ể':
			case 'Ễ':
			case 'Ệ':
				result[i] = 'E';
				break;
			case 'Ì':
			case 'Í':
			case 'Ĩ':
			case 'Ỉ':
			case 'Ị':
				result[i] = 'I';
				break;
			case 'Ò':
			case 'Ó':
			case 'Ô':
			case 'Õ':
			case 'Ơ':
			case 'Ȏ':
			case 'Ọ':
			case 'Ỏ':
			case 'Ố':
			case 'Ồ':
			case 'Ổ':
			case 'Ỗ':
			case 'Ộ':
			case 'Ớ':
			case 'Ờ':
			case 'Ở':
			case 'Ỡ':
			case 'Ợ':
				result[i] = 'O';
				break;
			case 'Ù':
			case 'Ú':
			case 'Ũ':
			case 'Ư':
			case 'Ụ':
			case 'Ủ':
			case 'Ứ':
			case 'Ừ':
			case 'Ử':
			case 'Ữ':
			case 'Ự':
				result[i] = 'U';
				break;
			case 'Ý':
			case 'Ỳ':
			case 'Ỵ':
			case 'Ỷ':
			case 'Ỹ':
				result[i] = 'Y';
				break;
			case 'Đ':
				result[i] = 'D';
				break;
//                case '–':
//                case '_':
//                    result[i] = '-';
//                    break;
			default:
				result[i] = arrChar[i];
			}
		}
		return new String(result);
	}
	
}
