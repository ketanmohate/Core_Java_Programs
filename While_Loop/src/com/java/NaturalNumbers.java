package com.java;
/* 1. Write a java program to print all natural numbers from 0 to n.*/

import java.util.*;
public class NaturalNumbers
{
	public static void main(String args[])
	{
		int i = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scan.nextInt();
		
		System.out.println("Natural Number:");
		while(i<=n)
		{	
			System.out.println(i);
			i ++;
		}
	}
}