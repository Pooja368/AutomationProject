package com.java.ClassandObjectConcepts;

public class StaticAndNonStatic {
	int studentId=30;
	static double percent=3.8;
	int c=0;
	
	 void test1()
     {
    	System.out.
    	println("Non-Static block method"); 
     }
	 static void test2()
	 {
		 System.out.println("Static block method");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*****Static block******");
		test2();
		System.out.println("The percentage of the student is "+percent+"\n");
		System.out.println("*****Non-Static block******");
		StaticAndNonStatic rv1=new StaticAndNonStatic();
		rv1.test1();
		System.out.println("Student Id is "+rv1.studentId);
		rv1.c=47;
		StaticAndNonStatic rv2=new StaticAndNonStatic();
		rv2.c=49;
		System.out.println("The values of the variables with different reference values are "+rv1.c+" "+rv2.c);
	}

}

