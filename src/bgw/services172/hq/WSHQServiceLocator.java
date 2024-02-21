/**
 * WSHQServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bgw.services172.hq;

import com.fmt.utils.HQ.signer.HQConstant;

public class WSHQServiceLocator extends org.apache.axis.client.Service implements bgw.services172.hq.WSHQService {

    public WSHQServiceLocator() {
    }


    public WSHQServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSHQServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSHQ
    private java.lang.String WSHQ_address = HQConstant.BGW_HQ_TTDT;

    public java.lang.String getWSHQAddress() {
        return WSHQ_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSHQWSDDServiceName = "WSHQ";

    public java.lang.String getWSHQWSDDServiceName() {
        return WSHQWSDDServiceName;
    }

    public void setWSHQWSDDServiceName(java.lang.String name) {
        WSHQWSDDServiceName = name;
    }

    public bgw.services172.hq.WSHQ getWSHQ() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
        	System.out.println("dia chi truy van hq:" +WSHQ_address);
            endpoint = new java.net.URL(WSHQ_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSHQ(endpoint);
    }

    public bgw.services172.hq.WSHQ getWSHQ(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            bgw.services172.hq.WSHQSoapBindingStub _stub = new bgw.services172.hq.WSHQSoapBindingStub(portAddress, this);
            _stub.setPortName(getWSHQWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSHQEndpointAddress(java.lang.String address) {
        WSHQ_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (bgw.services172.hq.WSHQ.class.isAssignableFrom(serviceEndpointInterface)) {
                bgw.services172.hq.WSHQSoapBindingStub _stub = new bgw.services172.hq.WSHQSoapBindingStub(new java.net.URL(WSHQ_address), this);
                _stub.setPortName(getWSHQWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WSHQ".equals(inputPortName)) {
            return getWSHQ();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://vn.fis.bgw", "WSHQService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://vn.fis.bgw", "WSHQ"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSHQ".equals(portName)) {
            setWSHQEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
