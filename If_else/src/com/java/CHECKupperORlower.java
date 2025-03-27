package com.java;

/*Q7. Write a C program to check whether a character is uppercase or lowercase alphabet.*/

import java.util.*;
public class CHECKupperORlower
{
	public static void main(String args[])
	{	
		char ch;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character:");
		ch = scan.nextLine().charAt(0);
		if(ch >= 'A' && ch<= 'A')
		{
			System.out.println("Character is uppercase");
		}
		else if(ch >='a' && ch <='b')
		{
			System.out.println("Character is lowercase");
		}
		else
		{
			System.out.println("plz Enter a alphabet");
		}
	}
}