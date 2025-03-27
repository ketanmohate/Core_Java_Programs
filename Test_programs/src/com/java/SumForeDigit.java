package com.java;
/*Write a java program to take a 4 digit number as command line argument, reverse the 
number and also find the sum of digits. */

import java.util.*;
public class SumForeDigit
{
	public static void main(String[]args)
	{
		int num , rem=0;
		int rev;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = scan.nextInt();
		int sum=0;
		
		rem = num % 10;
		sum = sum + rem ;
		
		rem = (num / 10)%10;
		sum = sum + rem;
		
		rem = (num / 100)%10;
		sum = sum + rem;
		
		rem = (num /1000);
		sum = sum + rem;
		
		System.out.println("The sum is:" + sum);
	}
}