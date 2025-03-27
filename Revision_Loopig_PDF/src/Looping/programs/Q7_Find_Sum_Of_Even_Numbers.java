package Looping.programs;

/*
 * 7.	Write a C program to find sum of all even numbers between 1 to n.
 */

import java.util.*;

public class Q7_Find_Sum_Of_Even_Numbers {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		
		System.out.println("Sum Of Even numbers");
		int sum =0;
		for(int i=1 ; i<=n ; i++)
		{
			if(i%2 == 0)
			{
				sum = sum+i;
			}
		}
		System.out.println(sum);
	}
}
