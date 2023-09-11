package edu.paradigmas.ejercicio1;

public class Banco {
	
	private double saldo;
	
	public Banco () {
		saldo = 0;
	}
	
	public double getSaldo () {
		return saldo;
	}
	
	public void ingresarSaldo (double ingreso) {
		if (ingreso <= 0) {
			System.out.println("El saldo a ingresar es un monto invalido");
			return;
		}
		
		saldo += ingreso;
	}
	
	public boolean retirarSaldo (double retiro) {
		if (retiro <= 0) {
			System.out.println("El monto solicitado es invalido");
			return false;
		}
		
		if (retiro > saldo) {
			System.out.println("El monto a retirar es mayor al saldo disponible");
			return false;
		}
		
		saldo -= retiro;
		
		return true;
	}
	
	public void transferirSaldo (double monto, Banco ctaDestino) {
		if (!this.retirarSaldo(monto)) {
			return;
		}
		
		ctaDestino.ingresarSaldo(monto);
	}
	
	public static void main(String[] args) {
		Banco cuenta1 = new Banco ();
		
		System.out.println(cuenta1.getSaldo());
		
		cuenta1.ingresarSaldo(1000);

		System.out.println(cuenta1.getSaldo());
		
		Banco cuenta2 = new Banco ();
		
		cuenta2.ingresarSaldo(1800);
		
		cuenta2.transferirSaldo(400, cuenta1);
		
		System.out.println(cuenta1.getSaldo());
		
		System.out.println(cuenta2.getSaldo());
		
		cuenta1.transferirSaldo(5000, cuenta2);
	}
	
}
