package co.edu.uptc.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.uptc.classes.Calificacion;

class DecisionCalificacion {

	@Test
	void testPromedioExcelente() {
		Calificacion cal= new Calificacion();
		String resultado=cal.calificacion(10, 10, 10);
		assertEquals("Excelente", resultado);
	}

	@Test
	void testPromedioBuena() {
		Calificacion cal= new Calificacion();
		String resultado=cal.calificacion(8, 8, 8);
		assertEquals("Buena", resultado);
	}
	
	@Test
	void testPromedioAceptable() {
		Calificacion cal= new Calificacion();
		String resultado=cal.calificacion(7, 7, 7);
		assertEquals("Aceptable", resultado);
	}
	
	@Test
	void testPromedioReprobado() {
		Calificacion cal= new Calificacion();
		String resultado=cal.calificacion(6, 6, 6);
		assertEquals("Reprobado", resultado);
	}
}
