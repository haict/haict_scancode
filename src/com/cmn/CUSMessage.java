package com.cmn;

public enum CUSMessage {	
	CUS_101("101", "Tra cứu thông tin nợ thuế của tờ khai hải quan"), 
	CUS_102("102", "Tra cứu thông tin nợ lệ phí của tờ khai hải quan"), 
	CUS_103("103", "Thông điệp tra cứu thông tin nợ phí, lệ phí của bộ ngành trong hệ thống một cửa quốc gia"), 
	CUS_104("104", "Thông điệp tra cứu thông tin bảo lãnh chung"), 
	CUS_105("105", "Tra cứu thông tin tờ khai hải quan điện tử"), 
	CUS_106("106", "Thông điệp tra cứu thông tin danh mục"),
	CUS_107("107", "Tra cứu trạng thái của giao dịch trước đó (giao dịch thanh toán, bảo lãnh)"), 
	CUS_108("108", "Tra cứu thông tin NNT đăng ký ủy quyền TCHQ thông báo phát sinh nợ tới NHTM)"), 
	
	CUS_200("200", "Thông điệp trả lời thông tin trong trường hợp chấp nhận thông tin thanh toán phí, lệ phí, bảo lãnh"), 
	CUS_201("201", "Trả lời kết quả tra cứu thông tin nợ thuế của tờ khai hải quan"), 
	CUS_202("202", ""), 
	CUS_203("203", "Thông điệp trả lời thông tin nợ phí, lệ phí của bộ ngành trong hệ thống một cửa quốc gia"), 
	CUS_204("204", "Thông điệp trả lời thông tin tra cứu bảo lãnh chung"),
	CUS_205("205", "Trả lời thông tin tờ khai hải quan điện tử (Xuất khẩu)"), 
	CUS_206("206", "Trả lời thông tin tờ khai hải quan điện tử (Nhập khẩu)"), 
	CUS_207("207", "Trả lời thông tin thông tin đơn vị xuất nhập khẩu"),  
	CUS_208("208", "Thông điệp trả lời thông tin danh mục loại hình xuất nhập khẩu"), 
	CUS_209("209", "Thông điệp trả lời thông tin danh mục hải quan"), 
	CUS_210("210", "Thông điệp trả lời thông tin danh mục Kho bạc"), 
	CUS_211("211", "Thông điệp trả lời thông tin danh mục mã lỗi"),
	CUS_212("212", "Thông điệp trả lời thông tin tra cứu trạng thái giao dịch"),
	CUS_213("213", "Thông điệp NHTM gửi TCHQ thông báo kết quả xử lý yêu cầu của NNT"),
	CUS_214("214", "Thông điệp trả lời thông tin danh mục tài khoản Kho bạc mở tại NHTM"),
	CUS_215("215", "Thông điệp trả lời thông tin danh mục tài khoản Kho bạc mở tại NHTM"),
	CUS_216("216", "Thông điệp trả lời thông tin danh mục tài khoản Kho bạc mở tại NHTM"),
	CUS_217("217", "Thông điệp trả lời trạng thái đăng ký ủy quyền TCHQ thông báo phát sinh nợ tới NHTM của NNT"),
	CUS_299("299", "299"), 
	CUS_301("301", "Thông điệp nộp thuế cho tờ khai hải quan"), 
	CUS_302("302", "Thông điệp nộp lệ phí cho nhiều tờ khai hải quan"), 
	CUS_303("303", "Thông điệp nộp thuế, phí, lệ phí của cơ quan quản lý thu"), 
	CUS_304("304", "Thông điệp TCHQ gửi NHTM về việc NNT đề nghị trich tiền nộp thuế"),
	CUS_305("305", "Thông điệp TCHQ gửi NHTM về việc NNT đề nghị trích tiền nộp phí bộ ngành"),	
	CUS_311("311", "Thông điệp đăng ký thông tin nộp thuế"),
	CUS_314("314", "Thông điệp đăng ký thông tin ủy quyền TCHQ thông báo phát sinh nợ tới NHTM"),
	CUS_314R("314", "Thông điệp xác nhận đăng ký thông tin ủy quyền TCHQ thông báo phát sinh nợ tới NHTM"),
	CUS_312("312", "Thông điệp NHTM thông báo cho TCHQ về việc NNT đã ký ủy quyền"),
	CUS_313("313", "Thông điệp TCHQ thông báo cho NHTM về việc đã nhận được thông tin đăng ký ủy quyền của DN tại NHTM"),
	CUS_401("401", "Thông điệp bảo lãnh thuế cho tờ khai hải quan"), 
	CUS_402("402", "Thông điệp bảo lãnh nộp thuế cho tờ khai hải quan (bảo lãnh chung)"), 
	CUS_403("403", "Thông điệp bảo lãnh nộp thuế cho hoá đơn vận đơn"), 
	CUS_501("501", "Yêu cầu huỷ thông tin của giao dịch thanh toán hoặc bảo lãnh đã thành công"), 
	CUS_502("502", "Yêu cầu huỷ thông tin của giao dịch thanh toán hoặc bảo lãnh đã thành công"), 
	CUS_503("503", "Yêu cầu huỷ thông tin của giao dịch thanh toán hoặc bảo lãnh đã thành công"), 
	CUS_504("504", "Yêu cầu huỷ thông tin của giao dịch thanh toán hoặc bảo lãnh đã thành công"), 
	CUS_505("505", "Yêu cầu huỷ thông tin của giao dịch thanh toán hoặc bảo lãnh đã thành công"), 
	CUS_506("506", "Yêu cầu huỷ thông tin của giao dịch thanh toán hoặc bảo lãnh đã thành công"), 
	CUS_800("800", "Tra cứu thông tin nợ thuế của tờ khai hải quan"), 
	CUS_801("801", "Thông điệp gửi yêu cầu đối chiếu nộp thuế cho tờ khai hải quan"), 
	CUS_802("802", "Thông điệp đối chiếu nộp lệ phí cho nhiều tờ khai hải quan"), 
	CUS_803("803", "Thông điệp đối chiếu nộp thuế, phí, lệ phí cho các Bộ Ngành"), 
	CUS_804("804", "Thông điệp đối chiếu bảo lãnh cho tờ khai hải quan"), 
	CUS_805("805", "Thông điệp đối chiếu bảo lãnh chung"), 
	CUS_806("806", "Thông điệp đối chiếu cho hoá đơn vận đơn"),
	CUS_807("807", "Thông điệp đối chiếu danh sách các yêu cầu được gửi từ Cổng thanh toán điện tử hải quan đối với giao dịch thanh toán thuế"),
	CUS_808("808", "Thông điệp đối chiếu danh sách các yêu cầu được gửi từ Cổng thanh toán điện tử hải quan đối với giao dịch thanh toán lệ phí bộ ngành"),
	CUS_809("809", "Thông điệp gửi yêu cầu đối chiếu các giao dịch thanh toán phí hạ tầng online 24/7"),
	CUS_810("810", "Thông điệp gửi yêu cầu đối chiếu các giao dịch thanh toán phí hạ tầng tại quầy"),
	CUS_851("851", "Trả lời kết quả đối chiếu thanh toán nợ thuế của tờ khai hải quan"), 
	CUS_852("852", "Trả lời kết quả đối chiếu nộp lệ phí hải quan"), 
	CUS_853("853", "Trả lời kết quả đối chiếu nộp thuế, phí, lệ phí của Bộ, Ngành"), 
	CUS_854("854", "Trả lời kết quả đối chiếu bảo lãnh nộp thuế cho tờ khai Hải quan"), 
	CUS_855("855", "Trả lời kết quả đối chiếu bảo lãnh chung"), 
	CUS_856("856", "Trả lời kết quả đối chiếu bảo lãnh cho hoá đơn vận đơn"),
	CUS_857("857", "Trả lời kết quả đối chiếu danh sách các yêu cầu được gửi từ Cổng thanh toán điện tử hải quan đối với giao dịch thanh toán thuế"),
	CUS_858("858", "Trả lời kết quả đối chiếu danh sách các yêu cầu được gửi từ Cổng thanh toán điện tử hải quan đối với giao dịch thanh toán lệ phí bộ ngành"),
	CUS_859("859", "Trả lời kết quả đối chiếu các giao dịch thanh toán phí hạ tầng online 24/7"),
	CUS_860("860", "Trả lời kết quả đối chiếu các giao dịch thanh toán phí hạ tầng tại quầy"),
	CUS_90X("", ""),
	CUS_900("900", "Thông điệp hỏi kết quả đối chiếu giao dịch huỷ thanh toán, bảo lãnh"),
	CUS_901("901", "Thông điệp đối chiếu các giao dịch huỷ thanh toán thuế đối với tờ khai hải quan"), 
	CUS_902("902", "Thông điệp đối chiếu các giao dịch huỷ thanh toán lệ phí đối với tờ khai hải quan"), 
	CUS_903("903", "Thông điệp đối chiếu các giao dịch huỷ thanh toán thuế, phí, lệ phí của các cơ quan quản lý thu"), 
	CUS_904("904", "Thông điệp đối chiếu các giao dịch huỷ bảo lãnh cho tờ khai hải quan"), 
	CUS_905("905", "Thông điệp đối chiếu các giao dịch huỷ bảo lãnh chung"), 
	CUS_906("906", "Thông điệp đối chiếu các giao dịch huỷ bảo lãnh cho hoá đơn vận đơn"),
	CUS_95X("95X", ""),
	CUS_951("951", "Thông điệp trả lời kết quả đối chiếu các giao dịch huỷ thanh toán thuế đối với tờ khai hải quan"), 
	CUS_952("952", "Thông điệp trả lời kết quả đối chiếu các giao dịch huỷ thanh toán lệ phí đối với tờ khai hải quan"), 
	CUS_953("953", "Thông điệp trả lời kết quả đối chiếu các giao dịch huỷ thanh toán thuế, phí, lệ phí của các cơ quan quản lý thu"), 
	CUS_954("954", "Thông điệp trả lời kết quả đối chiếu các giao dịch huỷ bảo lãnh cho tờ khai hải quan"), 
	CUS_955("955", "Thông điệp trả lời kết quả đối chiếu các giao dịch huỷ bảo lãnh chung"), 
	CUS_956("956", "Thông điệp trả lời kết quả đối chiếu các giao dịch huỷ bảo lãnh cho hoá đơn vận đơn"),
	CUS_RESPONSE("CUS_RESPONSE", "CUS Response without Data"),
	CUS_200B("200", "Thông điệp phản hồi thành công"),
	CUS_299B("299", "Thông điệp phản hồi không thành công"),
	CUS_110("110", "Thông điệp NHTM gửi TCHQ tra cứu về số phí hạ tầng phải nộp"),
	CUS_320("320", "Thông điệp UBND gửi TCHQ thông báo số phí hạ tầng phải nộp"),
	CUS_321("321", "Thông điệp NHTM gửi TCHQ nộp phí hạ tầng cho NNP"),
	CUS_322("322", "Thông điệp TCHQ gửi NHTM thông báo đề nghị trích tài khoản để nộp phí hạ tầng của NNP"),;
	
	CUSMessage(String code, String name) {
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

	public void setCode(String code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static CUSMessage getCUSMessage(String type) {
		for(CUSMessage v : values()){
	        if( v.getCode().equals(type)){
	            return v;
	        }
	    }
		return null;
	}
}