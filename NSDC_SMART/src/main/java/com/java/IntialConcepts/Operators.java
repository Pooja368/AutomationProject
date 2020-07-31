package com.java.IntialConcepts;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n**************post-increment**************\n");
		int i=0;
		System.out.println(i);//0
		i++;// post increment
		System.out.println(i);//1
		System.out.println(i++);//1
		int j=i+ ++i+ i++;//2,3,3
		System.out.println(j);//
		System.out.println(i);
		
		System.out.println("\n**************pre-increment**************\n");
		//pre-increment
		int k=0;
		System.out.println(++k);
		int l=++k+k+k++;
		System.out.println(l);
		System.out.println(k);
		
		System.out.println("\n**************post&pre-decrement**************\n");
		//post-decrement
		int a=1;
		int b=a--;
		System.out.println(a +" "+b);
		 b= a++ +--a+ a+ ++a+ a--;
		System.out.println(b+" "+a);
		
	}

}
