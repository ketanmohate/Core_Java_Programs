package com.java;
import java.util.*;
public class studentpercentageApp {
	public static void main(String srgs[])
	{
		String name;
		int Id;
		int s1,s2,s3,s4,s5,s6;
		float arr,percentage;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the student name");
		name=scan.nextLine();
		System.out.println("Enter the ID");
		Id=scan.nextInt();
		System.err.println("Enter the six sub marks");
		s1=scan.nextInt();
		s2=scan.nextInt();
		s3=scan.nextInt();
		s4=scan.nextInt();
		s5=scan.nextInt();
		s6=scan.nextInt();
		arr=s1+s2+s3+s4+s5+s6;
		percentage=arr/6;
		System.out.println("percentage of a student"+percentage);
		
	}
}
