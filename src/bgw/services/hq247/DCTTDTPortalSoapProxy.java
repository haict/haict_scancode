package bgw.services.hq247;

public class DCTTDTPortalSoapProxy implements bgw.services.hq247.DCTTDTPortalSoap {
  private String _endpoint = null;
  private bgw.services.hq247.DCTTDTPortalSoap dCTTDTPortalSoap = null;
  
  public DCTTDTPortalSoapProxy() {
    _initDCTTDTPortalSoapProxy();
  }
  
  public DCTTDTPortalSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initDCTTDTPortalSoapProxy();
  }
  
  private void _initDCTTDTPortalSoapProxy() {
    try {
      dCTTDTPortalSoap = (new bgw.services.hq247.DCTTDTPortalLocator()).getDCTTDTPortalSoap();
      if (dCTTDTPortalSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)dCTTDTPortalSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)dCTTDTPortalSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (dCTTDTPortalSoap != null)
      ((javax.xml.rpc.Stub)dCTTDTPortalSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public bgw.services.hq247.DCTTDTPortalSoap getDCTTDTPortalSoap() {
    if (dCTTDTPortalSoap == null)
      _initDCTTDTPortalSoapProxy();
    return dCTTDTPortalSoap;
  }
  
  public java.lang.String reconcileProcess(java.lang.String publicKey, java.lang.String msg) throws java.rmi.RemoteException{
    if (dCTTDTPortalSoap == null)
      _initDCTTDTPortalSoapProxy();
    return dCTTDTPortalSoap.reconcileProcess(publicKey, msg);
  }
  
  
}