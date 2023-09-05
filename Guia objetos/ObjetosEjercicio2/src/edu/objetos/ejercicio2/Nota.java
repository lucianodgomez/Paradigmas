package edu.objetos.ejercicio2;

public class Nota {

	private int nota;

    public Nota(int valorInicial) {
    	nota = valorInicial;
    }

    public int obtenerValor() {
    	return nota;
    }

    public boolean aprobado() {
    	return nota >= 4;
    }
    
    public boolean desaprobado() {
    	return nota < 4;
    }
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
