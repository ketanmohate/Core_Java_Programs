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
public class PrintTotalNumberOfNotes
{
	public static void main(String args[])
	{
		int amount; 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		amount = scan.nextInt();
		
		int Nnote,Ramount;
		
		if(amount > 1)
		{
			Nnote = (amount / 500); 
			Ramount = (Nnote * 500);
			amount = amount - Ramount;
			System.out.println("500 = " + Nnote);
			
			Nnote = (amount / 100);
			Ramount = (Nnote * 100);
			amount = amount - Ramount;
			System.out.println("100 = " + Nnote);
			
			Nnote = (amount / 50);
			Ramount = (Nnote * 50);
			amount = amount - Ramount;
			System.out.println("50 = " + Nnote);
			
			Nnote = (amount / 20);
			Ramount = (Nnote * 20);
			amount = amount - Ramount;
			System.out.println("20 = " + Nnote);
			
			Nnote = (amount / 10);
			Ramount = (Nnote * 10);
			amount = amount - Ramount;
			System.out.println("10 = " + Nnote);
			
			Nnote = (amount / 5);
			Ramount = (Nnote * 5);
			amount = amount - Ramount;
			System.out.println("5 = " + Nnote);
			
			Nnote = (amount / 2);
			Ramount = (Nnote * 2);
			amount = amount - Ramount;
			System.out.println("2 = " + Nnote);
			
			Nnote = (amount / 1);
			Ramount = (Nnote * 1);
			amount = amount - Ramount;
			System.out.println("1 = " + Nnote);
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}