package com.java;
/* Write a Java  program to check whether a number is even or odd using switch case.*/

import java.util.*;
	
public class EvenOddSwitchCase
{
	public static void main(String args[])
	{
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scan.nextInt();
		
		int result = (num % 2 == 0) ? 1 : 0;
		
		switch (result)
		{
			case 1:
				System.out.println("Number is even");
				break;
			case 0:
				System.out.println("Number is odd");
				break;
			default:
				System.out.println("Invalid");
		}
	}
}
			
	