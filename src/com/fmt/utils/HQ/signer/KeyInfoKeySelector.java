
package com.fmt.utils.HQ.signer;
import java.security.Key;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;

import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.AlgorithmMethod;
import javax.xml.crypto.KeySelector;
import javax.xml.crypto.KeySelectorException;
import javax.xml.crypto.KeySelectorResult;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.X509Data;


public class KeyInfoKeySelector extends KeySelector implements KeySelectorResult {
    private X509Certificate certificate;
    private X509Certificate[] certChain;
    
    public KeySelectorResult select(KeyInfo keyInfo, Purpose purpose, 
                                    AlgorithmMethod method, 
                                    XMLCryptoContext context) throws KeySelectorException {
        ArrayList certList = new ArrayList();
        if (null == keyInfo) {
            throw new KeySelectorException("no ds:KeyInfo present");
        }
        List keyInfoContent = keyInfo.getContent();
        this.certificate = null;
        //for (XMLStructure keyInfoStructure: keyInfoContent) {
        for(int j=0;j<keyInfoContent.size();j++){
        	XMLStructure keyInfoStructure = (XMLStructure)keyInfoContent.get(j);
            if (false == (keyInfoStructure instanceof X509Data)) {
                continue;
            }
            X509Data x509Data = (X509Data)keyInfoStructure;
            List x509DataList = x509Data.getContent();
            //for (Object x509DataObject: x509DataList) {
            for(int i=0;i<x509DataList.size();i++){
            		Object x509DataObject = (Object)x509DataList.get(i);
                if (false == (x509DataObject instanceof X509Certificate)) {
                    continue;
                }
                certList.add(x509DataObject);
            }
            if (!certList.isEmpty()) {
                this.certChain = (X509Certificate[])certList.toArray(new X509Certificate[0]);
                this.certificate = (X509Certificate)this.certChain[0];
                return this;
            }
        }
        throw new KeySelectorException("No key found!");
    }

    public Key getKey() {
        return this.certificate.getPublicKey();
    }

    /**
     * Gives back the X509 certificate used during the last signature
     * verification operation.
     *
     * @return
     */
    public X509Certificate getCertificate() {
        return this.certificate;
    }

    public X509Certificate[] getCertChain() {
      return certChain;
    }
}
