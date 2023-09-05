package edu.objetos.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NotaTest {

	@Test
	void test() {
		Nota n1 = new Nota (6);
		
		assertEquals (n1.obtenerValor(), 6, .0);
		
		assertTrue (n1.aprobado());
		
		assertFalse (n1.desaprobado());
	}

}
