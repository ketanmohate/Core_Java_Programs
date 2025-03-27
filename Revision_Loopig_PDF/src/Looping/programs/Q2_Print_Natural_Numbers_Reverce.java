package Looping.programs;

/*
 * 2. Write a C program to print all natural numbers in reverse (from n to 1). - using while loop
 */

import java.util.*;

public class Q2_Print_Natural_Numbers_Reverce {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		
		System.out.println("Natural Numbers in Reverse");
		for(int i=n ; i>=1 ; i--)
		{
			System.out.println(i);
		}
	}
}
