package com.java;

import java.util.*; 	
public class CabService
{
	public static void main(String args[])
	{
		int x,y;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the charges for the first cab service (XX): ");
		x = scan.nextInt();
		System.out.println("Enter the charges for the second cab service (YY): ");
		y = scan.nextInt();
	
		if(x < y)
		{
			System.out.println("First");
		}
		else if(x > y)
		{
			System.out.println("Second");
		}
		else
		{
			System.out.println("Any");
		}
	}
}