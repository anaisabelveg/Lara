/**
 * Conversor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example;

public interface Conversor extends java.rmi.Remote {
    public double ptsEuros(int pts) throws java.rmi.RemoteException;
    public int eurosPts(double euros) throws java.rmi.RemoteException;
}
