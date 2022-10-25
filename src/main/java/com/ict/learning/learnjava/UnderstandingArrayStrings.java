package com.ict.learning.learnjava;

public class UnderstandingArrayStrings {

	public static void main(String[] args) {
		
String names[][] =  {{"ram","hari"},{"priya","pink"}};
		
		for(String[] name:names) {
			for(String z:name)
			System.out.println(z);
			}

	}

}
