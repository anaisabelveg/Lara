package com.example;

public class GestionEmpleadosProxy implements com.example.GestionEmpleados {
  private String _endpoint = null;
  private com.example.GestionEmpleados gestionEmpleados = null;
  
  public GestionEmpleadosProxy() {
    _initGestionEmpleadosProxy();
  }
  
  public GestionEmpleadosProxy(String endpoint) {
    _endpoint = endpoint;
    _initGestionEmpleadosProxy();
  }
  
  private void _initGestionEmpleadosProxy() {
    try {
      gestionEmpleados = (new com.example.GestionEmpleadosServiceLocator()).getGestionEmpleados();
      if (gestionEmpleados != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)gestionEmpleados)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)gestionEmpleados)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (gestionEmpleados != null)
      ((javax.xml.rpc.Stub)gestionEmpleados)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.example.GestionEmpleados getGestionEmpleados() {
    if (gestionEmpleados == null)
      _initGestionEmpleadosProxy();
    return gestionEmpleados;
  }
  
  public com.example.Empleado buscar(int numero) throws java.rmi.RemoteException{
    if (gestionEmpleados == null)
      _initGestionEmpleadosProxy();
    return gestionEmpleados.buscar(numero);
  }
  
  public java.lang.String mostrarInfo(com.example.Empleado empleado) throws java.rmi.RemoteException{
    if (gestionEmpleados == null)
      _initGestionEmpleadosProxy();
    return gestionEmpleados.mostrarInfo(empleado);
  }
  
  
}