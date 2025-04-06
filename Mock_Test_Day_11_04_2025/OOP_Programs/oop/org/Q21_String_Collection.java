package oop.org;

/*
 * 
Q21. WAP to Perform string operation?
 */

import java.util.*;

class StringData
{
	String str;
	
	StringData(String str)
	{
		this.str = str;
	}
	
	int getLength()
	{
		char[] chArr = str.toCharArray();
		
		int count=0;
		for(char ch : chArr)
		{
			count++;
		}
		return count;
	}
	
	StringBuffer getConcat()
	{		
		String newStr = "";
		
		for (int i = 0; i < str.length(); i++) 
		{
			char ch = (char) (str.charAt(i)-32);
			
			newStr = newStr + ch;
		}
		
		StringBuffer sb = new StringBuffer(newStr);
		return sb;
	}
	
	StringBuffer getRev()
	{
		String revStr = "";
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			revStr = ch + revStr;
		}
		
		StringBuffer sb = new StringBuffer(revStr);
		
		return sb;
	}
}

public class Q21_String_Collection {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		StringData sd = new StringData(str);
		
		System.out.println(sd.getLength());
		System.out.println(sd.getConcat());
		System.out.println(sd.getRev());
	}

}
