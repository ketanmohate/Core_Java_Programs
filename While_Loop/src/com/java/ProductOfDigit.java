package com.java;
/* 5. Write a Java program to calculate product of digits of a number.*/

import java.util.*;

public class ProductOfDigit
{
	public static void main(String args[])
	{
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		num = scan.nextInt();
			
		int i = 0;
		int product = 1;
		int rem;

		while(num > i)
		{
			rem = num % 10;
			product =  product * rem ;
			num  = num / 10;
		}
		System.out.println("Product Of Digit :" + product);
	}
}