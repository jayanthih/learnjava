package com.ict.learning.learnjava;

public class UnderstandingConstructor {
	
	//constructor is a special kind of method
	
	public UnderstandingConstructor() {
		System.out.println("hello");
	}
	
	public UnderstandingConstructor(int value,int svalue) {
		int sum =value+svalue;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		UnderstandingConstructor uConstructor = new UnderstandingConstructor();
		UnderstandingConstructor uConstructor1 = new UnderstandingConstructor(30,45);
		
		
	}

}
