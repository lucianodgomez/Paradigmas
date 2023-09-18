package edu.paradigmas.ejercicio1;

public class Movimiento extends Cuenta {

	private String tipo;
	private double monto;
	private String motivo;
	
	public Movimiento (String tipo, double monto, String motivo) {
		this.tipo = tipo;
		this.monto = monto;
		this.motivo = motivo;
	}

	@Override
	public String toString() {
		return String.format("%-10s", tipo) + " " + String.format("%11.2f", monto) + "   " + motivo;		
	}
	
	
	
	
}
