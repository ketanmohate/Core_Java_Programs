package Looping.programs;

/*24.	Write a C program to find HCF (GCD) of two numbers .*/

import java.util.*;

public class Q24_Find_HCF_GCD_Of_Two_Numbers {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		// Take two numbers as input from the user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter seco	nd number: ");
        int num2 = sc.nextInt();

        // Initialize variables for HCF calculation
        int a = num1;
        int b = num2;

        // Using Euclidean algorithm to find HCF
        while (b != 0) 
         {
            int temp = b;
            b = a % b;
            a = temp;
        }

        // Output the HCF
        System.out.println("The HCF is " + a);
	}
}
