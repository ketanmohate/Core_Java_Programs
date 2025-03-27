package com.java;
/* 2. Write a java program to print all natural numbers in reverse (from n to 1).*/

import java.util.*;

public class ReverseNaturalNumber
{
	public static void main(String args[])
	{
		int num;
		int i =1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scan.nextInt();
		
		System.out.println("Reverse Natural Number:");

		while(i <= num)
		{
			System.out.println(num);
			num--;
		}
	}
}