package Day_13_01_2025;

/*
 * Q4.Java String Program to Check Anagram
Input: str1 = "Listen" 
            str2 = "Silent"
Output: Yes
Explanation: A string is called Anagram of other string when the it contains the same characters, only the order of characters can be different.
                        Example Listen ->  E:1 , I:1 , L: 1 , N:1 , S:1 , T:1  
                                         Silent ->  E:1 , I:1 , L: 1 , N:1 , S:1 , T:1  
                        As the occurence of elements are same in both the String hence they are anagram of each other.
 */

import java.util.*;

public class Q4_Check_Anagram 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first String:");
		String str1 = sc.nextLine();
		
		System.out.println("Enter the Secound String:");
		String str2 = sc.nextLine();
		
//		str1.toLowerCase();
//		str2.toLowerCase();
		
		str1 = str1.toLowerCase().replaceAll("\\s", "");
        str2 = str2.toLowerCase().replaceAll("\\s", "");
		
		char arr1[] = str1.toCharArray();
		
		char arr2[] = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
//		arr1.toString();
//		arr2.toString();
		
		
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
