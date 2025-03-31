package mock.org;

/*
 * 2. Factorial of a Number
Description: Write a program to compute the factorial of a given number n.
Input: n = 4


Output: 24
 */

import java.util.*;

public class Q2_Factorial_of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int fact = 1;
		for(int i=1 ; i<=num ; i++)
		{
			fact = fact * i;
		}
		System.out.println(fact);
	}

}
