package mock.org;

/*
 * 50. Find Greatest Common Divisor (GCD)
Description: Write a program to find the greatest common divisor (GCD) of two numbers.
Input: a = 12, b = 15


Output: 3
 */

import java.util.*;

public class Q50_Find_Greatest_Common_Divisor_GCD {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the two value");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=2 ; i<=b ; i++)
		{
			if(a%i == 0 && b%i == 0)
			{
				System.out.println(i);
				break;
			}
		}
	}

}
