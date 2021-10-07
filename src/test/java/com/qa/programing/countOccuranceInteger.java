package com.qa.programing;

import java.util.ArrayList;

public class countOccuranceInteger {

	public static void main(String[] args) {

		int[] a = { 2, 3, 6, 5, 2, 3, 6, 6, 6, 2 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			if (!al.contains(a[i])) {
				al.add(a[i]);
				count++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
					}
				}
				System.out.println(a[i] + " is repeated " + count + " times");
			}

		}

	}

}
