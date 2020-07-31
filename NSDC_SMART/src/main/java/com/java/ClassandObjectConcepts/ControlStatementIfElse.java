package com.java.ClassandObjectConcepts;

public class ControlStatementIfElse {

	// if else using methods
	static boolean numberTest(int a, int b) {
		if (a + b == 40 || b == 40 || a == 40) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean status = numberTest(4, 37);
		System.out.println("the status of the numberTest is " + status);
	}
}
