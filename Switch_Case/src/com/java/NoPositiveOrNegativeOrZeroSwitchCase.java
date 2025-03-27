package com.java;
/* Write a Java  program to check whether a number is positive, negative or zero using switch case. */

import java.util.*;

public class NoPositiveOrNegativeOrZeroSwitchCase
{
	public static void main(String args[])
	{
		int num ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scan.nextInt();
		
		int result = (num > 0) ? 1 : (num < 0) ? 2 : 3;
		
		switch(result)
		{
			case 1:
				System.out.println("Positiv");
				break;
			case 2:
				System.out.println("Negative");
				break;
			case 3:
				System.out.println("Zero");
				break;
			default:
				System.out.println("Invalid");
		}
	}
}