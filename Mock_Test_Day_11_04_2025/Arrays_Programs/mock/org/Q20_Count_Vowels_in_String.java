package mock.org;

/*
 * 20. Count Vowels in String
Description: Count the number of vowels in a given string.

Input: "hello"

Output: 2
 */

import java.util.*;

public class Q20_Count_Vowels_in_String {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		char chArr[] = str.toCharArray();
		
		int count =0;
		for (int i = 0; i < chArr.length; i++) 
		{
			
			if(chArr[i] == 'a' || chArr[i] == 'e' || chArr[i] == 'i' || chArr[i] == 'o' || chArr[i] == 'u' ||
					chArr[i] == 'A' || chArr[i] == 'E' || chArr[i] == 'I' || chArr[i] == 'O' || chArr[i] == 'U')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
