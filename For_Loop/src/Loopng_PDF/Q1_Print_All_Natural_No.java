package Loopng_PDF;

/* 1. Write a C program to print all natural numbers from 1 to n. - using while loop */

import java.util.*;

public class Q1_Print_All_Natural_No
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the N value(Limit):");
		int n = sc.nextInt();
		
		System.out.println("Print All Natural Number");
		for(int i = 1 ; i <= n ; i++)
		{
			System.out.println(i);
		}
	}

}
