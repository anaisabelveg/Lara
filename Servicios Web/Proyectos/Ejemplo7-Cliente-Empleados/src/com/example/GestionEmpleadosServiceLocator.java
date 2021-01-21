/**
 * GestionEmpleadosServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example;

public class GestionEmpleadosServiceLocator extends org.apache.axis.client.Service implements com.example.GestionEmpleadosService {

    public GestionEmpleadosServiceLocator() {
    }


    public GestionEmpleadosServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GestionEmpleadosServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GestionEmpleados
    private java.lang.String GestionEmpleados_address = "http://localhost:8080/Ejemplo6-WS-Empleados/services/GestionEmpleados";

    public java.lang.String getGestionEmpleadosAddress() {
        return GestionEmpleados_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GestionEmpleadosWSDDServiceName = "GestionEmpleados";

    public java.lang.String getGestionEmpleadosWSDDServiceName() {
        return GestionEmpleadosWSDDServiceName;
    }

    public void setGestionEmpleadosWSDDServiceName(java.lang.String name) {
        GestionEmpleadosWSDDServiceName = name;
    }

    public com.example.GestionEmpleados getGestionEmpleados() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GestionEmpleados_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGestionEmpleados(endpoint);
    }

    public com.example.GestionEmpleados getGestionEmpleados(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.example.GestionEmpleadosSoapBindingStub _stub = new com.example.GestionEmpleadosSoapBindingStub(portAddress, this);
            _stub.setPortName(getGestionEmpleadosWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGestionEmpleadosEndpointAddress(java.lang.String address) {
        GestionEmpleados_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.example.GestionEmpleados.class.isAssignableFrom(serviceEndpointInterface)) {
                com.example.GestionEmpleadosSoapBindingStub _stub = new com.example.GestionEmpleadosSoapBindingStub(new java.net.URL(GestionEmpleados_address), this);
                _stub.setPortName(getGestionEmpleadosWSDDServiceName());
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
        if ("GestionEmpleados".equals(inputPortName)) {
            return getGestionEmpleados();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://example.com", "GestionEmpleadosService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://example.com", "GestionEmpleados"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GestionEmpleados".equals(portName)) {
            setGestionEmpleadosEndpointAddress(address);
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
