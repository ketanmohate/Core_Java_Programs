package Apana_Clg;

import java.util.*;

public class Q2_Sum_Of_Natural_Numbers_1 
{
	
	public static void sumNatural(int num , int sum , int i)
	{
		if(num == i)
		{
			sum = sum+i;
			System.out.println(sum);
			return ;
		}
		sum = sum + i;
		sumNatural(num , sum, i+1);
		
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		sumNatural(num, 0 , 1);
	}

}
