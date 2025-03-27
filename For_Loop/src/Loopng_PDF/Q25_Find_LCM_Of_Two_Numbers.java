package Loopng_PDF;

/* 25. Write a C program to find LCM(Least Common Multiple) of two numbers.*/

import java.util.*;

public class Q25_Find_LCM_Of_Two_Numbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Numnber:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the Secound Number:");
		int num2 = sc.nextInt();
		
		// main logic
		System.out.println("LCM(Least Common Multiple) Is:");
		int max = 0;
		
		if(num1>num2)
		{
			max = num1;
		}
		else
		{
			max = num2;
		}

		int LCM=max;
		
		for(;LCM % num1 != 0 || LCM % num2 != 0;) 
        {
            LCM = LCM + max;
        }
		System.out.println(LCM);
	}

}
