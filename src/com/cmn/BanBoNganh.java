/**
 * 
 */
package com.cmn;

/**
 * @author Administrator
 *
 */
public enum BanBoNganh {
	
	CHUA_KIEM_SOAT("00", "Chưa kiểm soát"),
	CHUYEN_TRA("01", "Chuyển trả"),
	HUY_TCS("02", "Hủy TCS"),
	LOI_CORE("11", "Lỗi Core"),
	
	KIEM_SOAT_TIME_OUT("21", "Kiểm soát Timeout"),
	KIEM_SOAT_HQ_LOI("22", "Kiểm soát HQ Lỗi"),
	
	HUY_HQ_THANH_CONG("30", "Hủy HQ Thành Công"),
	HUY_HQ_TIME_OUT("31", "Hủy HQ Timeout"),
	HUY_HQ_LOI("32", "Hủy HQ Lỗi"),
	
	KIEM_SOAT_HQ_THANH_CONG("20", "Kiểm soát HQ thành công");
	
	BanBoNganh(String code, String name) {
		this.code = code;
		this.name = name;
	}
	
	private String code;
	private String name;
	
	public String getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
	
	public static String getNameByCode(String code) {
		if("00".equals(code))
			return CHUA_KIEM_SOAT.getName();
		if("01".equals(code))	
			return CHUYEN_TRA.getName();
		if("02".equals(code))
			return HUY_TCS.getName();
		if("11".equals(code))	
			return LOI_CORE.getName();
		if("20".equals(code))
			return KIEM_SOAT_HQ_THANH_CONG.getName();
		if("21".equals(code))
			return KIEM_SOAT_TIME_OUT.getName();
		if("22".equals(code))
			return KIEM_SOAT_HQ_LOI.getName();
		if("30".equals(code))
			return HUY_HQ_THANH_CONG.getName();
		if("31".equals(code))
			return HUY_HQ_TIME_OUT.getName();
		if("32".equals(code))
			return HUY_HQ_LOI.getName();
		return "";
	}
}
