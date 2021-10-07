package com.qa.programing;

public class getOccurance {

	public static void main(String[] args) {

		System.out.println(getOccuranceOfString("mohammed",'m'));
	}

	private static int getOccuranceOfString(String name, char c) {
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == c) {
				count++;
			}
		}
		return count;

	}

}
