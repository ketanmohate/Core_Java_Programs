package Day_13_01_2025;

/*
 Q2. Java String Program to Insert a String into Another String
Input: originalString = "JavaLanguage", 
            stringToBeInserted = "is", 
            index = 4
Output: "JavaisLanguage"
Explanation: Adding the new String to orignal String at the index given.
 */

import java.util.*;

public class Q2_Insert_String_Into_Another_String 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		System.out.println("Enter the String:");
		String newStr = sc.nextLine();
		
		System.out.println("Enter the Index:");
		int index=sc.nextInt();
		
		StringBuilder s = new StringBuilder(str);
		s.insert(index, newStr);
		
		s.toString();
		
		System.out.println(s);
		
		sc.close();
	}

}
