package bgw.services.hq;

public class TTDTPortalSoapProxy implements bgw.services.hq.TTDTPortalSoap {
  private String _endpoint = null;
  private bgw.services.hq.TTDTPortalSoap tTDTPortalSoap = null;
  
  public TTDTPortalSoapProxy() {
    _initTTDTPortalSoapProxy();
  }
  
  public TTDTPortalSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initTTDTPortalSoapProxy();
  }
  
  private void _initTTDTPortalSoapProxy() {
    try {
      tTDTPortalSoap = (new bgw.services.hq.TTDTPortalLocator()).getTTDTPortalSoap();
      if (tTDTPortalSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)tTDTPortalSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)tTDTPortalSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (tTDTPortalSoap != null)
      ((javax.xml.rpc.Stub)tTDTPortalSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public bgw.services.hq.TTDTPortalSoap getTTDTPortalSoap() {
    if (tTDTPortalSoap == null)
      _initTTDTPortalSoapProxy();
    return tTDTPortalSoap;
  }
  
  public java.lang.String WSProcess(java.lang.String publicKey, java.lang.String msg) throws java.rmi.RemoteException{
    if (tTDTPortalSoap == null)
      _initTTDTPortalSoapProxy();
    return tTDTPortalSoap.WSProcess(publicKey, msg);
  }
  
  public java.lang.String getPublicKey() throws java.rmi.RemoteException{
    if (tTDTPortalSoap == null)
      _initTTDTPortalSoapProxy();
    return tTDTPortalSoap.getPublicKey();
  }
  
  
}