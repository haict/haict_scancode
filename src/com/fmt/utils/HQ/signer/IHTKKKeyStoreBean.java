package com.fmt.utils.HQ.signer;
import java.io.FileInputStream;

import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.util.Enumeration;

import com.fmt.utils.HQ.signer.IHTKKKeyStoreBean;

public class IHTKKKeyStoreBean {
    private PrivateKey privateKey;
    private Certificate[] certChain;

    public void setCertChain(Certificate[] certChain) {
        this.certChain = certChain;
    }

    public Certificate[] getCertChain() {
        return certChain;
    }

    public void setPrivateKey(PrivateKey privateKey) {
        this.privateKey = privateKey;
    }

    public PrivateKey getPrivateKey() {
        return privateKey;
    }

    public static IHTKKKeyStoreBean getKeyStore(String keyStoreFile, String keyStorePwd) throws Exception{
        
    	System.out.println("IHTKKKeyStoreBean.getKeyStore-->keyStoreFile" + keyStoreFile +";keyStorePwd:"+ keyStorePwd);
    	IHTKKKeyStoreBean keyStore = null;
        KeyStore ks = KeyStore.getInstance("pkcs12");
        //KeyStore ks = KeyStore.getInstance("PKCS12","BC");
        ks.load(new FileInputStream(keyStoreFile), keyStorePwd.toCharArray());
        Enumeration aliasesEnum = ks.aliases();
        PrivateKey privateKey = null;
        Certificate[] certificateChain = null;
        if (aliasesEnum.hasMoreElements()) {
            String alias = (String)aliasesEnum.nextElement();
            certificateChain = ks.getCertificateChain(alias);
            privateKey = (PrivateKey) ks.getKey(alias, keyStorePwd.toCharArray());

            keyStore = new IHTKKKeyStoreBean();
            keyStore.setPrivateKey(privateKey);
            keyStore.setCertChain(certificateChain);
        }
        return keyStore;
    }
}
