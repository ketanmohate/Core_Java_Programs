package com.java;
/*7. Write a C program to find sum of all even numbers between 1 to n.*/

import java.util.*;

public class SumOfEvenNumber
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);	
		System.out.println("Enter the number:");	
		int num = scan.nextInt();
		
		int i = 1,sum = 0;
		
		while(i <=num)
		{
			if(i % 2 == 0)
			{
				sum = sum + i ;
			}
		i++;			
		}
		System.out.println("Sum Of Even Numbar :" + sum);
	}
}