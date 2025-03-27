package Loopng_PDF;

/* 17. Write a C program to check whether a number is palindrome or not.  */

import java.util.*;

public class Q17_Check_Palindrome_Or_Not 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		
		// main logic
		
		// first reverse Number
		System.out.println("Reverce Number:");
		int temp = num;
		
		int rev=0;
		int rem=0;
		
		for(;temp!=0;)
		{
			rem = temp % 10;
			rev = (rev * 10) + rem;
			temp = temp / 10;
		}
		System.out.println(rev);
		
		// check palindrome logic
		
		if(num == rev)
		{
			System.out.println("Number is Palindrome:\t" + num);
		}
		else
		{
			System.out.println("Number is Not Palindrome:\t" + num);
		}
	}

}
