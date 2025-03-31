package mock.org;

/*
 * 13. Check for Prime Number
Description: Write a program to check if a number n is prime.
Input: n = 7


Output: Prime
 */

import java.util.*;

public class Q13_Check_for_Prime_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int count = 0;
		for(int i=2 ; i<=num ; i++)
		{
			if(num%i == 0)
			{
				count ++;
			}
		}
		if(count == 1)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is Not Prime");
		}
	}

}
