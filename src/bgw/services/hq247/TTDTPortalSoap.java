/**
 * TTDTPortalSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bgw.services.hq247;

public interface TTDTPortalSoap extends java.rmi.Remote {
    public java.lang.String WSProcess(java.lang.String publicKey, java.lang.String msg) throws java.rmi.RemoteException;
    public java.lang.String getPublicKey() throws java.rmi.RemoteException;
}