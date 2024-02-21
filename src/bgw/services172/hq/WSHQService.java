/**
 * WSHQService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bgw.services172.hq;

public interface WSHQService extends javax.xml.rpc.Service {
    public java.lang.String getWSHQAddress();

    public bgw.services172.hq.WSHQ getWSHQ() throws javax.xml.rpc.ServiceException;

    public bgw.services172.hq.WSHQ getWSHQ(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
