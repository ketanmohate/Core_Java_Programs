package Assignment_16_09_2024;

/*
 Example12 
________________________________________________________________________ 
Write a C program to find all roots of a quadratic equation using if else. How to find all roots of a 
quadratic equation using if else in C programming. Logic to find roots of quadratic equation in C 
programming. 
Example 
Input 
Input a: 8 
Input b: -4 
Input c: -2 
Output 
Root1: 0.80 
Root2: -0.30 
 */
import java.util.*;

public class Q12_Find_All_Roots_Of_Quadratic_Equation 
{
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        // Input values for a, b, and c
        System.out.print("Input a: ");
        double a = sc.nextDouble();

        System.out.print("Input b: ");
        double b = sc.nextDouble();

        System.out.print("Input c: ");
        double c = sc.nextDouble();

        // Calculate the discriminant
        double discriminant = (b * b) - (4 * a * c);

        // Manual square root calculation using binary search
        if (discriminant >= 0) 
        {
            double low = 0;
            double high = discriminant;
            double epsilon = 0.00001;  // Precision of the result
            double mid = 0;

            // Adjust upper bound for discriminant < 1
            if (discriminant < 1) 
            {
                high = 1;
            }

            while ((high - low) > epsilon) 
            {
                mid = (low + high) / 2;
                
                if (mid * mid > discriminant) 
                {
                    high = mid;
                } 
                
                else 
                {
                    low = mid;
                }
            }

            // Now `mid` contains the square root of discriminant
            double sqrtDiscriminant = (low + high) / 2;

            // Calculate the roots based on the discriminant
            if (discriminant > 0) 
            {
                // Two distinct real roots
                double root1 = (-b + sqrtDiscriminant) / (2 * a);
                double root2 = (-b - sqrtDiscriminant) / (2 * a);
                System.out.printf("Root1: %.2f\n", root1);
                System.out.printf("Root2: %.2f\n", root2);
            } 
            else 
            {
                // One real root (discriminant == 0)
                double root = -b / (2 * a);
                System.out.printf("Root1 = Root2: %.2f\n", root);
            }
        } 
        else 
        {
            // No real roots, discriminant is negative
            System.out.println("The equation has no real roots.");
        }
	}

}
