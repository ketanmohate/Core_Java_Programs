package Date_02__08_2024;

import java.util.*;

/* 4.Write a C program to check whether a number is divisible by 5 and 11 or not. */

public class P4_number_is_divisible_by_5_and_11_or_not 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();

		if(num % 5 == 0 && num % 11 == 0) // number is 55,110,164
		{
			System.out.println("Number is divisible by 5 and 11");
		}
		else
		{
			System.out.println("Number is Not Divisible by 5 and 11");
		}
		
	}
}
