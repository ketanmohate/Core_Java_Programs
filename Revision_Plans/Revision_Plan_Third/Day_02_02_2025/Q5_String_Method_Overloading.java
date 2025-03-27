package Day_02_02_2025;

/*
   Q4. Perform Method overloading using string operation 
void stringOperation(String s): this function can accept string as parameter and sort it
void stringOperation(String first,String second): this function can compare two strings with each other and if strings 
are equal then show message strings are equal otherwise not
void stringOperation(String s,char ch): this function can accept string as parameter and search specific character
in it if character found say character found otherwise show message character not found.
 */

import java.util.*;

class OverloadingClass
{
	void stringOperation(String s)
	{
		char[] charArray = s.toCharArray();
		
		for(int i=0 ; i<charArray.length; i++)
		{
			for(int j=i+1 ; j<charArray.length;j++)
			{
				if(charArray[i] > charArray[j])
				{
					char temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;
				}
			}
		}
		
		//method 2
//		Arrays.sort(charArray);
		
		System.out.println("Sorted String Is:- " + new String(charArray));
	}
	void stringOperation(String first,String second)
	{
		if(first.equals(second))
		{
			System.out.println("Strings Are Equals");
		}
		else
		{
			System.out.println("Strings Are Not Equals");
		}
	}
	void stringOperation(String s,char ch)
	{
		char[] charArray = s.toCharArray();
		
		boolean flag = false;
		
		for(int i=0 ; i< charArray.length; i++)
		{
			if(charArray[i] == ch)
			{
				flag = true;
				break;
			}
		}
		if(flag = true)
		{
			System.out.println("Character is found");
		}
		else
		{
			System.out.println("Character is Not found");
		}
		
//		method 2
		
//		if (s.indexOf(ch) != -1) 
//		{
//            System.out.println("Character '" + ch + "' found in the string.");
//        } 
//		else 
//		{
//            System.out.println("Character '" + ch + "' not found in the string.");
//        }
	}
}

public class Q5_String_Method_Overloading 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First String:-");
		String str1 = sc.nextLine();
		
		System.out.println("Enter the Secound String");
		String str2 = sc.nextLine();
		
		System.out.println("Enter the Character to found in String first");
		char ch = sc.next().charAt(0);
		
		OverloadingClass oc = new OverloadingClass();
		
		oc.stringOperation(str1);
		oc.stringOperation(str1, str2);
		oc.stringOperation(str1,ch);
	}

}
