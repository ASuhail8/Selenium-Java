package com.qa.programing;

import java.util.ArrayList;

public class countOccuranceString {

	public static void main(String[] args) {

		String s = "abdulla";

		ArrayList<Character> al = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			if (!al.contains(s.charAt(i))) {
				al.add(s.charAt(i));
				count++;
				for (int j = i + 1; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						count++;
					}
				}
				System.out.println(s.charAt(i) + " is repeated " + count + " times");
			}
		}
	}
}
