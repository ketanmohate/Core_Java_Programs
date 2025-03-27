package com.java;

/*Q3. Write a java program to input cost price and selling price of a product and check profit or loss. */

import java.util.*;
public class PROFIRorLOSSapp
{
	public static void main(String args[])
	{
		int costprice , sellprice;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the cost price:");
		costprice = scan.nextInt();
		System.out.println("Enter the selling price");
		sellprice = scan.nextInt();
		
		if(costprice < sellprice)
		{
			int result1 = sellprice - costprice;
			System.out.println("Profit :" + result1);
		}
		else if(costprice > sellprice)
		{
			int result2 = costprice - sellprice ;
			System.out.println("Loss :" + result2);
		}
		else
		{		
			System.out.println("No prifit OR loss");
		}
	}
}
