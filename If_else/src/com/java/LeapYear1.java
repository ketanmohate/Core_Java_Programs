package com.java;

/* Write a C program to check whether a year is leap year or not. */

import java.util.*;
public class LeapYear1
{
	public static void main(String args[])
	{	
		int year;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Year:");
		year = scan.nextInt();
		if(year%4==00 )
		{
			System.out.println("It is Leap Year");
		}
		else
		{
			System.out.println("It is Not Leap Year");
		}
	}
}