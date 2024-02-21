/**
 * WSDCHQServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bgw.services172.hq;

import com.fmt.utils.HQ.signer.HQConstant;

public class WSDCHQServiceLocator extends org.apache.axis.client.Service implements bgw.services172.hq.WSDCHQService {

    public WSDCHQServiceLocator() {
    }

    public WSDCHQServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSDCHQServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSDCHQ
    private java.lang.String WSDCHQ_address = HQConstant.BGW_HQ_DCDT;

    public java.lang.String getWSDCHQAddress() {
        return WSDCHQ_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSDCHQWSDDServiceName = "WSDCHQ";

    public java.lang.String getWSDCHQWSDDServiceName() {
        return WSDCHQWSDDServiceName;
    }

    public void setWSDCHQWSDDServiceName(java.lang.String name) {
        WSDCHQWSDDServiceName = name;
    }

    public bgw.services172.hq.WSDCHQ getWSDCHQ() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
        	System.out.println("dia chi doi chieu hq: "+WSDCHQ_address);
            endpoint = new java.net.URL(WSDCHQ_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSDCHQ(endpoint);
    }

    public bgw.services172.hq.WSDCHQ getWSDCHQ(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            bgw.services172.hq.WSDCHQSoapBindingStub _stub = new bgw.services172.hq.WSDCHQSoapBindingStub(portAddress, this);
            _stub.setPortName(getWSDCHQWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSDCHQEndpointAddress(java.lang.String address) {
        WSDCHQ_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (bgw.services172.hq.WSDCHQ.class.isAssignableFrom(serviceEndpointInterface)) {
                bgw.services172.hq.WSDCHQSoapBindingStub _stub = new bgw.services172.hq.WSDCHQSoapBindingStub(new java.net.URL(WSDCHQ_address), this);
                _stub.setPortName(getWSDCHQWSDDServiceName());
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
        if ("WSDCHQ".equals(inputPortName)) {
            return getWSDCHQ();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://vn.fis.bgw", "WSDCHQService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://vn.fis.bgw", "WSDCHQ"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSDCHQ".equals(portName)) {
            setWSDCHQEndpointAddress(address);
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
