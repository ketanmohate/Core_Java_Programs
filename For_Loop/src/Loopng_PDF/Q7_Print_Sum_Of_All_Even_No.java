package Loopng_PDF;

/* 6. Write a C program to find sum of all natural numbers between 1 to n. */

import java.util.*;

public class Q7_Print_Sum_Of_All_Even_No 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of N(limit):");
		int n = sc.nextInt();
		
		int sum=0;
		
		System.out.println("Print Sum Of All Natural Numbers:");
		for(int i = 1 ; i <= n ; i++)
		{
			if(i%2 == 0)
			{
				sum = sum + i;
			}
		}
		System.out.println(sum);

	}

}
