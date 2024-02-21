package com.cmn.entity.cus;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

//import  com.sun.org.apache.xml.internal.security.signature.SignedInfo;

public class Signature {
	@XStreamAlias("SignedInfo")
	private SignedInfo signedInfo = new SignedInfo();
	@XStreamAlias("SignatureValue")
	private SignatureValue signatureValue = new SignatureValue();
	@XStreamAlias("KeyInfo")
	private KeyInfo keyInfo = new KeyInfo();	

	public SignedInfo getSignedInfo() {
		return signedInfo;
	}
	public void setSignedInfo(SignedInfo signedInfo) {
		this.signedInfo = signedInfo;
	}
	public SignatureValue getSignatureValue() {
		return signatureValue;
	}
	public void setSignatureValue(SignatureValue signatureValue) {
		this.signatureValue = signatureValue;
	}
	public KeyInfo getKeyInfo() {
		return keyInfo;
	}
	public void setKeyInfo(KeyInfo keyInfo) {
		this.keyInfo = keyInfo;
	}
	public static class SignedInfo {
		@XStreamAlias("CanonicalizationMethod")
		private CanonicalizationMethod canonicalizationMethod = new CanonicalizationMethod();
		@XStreamAlias("SignatureMethod")
		private SignatureMethod signatureMethod = new SignatureMethod();
		@XStreamAlias("Reference")
		private Reference reference = new Reference();
		public CanonicalizationMethod getCanonicalizationMethod() {
			return canonicalizationMethod;
		}
		public void setCanonicalizationMethod(
				CanonicalizationMethod canonicalizationMethod) {
			this.canonicalizationMethod = canonicalizationMethod;
		}
		public SignatureMethod getSignatureMethod() {
			return signatureMethod;
		}
		public void setSignatureMethod(SignatureMethod signatureMethod) {
			this.signatureMethod = signatureMethod;
		}
		public Reference getReference() {
			return reference;
		}
		public void setReference(Reference reference) {
			this.reference = reference;
		}		
		
	}

	public static class SignatureValue {}

	public static class KeyInfo {
		@XStreamAlias("KeyValue")
		private KeyValue keyValue = new KeyValue();
		@XStreamAlias("X509Data")
		private X509Data x509Data = new X509Data();
		public KeyValue getKeyValue() {
			return keyValue;
		}
		public void setKeyValue(KeyValue keyValue) {
			this.keyValue = keyValue;
		}
		public X509Data getX509Data() {
			return x509Data;
		}
		public void setX509Data(X509Data x509Data) {
			this.x509Data = x509Data;
		}
		
	}
	
	public static class CanonicalizationMethod {}
	
	public static class SignatureMethod {}
	
	public static class Reference {
		@XStreamAlias("Transforms")
		private Transforms transforms = new Transforms();
		@XStreamAlias("DigestMethod")
		private DigestMethod digestMethod = new DigestMethod();
		@XStreamAlias("DigestValue")
		private DigestValue digestValue = new DigestValue();
		
		public Transforms getTransforms() {
			return transforms;
		}
		public void setTransforms(Transforms transforms) {
			this.transforms = transforms;
		}
		public DigestMethod getDigestMethod() {
			return digestMethod;
		}
		public void setDigestMethod(DigestMethod digestMethod) {
			this.digestMethod = digestMethod;
		}
		public DigestValue getDigestValue() {
			return digestValue;
		}
		public void setDigestValue(DigestValue digestValue) {
			this.digestValue = digestValue;
		}
		
	}
	public static class KeyValue{
		@XStreamAlias("RSAKeyValue")
		private RSAKeyValue rSAKeyValue = new RSAKeyValue();

		public RSAKeyValue getrSAKeyValue() {
			return rSAKeyValue;
		}

		public void setrSAKeyValue(RSAKeyValue rSAKeyValue) {
			this.rSAKeyValue = rSAKeyValue;
		}
		
	}
	public static class X509Data{
		@XStreamAlias("X509SubjectName")
		private X509SubjectName x509SubjectName = new X509SubjectName();
		@XStreamAlias("X509Certificate")
		private X509Certificate x509Certificate = new X509Certificate();
		
		public X509SubjectName getX509SubjectName() {
			return x509SubjectName;
		}
		public void setX509SubjectName(X509SubjectName x509SubjectName) {
			this.x509SubjectName = x509SubjectName;
		}
		public X509Certificate getX509Certificate() {
			return x509Certificate;
		}
		public void setX509Certificate(X509Certificate x509Certificate) {
			this.x509Certificate = x509Certificate;
		}
		
	}
	public static class Transforms{
		@XStreamImplicit(itemFieldName = "Transform")
		private List<Transform> transforms = new ArrayList<Signature.Transform>();

		public List<Transform> getTransform() {
			return transforms;
		}

		public void setTransform(List<Transform> transforms) {
			this.transforms = transforms;
		}
		
	}	
	public static class DigestMethod{}
	public static class DigestValue{}
	public static class RSAKeyValue{
		@XStreamAlias("Modulus")
		private Modulus modulus = new Modulus();
		@XStreamAlias("Exponent")
		private Exponent exponent = new Exponent();
		public Modulus getModulus() {
			return modulus;
		}
		public void setModulus(Modulus modulus) {
			this.modulus = modulus;
		}
		public Exponent getExponent() {
			return exponent;
		}
		public void setExponent(Exponent exponent) {
			this.exponent = exponent;
		}
		
	}
	public static class X509SubjectName{}
	public static class X509Certificate{}
	public static class Transform{
		@XStreamAlias("XPath")
		private XPath xPath = new XPath();

		public XPath getxPath() {
			return xPath;
		}

		public void setxPath(XPath xPath) {
			this.xPath = xPath;
		}
	}
	public static class Modulus{}
	public static class Exponent{}
	public static class XPath{}
	
}
