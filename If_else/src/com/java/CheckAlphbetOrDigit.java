package com.java;

/* Write a java program to input any character and check whether it is alphabet, digits Special character. */

import java.util.*;
public class CheckAlphbetOrDigit
{
	public static void main(String args[])
	{
		char ch;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the any character");
		ch = scan.nextLine().charAt(0);
		if(ch >='a' && ch <='z' || ch >='A' && ch <='Z')
		{
			System.out.println(ch + ":" + "It is alphabet");
		}
		else if(ch >='0' && ch <='9')
		{
			System.out.println(ch + ":" + "It is digit");
		}
		else
		{
			System.out.println(ch + ":" + "It is Special Charactor");
		}
	}
}
 