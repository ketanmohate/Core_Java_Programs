package com.java;

/*Write a Java program to Input cost price and selling price of a product and check profit or loss.*/
import java.util.*;
public class ProfitLoss
{
	public static void main(String x[])
	{
		int costprice,sellprice;
		String result;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the cost Price:");
		costprice = scan.nextInt();
		System.out.println("Enter the selling price:");
		sellprice = scan.nextInt();
		result = (costprice < sellprice)?"Profit":"Loss";
		System.out.println(result);
	}
}