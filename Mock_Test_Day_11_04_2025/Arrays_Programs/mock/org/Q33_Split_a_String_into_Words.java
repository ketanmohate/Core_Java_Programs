package mock.org;

/*
 * 33. Split a String into Words
Description: Split a string into words.

Input: "hello world"

Output: ["hello", "world"]
 */

import java.util.*;

public class Q33_Split_a_String_into_Words {

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
					if(chArr[0] != ' ')
					{
						count++;
						inWord = true;
					}
				}
			}
			else
			{
				inWord = false;
			}
		}
		
		String[] arr = new String[count];
		
//		System.out.println(arr.length);
		
		int k= 0;
		String newStr = "";
		
		for(int i=0 ; i<chArr.length ; i++)
		{
			if(chArr[i] != ' ')
			{
				newStr = newStr + chArr[i];
			}
			if(chArr[i] == ' ' || i==chArr.length-1)
			{
				if(chArr[0] == ' ')
				{
					arr[k++] = newStr;
					newStr = "";
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + ",");
		}
	}

}
