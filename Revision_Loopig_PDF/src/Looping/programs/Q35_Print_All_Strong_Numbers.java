package Looping.programs;

/*35.	Write a C program to print all Strong numbers between 1 to n.*/

import java.util.*;

public class Q35_Print_All_Strong_Numbers {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Limti");
		int limit = sc.nextInt();
		
		for(int num=1 ; num<=limit ; num++)
		{
			int temp = num;
			int sum = 0;
			
			while(temp != 0)
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
				System.out.println(num);
			}
		}
	}
}
