package edu.paradigmas.ejercicio1;

public class Cuenta {
	
	private double saldo;
	
	public Cuenta () {
		saldo = 0;
	}
	
	public double getSaldo () {
		return saldo;
	}
	
	public boolean ingresarSaldo (double ingreso, String MotivoIngreso) {
		if (ingreso <= 0) {
			System.out.println("El saldo a ingresar es un monto invalido");
			return false;
		}
		
		saldo += ingreso;
		
		return true;
	}
	
	public boolean retirarSaldo (double retiro, String MotivoRetiro) {
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
	
	public void transferirSaldo (double monto, Cuenta ctaDestino, String MotivoTransferencia) {
		if (!this.retirarSaldo(monto, MotivoTransferencia)) {
			return;
		}
		
		ctaDestino.ingresarSaldo(monto, MotivoTransferencia);
	}
	
	public void vaciarCuenta () {
		saldo = 0;
	}
	
	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(0);
		
		cc.ingresarSaldo(1000, "Sueldo");
		
		cc.compraDebitoCC(180, "Compra");
		
		cc.retiroCC(300, "Servicios");
		
		cc.mostrarMovimientosCC();
	}
	
}
