package com.java;

/*Q1. Write a java program to check whether number is positive or negative or zero.*/

import java.util.*;
public class PisitiveNegativeZero
{
	public static void main(String args[])
	{
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scan.nextInt();
		if(num>0)
		{
			System.out.println("Number is posirive");
		}
		else if(num<0)
		{
			System.out.println("Number is nagative");
		}
		else
		{
			System.out.println("Number is zero");
		}
	}
}
