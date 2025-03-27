package Looping.programs;

/*25.	Write a C program to find LCM of two numbers.*/

import java.util.*;

public class Q25_Find_LCM_Of_Two_Numbers{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
        // Taking input from user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Finding GCD using the Euclidean algorithm
        int a = num1, b = num2;
        while (b != 0) 
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a;

        // Calculating LCM using the formula: (a * b) / GCD
        int lcm = (num1 * num2) / gcd;

        // Displaying the result
        System.out.println("LCM is: " + lcm);
	}
}
