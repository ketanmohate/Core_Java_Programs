package com.java;
/* Program 1. Write a Java program to display all  Armstrong numbers from 1 to N (Take N from 
user). */

import java.util.*;

public class TestAllArmstrongNo
{
	public static void main(String args[])
	{
			Scanner sc = new Scanner(System.in);
				
			System.out.println("Enter the range");
			int num = sc.nextInt();
			
			for(int i=1;i<=num;i++)
			{
				int temp = i;
				int rem=0;
				int sum=0;
				
				while(temp != 0)
				{
					rem=temp%10;
					sum=sum+rem*rem*rem; 
					temp=temp/10;
				}
				if(num==i)
				{
					System.out.println("All No: "+i);
				}
			}

	}
}