package com.qa.programing;

public class PrimeNo {
	// Java logic to Check if given number is Prime
	public static void main(String[] args) {

		int num = 54;
		int count = 0;
		for (int i = 0; i < num / 2; i++) {
			if (num % 2 == 0) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("Not prime");
		} else {
			System.out.println("prime");
		}
	}

}
