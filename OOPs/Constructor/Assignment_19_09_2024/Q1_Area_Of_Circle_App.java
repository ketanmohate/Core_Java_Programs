package Assignment_19_09_2024;

/*
 Q1. Write a java program to create class name as Area using parameterised constructor overloading name as :
	void Area(int)
	{
		//  calculate area of circle.
	}
	void Area(int , int)
	{
		//  calculate area of reactangle.
	}
	void Area(int , float)
	{
		//  calculate area of triangle.
	}
 */
import java.util.*;

class Area
{
	Area(int redius)
	{
		float pi=(float) 3.14;
		
		double area = (pi * redius * redius);
		System.out.println("Area Of Circle:\t\t"+area);
	}
	
	Area(int heigth, int width)
	{
		int area = heigth * width;
		System.out.println("Area Of Reactangle:\t"+area);
	}
	
	Area(int base, float tHeigth)
	{
		double area = 0.5 * base * tHeigth;
		System.out.println("Area Of Triangle:\t"+area);
	}

}

public class Q1_Area_Of_Circle_App 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Redius Of Circle");
		int redius=sc.nextInt();
		
		System.out.println("Enter the Heigth of Reactangle");
		int heigth=sc.nextInt();
		
		System.out.println("Enter the Width of Reactangle");
		int width=sc.nextInt();
		
		System.out.println("Enter the Base of Triangle");
		int base=sc.nextInt();
		
		System.out.println("Enter the Heigth Of Triangle");
		float tHeigth=sc.nextFloat();
		
		Area obj1 = new Area(redius);
		Area obj2 = new Area(heigth ,width);
		Area obj3 = new Area(base ,tHeigth);
		
	}
}
