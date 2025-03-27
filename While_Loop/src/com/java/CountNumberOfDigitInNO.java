package com.java;
/* 10. Write a java program to count number of digits in a number.*/

import java.util.*;

public class CountNumberOfDigitInNO
{
	public static void main(String args[])
	{
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scan.nextInt();
		
		int count = 0;

		while(num != 0)
		{
			num = num /10;
			count++;
		}
		System.out.println("Number of digit:" + count);
	}
}
