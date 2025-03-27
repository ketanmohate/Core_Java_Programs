package Looping.programs;

/*30.	Write a C program to check whether a number is Armstrong number or not.*/

import java.util.*;

public class Q30_Number_Is_Armstrong_Number_Or_Not {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int temp = num;
		
		int count=0;
		
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
			int power = 1;
			
			for(int i=0; i<count ; i++)
			{
				power = power * digit;
			}
			sum = sum + power;
			temp = temp / 10;
		}
		
		if (sum == num) 
		{
            System.out.println("Number is Armstrong");
        } 
		else 
		{
            System.out.println("Number is Not Armstrong");
        }
	}
}
