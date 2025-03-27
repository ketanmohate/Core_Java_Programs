package com.java;

/*Q5. Write a C program to input any alphabet and check whether it is vowel or consonant.*/

import java.util.*;
public class VOWELORCONSONANT
{
	public static void main(String args[])	
	{
		char ch ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character:");
		ch = scan.nextLine().charAt(0);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
		{
			System.out.println(" It is Vowel");
		}
		else
		{
			System.out.println("It is Consonant ");
		}
	}
} 