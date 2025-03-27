package com.java;
/* 31. Write a java program to print all Armstrong numbers between 1 to n. using for loop */

import java.util.*;

public class ForPrintAllArmstrongNO
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		for(int i = 1 ; i < num ; i++)
		{
			int rem = 0;
			int sum = 0;
			int temp = i;
			
			for(;temp != 0;)
			{
				rem = temp % 10;
				sum = sum + rem * rem * rem;
				temp = temp / 10;
			}
			if(i == sum)
			{
				System.out.println(i);
			}
		}
		
	}
}
