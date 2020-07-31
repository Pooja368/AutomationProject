
package com.java.ClassandObjectConcepts;

public class BasicBankingProgram {

	int balance;
	 void balance()
	 {
		 System.out.println("The balance amount in your account is "+balance);
	 }
	 
	  void depositAmount(int dAmount)
	 {
		 balance=balance+dAmount;
		 System.out.println("your deposit amount is "+dAmount);
		 balance();
	 }
	void withdrawAmount(int wAmount)
	{
		
		if(wAmount<=balance)
		{
			System.out.println("You have withdraw the "+wAmount+" Rs amount");
			balance=balance-wAmount;
			balance();
		}
		else
		{
			System.out.println("Insufficient funds in the account to withdraw try with different amount");
		}
       
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Welcome to state bank of india");
      BasicBankingProgram transaction=new BasicBankingProgram();
      transaction.balance();
      System.out.println("****Transaction details****");
      transaction.depositAmount(3800);
      transaction.withdrawAmount(5000);
      transaction.withdrawAmount(400);
      
      System.out.println("Thank you visiting us,come again");
	}

}
