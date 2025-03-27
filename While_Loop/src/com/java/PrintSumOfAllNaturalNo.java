package com.java;
/* 6. Write a Java program to find sum of all natural numbers between 1 to n.*/
	
import java.util.*;
	
public class PrintSumOfAllNaturalNo
{
	public static void main(String args[])
	{
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		num = scan.nextInt();
		
		int i = 1;
		int sum = 0;

		while(i <= num)
		{
			sum = sum + i;
			i++;
		}	
		System.out.println("Sum of natural number:" + sum);
	}
} 
		