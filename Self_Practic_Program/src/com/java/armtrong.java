package com.java;
import java.util.*;

public class armtrong {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Enter the number");
		num = sc.nextInt();
		
		int i = 0 ,rem,sum = 0;
		int temp = num;
		
		while(i < temp)
		{
			rem = temp % 10;
			sum = sum + rem * rem * rem;
			temp = temp / 10;		
		}
		System.out.println(sum);
	}
	
}
