package Date_02__08_2024;

/* 5.Write a C program to check whether a number is even or odd. */

import java.util.*;

public class P5_number_is_even_or_odd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		if(num % 2 ==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}

	}

}
