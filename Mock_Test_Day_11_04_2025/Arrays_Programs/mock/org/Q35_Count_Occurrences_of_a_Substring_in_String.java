package mock.org;

/*
 * 35. Count Occurrences of a Substring in String
Description: Count how many times a substring occurs in a string.

Input: "hello world hello", substring "hello"

Output: 2
 */

import java.util.*;

public class Q35_Count_Occurrences_of_a_Substring_in_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		System.out.println("Enter the sub String");
		String subStr = sc.nextLine();
		
		String[] strArr = str.split(" ");
		
		int count = 0;
		for(int i=0 ; i<strArr.length ; i++)
		{
			if(strArr[i].equals(subStr))
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
