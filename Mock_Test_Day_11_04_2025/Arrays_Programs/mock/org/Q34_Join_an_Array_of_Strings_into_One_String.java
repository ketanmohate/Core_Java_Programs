package mock.org;

/*
 * 34. Join an Array of Strings into One String
Description: Join an array of strings into a single string.

Input: ["hello", "world"]

Output: "helloworld"
 */

import java.util.*;

public class Q34_Join_an_Array_of_Strings_into_One_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		String[] strArr = new String[size];
		
		System.out.println("Enter the elements");
		for (int i = 0; i < size; i++) 
		{
			strArr[i] = sc.next();
		}
		
		String newStr = "";
		
		for(int i=0 ; i<strArr.length ; i++)
		{
			newStr = newStr + strArr[i];
		}
		
		System.out.println(newStr);
	}

}
