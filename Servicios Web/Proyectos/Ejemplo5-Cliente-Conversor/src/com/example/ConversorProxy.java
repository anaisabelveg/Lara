package com.example;

public class ConversorProxy implements com.example.Conversor {
  private String _endpoint = null;
  private com.example.Conversor conversor = null;
  
  public ConversorProxy() {
    _initConversorProxy();
  }
  
  public ConversorProxy(String endpoint) {
    _endpoint = endpoint;
    _initConversorProxy();
  }
  
  private void _initConversorProxy() {
    try {
      conversor = (new com.example.ConversorServiceLocator()).getConversor();
      if (conversor != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)conversor)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)conversor)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (conversor != null)
      ((javax.xml.rpc.Stub)conversor)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.example.Conversor getConversor() {
    if (conversor == null)
      _initConversorProxy();
    return conversor;
  }
  
  public double ptsEuros(int pts) throws java.rmi.RemoteException{
    if (conversor == null)
      _initConversorProxy();
    return conversor.ptsEuros(pts);
  }
  
  public int eurosPts(double euros) throws java.rmi.RemoteException{
    if (conversor == null)
      _initConversorProxy();
    return conversor.eurosPts(euros);
  }
  
  
}