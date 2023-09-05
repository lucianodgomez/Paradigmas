package edu.guiaobjetos.ejercicio1;

import static java.lang.Math.*;

public class Punto {
	
	private double x;
	
	private double y;
	
	public Punto (double valorX, double valorY) {
		x = valorX;
		y = valorY;
	}
	
	public double obtenerX() {
		return x;
	}
	
	public double obtenerY() {
		return y;
	}
	
	public void cambiarX(double nuevoX) {
		x = nuevoX;
	}
	
	public void cambiarY(double nuevoY) {
		y = nuevoY;
	}
	
	public boolean estaSobreEjeX(){
		return x != 0 && y == 0;		
	}
	
	public boolean estaSobreEjeY() {
		return y != 0 && x == 0;
	}
	
	public boolean esElOrigen() { 
		return y == 0 && x == 0;
	}
	
	public double distanciaAlOrigen() { 
		return sqrt((pow(x, 2)) + (pow(y, 2)));
	}	
	
	public double distanciaAotroPunto(Punto otro) { 
		return sqrt (pow(otro.obtenerX() - x, 2) + pow(otro.obtenerY() - y, 2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
