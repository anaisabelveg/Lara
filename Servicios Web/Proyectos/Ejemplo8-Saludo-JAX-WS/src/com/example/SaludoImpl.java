package com.example;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class SaludoImpl implements Saludo{

	@Override
	@WebMethod
	public String saludar(@WebParam(name="nombre")  String nombre) {
		// TODO Auto-generated method stub
		return "Bienvenido " + nombre + " a mi WS!!";
	}

}
