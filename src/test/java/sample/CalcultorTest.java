package sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcultorTest {

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		calc.add(10, 20);
		assertEquals(30,calc.getResult());
	}
	
}
