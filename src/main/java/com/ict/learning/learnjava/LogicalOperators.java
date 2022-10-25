package com.ict.learning.learnjava;

public final class LogicalOperators {

	public static void main(String[] args) { 

		int a=10;
		int b=20;
		int c=30;
				
		
	//	LogicalOperators == ,> ,< , >= ,<= ,  &&, ||, !    //
		boolean ce = a==b;
		boolean cg = a > b;
		boolean cl = a < b;
		boolean d = a > b || true;
		boolean e = (a>b) && (b>c);
		boolean f= (a<b) && (c>b);
	    boolean g = (a>b) || (c>b);
	    boolean h = !(a>b);
	    System.out.println(" a==b is " +ce);
	    System.out.println("a > b is " +cg);	    
	    System.out.println("a > b is " +d);
		System.out.println("a < b is "+cl);
		System.out.println("(a>b) && (b>c) is " +e );
		System.out.println("(a<b) && (c>b) is " +f );
		System.out.println("(a>b) || (c>b) is " +g );
		System.out.println("!(a>b)is " +h );
	}
		
}


