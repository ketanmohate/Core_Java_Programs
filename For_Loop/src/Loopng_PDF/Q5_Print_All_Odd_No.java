package Loopng_PDF;

/* 5. Write a C program to print all odd number between 1 to 100. */

import java.util.*;

public class Q5_Print_All_Odd_No 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Value of N(limit)");
		int n = sc.nextInt();
		
		System.out.println("Print All Odd Numbers:");
		for(int i = 1 ; i <= n ; i++)
		{
			if(i%2 != 0)
			{
				System.out.println(i);
			}
		}

	}

}
