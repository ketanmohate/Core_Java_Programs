package com.java;

/* Q. WAP to create class name as Circle with two methods 
void setRadius(float radius):  this method he	lp us to accept radius as parameter
void calArea(): this method can calculate area of circle and display it. 
*/

import java.util.*;

class OOPs1
{
	int r;
	double Area;
	
	public void setRadius()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the redius");
		r = sc.nextInt();
		Area = 3.14 * (r*r);
	}
	
	public void calArea()
	{
		System.out.println("Area of circle:" + Area);
	}
}

public class OOps1_Calarea 
{
	public static void main(String []args)
	{	
		OOPs1 obj = new OOPs1();
		obj.setRadius();
		obj.calArea();
	}

}
