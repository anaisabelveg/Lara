/**
 * GestionEmpleados.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example;

public interface GestionEmpleados extends java.rmi.Remote {
    public com.example.Empleado buscar(int numero) throws java.rmi.RemoteException;
    public java.lang.String mostrarInfo(com.example.Empleado empleado) throws java.rmi.RemoteException;
}
