package com.java;

/* Write a C program to input cost price and selling price of a product and check profit or loss. */

import java.util.*;
public class ProfitOrLossApp
{
	public static void main(String args[])
	{
		int costp,sellp;
		int result;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the cost price :");
		costp = scan.nextInt();
		System.out.println("Enter the selling price:");
		sellp = scan.nextInt();
		result = sellp - costp;
		if(result > 0)
		{
			System.out.println("Profit of " + result);
		}
		else if(result < 0) 
		{
			System.out.println("Loss of " + result);
		}
		else
		{
			System.out.println("No loss Or Profit");
		}
	}
}
		