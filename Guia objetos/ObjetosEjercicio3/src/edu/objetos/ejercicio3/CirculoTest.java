package edu.objetos.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import static java.lang.Math.*;

import org.junit.jupiter.api.Test;

class CirculoTest {

	@Test
	void testCirculo() {
		Circulo c = new Circulo (2);
		
		assertEquals (c.obtenerArea(), 4 * PI, .2);
		
		assertEquals (c.obtenerDiametro(), 4, .0);
		
		assertEquals (c.obtenerPerimetro(), 4 * PI, .2);
		
		assertEquals (c.obtenerRadio(), 2, .0);
		
		c.cambiarRadio(3);
		
		assertEquals (c.obtenerArea(), 9 * PI, .2);
		
		assertEquals (c.obtenerDiametro(), 6, .0);
		
		assertEquals (c.obtenerPerimetro(), 6 * PI, .2);
		
		assertEquals (c.obtenerRadio(), 3, .0);
	}

}
