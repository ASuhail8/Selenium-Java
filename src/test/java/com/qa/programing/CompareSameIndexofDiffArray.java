package com.qa.programing;

import java.util.ArrayList;

public class CompareSameIndexofDiffArray {
	// compare same indexes of 2 different arrays and create new array for
	// matchValues

	public static void main(String[] args) {

		int a[] = { 1, 5, 6, 9, 10, 15 };
		int b[] = { 1, 4, 6, 8, 11, 15 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					al.add(a[i]);
				}
			}
		}
		 Object[] c = al.toArray();
		for (int k = 0; k < c.length; k++) {
			System.out.println((c[k]));
		}
	}
}
