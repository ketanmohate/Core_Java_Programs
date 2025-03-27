package Assignment_02_12_2024;

/*Q2. Write a java program to check whether number is Armstrong or not. */

import java.util.*;

public class Q2_Number_Armstrong_Or_Not 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int temp = num;
		
		int count=0;
		
		for(;temp!=0;)
		{
			temp = temp / 10;
			count++;
		}
//		System.out.println(count);
		
		temp = num;
		
		int sum=0;
		
		for(;temp!=0;)
		{
			int pow=1;
			
			int rem = temp%10;
			
			for(int j=0;j<count;j++)
			{
				pow = pow * rem;
			}
			
			sum=sum+pow;
			
			temp=temp/10;
		}
		
		if(sum==num)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is Not Armstrong");
		}
	}

}
