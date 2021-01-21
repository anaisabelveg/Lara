package com.example;

import java.rmi.RemoteException;

public class AppMain {

	public static void main(String[] args) throws RemoteException {
		GestionEmpleados sw = 
				new GestionEmpleadosProxy().getGestionEmpleados();
		
		Empleado empleado = sw.buscar(4);
		System.out.println("Numero: " + empleado.getNumero());
		System.out.println("Nombre: " + empleado.getNombre());
		System.out.println("Sueldo: " + empleado.getSueldo());
		
		System.out.println(sw.mostrarInfo(new Empleado("Juan", 3, 30000)));

	}

}
