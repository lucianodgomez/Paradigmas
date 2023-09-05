package edu.objetos.ejercicio5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TarjetaBajaTest {

	@Test
	void testTarjetaBaja() {
		TarjetaBaja t = new TarjetaBaja (150);
		
		assertEquals (t.obtenerSaldo(), 150, .0);
		assertEquals (t.contarViajes(), 0, .0);
		assertEquals (t.contarViajesEnColectivo(), 0, .0);
		assertEquals (t.contarViajesEnSubte(), 0, .0);
		
		t.pagarViajeEnColectivo();
		t.pagarViajeEnSubte();
		t.pagarViajeEnColectivo();
		
		assertEquals (t.obtenerSaldo(), 36.32, .1);
		
		assertEquals (t.contarViajes(), 3, .0);
		assertEquals (t.contarViajesEnColectivo(), 2, .0);
		assertEquals (t.contarViajesEnSubte(), 1, .0);
		
		t.cargar(15);
		
		assertEquals (t.obtenerSaldo(), 51.32, .1);
		
	}

}
