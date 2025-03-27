package Assignment_02_12_2024;

/* Q1. Write a java program to check whether number is strong or not. */

import java.util.*;

public class Q1_Number_Strong_Or_Not 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int temp=num;
		
		int sum=0;
		
		for(;temp!=0;)
		{
			int rem = temp%10;	
			
			int mul=1;
			
			for(;rem!=0;)
			{
				mul=mul*rem;
				rem--;
			}
			
			sum = sum + mul;
			temp=temp/10;
		}
		if(num==sum)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("Not Strong Number");
		}
	}

}
