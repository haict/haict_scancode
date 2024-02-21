package com.cmn.sec;

import java.io.IOException;
import com.fmt.utils.HQ.signer.HQConstant;

public class SignParameter {
	private String privateKeyPath;
	private char[] privateKeyPassword;
	private String tagPath;
	private String tagSign;
	private boolean initSignedInfo;
	private boolean initCanonicalizationMethod;
	private boolean initSignatureMethod;
	private boolean initReference;
	private boolean initTransforms;
	private boolean initDigestMethod;
	private boolean initDigestValue;
	private boolean initSignatureValue;
	private boolean initKeyInfo;
	private boolean initKeyValue;
	private boolean initX509Data;
	private boolean initX509IssuerSerial;
	private boolean initX509Certificate;
	
	public SignParameter(String configFilePath,String type) throws IOException {
		initConfigParameter(configFilePath, type);
	}
	
	private void initConfigParameter(String configFilePath, String type) throws IOException {
		privateKeyPath = HQConstant.PATH_PFX;
		privateKeyPassword = HQConstant.PASSWORD_PFX.toCharArray();
		
		if("247".equals(type)){
			tagPath = HQConstant.TAG_XPATH_247;
			tagSign = HQConstant.BANK_TAGSIGN_247;
		}else{
			tagPath = HQConstant.GIP_XPATH;
			tagSign = HQConstant.BANK_TAGSIGN;
		}
		
		System.out.println("tagPath:"+tagPath);
		System.out.println("tagSign:"+tagSign);
		
		initSignedInfo = true;
		initCanonicalizationMethod = true;
		initSignatureMethod = true;
		initReference = true;
		initTransforms = true;
		initDigestMethod = true;
		initDigestValue = true;
		initSignatureValue = true;
		initKeyInfo = true;
		initKeyValue = true;
		initX509Data = true;
		initX509IssuerSerial = true;
		initX509Certificate = true;
	}

	public String getPrivateKeyPath() {
		return privateKeyPath;
	}

	public void setPrivateKeyPath(String privateKeyPath) {
		this.privateKeyPath = privateKeyPath;
	}

	public char[] getPrivateKeyPassword() {
		return privateKeyPassword;
	}

	public void setPrivateKeyPassword(char[] privateKeyPassword) {
		this.privateKeyPassword = privateKeyPassword;
	}

	public String getTagPath() {
		return tagPath;
	}

	public void setTagPath(String tagPath) {
		this.tagPath = tagPath;
	}

	public String getTagSign() {
		return tagSign;
	}

	public void setTagSign(String tagSign) {
		this.tagSign = tagSign;
	}

	public boolean isInitSignedInfo() {
		return initSignedInfo;
	}

	public void setInitSignedInfo(boolean initSignedInfo) {
		this.initSignedInfo = initSignedInfo;
	}

	public boolean isInitCanonicalizationMethod() {
		return initCanonicalizationMethod;
	}

	public void setInitCanonicalizationMethod(boolean initCanonicalizationMethod) {
		this.initCanonicalizationMethod = initCanonicalizationMethod;
	}

	public boolean isInitSignatureMethod() {
		return initSignatureMethod;
	}

	public void setInitSignatureMethod(boolean initSignatureMethod) {
		this.initSignatureMethod = initSignatureMethod;
	}

	public boolean isInitReference() {
		return initReference;
	}

	public void setInitReference(boolean initReference) {
		this.initReference = initReference;
	}

	public boolean isInitTransforms() {
		return initTransforms;
	}

	public void setInitTransforms(boolean initTransforms) {
		this.initTransforms = initTransforms;
	}

	public boolean isInitDigestMethod() {
		return initDigestMethod;
	}

	public void setInitDigestMethod(boolean initDigestMethod) {
		this.initDigestMethod = initDigestMethod;
	}

	public boolean isInitDigestValue() {
		return initDigestValue;
	}

	public void setInitDigestValue(boolean initDigestValue) {
		this.initDigestValue = initDigestValue;
	}

	public boolean isInitSignatureValue() {
		return initSignatureValue;
	}

	public void setInitSignatureValue(boolean initSignatureValue) {
		this.initSignatureValue = initSignatureValue;
	}

	public boolean isInitKeyInfo() {
		return initKeyInfo;
	}

	public void setInitKeyInfo(boolean initKeyInfo) {
		this.initKeyInfo = initKeyInfo;
	}

	public boolean isInitKeyValue() {
		return initKeyValue;
	}

	public void setInitKeyValue(boolean initKeyValue) {
		this.initKeyValue = initKeyValue;
	}

	public boolean isInitX509Data() {
		return initX509Data;
	}

	public void setInitX509Data(boolean initX509Data) {
		this.initX509Data = initX509Data;
	}

	public boolean isInitX509IssuerSerial() {
		return initX509IssuerSerial;
	}

	public void setInitX509IssuerSerial(boolean initX509IssuerSerial) {
		this.initX509IssuerSerial = initX509IssuerSerial;
	}

	public boolean isInitX509Certificate() {
		return initX509Certificate;
	}

	public void setInitX509Certificate(boolean initX509Certificate) {
		this.initX509Certificate = initX509Certificate;
	}
		
}
