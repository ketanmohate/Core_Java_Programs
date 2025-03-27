package com.java;

import java.util.*;

class Area
{
	Area(int r)
	{
		int area = (int) (3.14 * r * r);
		System.out.println("Area of Circle is:\t" + area);
		System.out.println();
	}
	
	Area(int l, int w)
	{
		int area = l * w;
		System.out.println("Area of Reactangle is:\t" + area);
		System.out.println();
	}
	
	Area(int h, float b)
	{
		int area = (int) (0.5 * h * b);
		System.out.println("Area of Triangle is\t" + area);
		System.out.println();
	}
}

public class Q2_Area_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Redius Of Circle");
		int r=sc.nextInt();
		
		Area objArea = new Area(r);
		
		System.out.println("Enter the Lenth of Reactangle");
		int l=sc.nextInt();
		
		System.out.println("Enter the Width Of Reactangle");
		int w=sc.nextInt();
		
		Area objArea1 = new Area(l,w);
		
		System.out.println("Enter the heith of Tringle");
		int h=sc.nextInt();
		
		System.out.println("Enter the Base of Tringle");
		float b=sc.nextFloat();

		Area objArea3 = new Area(h,b);
		
	}
}
