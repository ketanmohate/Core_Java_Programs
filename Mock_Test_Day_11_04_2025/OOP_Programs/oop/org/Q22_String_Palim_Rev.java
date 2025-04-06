package oop.org;

/*
 * Q22. WAP to Create class name as StringPalim 
 */

import java.util.*;

class StringPalim
{
	String str;
	StringPalim(String str)
	{
		this.str = str;
	}
	
	String revStr = "";
	
	String getRevString()
	{
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			revStr = ch + revStr;
		}
		
		return revStr;
	}
	
	boolean isPalim()
	{
		if(revStr.equals(str)) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

public class Q22_String_Palim_Rev {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		StringPalim sp = new StringPalim(str);
		
		System.out.println(sp.getRevString());
		
		if(sp.isPalim())
		{
			System.out.println("String is Palindrom");
		}
		else
		{
			System.out.println("String is not palindrom");
		}
	}

}
