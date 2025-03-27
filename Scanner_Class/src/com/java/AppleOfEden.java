package com.java;

import java.util.*;
public class AppleOfEden
{
	public static void main(String []args)
	{
		int x,y;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the maximum number of guards Ezio can manipulate :");
		x = scan.nextInt();
		System.out.println("Enter the No of guards");
		y = scan.nextInt();
		if(x > y)
		{
			System.out.println("YES");
		}
		else if(x < y)
		{
			System.out.println("NO");
		}
		else
		{
			System.out.println("YES");
		}
	}
}

		
