package co.edu.uptc.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.uptc.classes.ConvertirDecimalesARomanos;

class SentenciaRomanos {

	@Test
	void testMilesIgual1() {
		ConvertirDecimalesARomanos rom = new ConvertirDecimalesARomanos();
		String resultado = rom.convertirDecARomanos(1000);
		assertEquals("M", resultado);
	}
	
	@Test
	void testCentenasIgual9() {
		ConvertirDecimalesARomanos rom = new ConvertirDecimalesARomanos();
		String resultado = rom.convertirDecARomanos(900);
		assertEquals("CM", resultado);
	}
	
	@Test
	void testCentenasIgual6() {
		ConvertirDecimalesARomanos rom = new ConvertirDecimalesARomanos();
		String resultado = rom.convertirDecARomanos(600);
		assertEquals("DC", resultado);
	}
	
	@Test
	void testCentenasIgua4() {
		ConvertirDecimalesARomanos rom = new ConvertirDecimalesARomanos();
		String resultado = rom.convertirDecARomanos(400);
		assertEquals("CD",resultado);
	}
	
	@Test
	void testCentenasMenor4() {
		ConvertirDecimalesARomanos rom = new ConvertirDecimalesARomanos();
		String resultado = rom.convertirDecARomanos(300);
		assertEquals("CCC",resultado);
	}
	
	@Test
	void testDecenasIgual9() {
		ConvertirDecimalesARomanos rom = new ConvertirDecimalesARomanos();
		String resultado = rom.convertirDecARomanos(90);
		assertEquals("XC",resultado);
	}
	
	@Test
	void testDecenasMayorIgual5() {
		ConvertirDecimalesARomanos rom = new ConvertirDecimalesARomanos();
		String resultado = rom.convertirDecARomanos(60);
		assertEquals("LX",resultado);
	}

	@Test
	void testDecenasIgual4() {
		ConvertirDecimalesARomanos rom = new ConvertirDecimalesARomanos();
		String resultado = rom.convertirDecARomanos(40);
		assertEquals("XL",resultado);
	}
	
	@Test
	void testDecenasMenor4() {
		ConvertirDecimalesARomanos rom = new ConvertirDecimalesARomanos();
		String resultado = rom.convertirDecARomanos(30);
		assertEquals("XXX",resultado);
	}
	
	@Test
	void testUnidadesIgual9() {
		ConvertirDecimalesARomanos rom = new ConvertirDecimalesARomanos();
		String resultado = rom.convertirDecARomanos(9);
		assertEquals("IX",resultado);
	}
	
	@Test
	void testUnidadesMayorIgual5() {
		ConvertirDecimalesARomanos rom = new ConvertirDecimalesARomanos();
		String resultado = rom.convertirDecARomanos(5);
		assertEquals("V",resultado);
	}
	
	@Test
	void testUnidadesIgual4() {
		ConvertirDecimalesARomanos rom = new ConvertirDecimalesARomanos();
		String resultado = rom.convertirDecARomanos(4);
		assertEquals("IV",resultado);
	}
	
	@Test
	void testUnidadesMenor4() {
		ConvertirDecimalesARomanos rom = new ConvertirDecimalesARomanos();
		String resultado = rom.convertirDecARomanos(3);
		assertEquals("III",resultado);
	}

}
