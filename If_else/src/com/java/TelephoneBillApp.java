package com.java;
/* Q.1. Write a java program to prompt user input to take no. of telephone calls And Calculate monthly telephone bill as per following table:

up to 100 Calls : ₹ 200
next 50 calls : ₹ 0.7 per call,
next 50 calls : ₹ 0.6 per call.
above 200 Calls : ₹ 0.5 per cell.
Calculate bill according to no. of Calls.*/

import java.util.*;
public class TelephoneBillApp
{
	public static void main(String args[])
	{
		int ncalls;
		Scanner scan = new Scanner(System.in);	
		System.out.println("Enter the number of call:");
		ncalls = scan.nextInt();
		
		double bill = 0;		

		if(ncalls <= 100)
		{
			bill = 200;
			System.out.println("Total bill:" + bill);
		}
		else if(ncalls <= 150)
		{
			bill = 200 + ((ncalls - 100) * 0.7);
			System.out.println("Totel bill:" + bill);
		}
		else if(ncalls <= 200)
		{
			bill = 200 + 50 * 0.7 + ((ncalls - 150) * 0.6);
			System.out.println("Total bill:" + bill);		
		}
		else 
		{
			bill = 200 + 50 * 0.7 + 50 * 0.6 + ((ncalls - 200) * 0.5);	
			System.out.println("Total bill:" + bill);
		}
	}
}