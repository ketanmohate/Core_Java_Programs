package Loopng_PDF;

/* 29. Write a C program to find all prime factors of a number.*/

import java.util.*;

public class Q29_Find_All_Prime_Factors_Of_A_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		
		// main logic
		System.out.println("Print all prime factors:");
		for(int i=1 ; i<=num ;i++)
		{
			int count=0;
			for(int j=1; j<=i ;j++)
			{
				if(i%j ==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				if(num%i==0)
				{
					System.out.println(i);
				}
			}
				
		}
	}

}
