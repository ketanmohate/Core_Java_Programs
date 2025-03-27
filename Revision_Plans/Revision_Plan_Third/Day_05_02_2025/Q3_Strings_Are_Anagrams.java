package Day_05_02_2025;
/*
 * 3. Write a Java method to check if two given strings are anagrams of each other. 
(Two strings are anagrams if they contain the same characters with the same frequency 
but in a different order.)
Example:
Input: "listen", "silent"
Output: true
 */

import java.util.*;

public class Q3_Strings_Are_Anagrams 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first String");
		String str1 = sc.nextLine();
		
		System.out.println("Enter the Secound String");
		String str2 = sc.nextLine();
		
		if(str1.length() != str2.length()) 
		{
            System.out.println("False"); 
        }
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
	}

}
