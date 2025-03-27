package com.java;
/* Write a java program to enter a number and print its reverse. */

import java.util.*;

public class PrintReverseNumber
{
	public static void main(String args[])
	{
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scan.nextInt();
		
		int rem;
		int rev = 0;

		while(num >0)
		{
			rem = num % 10; //1234 = 4
			num = num / 10;  // 1234 = 123
			rev = (rev * 10) + rem ;  
		}
		System.out.println("Reverse number is  :" + rev);
	}
}
