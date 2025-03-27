package Assignment_08_10_2024;
/*
Q2. Write a Java program to create an abstract class Shape with abstract methods calculateArea() and 
      calculateTriangle(). Create subclasses Circle and Triangle that extend the Shape class and implement the 
      respective methods to calculate the area and perimeter of each shape.

*/

abstract class Shape 
{
	abstract void calculateArea();
	abstract void calculatePerimeter();
}

class Circle extends Shape 
{
	float r = 25;
	float pi = 3.14f;

	void calculateArea() 
	{
		float result = pi * r * r;
		System.out.println("Calculate Area:\t\t" + result);
	}

	void calculatePerimeter()
	{
		float result = 2 * pi * r;
		System.out.println("Calculate Perimeter:\t" + result);
	}
}

class Triangle extends Shape 
{
	void calculateArea() 
	{
		float b = 5;
		float h = 15;

		float result = (b * h) / 2;

		System.out.println("Calculate Triangle:\t" + result);
	}

	void calculatePerimeter()
	{
		float s1 = 15, s2 = 25, s3 = 28;

		float result = s1 * s2 * s3;

		System.out.println("Calculate Perimeter:\t" + result);
	}

}

class Q2_Shape_App 
{
	public static void main(String args[]) 
	{
		Circle objCircle = new Circle();

		objCircle.calculateArea();
		objCircle.calculatePerimeter();

		Triangle objTriangle = new Triangle();

		objTriangle.calculateArea();
		objTriangle.calculatePerimeter();
	}
}