package Looping.programs;

/*15.	Write a C program to calculate product of digits of a number.*/

import java.util.*;

public class Q15_Calculate_Product_Of_Digits_Of_A_Number {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int product = 1;
		
		while(num != 0)
		{
			int rem = num % 10;
			product = product * rem;
			num = num / 10;
		}
		
		System.out.println("Product of digit is:\t" + product);
	}
}
