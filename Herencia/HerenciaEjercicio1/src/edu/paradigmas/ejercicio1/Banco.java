package edu.paradigmas.ejercicio1;

public class Banco {
	
	public double saldo;
	
	public Banco () {
		saldo = 0;
	}
	
	public static void main(String[] args) {
		Banco cuenta1 = new Banco ();
		
		System.out.println(cuenta1.saldo);
		
		cuenta1.saldo += 1000;
		
		System.out.println(cuenta1.saldo);
		
		cuenta1.saldo -= 550;
		
		System.out.println(cuenta1.saldo);
	}
	
}
