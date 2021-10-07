package com.qa.programing;

public class PrintFibanocci {

	// Print Fibanocci Series by swapping variables
	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int sum = 0;
		int i = 0;
		while (i < 6) {
			sum = a + b; // 1
			System.out.println(sum);
			a = b;
			b = sum;
			i++;
		}
	}
}
