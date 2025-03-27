package Assignment_16_09_2024;

/*
 Example11: 
___________________________________________________________________________ 
Write a C Program to input two angles from user and find third angle of the triangle. How to find all 
angles of a triangle if two angles are given by user using C programming. C program to calculate the 
third angle of a triangle if two angles are given. 
ExampleInput 
Enter first angle: 60 
Enter second angle: 80 
Output 
Third angle = 40 
 */

import java.util.*;

public class Q11_Find_Third_Angle_Of_Triangle 
{

	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Two angle of the triangle: ");
        double angle1 = sc.nextDouble();
        double angle2 = sc.nextDouble();

        double angle3 = 180.0 - (angle1 + angle2);

        if (angle1 > 0 && angle2 > 0 && angle1 + angle2 < 180.0) 
        {
            System.out.println("The third angle of the triangle is: \n" + angle3);
        } 
        else 
        {
            System.out.println("Invalid input. The sum of the first two angles must be less than 180 degrees.");
        }

	}

}
