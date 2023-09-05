package edu.objetos.ejercicio5;

public class TarjetaBaja {
	
	private double saldo;
	private int cantViajesColectivo;
	private int cantViajesSubte;
	
	private static double valorBoletoColectivo = 39.59;
	private static double valorBoletoSubte = 34.5;
	
	public TarjetaBaja(double saldoInicial) {
		saldo = saldoInicial;
		cantViajesColectivo = 0;
		cantViajesSubte = 0;
	}

	public double obtenerSaldo() {
		return saldo;
	}

	public void cargar(double monto) {
		if (monto < 0)
			return;
		saldo += monto;
	}

	public void pagarViajeEnColectivo() {
		if (saldo < valorBoletoColectivo) {
			return;
		}
		
		saldo -= valorBoletoColectivo;
		cantViajesColectivo++;
	}

	public void pagarViajeEnSubte() {
		if (saldo < valorBoletoSubte) {
			return;
		}
		
		saldo -= valorBoletoSubte;
		cantViajesSubte++;
	}

	public int contarViajes() {
		return cantViajesColectivo + cantViajesSubte;
	}

	public int contarViajesEnColectivo() {
		return cantViajesColectivo;
	}

	public int contarViajesEnSubte() {
		return cantViajesSubte;
	}
	
	

	public static void main(String[] args) {
	}

}
