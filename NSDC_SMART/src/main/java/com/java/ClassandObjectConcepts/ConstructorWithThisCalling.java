package com.java.ClassandObjectConcepts;

public class ConstructorWithThisCalling {

	int StudentID;
	double fee;
	String studentName;
	ConstructorWithThisCalling(int StudentID, double fee, String studentName)
	{
		this.StudentID=StudentID;
		this.fee=fee;
		this.studentName=studentName;
	}
	void dispaly()
	{
		System.out.println("\n"+this.fee);
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorWithThisCalling ref=new ConstructorWithThisCalling(56,5600f,"Pooja");
		System.out.println("Please Entre the values of the student are\n"+ref.studentName+"\n"+ref.fee+"\n"+ref.StudentID);
		ref.dispaly();
		
	}
}
