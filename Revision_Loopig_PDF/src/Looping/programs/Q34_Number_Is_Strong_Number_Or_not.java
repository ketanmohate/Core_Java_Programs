package Looping.programs;

/*34.	Write a C program to check whether a number is Strong number or not.*/

import java.util.*;

public class Q34_Number_Is_Strong_Number_Or_not {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int temp = num;
		
		int sum = 0;
		
		while(temp !=0)
		{
			int digit = temp % 10;
			int fact = 1;
			
			for(int i=1 ; i<=digit ; i++)
			{
				fact = fact * i;
			}
			sum = sum + fact;
			temp = temp / 10;
		}
			
		if(sum == num)
		{
			System.out.println("Number is Strong");
		}
		else
		{
			System.out.println("Number is Not Strong");
		}
	}
}
