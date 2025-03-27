package com.java;
/*Write a java program to take a 4 digit number as command line argument, reverse the 
number and also find the sum of digits. */

import java.util.*;
public class reversnumberfore
{
	public static void main(String[]args)
	{
		int num , rem =0 ,sum =0 ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = scan.nextInt();
		int rev = (num % 10)*1000 + ((num / 10)%10) * 100 + ((num / 100 )%10)*10 + (num / 1000);
		System.out.println("revers number is:" + rev);
	}
}