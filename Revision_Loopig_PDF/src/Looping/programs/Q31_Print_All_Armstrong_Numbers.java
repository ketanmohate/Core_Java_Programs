package Looping.programs;

/*31.	Write a C program to print all Armstrong numbers between 1 to n.*/

import java.util.*;

public class Q31_Print_All_Armstrong_Numbers {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Limit");
		int limit = sc.nextInt();
		
		for(int num=1 ; num<=limit ; num++)
		{
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
				
				for(int i=1 ; i<=count ; i++)
				{
					power = power * digit;
				}
				sum = sum + power;
				temp = temp / 10;
			}
			if(sum == num)
			{
				System.out.println(num);
			}
		}
	}
}
