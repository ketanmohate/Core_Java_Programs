package Apana_Clg;

import java.util.*;

public class Q2_Sum_Of_Natural_Numbers 
{
	static int sum=0;
	
	public static void sumOfNaturalNumber(int n)
	{
		if(n == 0)
		{
			return ;
		}
		
		sum = sum + n;
		
		sumOfNaturalNumber(n-1);	
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		sumOfNaturalNumber(n);
		
		System.out.println("Sum Of Natural Number");	
		System.out.println(sum);
	}

}
