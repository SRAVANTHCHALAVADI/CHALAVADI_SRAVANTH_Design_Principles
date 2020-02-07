package com.epam;

public class Calculation implements Calculate {

	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b);
	}

	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return (a*b);
	}

	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return (a/b);
	}

	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return (int)Math.abs(a-b);
	}

}
