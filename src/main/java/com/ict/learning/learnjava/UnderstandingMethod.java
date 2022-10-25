package com.ict.learning.learnjava;

import java.util.Scanner;

public class UnderstandingMethod {
	
	int firstvalue = 10;
	int secondvalue = 20;
	//access specifier return type methodname

	public  void addition() {  //methods
		int sum = firstvalue + secondvalue;
		System.out.println(" Addition of two numbers are " + sum);

	}
	public  void substraction() {
		int sum = firstvalue - secondvalue;
		System.out.println(" Sub of two numbers are " + sum);
		
	}
	public  void multiplication() {
		int sum = firstvalue * secondvalue;
		System.out.println(" mul of two numbers are " + sum);
	}
		public  void addition(int fValue, int sValue) {   //methods with the parameters
			int sum = fValue + sValue ;
			System.out.println(" Add of two numbers are " + sum);

		}
		
		public  int addition(int fValue, int sValue,int tvalue) {  //method with a return type
			int sum = fValue + sValue + tvalue;
			return sum;
		}
		public  void substraction(int fValue, int sValue) {
			int sum = fValue - sValue;
			System.out.println(" Sub of two numbers are " + sum);

		}
		
		public  void multiplication(int fValue, int sValue) {
			int sum = fValue * sValue;
			System.out.println(" mul of two numbers are " + sum);

		}
		public  void division(int fValue, int sValue) {
			int sum = fValue / sValue;
			System.out.println(" div of two numbers are " + sum);

		}

    public static void main(String[] args) {
    	UnderstandingMethod uMethod = new UnderstandingMethod();
    	uMethod.addition();
    	uMethod.substraction();
    	uMethod.multiplication();
    	uMethod.addition(20,15);
    	
    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter the fvalue ");
    	int fvalue = scanner.nextInt();
    	System.out.println("Enter the svalue");
    	int svalue = scanner.nextInt();
    	System.out.println("Enter the tvalue");
    	int tvalue = scanner.nextInt();
    	uMethod.addition(fvalue,svalue);
    	uMethod.substraction(fvalue,svalue);
    	uMethod.multiplication(fvalue,svalue);
    	uMethod.division(fvalue,svalue);
    	System.out.println(uMethod.addition(20,22,23));
    	System.out.println(uMethod.addition(fvalue,svalue,tvalue)); //for user 
    	scanner.close();
    	
}
}
