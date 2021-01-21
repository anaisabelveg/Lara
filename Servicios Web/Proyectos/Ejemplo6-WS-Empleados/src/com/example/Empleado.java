package com.example;

public class Empleado {

	private String nombre;
	private int numero;
	private double sueldo;

	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public Empleado(String nombre, int numero, double sueldo) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", numero=" + numero + ", sueldo=" + sueldo + "]";
	}

}
