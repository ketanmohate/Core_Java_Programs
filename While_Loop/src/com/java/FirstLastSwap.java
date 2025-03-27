package com.java;
/* 3. Write a Java program to swap first and last digits of a number.*/
	
import java.util.*;
	
public class FirstLastSwap
{
	public static void main(String args[])
	{
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number");
		num = scan.nextInt();

		int count = 0;
		int temp = num;
		
		while(temp > 0) 
		{
			temp = temp / 10;
			count++;
		}
			
		System.out.println(count);
		
		int x = 1;
		int i = 1;

		while(i < count)
		{
			x = x * 10;
			i++;
		}	

		System.out.println(x);

		int firstdigit = num / x;
		int lastdigit = num % 10;
		int mid = num % x / 10;

		System.out.println("first digit" + firstdigit);
		System.out.println("last digit" + lastdigit);
		System.out.println("mid" + mid);

		int swap = lastdigit * x + mid * 10 + firstdigit;

		System.out.println("After swaping");		
		System.out.println(swap);

	}
}
	