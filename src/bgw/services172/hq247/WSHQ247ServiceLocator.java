/**
 * WSHQ247ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bgw.services172.hq247;

import com.fmt.utils.HQ.signer.HQConstant;

public class WSHQ247ServiceLocator extends org.apache.axis.client.Service implements bgw.services172.hq247.WSHQ247Service {

    public WSHQ247ServiceLocator() {
    }


    public WSHQ247ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSHQ247ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSHQ247
    private java.lang.String WSHQ247_address = HQConstant.BGW_HQ_TTDT247;

    public java.lang.String getWSHQ247Address() {
        return WSHQ247_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSHQ247WSDDServiceName = "WSHQ247";

    public java.lang.String getWSHQ247WSDDServiceName() {
        return WSHQ247WSDDServiceName;
    }

    public void setWSHQ247WSDDServiceName(java.lang.String name) {
        WSHQ247WSDDServiceName = name;
    }

    public bgw.services172.hq247.WSHQ247 getWSHQ247() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSHQ247_address);
            System.out.println("WSHQ247_address: "+WSHQ247_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSHQ247(endpoint);
    }

    public bgw.services172.hq247.WSHQ247 getWSHQ247(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            bgw.services172.hq247.WSHQ247SoapBindingStub _stub = new bgw.services172.hq247.WSHQ247SoapBindingStub(portAddress, this);
            _stub.setPortName(getWSHQ247WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSHQ247EndpointAddress(java.lang.String address) {
        WSHQ247_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (bgw.services172.hq247.WSHQ247.class.isAssignableFrom(serviceEndpointInterface)) {
                bgw.services172.hq247.WSHQ247SoapBindingStub _stub = new bgw.services172.hq247.WSHQ247SoapBindingStub(new java.net.URL(WSHQ247_address), this);
                _stub.setPortName(getWSHQ247WSDDServiceName());
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
        if ("WSHQ247".equals(inputPortName)) {
            return getWSHQ247();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://vn.fis.bgw", "WSHQ247Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://vn.fis.bgw", "WSHQ247"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSHQ247".equals(portName)) {
            setWSHQ247EndpointAddress(address);
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
