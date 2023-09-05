package edu.objetos.ejercicio6;

public class Cerradura {

	private int claveApertura;
	
	private int cantFallosMax;
	
	private int cantFallosConsec;
	
	private boolean bloqueo;
	
	private boolean estado;
	
	private int cantAperturasExitosas;
	
	public Cerradura(int claveDeApertura, int cantFallosConsecBloqueo) {
		claveApertura = claveDeApertura;
		cantFallosMax = cantFallosConsecBloqueo;
		cantFallosConsec = 0;
		bloqueo = false;
		estado = false;
		cantAperturasExitosas = 0;
	}

	public boolean abrir(int clave) {
		if (!fueBloqueada() && clave == claveApertura) {
			estado = true;
			cantAperturasExitosas++;
			cantFallosConsec = 0;
			return true;
		}
		
		cantFallosConsec++;
		
		if (cantFallosConsec == cantFallosMax) {
			bloqueo = true;
			estado = false;
		}
		
		return false;
	}

	public void cerrar() {
		estado = false;
	}

	public boolean estaAbierta() {
		return estado;
	}

	public boolean estaCerrada() {
		return !estado;
	}

	public boolean fueBloqueada(){
		return bloqueo;
	}

	public int contarAperturasExitosas() {
		return cantAperturasExitosas;
	}

	public int contarAperturasFallidas() {
		return cantFallosConsec;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
