package com.java;
/* 9. Write a java program to print multiplication table of any number.*/

import java.util.*;

public class MultiplicationTableApp
{
	public static void main(String args[])
	{
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scan.nextInt();
		
		int i = 1;
		
		while(i <= 10)
		{
			System.out.println(num + " * " + i + " = "  + num * i);
			i++;
		}
	}
}