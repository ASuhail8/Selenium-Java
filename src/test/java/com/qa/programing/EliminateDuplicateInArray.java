package com.qa.programing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class EliminateDuplicateInArray {
	// Eliminate duplicates and print Unique numbers in the Array
	public static void main(String[] args) {

		int[] a = { 5, 7, 5, 9, 2, 4, 4, 15, 15, 14 };
		HashSet<Integer> hs = new HashSet<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (!hs.add(a[i])) { //
				al.add(a[i]);
			}
		}
		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}