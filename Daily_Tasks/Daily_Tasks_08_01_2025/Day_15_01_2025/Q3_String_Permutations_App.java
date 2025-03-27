package Day_15_01_2025;

/*
 * Q3.Program to Print all Permutations of a String in Java
Input :  abc
Output : abc , acb , bac , bca , cab , cba
Explanation: All the sequence can be formed using these the string will be printed.  
 */

import java.util.*;

public class Q3_String_Permutations_App 
{
	public static void generatePermutations(String str, String perm) 
    {
        // If the string is empty, print the current permutation
        if (str.isEmpty()) 
        {
            System.out.print(perm + " ");
            return;
        }

        // Iterate through the string
        for (int i = 0; i < str.length(); i++) 
        {	
            // Extract the current character
            char currentChar = str.charAt(i);

            // Form the remaining string after removing the current character
            String remaining = str.substring(0, i) + str.substring(i + 1);

            // Recursive call with updated values
            generatePermutations(remaining, perm + currentChar);
        }
    }
	
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the String:");
			String str = sc.nextLine();
			
			generatePermutations(str, "");
	}

}
