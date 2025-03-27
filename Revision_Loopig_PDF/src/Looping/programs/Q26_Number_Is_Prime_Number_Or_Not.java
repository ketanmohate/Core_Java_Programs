package Looping.programs;

/*26.	Write a C program to check whether a number is Prime number or not.*/

import java.util.*;

public class Q26_Number_Is_Prime_Number_Or_Not {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		int count = 0;
		
		if (num < 2) 
		{
            System.out.println("Number is not Prime");
        }
		
		for(int i=1 ; i<=num ; i++)
		{
			if(num%i == 0)
			{
				count++;
			}	
		}
		
		if(count == 2)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not Prime");
		}
	}
}
