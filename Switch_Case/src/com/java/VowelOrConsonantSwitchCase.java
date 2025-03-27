package com.java;
/* Write a java program to input any alphabet and check whether it is vowel or consonant.(Using Switch case)*/

import java.util.*;

public class VowelOrConsonantSwitchCase
{
	public static void main(String args[])
	{
		char ch;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the chatactor:");
		ch = scan.nextLine().charAt(0);
		
		switch (ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
					System.out.println("Vowel");
					break;
			default:
					System.out.println("Consonant");
		}
	}
}