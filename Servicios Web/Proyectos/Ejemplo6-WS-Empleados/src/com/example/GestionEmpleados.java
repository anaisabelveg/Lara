package com.example;

public class GestionEmpleados {
	
	public String mostrarInfo(Empleado empleado) {
		return empleado.toString();
	}
	
	public Empleado buscar(int numero) {
		return new Empleado("Juan", numero, numero * 1000);
	}

}
