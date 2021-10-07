package com.qa.programing;

public class SwapVaraibleWithAndWithoutTemp {

	// Swap the variables with and with out using Temp variable
	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		int temp;

		temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);

		int c = 15;
		int d = 20;

		c = c + d; // 15
		d = c - d; // 15-10 = 5
		c = c - d; // 15-5 = 10

		System.out.println(c);
		System.out.println(d);
	}
}
