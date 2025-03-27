package com.java;
/* Problem Statement: Calculate the discount on a product based on its category in a store. The discount rules are:

Electronics: 10% discount.
Clothing: 15% discount, but 20% if the purchase amount is over Rs. 5000.
Food: No discount, unless the purchase amount is over Rs. 1000, then 5% discount.*/

import java.util.*;

public class DiscountOnProduct
{
	public static void main(String args[])
	{
		int choise;
		Scanner scan = new Scanner(System.in);
		System.out.println("Which of the following to purchase");
		System.out.println("1. Electronics product ");
		System.out.println("2. Clothing product ");
		System.out.println("3. Food product ");
		
		choise = scan.nextInt();
		
		System.out.println("Enter the purchase amount: ");
		int amount = scan.nextInt();
		int discount,totalbill;

		switch (choise)
		{
			case 1:
				discount = (amount*10)/100;
				System.out.println("Discount is:" + discount);
				totalbill = amount - discount;
				System.out.println("Total bill:"+totalbill);
				break;
			
			case 2:
				if(amount > 5000)
				{
					discount = (amount*15)/100;
					int extradic = (amount*20)/100;
					int alldis = discount + extradic;
					System.out.println("Discount is:"+ alldis);
					totalbill = amount - alldis;
					System.out.println("Total bill:" + totalbill);
				}
				else
				{
					discount = (amount*15)/100;
					System.out.println("Discount:" + discount);
					totalbill = amount - discount ;
					System.out.println("Total bill:" + totalbill);
				}
				break;
			
			case 3:
				if(amount > 1000)
				{
					discount = (amount*5)/100;
					System.out.println("Discount:" + discount);
					totalbill = amount-discount;
					System.out.println("Total bill:" + totalbill);
				}
				else
				{
					System.out.println("No Discount");
					System.out.println("Total bill:" + amount);
				}
				break;
	
			default:
				System.out.println("Invalid");
		}
	}
}