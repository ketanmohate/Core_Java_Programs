package com.java;
/* 8. Write a Java program to find sum of all odd numbers between 1 to n.*/

import java.util.*;

public class AllOddNumberApp
{
	public static void main(String args[])
	{
		int  num;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the numbe:");
		num = scan.nextInt();
		
		int i = 1;	
		int sum = 0;	
		
		System.out.println("Sum of All odd Number");		

		while(i <= num)
		{
			if(i % 2 == 1)
			{
				sum = sum + i;
			}
			i++;
		}
		System.out.println(sum);
	}
}		
		