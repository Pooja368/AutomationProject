package com.JavaPrograms;

public class StarPatternPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "a/b/c/d";
		String[] a1 = s.split("/");
		System.out.println("split string using only regex:");
		for (String string : a1) {
			System.out.println(string +" printing value  of S "+a1);
		}
		System.out.println("split string using regex with limit:");
		String[] a2 = s.split("/", 2);
		for (String string : a2) {
			System.out.println(string);
			System.out.println(string);
		}
	}

}
