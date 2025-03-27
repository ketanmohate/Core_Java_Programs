package com.java;

/* WAP to input three digit numbers and check number is palindrome or not using conditional operator. */
import java.util.*;
public class ThreeDigitPalindrome
{
	public static void main(String args[])
	{
		int num ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scan.nextInt();
		int rev = (num % 10)*100 + ((num/10)%10)*10 + (num/100);
		if (num == rev )
		{
			System.out.println("Number is palindrome ");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	}
}
