package Day_15_01_2025;

/*
 * Q1. Program to Add Binary Strings
Input : str1 = "1001"
             str2 = "11"
Output : "1100"
Explanation : "1001" represents for 9 and "11" represents for 3 then result should be 12 which means result = "1100".
 */

import java.util.*;

public class Q1_Add_Binary_Strings_Using_Custom_Logic 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Binary String:");
		String str1 = sc.nextLine();
		
		System.out.println("Enter the Secound Binary String");
		String str2 = sc.nextLine();
		
//		method 2 using custom logic
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		
		
		int power1 = 1;
		int decimal1 = 0;

        for (int i = arr1.length - 1; i >= 0; i--) 
        {
            int digit = arr1[i] - '0'; // Convert char to int
            decimal1 += digit * power1;
            power1 *= 2; // Increment the power of 2 for the next bit
        } 
        
		int power2 = 1;
		int decimal2 = 0;
		
        for (int i = arr2.length - 1; i >= 0; i--) 
        {
            int digit = arr2[i] - '0'; // Convert char to int
            decimal2 += digit * power2;
            power2 *= 2; // Increment the power of 2 for the next bit
        } 
        
//        System.out.println(decimal1);
//        System.out.println(decimal2);
        
        int sumDecimal = decimal1 + decimal2;
        
        char binaryArray[] = new char[32];  // To hold binary digits, max for 32-bit integer
        
        int index = 0;
        
        while (sumDecimal > 0) 
        {
            int remainder = sumDecimal % 2; // Get the remainder (0 or 1)
            binaryArray[index++] = (char) (remainder + '0'); // Convert int to char ('0' or '1')
            sumDecimal = sumDecimal / 2; // Update decimal by dividing it by 2
        }

        // Reverse the array to get the correct binary representation
        StringBuilder binary = new StringBuilder();
        
        for (int i = index - 1; i >= 0; i--) 
        {
            binary.append(binaryArray[i]);
        }

        System.out.println("output:-\t"+binary);
	}
}
