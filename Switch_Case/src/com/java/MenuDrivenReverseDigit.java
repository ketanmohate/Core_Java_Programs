package com.java;
/* Q.2 Write a Menu driven program for following

1. Reverse two digit number

2. Reverse three digit number

3. Reverse four digit number */

import java.util.*;
public class MenuDrivenReverseDigit
{
	public static void main(String args[])
	{
		int choise;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your choise");
		System.out.println("1. Reverse two digit number");
		System.out.println("2. Reverse three digit number");
		System.out.println("3. Reverse four digit number");
		choise = scan.nextInt();
		
		int num;
		int rev;

		switch (choise)
		{
			case 1:
				System.out.println("Enter the number:");
				num = scan.nextInt();
				rev = (num % 10)*10 + (num / 10);
				System.out.println("Reverse number is:" + rev);
				break;
			case 2:
				System.out.println("Enter the number:");
				num = scan.nextInt();
				rev = (num % 10)*100 + ((num / 10) % 10)*10 + (num/100);
				System.out.println("Reverse number is:" + rev);
				break;
			case 3:
				System.out.println("Enter the number:");
				num = scan.nextInt();
				rev = (num % 10)*1000 + (( num / 10) % 10)*100 + ((num / 100) % 10)*10 + (num / 1000);
				System.out.println("Reverse number is:" + rev);
				break;
			default:
				System.out.println("Invalid");
		}
	}
}