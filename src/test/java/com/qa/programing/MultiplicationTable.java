package com.qa.programing;

public class MultiplicationTable {

	// Print Multiplication table without using Multiply operator

	public static void main(String[] args) {
		System.out.println(getProduct(2, 5));
	}

	private static int getProduct(int a, int b) {
		int sum = 0;
		for (int i = 0; i < b; i++) {
			sum = sum + a;
		}
		return sum;
	}

}
