package com.tcs.sgb.ws.service;

import com.tcs.sgb.ws.entity.AccInternalReq;
import com.tcs.sgb.ws.entity.AccInternalResp;
import com.tcs.sgb.ws.entity.AccInternalWithTaxReq;
import com.tcs.sgb.ws.entity.AccInternalWithTaxResp;
import com.tcs.sgb.ws.entity.AmountBalInterestReq;
import com.tcs.sgb.ws.entity.AmountBalInterestResp;
import com.tcs.sgb.ws.entity.AmountBalOnlineReq;
import com.tcs.sgb.ws.entity.AmountBalOnlineResp;
import com.tcs.sgb.ws.entity.AmountCollectDirectReq;
import com.tcs.sgb.ws.entity.AmountCollectDirectResp;
import com.tcs.sgb.ws.entity.AutoKCDateEndReq;
import com.tcs.sgb.ws.entity.AutoKCDateEndResp;
import com.tcs.sgb.ws.entity.AutoSaveAccKBReq;
import com.tcs.sgb.ws.entity.AutoSaveAccKBResp;
import com.tcs.sgb.ws.entity.ErrKCDateEndReq;
import com.tcs.sgb.ws.entity.ErrKCDateEndResp;
import com.tcs.sgb.ws.entity.PartNNSNNFromCitadToAccKbReq;
import com.tcs.sgb.ws.entity.PartNNSNNFromCitadToAccKbResp;
import com.tcs.sgb.ws.entity.SendMessageHqToKBNNReq;
import com.tcs.sgb.ws.entity.SendMessageHqToKBNNResp;
import com.tcs.sgb.ws.entity.UpdateStatusKBNNReq;
import com.tcs.sgb.ws.entity.UpdateStatusKBNNResp;

public interface SgbService {
	// 3. Login API
	//LoginApiKBResp loginApiKBResp(LoginApiKBReq loginApiKBReq, HttpSession session);

	// 4. API hạch toán tài khoản nội bộ SAIGONBANK
	AccInternalResp accInternal(AccInternalReq accInternalReq) throws Exception;

	// 5.1 API tự động kết chuyển cuối ngày với KBNN
	AutoKCDateEndResp autoKCDateEnd(AutoKCDateEndReq autoKCDateEndReq) throws Exception;
	
	// 5.2 API xu ly loi kết chuyển cuối ngày với KBNN
	ErrKCDateEndResp errKCDateEnd(ErrKCDateEndReq errKCDateEndReq) throws Exception;

	// 6. API tự động sao kê tài khoản KBNN tại SGB
	AutoSaveAccKBResp autoSaveAccKB(AutoSaveAccKBReq autoSaveAccKBReq) throws Exception;

	// 7. API truy vấn số dư online
	AmountBalOnlineResp amountBalOnlineResp(AmountBalOnlineReq amountBalOnlineReq) throws Exception;

	// 8. API tạo bảng kê tính lãi với KBNN
	AmountBalInterestResp amountBalInterestResp(AmountBalInterestReq amountBalInterestReq) throws Exception;

	// 9. API thu biên lai thu tại quầy nộp NSNN
	AmountCollectDirectResp amountCollectDirectResp(AmountCollectDirectReq amountCollectDirectReq) throws Exception;

	// 10. API hạch toán tài khoản nội bộ SAIGONBANK với lệnh nộp thuế
	AccInternalWithTaxResp accInternalWithTaxResp(AccInternalWithTaxReq accInternalWithTaxReq) throws Exception;

	// 11. API đẩy lệnh đi kho bạc với các món nộp Hải quan SGB
	SendMessageHqToKBNNResp sendMessageHqToKBNNResp(SendMessageHqToKBNNReq sendMessageHqToKBNNReq) throws Exception;

	// 12. API các món NNSNN từ Citad về tài khoản kho bạc tại SGB
	PartNNSNNFromCitadToAccKbResp partNNSNNFromCitadToAccKbResp(
			PartNNSNNFromCitadToAccKbReq partNNSNNFromCitadToAccKbReq) throws Exception;
	// 13. API cap nhat trang thai gui kb cho t24
	UpdateStatusKBNNResp updateStatusKBNN(UpdateStatusKBNNReq updateStatusKBNNReq) throws Exception;
}
