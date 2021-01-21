package com.example;

public class Conversor {
	
	public double ptsEuros(int pts) {
		return pts /166.386;
	}
	
	public int eurosPts(double euros) {
		return (int) (euros * 166.386);
	}

}
