
package com.fmt.utils.HQ.signer;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMValidateContext;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.cmn.Constants;

public class XMLSignatureVerifier extends SignatureVerifier{
    private XMLViewEntity lstxmlview;
    private Collection cltxmlv;
  
    public void verifyXMLSignature(BigInteger[] certSerialNumber, byte[] fileData) throws Exception {
        // Instantiate the document to be validated
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
		dbf.setAttribute("http://javax.xml.XMLConstants/property/accessExternalSchema", "");
		dbf.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
        dbf.setNamespaceAware(true);
        Document doc = dbf.newDocumentBuilder().parse(new ByteArrayInputStream(fileData));
        // Find Signature element
        NodeList nl = doc.getElementsByTagNameNS(XMLSignature.XMLNS, "Signature");
        if (nl.getLength() == 0) {
            throw new Exception("Hồ sơ không có chữ ký điện tử");
        }
        // Create a DOM XMLSignatureFactory that will be used to unmarshal the
        // document containing the XMLSignature
        XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");
        // Create a DOMValidateContext and specify a KeyValue KeySelector
        // and document context
        for (int i = 0; i < nl.getLength(); i++) {
            KeyInfoKeySelector keySelector = new KeyInfoKeySelector();
            DOMValidateContext valContext = new DOMValidateContext(keySelector, nl.item(i));
            // unmarshal the XMLSignature
            XMLSignature signature = fac.unmarshalXMLSignature(valContext);
            // Validate the XMLSignature (generated above)
            boolean coreValidity = signature.validate(valContext);
            // Check core validation status
            if (!coreValidity) {
            	throw new Exception("Chữ ký điện tử không đúng");
            }
            try
            {
            	verifyCertificationChain(Calendar.getInstance().getTime(), certSerialNumber, keySelector.getCertChain());
            	break;
            } catch(Exception e){
                if(nl.getLength()==1||(i==nl.getLength()-1)){
                	throw e;
                }
             }
        }
    }
  
  public Collection viewInforXML(byte[] fileData) throws Exception {
    // Instantiate the document to be validated
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    dbf.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
	dbf.setAttribute("http://javax.xml.XMLConstants/property/accessExternalSchema", "");
	dbf.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
    dbf.setNamespaceAware(true);
    Document doc = dbf.newDocumentBuilder().parse(new ByteArrayInputStream(fileData));
    // Find Signature element
    NodeList nl = doc.getElementsByTagNameNS(XMLSignature.XMLNS, "Signature");
    if (nl.getLength() == 0) {
      cltxmlv = new ArrayList();
      return cltxmlv;
    }
    // Create a DOM XMLSignatureFactory that will be used to unmarshal the
    // document containing the XMLSignature
    XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");
    // Create a DOMValidateContext and specify a KeyValue KeySelector
    // and document context
    String SubjectName = "";
    String SubjectN ="";
    String dateTimeSub="";
    int indexofbg =0;
    int indexofend =0;
    int indexofbg2 =0;
    int indexofend2 =0;
    //String ngay_htai = IHTKKUtils.convertDateToString(Calendar.getInstance(),"DD/MM/YYYY");
    for(int i=0;i<nl.getLength();i++){
        lstxmlview = new XMLViewEntity();
        Element element = (Element) nl.item(i);
        NodeList name = element.getElementsByTagName("X509SubjectName");
        Element line = (Element) name.item(0);
        
        KeyInfoKeySelector keySelector = new KeyInfoKeySelector();
        DOMValidateContext valContext = new DOMValidateContext(keySelector, nl.item(i));          
        // unmarshal the XMLSignature
        XMLSignature signature = fac.unmarshalXMLSignature(valContext);           
        // Validate the XMLSignature (generated above)
        boolean coreValidity = signature.validate(valContext);         
        // Check core validation status
        if(!coreValidity) {
            lstxmlview.setSignVerifier("0");
        }else{
            lstxmlview.setSignVerifier("1");
        }   
        //verifyCertificationChain(Calendar.getInstance().getTime(), certSerialNumber, keySelector.getCertChain());
        SubjectName = line.getFirstChild().getNodeValue();
        indexofend = SubjectName.length();
        indexofend2 = SubjectName.length();
        indexofbg = SubjectName.indexOf("CN=");
        SubjectN = SubjectName.substring(indexofbg, indexofend);
        indexofend = SubjectN.indexOf(",");
        SubjectN = SubjectN.substring(3, indexofend);
        
        indexofbg2 = SubjectName.indexOf("|TGKY=");
        if(indexofbg2 != -1){
            dateTimeSub = SubjectName.substring(indexofbg2, indexofend2);
            dateTimeSub = dateTimeSub.substring(6);
          }
        
        lstxmlview.setNgay_ky(dateTimeSub);
        lstxmlview.setSubjectName(SubjectN);        
        cltxmlv.add(lstxmlview);
        dateTimeSub="";
    }
    return cltxmlv;
  }




  public XMLSignatureVerifier() {
          //lstxmlview = new XMLViewEntity();
          this.cltxmlv = new ArrayList();
      }
    public void setCltxmlv(Collection cltxmlv) {
        this.cltxmlv = cltxmlv;
    }

    public Collection getCltxmlv() {
        return cltxmlv;
    }

    public void setLstxmlview(XMLViewEntity lstxmlview) {
        this.lstxmlview = lstxmlview;
    }

    public XMLViewEntity getLstxmlview() {
        return lstxmlview;
    }
    
    
}
