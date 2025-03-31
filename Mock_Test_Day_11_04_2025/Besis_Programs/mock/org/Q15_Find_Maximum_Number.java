package mock.org;

/*
 * 15. Find Maximum Number
Description: Write a program to find the maximum number between two numbers.
Input: a = 10, b = 20


Output: 20
 */

import java.util.*;

public class Q15_Find_Maximum_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the tow Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(b);
		}
	}

}
