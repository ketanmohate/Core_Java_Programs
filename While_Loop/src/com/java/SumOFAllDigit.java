package com.java;
/* 4. Write a Java program to calculate sum of digits of a number.*/

import java.util.*;
	
public class SumOFAllDigit
{
	public static void main(String args[])
	{
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		num = scan.nextInt();
	
		int i = 0;
		int rem;
		int sum = 0;
	
		while(num > i)
		{
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println("Sum :" + sum);
	}
}