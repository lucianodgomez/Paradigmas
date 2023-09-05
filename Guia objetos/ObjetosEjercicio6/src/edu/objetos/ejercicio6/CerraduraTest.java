package edu.objetos.ejercicio6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CerraduraTest {

	@Test
	void testCerradura() {
		Cerradura c = new Cerradura (1234, 3);
		
		assertTrue (c.abrir(1234));
		
		assertTrue (c.estaAbierta());
		assertFalse (c.estaCerrada());
		
		assertFalse (c.abrir(0));
		
		c.cerrar();
		
		
		assertTrue (c.estaCerrada());
		assertFalse (c.estaAbierta());
		
		c.abrir(0);
		c.abrir(0);
		
		assertTrue (c.fueBloqueada());
		
	}

}
