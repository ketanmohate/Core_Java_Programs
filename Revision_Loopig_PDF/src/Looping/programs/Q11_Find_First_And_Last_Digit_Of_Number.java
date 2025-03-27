package Looping.programs;

/*11.	Write a C program to find first and last digit of a number.*/

import java.util.*;

public class Q11_Find_First_And_Last_Digit_Of_Number {
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
		System.out.println("First Digit:-\t" + firstDigit);
		
		int lastDigit = num % 10;
		System.out.println("Last Digit:-\t" + lastDigit);
	}
}
