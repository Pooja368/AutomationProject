package com.java.ClassandObjectConcepts;

public class AccessModifierBased {
	
	//first example , Argument no feturn value
	public static void multiply(int a , int b)
	{
		int mul=a*b;
		System.out.println("The result is "+ mul);
	}
    // second example, arguments with return values
	static int square(int a)
	{
		int square=a*a;
		return square;
	}
	
	// 3rd example No return value and No arguments
	static void testmethod()
	{
	  System.out.println("test() method");	
	}
	//4th example no arguments with return value
	static int returnvalue()
	{
		System.out.println("enter the value for interger" );
		return 67;
	}
	//5th example
	static double returnValueDecimal()
	{
		System.out.println("enter the value for decimals" );
		return 67.6;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		multiply(2, 4);//1
		int value=square(3);//2 retrun value printed from the main value
		System.out.println("The square of the number is \n"+value);//2
		testmethod();//3
		//System.out.println(testmethod()); in syso statement void argument not allowedrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrto call
		System.out.println(returnvalue());//4
		
		System.out.println(returnValueDecimal());
	}

}
