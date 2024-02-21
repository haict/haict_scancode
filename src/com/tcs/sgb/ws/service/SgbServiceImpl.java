package com.tcs.sgb.ws.service;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
import com.tcs.sgb.ws.entity.LoginApiKBReq;
import com.tcs.sgb.ws.entity.LoginApiKBResp;
import com.tcs.sgb.ws.entity.PartNNSNNFromCitadToAccKbReq;
import com.tcs.sgb.ws.entity.PartNNSNNFromCitadToAccKbResp;
import com.tcs.sgb.ws.entity.SendMessageHqToKBNNReq;
import com.tcs.sgb.ws.entity.SendMessageHqToKBNNResp;
import com.tcs.sgb.ws.entity.UpdateStatusKBNNReq;
import com.tcs.sgb.ws.entity.UpdateStatusKBNNResp;
import com.tcs.sgb.ws.utils.SgbAdapter;
import com.tcs.sgb.ws.utils.SgbConstant;
import com.tcs.sgb.ws.utils.XMLUtils;

public class SgbServiceImpl implements SgbService {
	private static Logger logger = LogManager.getLogger(SgbService.class);

	private String user = SgbConstant.user;

	private String password = SgbConstant.password;

	@Override
	public AccInternalResp accInternal(AccInternalReq accInternalReq) throws Exception {

		AccInternalResp acctRes = null;
		try {
			logger.info("Begin accInternal");
			SgbConstant.TOKEN = loginApi();
			SgbAdapter adapter = new SgbAdapter();
			String jsonReq = XMLUtils.obj2JsonString(accInternalReq);
			String url = SgbConstant.URL_SERVER + "/" + SgbConstant.ACC_INTERNAL;
			String jsonResp = adapter.callResAPI(jsonReq, url);
			acctRes = (AccInternalResp) XMLUtils.json2Object(jsonResp, AccInternalResp.class);
		} catch (Exception e) {
			logger.error("accInternal error", e);
			throw e;
		}
		logger.info("end accInternal");
		return acctRes;
	}
	@Override
	public AutoKCDateEndResp autoKCDateEnd(AutoKCDateEndReq autoKCDateEndReq) throws Exception {
		AutoKCDateEndResp resp = null;
		try {
			logger.info("Begin autoKCDateEnd");
			SgbConstant.TOKEN = loginApi();
			SgbAdapter adapter = new SgbAdapter();
			String jsonReq = XMLUtils.obj2JsonString(autoKCDateEndReq);
			String url = SgbConstant.URL_SERVER + "/" + SgbConstant.AUTO_KC_DATE_END;
			String jsonResp = adapter.callResAPI(jsonReq, url);
			resp = (AutoKCDateEndResp) XMLUtils.json2Object(jsonResp, AutoKCDateEndResp.class);
		} catch (Exception e) {
			logger.error("autoKCDateEnd error", e);
			throw e;
		}
		logger.info("end autoKCDateEnd");
		return resp;
	}
	
