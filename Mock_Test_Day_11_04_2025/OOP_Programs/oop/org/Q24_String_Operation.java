package oop.org;

/*
 *  Q24. Perform Method overloading using string operation 
void stringOperation(String s): this function can accept string as parameter and sort it
void stringOperation(String first,String second): this function can compare two strings with each other and if strings 
are equal then show message strings are equal otherwise not
void stringOperation(String s,char ch): this function can accept string as parameter and search specific character
in it if character found say character found otherwise show message character not found.
 */

import java.util.*;

class StringOperation
{
	void stringOperation(String str)
	{
		System.out.println("----------------------------------------------------");
		char[] chArr = str.toCharArray();
		
		for (int i = 0; i < chArr.length; i++) 
		{
			for (int j = i+1; j < chArr.length; j++) 
			{
				if(chArr[i] > chArr[j])
				{
					char temp = chArr[i];
					chArr[i] = chArr[j];
					chArr[j] = temp;
				}
			}
		}
		String newStr = new String(chArr);
		System.out.println("Reverse String:");
		System.out.println(newStr);
	}
	void stringOperation(String first,String second) 
	{
		System.out.println("----------------------------------------------------");
		if(first.equals(second))
		{
			System.out.println("String are equals");
		}
		else
		{
			System.out.println("String are not equals");
		}
	}
	void stringOperation(String str,char ch)
	{
		System.out.println("----------------------------------------------------");
		char[] chArr = str.toCharArray();
		
		boolean flag = false;
		for (int i = 0; i < chArr.length; i++) 
		{
			if(chArr[i] == ch)
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("character found");
		}
		else
		{
			System.out.println("character not found");
		}
	}
}

public class Q24_String_Operation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First String");
		String str1 = sc.nextLine();
		
		System.out.println("Enter the Secound String");
		String str2 = sc.nextLine();

		System.out.println("Enter the one Character");
		char ch = sc.next().charAt(0);
		
		StringOperation st = new StringOperation();
		
		st.stringOperation(str1);
		st.stringOperation(str1, str2);
		st.stringOperation(str1, ch);
				
	}

}
