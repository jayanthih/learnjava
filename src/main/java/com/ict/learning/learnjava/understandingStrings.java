package com.ict.learning.learnjava;

import java.util.Arrays;

public class understandingStrings {

	public static void main(String[] args) {
		
		String N = "Venkat"; 
		String L = "Raman";
		String T = (N + L);
		String full = "Venkat-Raman";
		System.out.println("First Name : " + N);
		System.out.println("Last Name : " + L);
		System.out.println("Full Name : ".concat(T)); 
		System.out.println("Length : " +full.length());
		System.out.println("Lowercase : "+T.toLowerCase());
		System.out.println("Uppercase : "+T.toUpperCase());
		System.out.println("Substring: "+N.substring(0,3));
		System.out.println("Substring: "+N.substring(2,3));
		System.out.println("First char : " +N.charAt(0));
		System.out.println("Last char : " +full.charAt(11));
		System.out.println(N.substring(3,4).concat(L.substring(0,1)));
		System.out.println(N.replace('a','e'));
		System.out.println(N.replaceAll("Venkat","krishna"));
		System.out.println(full.replaceFirst("Venkat","Hello"));
		String[] strArray = full.split("-");
		System.out.println(Arrays.toString(strArray));
		System.out.println(full.startsWith("Raman"));		
		System.out.println(full.startsWith("Ve"));		
		System.out.println(full.startsWith("Raman",7));		
		System.out.println(full.startsWith("Ve",0));
		System.out.println(N.codePointAt(0));
		System.out.println(N.codePointBefore(1));
		System.out.println(N.codePointCount(0, 6));
		String S1="   Hello Roja   ";
		System.out.println(S1.trim());
		System.out.println(S1.trim().length());
		System.out.println(S1.length());
		
				
	}

}
