package edu.guiaobjetos.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static java.lang.Math.*;

class PuntoTest {

	@Test @Disabled
	void testMetodosObtener() {
		Punto p = new Punto (3,4);
		
		assertEquals (p.obtenerX(), 3, .0);
		
		assertEquals (p.obtenerY(), 4, .0);
	}
	
	@Test @Disabled
	void testCambiarVariables () {
		Punto p = new Punto (2,3);
		
		assertEquals (p.obtenerX(), 2, .0);
		
		assertEquals (p.obtenerY(), 3, .0);
		
		p.cambiarX(3);
		
		p.cambiarY(4);
		
		assertEquals (p.obtenerX(), 3, .0);
		
		assertEquals (p.obtenerY(), 4, .0);
	}
	
	@Test @Disabled
	void verificacionFuncionesEstaSobreDeterminadoEje (){
		Punto p = new Punto (2,0);
		
		assertTrue (p.estaSobreEjeX());
		
		assertFalse (p.estaSobreEjeY());
		
		assertFalse (p.esElOrigen());
		
		p.cambiarX(0);
		
		p.cambiarY(1);
		
		assertTrue (p.estaSobreEjeY());
		
		assertFalse (p.estaSobreEjeX());
		
		assertFalse (p.esElOrigen());
		
		p.cambiarY(0);
		
		assertTrue (p.esElOrigen());
		
		assertFalse (p.estaSobreEjeX());
		
		assertFalse (p.estaSobreEjeY());
	}
	
	@Test
	void testDistancias () {
		Punto p1 = new Punto (2,3);
		
		Punto p2 = new Punto (2,2);
		
		assertEquals (p1.distanciaAlOrigen(), sqrt(13), .0);
		
		assertEquals (p1.distanciaAotroPunto(p2), 1, .0);
	}

}
