package com.java;
/* 33. Write a java program to print all Perfect numbers between 1 to n. using for loop */

import java.util.*;

public class ForPrintAllPerfectNo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int i ;
		for(i = 1 ; i < num ; i++); // 28
		{
			int sum = 0;
			int j ;
			for(j = 1 ; j < i ; j++) // 28
			{
				if(j % 2 == 0) //
				{
					sum = sum + j;
				}	
			}
			if(num == sum)
			{
				System.out.println(i);
			}
		} 
	}
}
		
		

