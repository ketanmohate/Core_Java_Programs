package mock.org;

/*
 * 23. Find the First Non-Repeated Character in a String
Description: Find the first non-repeated character in a string.

Input: "swiss"

Output: w
 */

import java.util.*;

public class Q23_First_Non_Repeated_Character_in_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		char [] chArr = str.toCharArray();
	
		
		for(int i=0 ; i<chArr.length ; i++)
		{
			boolean found = false;
			
			for(int j=0 ; j<chArr.length ; j++)
			{
				if(i!=j && chArr[i] == chArr[j]) 
				{
					found = true;
					break;
				}
			}
			if(!found)
			{
				System.out.println(chArr[i]);
				break;
//				return;
			}
		}
	}

}
