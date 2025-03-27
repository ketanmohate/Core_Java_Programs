package com.java;
/* Write a java program to find first and last digit of a number.*/
		
import java.util.*;
	
public class ForFirstAndLastDigitNO
{
	public static void main(String args[])	
	{
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scan.nextInt();
		
		int lastdigit = (num % 10);
		int firstdigit = num;

		for(int i=10 ;firstdigit >= i ;)
		{
			firstdigit = firstdigit / i;
		}
		System.out.println("First digit :" + firstdigit);
		System.out.println("Last digit :" + lastdigit);		
	}
}