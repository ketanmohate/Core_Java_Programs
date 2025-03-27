package com.java;

/*Q2. Write a java program to check whether charcter is alpbhabet or not.*/

import java.util.*;
public class AlphabetOrNotApp
{
	public static void main(String args[])
	{
		char ch;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Character :");
		ch = scan.nextLine().charAt(0);
		if(ch >='a' && ch <='z' || ch >='A' && ch<='Z')	
		{
			System.out.println(" Character is alphabet ");
		}
		else
		{
			System.out.println("character is Not alphabet");
		}
	}
}
