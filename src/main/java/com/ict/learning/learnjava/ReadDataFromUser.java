package com.ict.learning.learnjava;

import java.util.Scanner;

public class ReadDataFromUser {

	public static void main(String[] args) {
		String name;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first name");
		name =scanner.nextLine();
	
		System.out.println("Enter Your Last Name");
		 name =name +" "+ scanner.nextLine();
		System.out.println("Hello  "+name +" " +" Welcome");
		
		scanner.close();
		
		
		
		
		
		
		
		

	}

}
