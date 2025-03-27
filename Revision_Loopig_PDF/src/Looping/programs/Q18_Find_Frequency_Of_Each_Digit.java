package Looping.programs;

/*18.	Write a C program to find frequency of each digit in a given integer.*/

import java.util.*;

public class Q18_Find_Frequency_Of_Each_Digit {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		// To store frequency of digits
        int[] frequency = new int[10]; // array to hold count of digits 0-9
        
        // If the number is negative, make it positive manually
        if (num < 0) 
        {
            num = -num; // Convert negative number to positive
        }
        
        // Loop through each digit and count the frequency
        while (num > 0) 
        {
            int digit = (int) (num % 10); // Get the last digit
            frequency[digit]++; // Increment the frequency for that digit
            num = num / 10; // Remove the last digit
        }
        
        // Display the frequency of each digit
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) 
        {
            if (frequency[i] > 0) 
            {
                System.out.println(i + ": " + frequency[i]);
            }
        }
	}
}
