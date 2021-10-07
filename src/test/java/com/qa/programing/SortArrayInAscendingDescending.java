package com.qa.programing;

public class SortArrayInAscendingDescending {

	// Sort the Array in Ascending and Descending order

	public static void main(String[] args) {

		int a[] = { 5, 6, 2, 4, 1, 7, 3 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
}
