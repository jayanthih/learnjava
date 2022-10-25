package com.ict.learning.learnjava;

public class UnderstandingArrays {

	public static void main(String[] args) {
		int i[] = {1,2,3,4,5,6}; 
		System.out.println(i[1]); 
		
		for(int x:i) {
			System.out.println(x);
		}
		int i1[][] = {{1,2,3,4,5,6},{6,3,4,5}}; // Multidimensional arrays
		 
		
		for(int[] x1:i1) {
			for(int z:x1 ) {
			System.out.println(z);
			}
		}
		
					
	}		
				
		
	}


