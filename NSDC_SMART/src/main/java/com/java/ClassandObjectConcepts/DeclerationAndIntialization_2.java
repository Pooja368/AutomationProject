package com.java.ClassandObjectConcepts;

public class DeclerationAndIntialization_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //Declaration
		int stdId;
		double marks1;
		float marks2;
		String result;
		char grade;
		//Initialization
		stdId=61;
		marks1=87;
		marks2=90;
		result="Passed";
		grade='A';
		//Printing
		System.out.println("student Id is "+stdId);
		System.out.println("Total marks of the student is "+(marks1+marks2));
		System.out.println("Greade obtained by the Student is "+grade);
		System.out.println("final result of the student is "+result);
		
		//Re-initialization of the variable
		int costofRice=35;
		System.out.println("Initial Cost of the rice is "+costofRice);
		//int costofRice=50; compile time error because declaration of same variable again
		//double costofRice=50.67; compile time error because the variable already declared with int type data type
		double CostOFRice=50.67;//case sensitive
		System.out.println("changed Cost of the rice is in double "+CostOFRice);
		costofRice=40;
		System.out.println("changed Cost of the rice is "+costofRice);
		
		System.out.println("Initial Cost of the rice is "+(costofRice=100));
		
	}

}
