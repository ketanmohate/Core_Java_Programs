package com.java;
/* Write a C program to find sum of first and last digit of a number. */
	
import java.util.*;

public class SumOfFirstAndLastDigit
{
	public static void main(String args[])
	{
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scan.nextInt();
	
		int lastdigit = num % 10;
		int firstdigit = num;
		
		while(firstdigit >= 10)
		{
			firstdigit = firstdigit / 10;
		}
		
		int sum = firstdigit + lastdigit;
		System.out.println("Sum of First and Last digit:" + sum );
	}
}