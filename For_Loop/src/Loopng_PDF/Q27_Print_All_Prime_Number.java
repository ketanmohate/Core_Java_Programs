package Loopng_PDF;

/* 27. Write a C program to print all Prime numbers between 1 to n. */

import java.util.*;

public class Q27_Print_All_Prime_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of N(Limit)");
		int n = sc.nextInt();
		
		// main logic;
		System.out.println("Prime Numbers");
		for(int i = 1 ; i <= n ; i++)
		{
			int count=0;
			
			for(int j = 1 ; j <= i ; j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
		
	}

}
