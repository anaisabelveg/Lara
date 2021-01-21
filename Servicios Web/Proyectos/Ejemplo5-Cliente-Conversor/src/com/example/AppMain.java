package com.example;

import java.rmi.RemoteException;

public class AppMain {

	public static void main(String[] args) throws RemoteException {
		Conversor sw = new ConversorProxy().getConversor();
		System.out.println("1000 pts son " + sw.ptsEuros(1000) + " euros");
		System.out.println("6 euros son " + sw.eurosPts(6) + " pts");
	}

}
