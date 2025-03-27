package com.java;
/* 6. Write a java program to find sum of all natural numbers between 1 to n. using for loop */

import java.util.*;
	
public class ForSumofNatualNO
{
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		num = sc.nextInt();
		int sum = 0;		

		for(int i = 1 ; i <= num ; i++)
		{
			sum = sum + i;
		}
		System.out.println("Sum of Natural Numbers: " + sum);
	}
}
