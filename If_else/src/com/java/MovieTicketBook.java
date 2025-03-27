package com.java;

/* Example 1: Movie Ticket Pricing
Problem Statement: Calculate the price of a movie ticket based on the customer's age and whether it's a weekend. The pricing is as follows:
			Children (under 13 years): Rs. 100 on weekdays, Rs. 120 on weekends.
			Adults (13 to 64 years): Rs. 150 on weekdays, Rs. 180 on weekends.
			Seniors (65 years and above): Rs. 130 on weekdays, Rs. 150 on weekends. */

import java.util.*;
public class MovieTicketBook
{
	public static void main(String args[])
	{
		int age;
		int days;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age:");
		age = scan.nextInt();
		System.out.println("Enter the days:");
		System.out.println("1.Monday, 2.Tuesday, 3.Wednesday, 4.Thursday, 5.Friday, 6.Saturday, 7.Sunday.");
		days = scan.nextInt();
		
		if(age < 13)
		{
			if(days == 6 || days == 7)
			{
				System.out.println("Rs.120");
			}
			else 
			{
				System.out.println("Rs.100");
			}
		}

		else if(age >= 13 && age <= 64)
		{
			if(days == 6 || days == 7)
			{
				System.out.println("Rs.180");
			}
			else 
			{
				System.out.print("Rs.150");
			}
		}

		else 
		{
			if(days == 6 || days == 7)
			{
				System.out.println("Rs.150");
			}
			else 
			{
				System.out.print("Rs.130");
			}
		}
	}
}
