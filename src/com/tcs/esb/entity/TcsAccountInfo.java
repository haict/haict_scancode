/**
 * TcsAccountInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tcs.esb.entity;

import java.util.List;

public class TcsAccountInfo  implements java.io.Serializable {
    
	private String acBal;
	private String acCurBal;
    private String acBranch;
    private String acNo;
	private String acDes;
    private String acCcy;
    private String acNum;
    private String cusAddress;
    private String cusName;
    private String t24Cif;
    private String taxCode;
    
    private String tien_lai;
	private String ngay_tinh_lai;
	private String totalAmount;
	private String number_day;
	private String rate;
	
	private String du_dau;
	private String du_cuoi;
	private String ps_thu;
	private String ps_chi;
	private String han_muc;

	private List<TransactionInfo> lsTransaction;
    public TcsAccountInfo() {
    }

    public String getAcBal() {
		return acBal;
	}

	public void setAcBal(String acBal) {
		this.acBal = acBal;
	}

	public String getAcCurBal() {
		return acCurBal;
	}

	public void setAcCurBal(String acCurBal) {
		this.acCurBal = acCurBal;
	}

	public String getAcBranch() {
		return acBranch;
	}

	public void setAcBranch(String acBranch) {
		this.acBranch = acBranch;
	}

	public String getAcNo() {
		return acNo;
	}

	public void setAcNo(String acNo) {
		this.acNo = acNo;
	}

	public String getAcDes() {
		return acDes;
	}

	public void setAcDes(String acDes) {
		this.acDes = acDes;
	}

	public String getAcCcy() {
		return acCcy;
	}

	public void setAcCcy(String acCcy) {
		this.acCcy = acCcy;
	}

	public String getAcNum() {
		return acNum;
	}

	public void setAcNum(String acNum) {
		this.acNum = acNum;
	}

	public String getCusAddress() {
		return cusAddress;
	}

	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getT24Cif() {
		return t24Cif;
	}

	public void setT24Cif(String t24Cif) {
		this.t24Cif = t24Cif;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public Object get__equalsCalc() {
		return __equalsCalc;
	}

	public void set__equalsCalc(Object __equalsCalc) {
		this.__equalsCalc = __equalsCalc;
	}

	public boolean is__hashCodeCalc() {
		return __hashCodeCalc;
	}

	public void set__hashCodeCalc(boolean __hashCodeCalc) {
		this.__hashCodeCalc = __hashCodeCalc;
	}

	public static void setTypeDesc(org.apache.axis.description.TypeDesc typeDesc) {
		TcsAccountInfo.typeDesc = typeDesc;
	}
	

	public String getNgay_tinh_lai() {
		return ngay_tinh_lai;
	}

	public void setNgay_tinh_lai(String ngay_tinh_lai) {
		this.ngay_tinh_lai = ngay_tinh_lai;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getNumber_day() {
		return number_day;
	}

	public void setNumber_day(String number_day) {
		this.number_day = number_day;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}
	
	public String getTien_lai() {
		return tien_lai;
	}

	public void setTien_lai(String tien_lai) {
		this.tien_lai = tien_lai;
	}

	public String getDu_dau() {
		return du_dau;
	}

	public void setDu_dau(String du_dau) {
		this.du_dau = du_dau;
	}

	public String getDu_cuoi() {
		return du_cuoi;
	}

	public void setDu_cuoi(String du_cuoi) {
		this.du_cuoi = du_cuoi;
	}

	public String getPs_thu() {
		return ps_thu;
	}

	public void setPs_thu(String ps_thu) {
		this.ps_thu = ps_thu;
	}

	public String getPs_chi() {
		return ps_chi;
	}

	public void setPs_chi(String ps_chi) {
		this.ps_chi = ps_chi;
	}

	public List<TransactionInfo> getLsTransaction() {
		return lsTransaction;
	}

	public void setLsTransaction(List<TransactionInfo> lsTransaction) {
		this.lsTransaction = lsTransaction;
	}
	

	public String getHan_muc() {
		return han_muc;
	}

	public void setHan_muc(String han_muc) {
		this.han_muc = han_muc;
	}

	public TcsAccountInfo(
           String acBal,
           String acBranch,
           String acCcy,
           String acNum,
           String cusAddress,
           String cusName,
           String t24Cif,
           String taxCode) {
           this.acBal = acBal;
           this.acBranch = acBranch;
           this.acCcy = acCcy;
           this.acNum = acNum;
           this.cusAddress = cusAddress;
           this.cusName = cusName;
           this.t24Cif = t24Cif;
           this.taxCode = taxCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TcsAccountInfo)) return false;
        TcsAccountInfo other = (TcsAccountInfo) obj;
        if (obj == null){return false;}
        if (this == obj){return true;}
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acBal==null && other.getAcBal()==null) || 
             (this.acBal!=null &&
              this.acBal.equals(other.getAcBal()))) &&
            ((this.acBranch==null && other.getAcBranch()==null) || 
             (this.acBranch!=null &&
              this.acBranch.equals(other.getAcBranch()))) &&
            ((this.acCcy==null && other.getAcCcy()==null) || 
             (this.acCcy!=null &&
              this.acCcy.equals(other.getAcCcy()))) &&
            ((this.acNum==null && other.getAcNum()==null) || 
             (this.acNum!=null &&
              this.acNum.equals(other.getAcNum()))) &&
            ((this.cusAddress==null && other.getCusAddress()==null) || 
             (this.cusAddress!=null &&
              this.cusAddress.equals(other.getCusAddress()))) &&
            ((this.cusName==null && other.getCusName()==null) || 
             (this.cusName!=null &&
              this.cusName.equals(other.getCusName()))) &&
            ((this.t24Cif==null && other.getT24Cif()==null) || 
             (this.t24Cif!=null &&
              this.t24Cif.equals(other.getT24Cif()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAcBal() != null) {
            _hashCode += getAcBal().hashCode();
        }
        if (getAcBranch() != null) {
            _hashCode += getAcBranch().hashCode();
        }
        if (getAcCcy() != null) {
            _hashCode += getAcCcy().hashCode();
        }
        if (getAcNum() != null) {
            _hashCode += getAcNum().hashCode();
        }
        if (getCusAddress() != null) {
            _hashCode += getCusAddress().hashCode();
        }
        if (getCusName() != null) {
            _hashCode += getCusName().hashCode();
        }
        if (getT24Cif() != null) {
            _hashCode += getT24Cif().hashCode();
        }
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TcsAccountInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CBIGW", "tcsAccountInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acBal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CBIGW", "acBal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acBranch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CBIGW", "acBranch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acCcy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CBIGW", "acCcy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CBIGW", "acNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cusAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CBIGW", "cusAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cusName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CBIGW", "cusName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("t24Cif");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CBIGW", "t24cif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CBIGW", "taxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType, 
           Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType, 
           Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }
}