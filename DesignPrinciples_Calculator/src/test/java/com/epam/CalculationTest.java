package com.epam;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculationTest {

	@Test
	public void test() {
		Calculation c=new Calculation ();
		assertEquals(3,c.add(1, 2));
		assertEquals(4,c.sub(8, 4));
		assertEquals(20,c.mul(10, 2));
		assertEquals(10,c.div(200, 20));
		
	}

}
