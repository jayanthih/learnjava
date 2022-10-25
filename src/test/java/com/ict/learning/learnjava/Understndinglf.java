package com.ict.learning.learnjava;

import java.util.Scanner;

public class Understndinglf {

	public static void main(String[] args) {
	
		int firstValue = 30;
		int secondValue= 40;
		
		if(firstValue>secondValue) {
			System.out.println("firstvalue is greater");
		}else {
			System.out.println("secondvalue is greater");
		}
		
		
		
		int firstValue1 ;
		int secondValue1;
		int thirdValue ;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the First Value1 ");
		firstValue = scanner.nextInt();
		System.out.println(" Enter the Second Value1 ");
		secondValue = scanner.nextInt();
		System.out.println(" Enter the Third Value ");
		thirdValue = scanner.nextInt();
		
		
		if(firstValue>secondValue) {
			System.out.println("firstValue is greater");
		}else if(secondValue>thirdValue) {
			System.out.println("secondValue is greater");
			
		}else {
			System.out.println("thirdValue is greater");
			
		}
		
		
	}

}
