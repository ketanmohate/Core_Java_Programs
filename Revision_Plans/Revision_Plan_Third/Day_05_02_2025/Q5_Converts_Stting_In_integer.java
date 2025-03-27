package Day_05_02_2025;

/*
 * 5. Write a Java method that converts a numeric string into an integer without using Integer.
 	parseInt(). Handle negative numbers as well.
Example:
Input: "1234"
Output: 1234
Input: "-567"
Output: -567
 */

import java.util.*;

public class Q5_Converts_Stting_In_integer 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		if(str == null && str.isEmpty())
		{
			System.out.println("Invalid input!");
		}
		
		int num = 0;
		int sign = 1;
		int startIndex = 0;

		
		if(str.charAt(0) == '-')
		{
			sign = -1;
			startIndex = 1;
		}
		
		for(int i=startIndex ; i<str.length() ; i++)
		{
			char ch = str.charAt(i);
			
			// Check character is a digit
			if(ch < '0' || ch > '9')
			{
				System.out.println("Invalid input! Not a numeric string.");
			}
			
			num = num * 10 +(ch -'0'); // Convert character to integer
		}
		
		// Apply sign and print result
		num = num * sign;
        System.out.println("Converted Integer: " + num);
	}

}
