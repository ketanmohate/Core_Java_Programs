package mock.org;

/*
 * 9. Sum of Digits
Description: Write a program to calculate the sum of digits of a given number.
Input: n = 234


Output: 9
 */

import java.util.*;

public class Q9_Sum_of_Digits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int sum = 0;
		
		while(num !=0)
		{
			int digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		System.out.println(sum);
	}

}
