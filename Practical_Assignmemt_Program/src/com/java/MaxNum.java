package com.java;

/* Write a java program to find maximum between two numbers.*/

import java.util.*;
public class MaxNum
{
	public static void main(String args[])
	{
		int num1,num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Two number :");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		if(num1 > num2 )
		{
			System.out.println("Max number is :" + num1);
		}
		else 
		{
			System.out.println("Max number is :" + num2);
		}
	}
}
		
