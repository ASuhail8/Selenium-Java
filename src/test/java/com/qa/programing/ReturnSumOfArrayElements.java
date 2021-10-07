package com.qa.programing;

public class ReturnSumOfArrayElements {

	// Method which accepts Array and returns sum of all the elements in array

	public static void main(String[] args) {

		int[] a = { 10, 5, 7, 4, 9, 8 };

		int sum = getSum(a);
		System.out.println(sum);

	}

	private static int getSum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

}
