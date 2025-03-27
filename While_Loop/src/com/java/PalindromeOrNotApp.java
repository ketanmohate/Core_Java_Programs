package com.java;
/* 7. Write a Java program to check whether a number is palindrome or not.*/
	
import java.util.*;
	
public class PalindromeOrNotApp
{
	public static void main(String args[])
	{
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		num = scan.nextInt();
			
		int  i = 0;
		int rev = 0;
		int rem = 0;
		int temp = num;

		while(num > i)
		{
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println(rev);
		
		if(temp == rev)
		{
			System.out.println(temp + ": It is Palindrome");
		}
		else 
		{
			System.out.println(temp + ": It is not Palindrome");
		}
	}
}
			
		
	
		
