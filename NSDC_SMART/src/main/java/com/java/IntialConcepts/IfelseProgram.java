package com.java.IntialConcepts;

import java.util.Scanner;

public class IfelseProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please entre the marks");
		int marks = sc.nextInt();
		System.out.println("you entred the marks is"+marks+"\n");
		if (marks >= 85 && marks <= 100) {
			System.out.println("The candidate passed with distinction");
		} else if (marks >= 70 && marks <= 84) {
			System.out.println("The candidate passed with First class");
		} else if (marks >= 60 && marks <= 69) {
			System.out.println("The Candidate passed with Second class");
		} else if (marks >= 40 && marks <= 59) {
			System.out.println("The Candidate passed with third class and just pass");
		} else {
			System.out.println("Candidate Failed!! oh Shit");
		}
	}

}
