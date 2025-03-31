package mock.org;

/*
 * 7. Reverse a Number
Description: Write a program to reverse the digits of a given number.
Input: n = 12345


Output: 54321
 */

import java.util.*;

public class Q7_Reverse_a_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int rev = 0;
		
		while(num !=0)
		{
			int digit = num % 10;
			rev = (rev * 10) + digit;
			num = num / 10;
		}
		System.out.println(rev);
	}

}
