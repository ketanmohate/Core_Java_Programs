package Loopng_PDF;

/* 22. Write a C program to find all factors of a number. */

import java.util.*;

public class Q22_Find_All_Factors_Of_A_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to find its factor:");
		int n = sc.nextInt();
		
		// main logic
		
		System.out.println("Print All Factors:");
		
		for(int i = 1 ; i <= n ; i++)
		{
			if(n % i == 0)
			{
				System.out.println(i);
			}
		}
		
	}

}
