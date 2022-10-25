package com.ict.learning.learnjava;

public class UnderstandingVariables {
	
	/*integer*/
	public short display()
	{
		return 10;
	}

	public int display1(int a, int b)
	{
		int c=a/b;
		
		return c;
	}
	
	public long display2()
	{
		return 99999999999999999L;
	}
	
	public float display3(float a, float b)
	{
		float c = a/b;
		return c;
	}
	
	public byte display4()
	{
		return -127;
	}
	
	public byte display5()
	{
		return 127;
	}
	
	public double display6()
	{
		return 8888888888888888.88;
	}

	public static void main(String[] args) {
		System.out.println("This is my first program");
  
		
		
		int number=6;
		float sum=20.0f;
		float total = +number+sum;
	    System.out.println("value of integer = " +number +",  Float = "+sum);
	    System.out.println("Total=" +total);
	    int a=5;
	    int b=3;
	    int c= a*b;
	    System.out.println("integer c="+c );
		Byte num1=127;
		Byte num2=-128;
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);	
		
	    short snum1=9999;
		long  num3=6666666666666L;
		float fnum4=66666666666666666666666666666666666666.66f;
		double dnum=66666666666666666666666666666666666666666666666.777;
		
		UnderstandingVariables obj = new UnderstandingVariables();
		System.out.println("Short Display" +obj.display());
		System.out.println("int Display" +obj.display1(5,3));
		System.out.println("long Display" +obj.display2());
		System.out.println("float Display" +obj.display3(10,3));
		System.out.println("byte Display" +obj.display4());
		System.out.println("byte Display" +obj.display5());
		System.out.println("double Display" +obj.display6());
	  
			
		
	}	
	 
	
}
		
