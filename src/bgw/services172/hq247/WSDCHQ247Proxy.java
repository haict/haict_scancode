package bgw.services172.hq247;

public class WSDCHQ247Proxy implements bgw.services172.hq247.WSDCHQ247 {
  private String _endpoint = null;
  private bgw.services172.hq247.WSDCHQ247 wSDCHQ247 = null;
  
  public WSDCHQ247Proxy() {
    _initWSDCHQ247Proxy();
  }
  
  public WSDCHQ247Proxy(String endpoint) {
    _endpoint = endpoint;
    _initWSDCHQ247Proxy();
  }
  
  private void _initWSDCHQ247Proxy() {
    try {
      wSDCHQ247 = (new bgw.services172.hq247.WSDCHQ247ServiceLocator()).getWSDCHQ247();
      if (wSDCHQ247 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSDCHQ247)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSDCHQ247)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSDCHQ247 != null)
      ((javax.xml.rpc.Stub)wSDCHQ247)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public bgw.services172.hq247.WSDCHQ247 getWSDCHQ247() {
    if (wSDCHQ247 == null)
      _initWSDCHQ247Proxy();
    return wSDCHQ247;
  }
  
  public java.lang.String reconcileProcess(java.lang.String publicKey, java.lang.String msg) throws java.rmi.RemoteException{
    if (wSDCHQ247 == null)
      _initWSDCHQ247Proxy();
    return wSDCHQ247.reconcileProcess(publicKey, msg);
  }
  
  
}