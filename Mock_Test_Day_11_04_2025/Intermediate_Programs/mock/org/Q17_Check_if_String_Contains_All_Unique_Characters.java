package mock.org;

/*
 *17. Check if String Contains All Unique Characters
Description: Check if a string contains all unique characters.

Input: "abcdef"

Output: true
 */

import java.util.*;

public class Q17_Check_if_String_Contains_All_Unique_Characters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		char[] chArr = str.toCharArray(); 
		
		boolean found = false;
		
		for(int i = 0; i < chArr.length; i++) 
		{
			for (int j = i+1; j < chArr.length; j++)
			{
				if(chArr[i] == chArr[j])
				{
					found = true;
					break;
				}
			}
		}
		if(!found)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}
