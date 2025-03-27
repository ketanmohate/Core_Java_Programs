package Date_03__08_2024;

/* 18.Write a C program to calculate profit or loss. */

import java.util.*;

public class P18_calculate_profit_or_loss 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Cost price:");
		long costprice = sc.nextLong();
		
		System.out.println("Enter the Selling price");
		long sellprice = sc.nextLong();
		
		long result = sellprice - costprice ;
		
		if(result > 0)
		{
			System.out.println("Profit");
		}
		else if (result < 0)
		{
			System.out.println("Loss");
		}
		else
		{
			System.out.println("No Profit And Loss");
		}
	}
}
