package com.java;

/* Q13.Write a java program to find total number of notes in given amount. How to write a java program to print total number of notes in given amount. 
Input from user:
Enter the amount: 2528
Expected output:
500=5
100=0
50=0
20=1
10=0
5=1
2=1
1=1 */

import java.util.*;
public class m
{
	public static void main(String args[])
{
		int amount;
		int noNotes,res;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount:");
		amount = scan.nextInt();

		if(amount >= 1)
		{
			noNotes = amount / 500;
			res = 500 * noNotes;
			System.out.println("500" + "=" + noNotes);
			amount = amount-res;

			noNotes = amount / 100;
			res = 100 * noNotes;
			System.out.println("100" + "=" + noNotes);
			amount = amount-res;

			noNotes = amount / 50;
			res = 50 * noNotes;
			System.out.println("50" + "=" + noNotes);
			amount = amount-res;

			noNotes = amount / 20;
			res = 20 * noNotes;
			System.out.println("20" + "=" + noNotes);
			amount = amount-res;

			noNotes = amount / 10;
			res = 10 * noNotes;
			System.out.println("10" + "=" + noNotes);
			amount = amount-res;

			noNotes = amount / 5;
			res = 5 * noNotes;
			System.out.println("5" + "=" + noNotes);
			amount = amount-res;

			noNotes = amount / 2;
			res = 2 * noNotes;
			System.out.println("2" + "=" + noNotes);
			amount = amount-res;

			noNotes = amount / 1;
			res = 1 * noNotes;
			System.out.println("1" + "=" + noNotes);
			amount = amount-res;
		}
	}
}