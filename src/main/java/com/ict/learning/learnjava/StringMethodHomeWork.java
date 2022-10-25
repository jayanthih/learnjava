package com.ict.learning.learnjava;

import java.util.Scanner;

public class StringMethodHomeWork {
	public  String fullName(String firstName, String lastName) {  //method with a return type
		String fullName = firstName.concat(lastName);
		return fullName;
	}
	
	public static void main(String[] args) {
		StringMethodHomeWork umethod = new StringMethodHomeWork();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the firstName ");
    	String firstName = scanner.nextLine();
    	System.out.println("Enter the lastName");
    	String lastName = scanner.nextLine();
        umethod.fullName(firstName, lastName);
        System.out.println("fullName ".concat(umethod.fullName(firstName, lastName)));
		
		scanner.close();
	} 
	

}
