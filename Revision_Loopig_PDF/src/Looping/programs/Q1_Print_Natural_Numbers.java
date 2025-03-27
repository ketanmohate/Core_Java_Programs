package Looping.programs;

/*
 * 1. Write a C program to print all natural numbers from 1 to n. - using while loop
 */

import java.util.*;

public class Q1_Print_Natural_Numbers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		
		System.out.println("Natural Numbers");
		for(int i=1 ; i<=n ; i++)
		{
			System.out.println(i);
		}
	}
}
