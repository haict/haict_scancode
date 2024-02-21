/**
 * DCTTDTPortalLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bgw.services.hq247;

import com.fmt.utils.HQ.signer.HQConstant;

public class DCTTDTPortalLocator extends org.apache.axis.client.Service implements bgw.services.hq247.DCTTDTPortal {

    public DCTTDTPortalLocator() {
    }


    public DCTTDTPortalLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DCTTDTPortalLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DCTTDTPortalSoap
    private java.lang.String DCTTDTPortalSoap_address = HQConstant.BGW_HQ_DCDT247;

    public java.lang.String getDCTTDTPortalSoapAddress() {
        return DCTTDTPortalSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DCTTDTPortalSoapWSDDServiceName = "DCTTDTPortalSoap";

    public java.lang.String getDCTTDTPortalSoapWSDDServiceName() {
        return DCTTDTPortalSoapWSDDServiceName;
    }

    public void setDCTTDTPortalSoapWSDDServiceName(java.lang.String name) {
        DCTTDTPortalSoapWSDDServiceName = name;
    }

    public bgw.services.hq247.DCTTDTPortalSoap getDCTTDTPortalSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
        	System.out.println("Doi chieu 247:"+DCTTDTPortalSoap_address);
            endpoint = new java.net.URL(DCTTDTPortalSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDCTTDTPortalSoap(endpoint);
    }

    public bgw.services.hq247.DCTTDTPortalSoap getDCTTDTPortalSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            bgw.services.hq247.DCTTDTPortalSoapStub _stub = new bgw.services.hq247.DCTTDTPortalSoapStub(portAddress, this);
            _stub.setPortName(getDCTTDTPortalSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDCTTDTPortalSoapEndpointAddress(java.lang.String address) {
        DCTTDTPortalSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (bgw.services.hq247.DCTTDTPortalSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                bgw.services.hq247.DCTTDTPortalSoapStub _stub = new bgw.services.hq247.DCTTDTPortalSoapStub(new java.net.URL(DCTTDTPortalSoap_address), this);
                _stub.setPortName(getDCTTDTPortalSoapWSDDServiceName());
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
        if ("DCTTDTPortalSoap".equals(inputPortName)) {
            return getDCTTDTPortalSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "DCTTDTPortal");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "DCTTDTPortalSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DCTTDTPortalSoap".equals(portName)) {
            setDCTTDTPortalSoapEndpointAddress(address);
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
