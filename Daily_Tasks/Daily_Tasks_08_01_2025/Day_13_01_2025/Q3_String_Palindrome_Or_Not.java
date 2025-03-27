package Day_13_01_2025;

/*
 * Q3. Java String program to check whether a string is a Palindrome
Input: str = “aba”
Output: yes
Explanation: Palindrome is String which can be read same both forth and reverse side or can be said String whose orignal string is same as reverse of String.
                         "AbbA" , "DaD" , etc these are some examples of Palindrom String.  
 */

import java.util.*;

public class Q3_String_Palindrome_Or_Not 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		StringBuffer s = new StringBuffer(str);
		
		s.reverse();
		
//		String pal=s.toString();
			
		if(str.equals(s.toString()))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
	}

}

