package bgw.services172.hq;

public class WSDCHQProxy implements bgw.services172.hq.WSDCHQ {
  private String _endpoint = null;
  private bgw.services172.hq.WSDCHQ wSDCHQ = null;
  
  public WSDCHQProxy() {
    _initWSDCHQProxy();
  }
  
  public WSDCHQProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSDCHQProxy();
  }
  
  private void _initWSDCHQProxy() {
    try {
      wSDCHQ = (new bgw.services172.hq.WSDCHQServiceLocator()).getWSDCHQ();
      if (wSDCHQ != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSDCHQ)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSDCHQ)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSDCHQ != null)
      ((javax.xml.rpc.Stub)wSDCHQ)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public bgw.services172.hq.WSDCHQ getWSDCHQ() {
    if (wSDCHQ == null)
      _initWSDCHQProxy();
    return wSDCHQ;
  }
  
  public java.lang.String reconcileProcess(java.lang.String publicKey, java.lang.String msg) throws java.rmi.RemoteException{
    if (wSDCHQ == null)
      _initWSDCHQProxy();
    return wSDCHQ.reconcileProcess(publicKey, msg);
  }
  
  
}