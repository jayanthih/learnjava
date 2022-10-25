package com.ict.learning.learnjava;

public class UnderstandingSwitch {

	public static void main(String[] args) {
	  /*	 switch (expression) {
	  	 case x:
			 break;
		 case y:
			 break;	 
		 case z:
			 break;
		 default:	 
	}
            */
		
		int day =2;
		switch(day) {
		case 1:
			System.out.println(" Monday");
			break;
		case 2:
			System.out.println(" Tuesday");
			break;	
		case 3:
			System.out.println(" Wednesday");
			break;	
		default:
			System.out.println(" No matching found");  
			}
			
			
		String colorcode = "v";
		switch (colorcode) {
		case "v":
			System.out.println(" Violet");
			break;
		case "i":
			System.out.println(" Indigo");
			break;	
		case "b":
			System.out.println(" Blue");
			break;	
		case "y":
			System.out.println(" Yellow");
			break;	
		default:
			System.out.println(" No matching found");
			
		}
		}
}

