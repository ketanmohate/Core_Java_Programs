package com.java;
/* Write a java program to calculate sum of digits of a number.*/
	
import java.util.*;

public class SumOFDigitApp
{
	public static void main(String args[])
	{
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scan.nextInt();

		int sum = 0;

		while(num !=0)
		{
			sum = sum + (num % 10);
			num  = num / 10;
		}
		
		System.out.println("Sum of :" + sum);
	}
}