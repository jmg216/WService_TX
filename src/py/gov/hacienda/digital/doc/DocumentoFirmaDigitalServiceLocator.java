/**
 * DocumentoFirmaDigitalServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package py.gov.hacienda.digital.doc;

public class DocumentoFirmaDigitalServiceLocator extends org.apache.axis.client.Service implements py.gov.hacienda.digital.doc.DocumentoFirmaDigitalService {

    public DocumentoFirmaDigitalServiceLocator() {
    }


    public DocumentoFirmaDigitalServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DocumentoFirmaDigitalServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DocumentoFirmaDigitalEndPointPort
    private java.lang.String DocumentoFirmaDigitalEndPointPort_address = "http://localhost:8080/doc/objetoPdfService";

    public java.lang.String getDocumentoFirmaDigitalEndPointPortAddress() {
        return DocumentoFirmaDigitalEndPointPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DocumentoFirmaDigitalEndPointPortWSDDServiceName = "DocumentoFirmaDigitalEndPointPort";

    public java.lang.String getDocumentoFirmaDigitalEndPointPortWSDDServiceName() {
        return DocumentoFirmaDigitalEndPointPortWSDDServiceName;
    }

    public void setDocumentoFirmaDigitalEndPointPortWSDDServiceName(java.lang.String name) {
        DocumentoFirmaDigitalEndPointPortWSDDServiceName = name;
    }

    public py.gov.hacienda.digital.doc.DocumentoFirmaDigitalEndPoint getDocumentoFirmaDigitalEndPointPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DocumentoFirmaDigitalEndPointPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDocumentoFirmaDigitalEndPointPort(endpoint);
    }

    public py.gov.hacienda.digital.doc.DocumentoFirmaDigitalEndPoint getDocumentoFirmaDigitalEndPointPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            py.gov.hacienda.digital.doc.DocumentoFirmaDigitalServiceSoapBindingStub _stub = new py.gov.hacienda.digital.doc.DocumentoFirmaDigitalServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getDocumentoFirmaDigitalEndPointPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDocumentoFirmaDigitalEndPointPortEndpointAddress(java.lang.String address) {
        DocumentoFirmaDigitalEndPointPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (py.gov.hacienda.digital.doc.DocumentoFirmaDigitalEndPoint.class.isAssignableFrom(serviceEndpointInterface)) {
                py.gov.hacienda.digital.doc.DocumentoFirmaDigitalServiceSoapBindingStub _stub = new py.gov.hacienda.digital.doc.DocumentoFirmaDigitalServiceSoapBindingStub(new java.net.URL(DocumentoFirmaDigitalEndPointPort_address), this);
                _stub.setPortName(getDocumentoFirmaDigitalEndPointPortWSDDServiceName());
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
        if ("DocumentoFirmaDigitalEndPointPort".equals(inputPortName)) {
            return getDocumentoFirmaDigitalEndPointPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "DocumentoFirmaDigitalService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "DocumentoFirmaDigitalEndPointPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DocumentoFirmaDigitalEndPointPort".equals(portName)) {
            setDocumentoFirmaDigitalEndPointPortEndpointAddress(address);
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
