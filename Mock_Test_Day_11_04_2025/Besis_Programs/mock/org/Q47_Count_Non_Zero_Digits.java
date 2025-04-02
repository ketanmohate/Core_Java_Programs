package mock.org;

/*
 *47. Count Non-Zero Digits
Description: Write a program to count the number of non-zero digits in a number.
Input: n = 1203


Output: 3
 */

import java.util.Scanner;

public class Q47_Count_Non_Zero_Digits {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int count = 0;
		
		while(num != 0)
		{
			int digit = num % 10;
			
			if(digit != 0)
			{
				count ++;
			}
			
			num = num / 10;
		}
		
		System.out.println(count);
	}
}
