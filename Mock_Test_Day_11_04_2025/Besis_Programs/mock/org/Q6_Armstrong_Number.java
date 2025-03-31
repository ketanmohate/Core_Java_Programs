package mock.org;

/*
 * 6. Armstrong Number
Description: Write a program to check if a number is an Armstrong number.
Input: n = 153


Output: Armstrong
 */

import java.util.*;

public class Q6_Armstrong_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int temp = num;
		
		int count =0;
		
		while(temp != 0)
		{
			count++;
			temp = temp / 10;
		}
		
		temp = num;
		
		int sum = 0;
		
		while(temp !=0)
		{
			int digit = temp % 10;
			
			int fact = 1;
			
			for(int i=1 ; i<=count ; i++)
			{
				fact = fact * digit;
			}
			sum = sum + fact;
			temp = temp / 10;
		}
		
		if(num == sum)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}

}