	@Override
	public ErrKCDateEndResp errKCDateEnd(ErrKCDateEndReq errKCDateEndReq) throws Exception {
		ErrKCDateEndResp resp = null;
		try {
			logger.info("Begin errKCDateEnd");
			SgbConstant.TOKEN = loginApi();
			SgbAdapter adapter = new SgbAdapter();
			String jsonReq = XMLUtils.obj2JsonString(errKCDateEndReq);
			String url = SgbConstant.URL_SERVER + "/" + SgbConstant.ERR_KC_DATE_END;
			String jsonResp = adapter.callResAPI(jsonReq, url);
			resp = (ErrKCDateEndResp) XMLUtils.json2Object(jsonResp, ErrKCDateEndResp.class);
		} catch (Exception e) {
			logger.error("errKCDateEnd error", e);
			throw e;
		}
		logger.info("end errKCDateEnd");
		return resp;
	}
	@Override
	public AutoSaveAccKBResp autoSaveAccKB(AutoSaveAccKBReq autoSaveAccKBReq) throws Exception {
		AutoSaveAccKBResp resp = null;
		try {
			logger.info("Begin autoSaveAccKB ");
			SgbConstant.TOKEN = loginApi();
			SgbAdapter adapter = new SgbAdapter();
			String jsonReq = XMLUtils.obj2JsonString(autoSaveAccKBReq);
			String url = SgbConstant.URL_SERVER + "/" + SgbConstant.AUTO_SAVE_ACC_KB;
			String jsonResp = adapter.callResAPI(jsonReq, url);
			resp = (AutoSaveAccKBResp) XMLUtils.json2Object(jsonResp, AutoSaveAccKBResp.class);
		} catch (Exception e) {
			logger.error("autoSaveAccKB error", e);
			throw e;
		}
		logger.info("end autoSaveAccKB");
		return resp;
	}
	@Override
	public AmountBalOnlineResp amountBalOnlineResp(AmountBalOnlineReq amountBalOnlineReq) throws Exception {
		AmountBalOnlineResp resp = null;
		try {
			logger.info("Begin amountBalOnlineResp");
			SgbConstant.TOKEN = loginApi();
			SgbAdapter adapter = new SgbAdapter();
			String jsonReq = XMLUtils.obj2JsonString(amountBalOnlineReq);
			String url = SgbConstant.URL_SERVER + "/" + SgbConstant.AMOUNT_BAL_ONLINE;
			String jsonResp = adapter.callResAPI(jsonReq, url);
			resp = (AmountBalOnlineResp) XMLUtils.json2Object(jsonResp, AmountBalOnlineResp.class);
		} catch (Exception e) {
			logger.error("amountBalOnlineResp error", e);
			throw e;
		}
		logger.info("end amountBalOnlineResp");
		return resp;
	}
	@Override
	public AmountBalInterestResp amountBalInterestResp(AmountBalInterestReq amountBalInterestReq) throws Exception {
		AmountBalInterestResp resp = null;
		try {
			logger.info("Begin amountBalInterestResp");			
			SgbConstant.TOKEN = loginApi();
			SgbAdapter adapter = new SgbAdapter();
			String jsonReq = XMLUtils.obj2JsonString(amountBalInterestReq);
			String url = SgbConstant.URL_SERVER + "/" + SgbConstant.AMOUNT_BAL_INTEREST;
			String jsonResp = adapter.callResAPI(jsonReq, url);
			resp = (AmountBalInterestResp) XMLUtils.json2Object(jsonResp, AmountBalInterestResp.class);
		} catch (Exception e) {
			logger.error("amountBalInterestResp error", e);
			throw e;
		}
		logger.info("end amountBalInterestResp");
		return resp;
	}
	@Override
	public AmountCollectDirectResp amountCollectDirectResp(AmountCollectDirectReq amountCollectDirectReq)
			throws Exception {
		AmountCollectDirectResp resp = null;
		try {
			logger.info("begin amountCollectDirectResp");
			SgbConstant.TOKEN = loginApi();
			SgbAdapter adapter = new SgbAdapter();
			String jsonReq = XMLUtils.obj2JsonString(amountCollectDirectReq);
			String url = SgbConstant.URL_SERVER + "/" + SgbConstant.AMOUNT_COLLECT_DIRECT;
			String jsonResp = adapter.callResAPI(jsonReq, url);
			resp = (AmountCollectDirectResp) XMLUtils.json2Object(jsonResp, AmountCollectDirectResp.class);
		} catch (Exception e) {
			logger.error("amountCollectDirectResp error", e);
			throw e;
		}
		logger.info("end amountCollectDirectResp");
		return resp;
	}
	@Override
	public AccInternalWithTaxResp accInternalWithTaxResp(AccInternalWithTaxReq accInternalWithTaxReq) throws Exception {
		logger.info("begin accInternalWithTaxResp");
		AccInternalWithTaxResp resp = null;
		try {
			SgbConstant.TOKEN = loginApi();
			SgbAdapter adapter = new SgbAdapter();
			String jsonReq = XMLUtils.obj2JsonString(accInternalWithTaxReq);
			String url = SgbConstant.URL_SERVER + "/" + SgbConstant.ACC_INTERNAL_WITH_TAX;
			String jsonResp = adapter.callResAPI(jsonReq, url);
			resp = (AccInternalWithTaxResp) XMLUtils.json2Object(jsonResp, AccInternalWithTaxResp.class);
		} catch (Exception e) {
			logger.error("accInternalWithTaxResp error", e);
			throw e;
		}
		logger.info("end accInternalWithTaxResp");
		return resp;
	}
	@Override
	public SendMessageHqToKBNNResp sendMessageHqToKBNNResp(SendMessageHqToKBNNReq sendMessageHqToKBNNReq)
			throws Exception {
		SendMessageHqToKBNNResp resp = null;
		try {
			logger.info("Begin sendMessageHqToKBNNResp");
			SgbConstant.TOKEN = loginApi();
			SgbAdapter adapter = new SgbAdapter();
			String jsonReq = XMLUtils.obj2JsonString(sendMessageHqToKBNNReq);
			String url = SgbConstant.URL_SERVER + "/" + SgbConstant.SEND_MESSAGE_HQ_TO_KBNN;
			String jsonResp = adapter.callResAPI(jsonReq, url);
			resp = (SendMessageHqToKBNNResp) XMLUtils.json2Object(jsonResp, SendMessageHqToKBNNResp.class);
		} catch (Exception e) {
			logger.error("sendMessageHqToKBNNResp error", e);
			throw e;
		}
		logger.info("end sendMessageHqToKBNNResp");
		return resp;
	}
	@Override
	public PartNNSNNFromCitadToAccKbResp partNNSNNFromCitadToAccKbResp(
			PartNNSNNFromCitadToAccKbReq partNNSNNFromCitadToAccKbReq) throws Exception {
		PartNNSNNFromCitadToAccKbResp resp = null;
		try {
			logger.info("begin partNNSNNFromCitadToAccKbResp");
			SgbConstant.TOKEN = loginApi();
			SgbAdapter adapter = new SgbAdapter();
			String jsonReq = XMLUtils.obj2JsonString(partNNSNNFromCitadToAccKbReq);
			String url = SgbConstant.URL_SERVER + "/" + SgbConstant.PART_NNSNN_FROM_CITAD_TO_ACC_KB;
			String jsonResp = adapter.callResAPI(jsonReq, url);
			resp = (PartNNSNNFromCitadToAccKbResp) XMLUtils.json2Object(jsonResp,
					PartNNSNNFromCitadToAccKbResp.class);
		} catch (Exception e) {
			logger.error("partNNSNNFromCitadToAccKbResp error", e);
			throw e;
		}
		logger.info("end partNNSNNFromCitadToAccKbResp");
		return resp;
	}
	@Override
	public UpdateStatusKBNNResp updateStatusKBNN(UpdateStatusKBNNReq updateStatusKBNNReq)
			throws Exception {
		UpdateStatusKBNNResp resp = null;
		try {
			logger.info("begin updateStatusKBNN");	
			SgbConstant.TOKEN = loginApi();
			SgbAdapter adapter = new SgbAdapter();
			String jsonReq = XMLUtils.obj2JsonString(updateStatusKBNNReq);
			String url = SgbConstant.URL_SERVER + "/" + SgbConstant.UPDATE_STATUS_KBNN;
			String jsonResp = adapter.callResAPI(jsonReq, url);
			resp = (UpdateStatusKBNNResp) XMLUtils.json2Object(jsonResp,
					UpdateStatusKBNNResp.class);
		} catch (Exception e) {
			logger.error("updateStatusKBNN error", e);
			throw e;
		}
		logger.info("end updateStatusKBNN");
		return resp;
	}
	private String loginApi () throws Exception {
		long timeCurrent = new Date().getTime();
		if ((timeCurrent - SgbConstant.TOKEN_TIME_ACTIVE > TimeUnit.MINUTES.toMillis(SgbConstant.TOKEN_TIME_ALLOW)) || StringUtils.isBlank(SgbConstant.TOKEN)) {
			SgbAdapter sgb = new SgbAdapter();
			String jsonLoginReq = null;
			String jsonLoginRes = null;
			LoginApiKBResp loginRes = null;
			// Call API login lay token
			LoginApiKBReq loginReq = new LoginApiKBReq();
			loginReq.setName(user);
			loginReq.setPassword(password);
			jsonLoginReq = XMLUtils.obj2JsonString(loginReq);
			jsonLoginRes = sgb.callAPILogin(jsonLoginReq, SgbConstant.URL_SERVER + "/" + SgbConstant.LOGIN_API_KB);
			loginRes = (LoginApiKBResp) XMLUtils.json2Object(jsonLoginRes, LoginApiKBResp.class);

			SgbConstant.TOKEN = loginRes.getToken();			
		}
		return SgbConstant.TOKEN;
	}
}
