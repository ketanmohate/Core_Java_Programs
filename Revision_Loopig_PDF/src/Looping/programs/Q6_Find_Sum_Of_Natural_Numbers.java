package Looping.programs;

/*
 * 6. Write a C program to find sum of all natural numbers between 1 to n.
 */

import java.util.*;

public class Q6_Find_Sum_Of_Natural_Numbers {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		
		System.out.println("Sum Of Natual Numbers");
		int sum =0;
		for(int i=1 ; i<=n ; i++)
		{
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
