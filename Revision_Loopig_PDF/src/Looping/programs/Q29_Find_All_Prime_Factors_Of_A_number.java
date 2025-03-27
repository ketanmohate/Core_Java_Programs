package Looping.programs;

/*29.	Write a C program to find all prime factors of a number.*/

import java.util.*;

public class Q29_Find_All_Prime_Factors_Of_A_number {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Prime factors of " + num + " are: ");

        // Print the number of times 2 divides num
        while (num % 2 == 0) 
        {
            System.out.print(2 + " ");
            num = num / 2;
        }

        // Check for odd factors from 3 onwards
        for (int i = 3; i * i <= num; i += 2) 
        { // Replacing Math.sqrt with i * i
            while (num % i == 0) 
            {
                System.out.print(i + " ");
                num /= i;
            }
        }

        // If the remaining number is greater than 2, it must be prime
        if (num > 2) 
        {
            System.out.print(num);
        }

        System.out.println();
    }
}
