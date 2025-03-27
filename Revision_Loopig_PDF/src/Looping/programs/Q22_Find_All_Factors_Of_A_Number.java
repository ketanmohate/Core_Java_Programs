package Looping.programs;

/*22.	Write a C program to find all factors of a number.*/

import java.util.*;

public class Q22_Find_All_Factors_Of_A_Number {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		System.out.println("The factors of number are:");
		for(int i=1 ; i<=num ; i++)
		{
			if(num % i == 0)
			{
				System.out.println(i);
			}
		}
	}
}
