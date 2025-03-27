package Day_11_01_2025;

/*
 * Q2. WAP to convert lowercase string to uppercase without using inbuilt function?
 */

import java.util.*;

public class P_Q2_Convert_lower_To_Uppercase_String 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		
		char[] ch = str.toCharArray();
		
		for(int i=0 ; i<ch.length ; i++)
		{
			ch[i] = (char) (ch[i]-32);
		}
		
		new String(ch);
		
		System.out.println(ch);
	}

}
