package com.java;
/* 10. Write a java program to count number of digits in a number. using for loop */

import java.util.*;

public class ForCountDigitOfNumber
{	
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		num = sc.nextInt();
	
		int count = 0;		

		for(;num > 0 ;)
		{
			num = num / 10;
			count++;
		}
		System.out.println("Number of Digit in Number : " + count);
	}
}