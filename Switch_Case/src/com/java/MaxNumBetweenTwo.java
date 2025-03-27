package com.java;
/* Write a Java  program to find maximum between two numbers using switch case.*/

import java.util.*;
public class MaxNumBetweenTwo
{
	public static void main(String args[])
	{
		int num1,num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Two number:");
		num1 = scan.nextInt();
		num2 = scan.nextInt();

		 int max = (num1 > num2) ? 1 : (num1 < num2) ? -1 : 0;
			
		switch (max)
		{
			case 1:		
				System.out.println("Max number is :" + num1);
				break;

			case -1:
				System.out.println("max number is :" + num2);
				break;
			 
			case 0:
				System.out.println("Equal" );
				break;
				
			default:
				System.out.println("Invalid");
		}
	}
}