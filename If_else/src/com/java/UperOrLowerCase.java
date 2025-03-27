package com.java;

/* Write a C program to check whether a character is uppercase or lowercase alphabet. */

import java.util.*;
public class UperOrLowerCase
{
	public static void main(String args[])
	{
		char ch;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Charactor :");
		ch = scan.nextLine().charAt(0);
		if(ch >= 'A' && ch <= 'Z' )
		{
			System.out.println("Character is Uppercase");
		}
		else 
		{
			System.out.println("Character is Lowercase");
		}
	}
}