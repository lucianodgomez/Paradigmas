package edu.objetos.ejercicio3;

import static java.lang.Math.*;

public class Circulo {
	
	private double radio;
	
	public Circulo (double r) {
		radio = r;
	}
	
	public double obtenerRadio () {
		return radio;
	}
	
	public double obtenerDiametro () {
		return 2 * radio;
	}

	public double obtenerPerimetro () {
		return 2 * PI * radio;
	}
	
	public double obtenerArea () {
		return PI * pow (radio, 2);
	}
	
	public void cambiarRadio (double radioNuevo) {
		radio = radioNuevo;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
