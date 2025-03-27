package Looping.programs;

/*12.	Write a C program to find sum of first and last digit of a number.*/

import java.util.*;

public class Q12_Find_Sum_First_And_Last_Digit_Of_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int temp = num;
		
		int firstDigit=0;
		while(temp != 0)
		{
			firstDigit = temp % 10;
			temp = temp / 10;
		}
		
		int lastDigit = num % 10;
		
		int sum = firstDigit + lastDigit;
		
		System.out.println("Sum Of First And Last Digit:\t" + sum);
	}
}
