package com.java;
/* 4. Write a java program to print all even numbers between 1 to 100. - using for loop */

import java.util.*;

public class ForPrintEvenNumber
{
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the number");
		num = sc.nextInt();

		System.out.println("Print all even numbers");

		for(int i = 1 ; i <= num ; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
		}
	}
} 
