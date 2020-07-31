package com.java.ClassandObjectConcepts;

public class Constructors {
    int studentId;
	Constructors()
	{
		System.out.println("No argument Constructor");
		
	}
	Constructors(int a)
	{
		System.out.println("Single argument Constructor");
		studentId=a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructors ref1=new Constructors();
		Constructors ref2=new Constructors(47);
		System.out.println("Student id of the constructor is "+ref2.studentId+" and "+ref1.studentId);
		
	}

}
