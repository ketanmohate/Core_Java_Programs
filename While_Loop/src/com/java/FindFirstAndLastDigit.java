package com.java;
/* 1. Write a Java program to find first and last digit of a number.*/

	
import java.util.*;
	
public class FindFirstAndLastDigit
{
	public static void main(String args[])
	{
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number");
		num = scan.nextInt();
		
		int firstdigit,lastdigit;	
		int temp = num;
		int count = 0;

		while(temp > 0)
		{
			temp = temp / 10; 
			count++;	
		}
		//System.out.println("Count:" + count);

		int x = 1;
		int i = 1;

		while(i < count)
		{
			x = x * 10;
			i++;
		}
	
		//System.out.println("Find x:" + x);

		firstdigit = num / x;
		lastdigit = num % 10;
		
		System.out.println("First digit :" + firstdigit);
		System.out.println("Last digit :" + lastdigit);
	}
}
