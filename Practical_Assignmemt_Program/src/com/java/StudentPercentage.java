package com.java;

/*Write a C program to enter marks of five subjects and calculate total marks and percentage. */
import java.util.*;
public class StudentPercentage
{
	public static void main(String args[])
	{
		int s1,s2,s3,s4,s5,total;
		float persentage;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 5 sub marks :");
		s1 = scan.nextInt();
		s2 = scan.nextInt();
		s3 = scan.nextInt();
		s4 = scan.nextInt();
		s5 = scan.nextInt();
		total = s1+s2+s3+s4+s5;
		persentage = total/5;
		System.out.println("The persentage is :" + persentage);
	}
}