package com.ict.learning.learnjava;

public class UnderstandingLoopHW {

	public static void main(String[] args) {
		
int number = 10;
		
        for (int i=1;i<=number;i++) {
        	if (i%2==0) 
        	{
        		System.out.println("i " +i);
        	}
        }
        
        int y = 1;
        while(y<=number) {
        	if (y%2==0) 
        	{
        		System.out.println("y " +y);
        	}
        	y++;
        }
        y=1;
        do {
        	if (y%2==0) {
		
              System.out.println(" y  " + y);
        	}
		y++;	
    }
	while(y<=number);
        

	}

}
