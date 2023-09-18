package edu.paradigmas.ejercicio1;

import java.util.*;

public class CuentaDeAhorro extends Cuenta{
	
	private double saldoReservado;
	
	List <Movimiento> movimientos = new ArrayList<> ();
	
	public CuentaDeAhorro () {
		super();
		saldoReservado = 0;
	}
	
	public double getSaldoReservado () {
		return saldoReservado;
	}
	
	public void reservarSaldo (double saldoAReservar){
		if (!this.retirarSaldo(saldoAReservar, "Reserva")) {
			return;
		}
		
		saldoReservado += saldoAReservar;
	}
	
	public void disponerSaldoReservado (double saldoADisponer) {
		if (saldoADisponer > saldoReservado || saldoADisponer <= 0) {
			System.out.println("El saldo solicitado es mayor al reservado o un monto invalido");
			return;
		}
		
		this.ingresarSaldo(saldoADisponer, "Liberar");
		
		saldoReservado -= saldoADisponer;
	}
	
	public void retiroCA (double montoARetirar, String motivo) {
		if (!this.retirarSaldo(montoARetirar, motivo)) {
			return;
		}
		
		agregarMovimiento ("Retiro", montoARetirar, motivo);
	}
	
	public void ingresoCA (double montoAIngresar, String motivo) {
		if (!this.ingresarSaldo(montoAIngresar, motivo)){
			return;			
		}
		
		agregarMovimiento ("Ingreso", montoAIngresar, motivo);
	}
	
	public void compraDebitoCA (double montoCompra, String motivo) {
		if (!this.retirarSaldo(montoCompra, motivo)) {
			return;
		}
		
		agregarMovimiento ("Debito", montoCompra, motivo);		
	}
	
	public void compraCreditoCA (double montoCompra, String motivo) {
		if (!this.retirarSaldo(montoCompra*1.03, motivo)) {
			return;
		}
		
		agregarMovimiento ("Credito", montoCompra, motivo);
	}
	
	private void agregarMovimiento (String tipo, double monto, String motivo) {
		Movimiento mov = new Movimiento (tipo, monto, motivo);
		
		movimientos.add(mov);
	}
	
	public void mostrarMovimientosCA () {
		System.out.println("--- Movimientos de cuenta ---");
		System.out.println("   Tipo   |   Monto   |  Motivo  ");
		
		for (int i = 0; i < movimientos.size(); i++) {
			System.out.println(movimientos.get(i));
		}
	}

	//Completar con plazos fijos
	
}
