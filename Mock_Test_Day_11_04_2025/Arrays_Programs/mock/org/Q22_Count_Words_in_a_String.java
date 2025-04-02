package mock.org;

/*
 * 22. Count Words in a String
Description: Count the number of words in a string.

Input: "hello world"

Output: 2
 */

import java.util.*;

public class Q22_Count_Words_in_a_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		char [] chArr = str.toCharArray();
		
		int count = 0;
		boolean inWord = false;
		
		
		for(int i=0 ; i<chArr.length ; i++)
		{
			char ch = str.charAt(i);
			
			if(ch != ' ')
			{
				if(inWord == false)
				{
					count++;
					inWord = true;
				}
			}
			else
			{
				inWord = false;
			}
		}
		System.out.println(count);
	}

}
