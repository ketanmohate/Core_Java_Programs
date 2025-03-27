package Looping.programs;

/*19.	Write a C program to enter a number and print it in words.*/

import java.util.Scanner;

public class Q19_Number_To_Words 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        // Read the number from the user
        System.out.print("Enter a number (0-999): ");
        int number = sc.nextInt();
        
        // Arrays for ones, teens, tens, and hundreds
        String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] thousands = {"", "Hundred"};
        
        String words = "";

        if (number == 0) 
        {
            words = "Zero";
        } 
        else 
        {
            if (number >= 100) 
            {
                words += ones[number / 100] + " " + thousands[1] + " ";
                number = number % 100;
            }

            if (number >= 10 && number <= 19) 
            {
                words += teens[number - 10] + " ";
            } 
            else if (number >= 20)
            {
                words += tens[number / 10] + " ";
                number = number % 10;
            }

            if (number > 0) 
            {
                words += ones[number] + " ";
            }
        }

        // Output the result
        System.out.println("Number in words: " + words.trim());
    }
}
