package Assignment_16_09_2024;

/*
 Write a C program to check whether a triangle is valid or not if angles are given using if else. How to 
check whether a triangle can be formed or not, if its angles are given using if else in C programming. 
Logic to check triangle validity if angles are given in C program. 
 */

import java.util.*;

public class Q9_Triangle_Is_Valid_Or_Not 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        // Input angles of the triangle
        System.out.println("Enter the three angles of the triangle: ");
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();

        // Calculate the sum of the angles
        int sum = angle1 + angle2 + angle3;

        // Check if the triangle is valid
        if (sum == 180 && (angle1 > 0 && angle2 > 0 && angle3 > 0)) 
        {
            System.out.println("The triangle is valid.");
        }
        else 
        {
            System.out.println("The triangle is not valid.");
        }

	}

}
