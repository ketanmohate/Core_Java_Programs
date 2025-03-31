package mock.org;

/*
 * Palindrome Number
Description: Write a program to check if a number is a palindrome.
Input: n = 121


Output: Palindrome
 */

import java.util.*;

public class Q5_Palindrome_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int temp = num;
		
		int rev = 0;
		while(temp !=0)
		{
			int digit = temp % 10;
			rev = (rev * 10) + digit;
			temp = temp / 10;
		}
		
//		System.out.println(rev);
		
		if(num == rev)
		{
			System.out.println("Numbar is Palindrome");
		}
		else
		{
			System.out.println("Number is Not Palindrome");
		}
		
	}

}
