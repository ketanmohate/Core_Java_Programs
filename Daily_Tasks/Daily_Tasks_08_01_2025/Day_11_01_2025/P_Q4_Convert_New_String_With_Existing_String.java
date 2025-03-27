package Day_11_01_2025;

/*
 * Q4. WAP to convert new string with existing string without using replace function?
 */

import java.util.*;

public class P_Q4_Convert_New_String_With_Existing_String 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String oldStr = sc.nextLine();
		
		System.out.println("Enter the Replase String:");
		String newStr = sc.nextLine();
		
		StringBuffer s = new StringBuffer(oldStr);
		
		s.replace(3, 3, newStr);
		
//		int length1 = oldStr.length();
//		int length2 = newStr.length();
//		int length=0;
//		
//		if(length1 > length2)
//		{
//			length = length1;
//		}
//		else
//		{
//			length = length2;
//		}
		
		char oldCh[] = oldStr.toCharArray();
		char newCh[] = newStr.toCharArray();
		
		for(int i=0 ; i<oldCh.length; i++)
		{
			oldCh[i] = newCh[i];  
		}
		
		new String(oldCh);
		
		System.out.println(oldCh);
	}

}
