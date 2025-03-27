package Looping.programs;

/*
 * 8.	Write a C program to find sum of all odd numbers between 1 to n.
 */

import java.util.*;

public class Q8_Find_Sum_Of_Odd_Numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		
		System.out.println("Sum Of Odd Numbers");
		int sum=0;
		for(int i=1 ; i<=n ; i++)
		{
			if(i%2 != 0)
			{
				sum = sum +i;
			}
		}
		System.out.println(sum);
	}

}
