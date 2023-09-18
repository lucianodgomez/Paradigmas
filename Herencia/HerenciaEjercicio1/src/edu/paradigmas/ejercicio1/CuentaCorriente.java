package edu.paradigmas.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class CuentaCorriente extends Cuenta {
	
	private double montoDescubierto;
	
	List <Movimiento> movimientos = new ArrayList<> ();
	
	public CuentaCorriente (double montoDes) {
		super();
		montoDescubierto = montoDes;
	}
	
	public double getMontoDescubierto () {
		return montoDescubierto;
	}
	
	public void retiroCC (double montoARetirar, String motivo) {
		if (this.getSaldo() + montoDescubierto < montoARetirar || montoARetirar <= 0) {
			System.out.println("Monto solicitado invalido o excede los limites");
			return;
		}
		
		if (this.getSaldo() < montoARetirar) {
			montoDescubierto -= montoARetirar - this.getSaldo();			
		}
		
		this.retirarSaldo(montoARetirar, motivo);	
		
		agregarMovimiento ("Retiro", montoARetirar, motivo);
	}
	
	public void ingresoCC (double montoAIngresar, String motivo) {
		if (!this.ingresarSaldo(montoAIngresar, motivo)){
			return;			
		}
		
		agregarMovimiento ("Ingreso", montoAIngresar, motivo);
	}
	
	public void compraDebitoCC (double montoCompra, String motivo) {
		if (!this.retirarSaldo(montoCompra, motivo)) {
			return;
		}
		
		agregarMovimiento ("Debito", montoCompra, motivo);		
	}
	
	public void compraCreditoCC (double montoCompra, String motivo) {
		if (!this.retirarSaldo(montoCompra*1.03, motivo)) {
			return;
		}
		
		agregarMovimiento ("Credito", montoCompra, motivo);
	}
	
	private void agregarMovimiento (String tipo, double monto, String motivo) {
		Movimiento mov = new Movimiento (tipo, monto, motivo);
		
		movimientos.add(mov);
	}
	
	public void mostrarMovimientosCC () {
		System.out.println("--- Movimientos de cuenta ---");
		System.out.println("   Tipo   |   Monto   |  Motivo  ");
		
		for (int i = 0; i < movimientos.size(); i++) {
			System.out.println(movimientos.get(i));
		}
	}

	//Completar con plazos fijos
}
