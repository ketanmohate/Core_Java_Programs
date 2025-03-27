package com.java;

import java.util.*;
public class CourseRegister
{
	public static void main(String [] args)
	{
		int nn,mm,kk;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the No of group Student registere:");
		nn = scan.nextInt();
		System.out.println("Enter the minimum capacity of student in course:");
		mm = scan.nextInt();
		System.out.println("Enter the already enrolled in the cours student:");
		kk = scan.nextInt();
		int tem = mm - kk;
		if(tem > nn)
		{
			System.out.println("Yes");
		}
		else if(tem >= nn)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("NO");
		}
	}
}