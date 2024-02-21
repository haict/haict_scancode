package bgw.services172.hq247;

public class WSHQ247Proxy implements bgw.services172.hq247.WSHQ247 {
  private String _endpoint = null;
  private bgw.services172.hq247.WSHQ247 wSHQ247 = null;
  
  public WSHQ247Proxy() {
    _initWSHQ247Proxy();
  }
  
  public WSHQ247Proxy(String endpoint) {
    _endpoint = endpoint;
    _initWSHQ247Proxy();
  }
  
  private void _initWSHQ247Proxy() {
    try {
      wSHQ247 = (new bgw.services172.hq247.WSHQ247ServiceLocator()).getWSHQ247();
      if (wSHQ247 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSHQ247)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSHQ247)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSHQ247 != null)
      ((javax.xml.rpc.Stub)wSHQ247)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public bgw.services172.hq247.WSHQ247 getWSHQ247() {
    if (wSHQ247 == null)
      _initWSHQ247Proxy();
    return wSHQ247;
  }
  
  public java.lang.String WSProcess(java.lang.String publicKey, java.lang.String msg) throws java.rmi.RemoteException{
    if (wSHQ247 == null)
      _initWSHQ247Proxy();
    return wSHQ247.WSProcess(publicKey, msg);
  }
  
  public java.lang.String getPublicKey() throws java.rmi.RemoteException{
    if (wSHQ247 == null)
      _initWSHQ247Proxy();
    return wSHQ247.getPublicKey();
  }
  
  
}