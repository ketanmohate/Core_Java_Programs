package com.java;

/* WAP to input four digit numbers and swap its first and last digit.*/

import java.util.*;
public class SwapFirstLastDigit
{
	public static void main(String x[])
	{
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the four Digit number :");
		num = scan.nextInt();
		
		int digit1=(num/1000); 
		int digitlast = (num %10); 
		int digitmid = (num / 10) % 100;
		int swap = (digitlast * 1000 + digitmid * 10 + digit1);
		System.out.println("Swap number is :" + swap);
	}
} 
