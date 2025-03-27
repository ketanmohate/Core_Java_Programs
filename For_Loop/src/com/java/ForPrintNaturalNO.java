package com.java;
/* 1. Write a java program to print all natural numbers from 1 to n. - using for loop */

import java.util.*;

public class ForPrintNaturalNO
{
	public static void main(String args[])
	{
		int num;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scan.nextInt();

		System.out.println("Natural Number");
		for(int i = 1 ; i <= num ; i++)
		{
			System.out.println(i);
		}
	}
}