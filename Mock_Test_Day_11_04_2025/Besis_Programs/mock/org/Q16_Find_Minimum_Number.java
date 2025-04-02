package mock.org;

import java.util.Scanner;

/*
 * 16. Find Minimum Number
Description: Write a program to find the minimum number between two numbers.
Input: a = 10, b = 20


Output: 10

 */

public class Q16_Find_Minimum_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the tow Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a<b)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(b);
		}
	}

}
