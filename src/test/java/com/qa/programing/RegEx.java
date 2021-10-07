package com.qa.programing;

public class RegEx {

	public static void main(String[] args) {
		String str = "This#is$my%first^discussion@with&Altimetrik";
		String s = str.replaceAll("[#$%^@&]", " ");
		System.out.println(s);
	}

}
