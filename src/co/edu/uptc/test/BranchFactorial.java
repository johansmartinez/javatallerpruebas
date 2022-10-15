package co.edu.uptc.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import co.edu.uptc.classes.Factorial;

class BranchFactorial {

	@Test
	void testFactorial0() {
		Factorial fact=new Factorial();
		double resultado =fact.factorial(0);
		assertEquals(1, resultado);
	}
	
	@Test
	void testFactorial5() {
		Factorial fact=new Factorial();
		double resultado =fact.factorial(5);
		assertEquals(120, resultado);
	}
	
	@Test
	void testFactorialMinus1() {
		Factorial fact=new Factorial();
		double resultado =fact.factorial(-1);
		assertEquals(new Exception(), resultado);
	}

}
