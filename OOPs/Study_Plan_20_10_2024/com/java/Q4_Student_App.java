package com.java;


/*
 class Student 
{ void setSubMarks(int s[]) 
   { //here we need to store the array in instance variable  
   } 
   void calculatePer() 
   { //here we need to call the aggregate of six subjects marks through the array and calculate its per 
and store in instance variable. 
   }  
   void checkGrades() 
   { //here we need to check grades means per>75 && per<=100 then student in distinction  if per>60 
&& per<=75 then in first division  if per>=50 && per<=60 then second division and if per>40 && 
per<=50 then in third division and if per <40 then  student failed  
   } 
} 
public class StudentApp 
{   public static void main(String x[]) 
    { //create the object of scanner class 
     //declare the array with 6 six of type integer and store input values in array as subject marks 
//create the object of Student class and call the setSubMarks() function and pass array in it 
//then call calculatePer() student function 
//then call checkGrades() function for checking the grading of students. 
} 
} 
 */

import java.util.*;

class Student 
{ 
	private int[] marks;
    private double percentage;
	
	void setSubMarks(int s[]) 
	{ 
		this.marks=s;
	}
	void calculatePer() 
	{
		System.out.println("-------------------------------");
		int totalMarks=0;
		for(int i=0;i<marks.length;i++)
		{
			totalMarks = totalMarks + marks[i];
		}
		percentage=(totalMarks/marks.length);
		System.out.println("Percentage:\t"+percentage);
	}
	void checkGrades()
	{
		System.out.print("Grades:\t\t");
		if(percentage > 75 && percentage <=100)
		{
			System.out.println("Distinction");
		}
		else if(percentage > 60 && percentage <= 75)
		{
			System.out.println("First Division");
		}
		else if(percentage >= 50 && percentage <= 60)
		{
			System.out.println("Second Division");
		}
		else if(percentage > 40 && percentage <= 50)
		{
			System.out.println("Third Division");
		}
		else
		{
			System.out.println("Failed");
		}
		System.out.println("-------------------------------");
	}
} 
public class Q4_Student_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the No of Subject");
		int nSubject=sc.nextInt();

		int subjectMarks[]  = new int[nSubject];
		
		for(int i=0;i<subjectMarks.length;i++)
		{
			System.out.println("Enter the " +(i+1)+" Marks");
			int marks = sc.nextInt();
			subjectMarks[i] = marks;
		}
		
		Student stud = new Student();
		
		stud.setSubMarks(subjectMarks);
		stud.calculatePer();
		stud.checkGrades();
	}

}
