package com.java;

/*
 Q1. Prime Number Checker for 1 to N 
Specification: Create a class PrimeChecker that takes an integer N via the constructor and 
checks if each number from 1 to N is a prime number using a loop. 
Input: An integer N. 
Output: Whether each number from 1 to N is a prime number or not. 
 */

import java.util.*;

class PrimeChecker
{
	 PrimeChecker(int num)
	 {
		 for(int i=2 ; i<=num ; i++)
		 {
			 boolean isPrime = true;
			 for(int j=2 ; j<i ; j++)
			 {
				 if(i % j == 0)
				 {
					 isPrime = false;
//	                 break;
				 }
			 }
			 if (isPrime) 
			 {
				 System.out.println(i + " ");
			 }
		 }
	 }
}

public class Q1_Prime_Number_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		PrimeChecker obj = new PrimeChecker(num);
		
	}

}
