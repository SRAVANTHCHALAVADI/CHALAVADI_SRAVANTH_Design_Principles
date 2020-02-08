package com.epam;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculationTest {

	@Test
	public void test1() {
		Calculation c=new Calculation ();
		assertEquals(3,c.add(1, 2));
	}
	@Test
	public void test2() {
		Calculation c=new Calculation ();
		assertEquals(4,c.sub(8, 4));
	}
	@Test
	public void test3() {
		Calculation c=new Calculation ();
		assertEquals(20.0,c.mul(10, 2));
	}
	@Test
	public void test() {
		Calculation c=new Calculation ();
		assertEquals(10,c.div(200, 20));
		
	}

}
