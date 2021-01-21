/**
 * ConversorService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example;

public interface ConversorService extends javax.xml.rpc.Service {
    public java.lang.String getConversorAddress();

    public com.example.Conversor getConversor() throws javax.xml.rpc.ServiceException;

    public com.example.Conversor getConversor(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
