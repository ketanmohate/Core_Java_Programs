package com.java;
/* 6. Write a C program to find sum of all natural numbers between 1 to n.*/

import java.util.*;

public class SumOfNaturlNo
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		
		int i = 1,sum=0;
		
		while(i <=num)
		{
			sum = sum + i;
			i++;
		}
		System.out.println("Sum of Natural Number:" + sum);
	}
}