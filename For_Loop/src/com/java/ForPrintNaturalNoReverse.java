package com.java;

/* 2. Write a java program to print all natural numbers in reverse (from n to 1). - using for loop */

import java.util.*;

public class ForPrintNaturalNoReverse
{
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the number");
		num = sc.nextInt();

		System.out.println("Natural revers number");
		
		for(int i = num; i >=1 ; i--)
		{
			System.out.println(i);
		}
	}
}