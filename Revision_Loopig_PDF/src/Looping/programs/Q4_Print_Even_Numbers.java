package Looping.programs;

/*
 * 4. Write a C program to print all even numbers between 1 to 100. - using while loop
 */

import java.util.*;

public class Q4_Print_Even_Numbers {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		
		System.out.println("Even Numbers");
		for(int i=1 ; i<=n ; i++)
		{
			if(i%2 == 0)
			{
				System.out.println(i);
			}
		}
	}
}
