package Loops.copy;

public class aadition {
	 
	static int num1=10,num2=100,num3,num4;
	static String name="aarti";
	
	
	 public static void  Add() {
		 
		  num3=num1+num2;
		  System.out.println("addition is:"+num3);
	 
		 
	 }
	 
	 public static void  AdditionOfTwoNum(int no1, int no2) {
		 
		num3=no1+no2;
	   System.out.println("the addition of two num is:"+num3);
	   
	 }
	 
	 public static void multiplication(int A,int B,int c) {
		 
		 
	    num3=A*B*c;
		System .out.println("multiplication is:"+num3);
		
	 }
	 
	 public static void subtraction(int n1,int n2){
		 
	  
		 
		 num4=n1-n2;
		 System.out.println("subtraction is:"+num4);
		
		 
	 }
	 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Add();
        AdditionOfTwoNum(200,600); 
        multiplication(20,30,50);
	}
	

}
