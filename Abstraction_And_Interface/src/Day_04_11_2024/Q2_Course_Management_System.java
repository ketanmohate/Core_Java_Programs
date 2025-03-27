package Day_04_11_2024;

/*
 * Q2. Course Management System 
Objective: Create a system to manage different types of courses in an online learning 
platform. 
Requirements: 
Define a Base Class: 
Create a class named Course with attributes such as courseName, duration, and instructor. 
Include a method getDetails() that prints course details. 
Implement Subclasses: 
Create a class VideoCourse that extends Course and adds an attribute for videoLength. 
Override getDetails() to include video length. 
Create a class TextCourse that extends Course and adds an attribute for numberOfPages. 
Override getDetails() to include the number of pages. 
Demonstration: 
Create an array of Course objects. 
Initialize it with instances of VideoCourse and TextCourse. 
Call getDetails() for each course to demonstrate functionality. 
Expected Output: 
Course Name: Java Programming, Duration: 4 weeks, Instructor: John Doe, Video Length: 
10 hours 
Course Name: Data Structures, Duration: 3 weeks, Instructor: Jane Smith, Number of 
Pages: 120
 */

import java.util.*;

class Course
{
	String courseName;
	int duration;
	String instructorName;
	
	Course(String courseName, int duration, String instructorName)
	{
		this.courseName = courseName;
		this.duration = duration;
		this.instructorName = instructorName;
	}
	
	void getDetails()
	{
		System.out.println("Course Name:\t\t" + courseName);
		System.out.println("Course Duration:\t" + duration);
		System.out.println("instructor Name:\t"+ instructorName);
	}
	
}

class videosCourse extends Course
{
	int videosLength;
	
	videosCourse(String courseName, int duration, String instructorName, int videosLength)
	{
		super(courseName, duration, instructorName);
		this.videosLength = videosLength;
	}
	
	void getDetails()
	{
		super.getDetails();
		System.out.println("Videos Length:\t" + videosLength);
	}
}

class textCourse extends Course
{
	int numberOfPages;
	
	textCourse (String courseName, int duration, String instructorName, int numberOfPages)
	{
		super(courseName, duration, instructorName);
		this.numberOfPages = numberOfPages;
	}
	
	void getDetails()
	{
		super.getDetails();
		System.out.println("Number of Pages:\t" + numberOfPages);
	}
}

public class Q2_Course_Management_System 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Course[] c = new Course[2];
		
		for(int i=0 ; i<c.length ; i++)
		{
			System.out.println("Enter the Course Name:");
			String name = sc.nextLine();
			
			System.out.println("Enter the Course Duration:");
			int duration=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the Course Instructor Name:");
			String instructorName = sc.nextLine();
			
			System.out.println("Choose Course Type (1 for Video Course, 2 for Text Course):");
			int courseType = sc.nextInt();
			sc.nextLine();
			
			if(courseType == 1) 
			{
				System.out.println("Enter the Videos Length:");
				int vLength = sc.nextInt();
				sc.nextLine();
				c[i] = new videosCourse(name, duration, instructorName, vLength);
			}
			else if(courseType == 2)
			{
				System.out.println("Enter the number Of pages:");
				int nPages = sc.nextInt();
				sc.nextLine();
				c[i] = new textCourse(name, duration, instructorName , nPages);
			}
			else
			{
				System.out.println("Pls valid input");
			}
			
			System.out.println("-----------------------------------------------------");
			
			c[i] = new Course(name, duration, instructorName);
			
		}
		
		for(Course arrC : c)
		{
			arrC.getDetails();
			System.out.println("-----------------------------------------");
		}
	}

}

