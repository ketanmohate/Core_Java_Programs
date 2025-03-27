package Looping.programs;

/*1.	Write a C program to check whether a number is palindrome or not.*/

import java.util.*;

public class Q17_Number_Is_Palindrome_Or_Not {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int temp = num;
		int rev = 0;
		
		while(temp !=0)
		{
			int digit = temp % 10;
			rev = rev * 10 + digit;
			temp = temp / 10;
		}
		
		if(num == rev)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is Not Palindrome");
		}
	}
}
