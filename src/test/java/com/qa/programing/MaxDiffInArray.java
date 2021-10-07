package com.qa.programing;

public class MaxDiffInArray {

	// Max difference between any adjacent index in array

	public static void main(String[] args) {

		int[] a = { 45, 1, 5, 7, 10, 15, 26, 34, 50 };
		int max = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i + 1] - a[i] > max) {
				max = a[i + 1] - a[i];
			}
		}
		System.out.println(max);

		int[] b = { 70, 1, 5, 7, 10, 15, 26, 34, 50, 75 };
		int min = b[b.length - 1];
		for (int i = 0; i < b.length - 1; i++) {
			if (b[i + 1] - b[i] < min) {
				min = b[i + 1] - b[i];
			}
		}
		System.out.println(min);
	}
}
