package Assignment_18_09_2024;

/*
 Q.1 Create a class named 'Rectangle' with two data members-length and breadth and a function to calculate 
the area which is 'length*breadth'. 
The class has three constructors which are:

A: having no parameter - values of both length and breadth are assigned zero.

B: having two numbers as parameters - the two numbers are assigned as length and breadth respectively.

C: having one number as parameter - both length and breadth are assigned that number.

Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.
 */

import java.util.*;

class Rectangle
{	
	int length;
	int breadth;
	
	public Rectangle()
	{
		this.length=0;
		this.breadth=0;
	}
	
	public Rectangle(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	public Rectangle(int breadth)
	{
		this.length=0;
		this.breadth=breadth;
	}
	
	public int calArea()
	{
		int area = length * breadth;
		return area;
	}
}

public class Q1_Rectangle_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length");
		int length=sc.nextInt();
		
		System.out.println("Enter the breadth");
		int breadth=sc.nextInt();
		
		Rectangle obj1 = new Rectangle();
		Rectangle obj2 = new Rectangle(breadth, breadth);
		Rectangle obj3 = new Rectangle(breadth,0);
		
		System.out.println("Area of Rectangle:\t"+obj1.calArea());
		System.out.println("Area of Rectangle:\t"+obj2.calArea());
		System.out.println("Area of Rectangle:\t"+obj3.calArea());
	}

}
