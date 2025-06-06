package Loopng_PDF;

/* 31. Write a C program to print all Armstrong numbers between 1 to n.*/

import java.util.*;

public class Q31_Print_All_Armstrong_Numbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of N(limit):");
		int n = sc.nextInt();
		
		// main logic
		System.out.println("Print All Armstrong Number:");
		for(int i=1 ; i<=n ;i++)
		{
			int temp = i;
			
			// count digit
			int count=0;
			for(;temp!=0;)
			{
				temp = temp /10;
				count++;
			}
			
			//
			temp=i; 
			int rem=0;
			int sum=0;
			for(;temp!=0;)
			{
				int pow =1;
				
				rem = temp % 10;
				
				for(int j=0;j<count;j++)
				{
					pow = pow * rem;
				}
				
				sum = sum + pow;
				
				temp = temp/10;
				
			}
			if(sum==i)
			{
				System.out.println(i);
			}
			
		}
		
	}

}
