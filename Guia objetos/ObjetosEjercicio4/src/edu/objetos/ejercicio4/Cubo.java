package edu.objetos.ejercicio4;

public class Cubo {
	
	private double lado;
	
	public Cubo (double l) {
		if (l <= 0) {
			throw new RuntimeException ("Lado incorrecto");
		}
		lado = l;
	}
	
	public double obtenerLado() {
    	return lado;
    }
    
    public void cambiarLado(double longitudLado) {
    	if (longitudLado <= 0) {
			throw new RuntimeException ("Lado incorrecto");
		}
		lado = longitudLado;
    }

    public double obtenerAreaCara() {
    	return lado * lado;
    }

    public double obtenerVolumen() {
    	return Math.pow(lado, 3);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
