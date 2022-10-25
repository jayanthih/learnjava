package com.ict.learning.learnjava;

public class UnderstandingStatic1 {

		//static  String name = "jayanthi";
		
		public static void concate() {
			String fname  = "hari";
			String lname = "jaya";
			
			String fullname=fname+ " "+lname;
			System.out.println("your full name" +" " +fullname);
		}
		static {  //static means it will execute first
			System.out.println("this is test");
		}
		public static void main(String[]args) {
			//UnderstandingStatic1 identity = new UnderstandingStatic1 ();
			concate();
			//System.out.println();
		}
		
			
		}

	


