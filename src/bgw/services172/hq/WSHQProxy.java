package bgw.services172.hq;

public class WSHQProxy implements bgw.services172.hq.WSHQ {
  private String _endpoint = null;
  private bgw.services172.hq.WSHQ wSHQ = null;
  
  public WSHQProxy() {
    _initWSHQProxy();
  }
  
  public WSHQProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSHQProxy();
  }
  
  private void _initWSHQProxy() {
    try {
      wSHQ = (new bgw.services172.hq.WSHQServiceLocator()).getWSHQ();
      if (wSHQ != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSHQ)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSHQ)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSHQ != null)
      ((javax.xml.rpc.Stub)wSHQ)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public bgw.services172.hq.WSHQ getWSHQ() {
    if (wSHQ == null)
      _initWSHQProxy();
    return wSHQ;
  }
  
  public java.lang.String WSProcess(java.lang.String publicKey, java.lang.String msg) throws java.rmi.RemoteException{
    if (wSHQ == null)
      _initWSHQProxy();
    return wSHQ.WSProcess(publicKey, msg);
  }
  
  public java.lang.String getPublicKey() throws java.rmi.RemoteException{
    if (wSHQ == null)
      _initWSHQProxy();
    return wSHQ.getPublicKey();
  }
  
  
}