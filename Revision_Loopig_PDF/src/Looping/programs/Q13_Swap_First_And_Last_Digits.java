package Looping.programs;

/*13.	Write a C program to swap first and last digits of a number.*/

import java.util.*;

public class Q13_Swap_First_And_Last_Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();		
		
		int temp = num;
		int lastDigit = temp % 10;
		int firstDigit = 0;
		int divisor = 1;

        // Find the first digit and the divisor to extract the middle part
        while (temp >= 10) 
        {
            firstDigit = temp % 10;
            divisor = divisor * 10;
            temp = temp / 10;
        }
        
        firstDigit = temp; // Get the first digit

        if (divisor == 1) // If it's a single-digit number, no change needed
        { 
            System.out.println("Number after swapping first and last digit: " + num);
        }

        // Remove first and last digits from the number
        int middlePart = num % divisor / 10;

        // Construct the new number
        int swappedNum = lastDigit * divisor + middlePart * 10 + firstDigit;

        System.out.println("Number after swapping first and last digit: " + swappedNum);
	}
}
