/**
 * WSDCHQ247ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bgw.services172.hq247;

import com.fmt.utils.HQ.signer.HQConstant;

public class WSDCHQ247ServiceLocator extends org.apache.axis.client.Service implements bgw.services172.hq247.WSDCHQ247Service {

    public WSDCHQ247ServiceLocator() {
    }


    public WSDCHQ247ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSDCHQ247ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSDCHQ247
    private java.lang.String WSDCHQ247_address = HQConstant.BGW_HQ_DCDT247;

    public java.lang.String getWSDCHQ247Address() {
        return WSDCHQ247_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSDCHQ247WSDDServiceName = "WSDCHQ247";

    public java.lang.String getWSDCHQ247WSDDServiceName() {
        return WSDCHQ247WSDDServiceName;
    }

    public void setWSDCHQ247WSDDServiceName(java.lang.String name) {
        WSDCHQ247WSDDServiceName = name;
    }

    public bgw.services172.hq247.WSDCHQ247 getWSDCHQ247() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSDCHQ247_address);
            System.out.println("WSDCHQ247_address: "+WSDCHQ247_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSDCHQ247(endpoint);
    }

    public bgw.services172.hq247.WSDCHQ247 getWSDCHQ247(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            bgw.services172.hq247.WSDCHQ247SoapBindingStub _stub = new bgw.services172.hq247.WSDCHQ247SoapBindingStub(portAddress, this);
            _stub.setPortName(getWSDCHQ247WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSDCHQ247EndpointAddress(java.lang.String address) {
        WSDCHQ247_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (bgw.services172.hq247.WSDCHQ247.class.isAssignableFrom(serviceEndpointInterface)) {
                bgw.services172.hq247.WSDCHQ247SoapBindingStub _stub = new bgw.services172.hq247.WSDCHQ247SoapBindingStub(new java.net.URL(WSDCHQ247_address), this);
                _stub.setPortName(getWSDCHQ247WSDDServiceName());
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
        if ("WSDCHQ247".equals(inputPortName)) {
            return getWSDCHQ247();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://vn.fis.bgw", "WSDCHQ247Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://vn.fis.bgw", "WSDCHQ247"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSDCHQ247".equals(portName)) {
            setWSDCHQ247EndpointAddress(address);
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
