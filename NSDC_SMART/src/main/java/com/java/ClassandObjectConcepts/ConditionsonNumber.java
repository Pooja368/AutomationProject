package com.java.ClassandObjectConcepts;

public class ConditionsonNumber {

	
	static int number(int a, int b)
	{	
		if(a==b)
		{
			return(2*(a+b));
		}
		else
		{
			return(a+b);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated h  stub
		//Scanner inputValues =new Scanner(System.in);
		//                                                                                                                          System.out.println("Entre the values of the numbers");
		
        int result=number(7, 8);
        System.out.println(result);
	}

}
