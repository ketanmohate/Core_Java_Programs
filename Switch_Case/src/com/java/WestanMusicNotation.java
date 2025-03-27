package com.java;
/* Q.5.  Write a java Program to enter Indian Classical music notations and print its Western Music notations. uses Switch case)

Indian Musical notes	Western Musical notes
	S			C
	R			D
	G			E
	M			F
	P			G
	D			A
	N			B 
*/

import java.util.*;

public class WestanMusicNotation
{
	public static void main(String args[])
	{
		char choise;
		Scanner scan = new Scanner(System.in);
		System.out.println("Indian Musical notes");
		System.out.println("S");
		System.out.println("R");
		System.out.println("G");
		System.out.println("M");
		System.out.println("P");
		System.out.println("D");
		System.out.println("N");
		System.out.println("Enter the  your choise:");

		choise  = scan.next().charAt(0);
		
		switch (choise)
		{
			case 'S':
				System.out.println("Western Musical notes : C");
				break;
			case 'R':
				System.out.println("Western Musical notes : D");
				break;
			case 'G':
				System.out.println("Western Musical notes : E");
				break;
			case 'M':
				System.out.println("Western Musical notes : F");
				break;
			case 'P':
				System.out.println("Western Musical notes : G");
				break;
			case 'D':
				System.out.println("Western Musical notes : A");
				break;
			case 'N':
				System.out.println("Western Musical notes : B");
				break;
			default:
				System.out.println("Invalid");
		}
	}
}