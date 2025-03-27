package com.java;
/* Write a Java  program print total number of days in a month using switch case.*/

import java.util.*;
public class DaysInMonth
{
	public static void main(String args[])
	{
		int month;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Month : 1.January, 2.February, 3.March, 4.April, 5.May, 6.June, 7.July, 8.August, 9.September, 10.October, 		11.November, 12.December");
		month = scan.nextInt();
		System.out.println("Enter the year:");
		int year = scan.nextInt();

		
		switch(month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31 days");
				break;
			
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30 days");
				break;
			
			case 2:
				if(year % 4  == 0)
				{
					System.out.println("28 days");
				}
				else
				{
					System.out.println("29 days");
				}
				break;

			default:
				System.out.println("Invalid");
		}
	}
}



