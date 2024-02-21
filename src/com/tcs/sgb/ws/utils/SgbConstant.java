package com.tcs.sgb.ws.utils;

import java.util.Map;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SgbConstant {

	private static final String FILE_NAME = "appconfig";

	public static String SPECIAL_CHARACTER_INVALID = "";
	public static String SPECIAL_CHARACTER_VALID = "";
	public static String SPECIAL_CHARACTER_REPLACE = "";
	public static String FOLDER_XML = "";
	public static String URL_SERVER = ResourceBundle.getBundle(SgbConstant.FILE_NAME).getString("url_server").trim();

	public static String user = ResourceBundle.getBundle(SgbConstant.FILE_NAME).getString("spring.user.login.core")
			.trim();
	public static String password = ResourceBundle.getBundle(SgbConstant.FILE_NAME)
			.getString("spring.password.login.core").trim();
	public static String timeOutSession = ResourceBundle.getBundle(SgbConstant.FILE_NAME)
			.getString("spring.session.timeout.seconds").trim();

	public static String ACC_INTERNAL = ResourceBundle.getBundle(SgbConstant.FILE_NAME).getString("acc_internal.core")
			.trim();
	public static String ACC_INTERNAL_WITH_TAX = ResourceBundle.getBundle(SgbConstant.FILE_NAME)
			.getString("acc_internal_with_tax.core").trim();
	public static String AMOUNT_BAL_INTEREST = ResourceBundle.getBundle(SgbConstant.FILE_NAME)
			.getString("amount_bal_interest.core").trim();
	public static String AMOUNT_BAL_ONLINE = ResourceBundle.getBundle(SgbConstant.FILE_NAME)
			.getString("amount_bal_online.core").trim();
	public static String AMOUNT_COLLECT_DIRECT = ResourceBundle.getBundle(SgbConstant.FILE_NAME)
			.getString("amount_collect_direct.core").trim();
	public static String AUTO_KC_DATE_END = ResourceBundle.getBundle(SgbConstant.FILE_NAME).getString("auto_kc_date_end.core").trim();
	public static String ERR_KC_DATE_END = ResourceBundle.getBundle(SgbConstant.FILE_NAME).getString("err_kc_date_end.core").trim();	
	public static String AUTO_SAVE_ACC_KB = ResourceBundle.getBundle(SgbConstant.FILE_NAME)
			.getString("auto_save_acc_kb.core").trim();
	public static String LOGIN_API_KB = ResourceBundle.getBundle(SgbConstant.FILE_NAME).getString("login_api_kb.core")
			.trim();
	public static String PART_NNSNN_FROM_CITAD_TO_ACC_KB = ResourceBundle.getBundle(SgbConstant.FILE_NAME)
			.getString("part_nnsnn_from_citad_to_acc_kb.core").trim();
	public static String SEND_MESSAGE_HQ_TO_KBNN = ResourceBundle.getBundle(SgbConstant.FILE_NAME).getString("send_message_hq_to_kbnn.core").trim();
	
	public static String UPDATE_STATUS_KBNN = ResourceBundle.getBundle(SgbConstant.FILE_NAME).getString("update_status_kbnn.core").trim();
	
	public static String TOKEN  = "";	
	public static long TOKEN_TIME_ACTIVE = 0;	
	public static long TOKEN_TIME_ALLOW = 59; //time sgb 60	
		
	public static Map<String, String> mapErrCore = Stream.of(new String[][] {
			  { "00", "Thành công" }, 
			  { "01", "Invalid account" }, 
			  { "02", "Invalid Citad Code" },
			  { "03", "Batch running" },
			  { "04", "Invalid date" },
			  { "05", "Database error" },			 
			  { "06", "Not enough balance" },
			  { "07", "Not found Transaction" },
			  { "96", "Lỗi hệ thống" },
			  { "99", "Lỗi chưa xác định" },
			  { "93", "Sai đặc tả API SGB-FP" },
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));

}
