package com.java;
/* 9. Write a java program to print multiplication table of any number. using for loop */

import java.util.*;

public class ForPrintMultiplicationTable
{
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		num = sc.nextInt();
	
		System.out.println("Multiplication table of :" + num);

		for(int i = 1 ; i <= 10 ; i++)
		{
			System.out.println(num + " * " + i + " = " + i*num);
		}
	}
}