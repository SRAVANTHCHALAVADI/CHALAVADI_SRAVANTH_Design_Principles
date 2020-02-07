package com.epam;

import java.util.Scanner;

public class CalculationMain {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		Calculation c=new Calculation();
		System.out.print("Enter Value for \"A\" : ");
		int a=sc.nextInt();
		System.out.print("Enter Value for \"B\" : ");
		int b=sc.nextInt();
		System.out.println("A+B = "+c.add(a, b));
		System.out.println("A-B = "+c.sub(a, b));
		System.out.println("A*B = "+c.mul(a, b));
		System.out.println("A/B = "+c.div(a, b));
		
	}

}
