package com.java;
/* 6. Write a Java program to enter a number and print its reverse.*/

import java.util.*;
	
public class PrintReverseNumberApp
{
	public static void main(String args[])
	{
		int num;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number:");
		num = scan.nextInt();
		
		int rem;
		int rev = 0;
		
		while(num > 0) 
		{
			rem = num % 10;  // 5 
			rev = rev * 10 + rem; 
			num = num / 10; 
		}
		System.out.println("Reverse Number:" + rev);
	}
}