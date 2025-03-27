package com.java;

/*Write a java program take a number as command line argument to display table of a 
given number*/

public class MultiplicationTable
{
	public static void main(String []x)
	{
		int num ;
		System.out.println("Enter the number:");
		num =Integer.parseInt(x[0]);
		System.out.println( num + "x" + "1" + "=" + num*1); 
		System.out.println( num + "x" + "2" + "=" + num*2); 
		System.out.println( num + "x" + "3" + "=" + num*3); 
		System.out.println( num + "x" + "4" + "=" + num*4); 
		System.out.println( num + "x" + "5" + "=" + num*5); 
		System.out.println( num + "x" + "6" + "=" + num*6); 
		System.out.println( num + "x" + "7" + "=" + num*7); 
		System.out.println( num + "x" + "8" + "=" + num*8); 
		System.out.println( num + "x" + "9" + "=" + num*9); 
		System.out.println( num + "x" + "10" + "=" + num*10); 
	}
}