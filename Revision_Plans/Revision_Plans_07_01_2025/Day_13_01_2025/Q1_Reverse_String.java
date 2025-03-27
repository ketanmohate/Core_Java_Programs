package Day_13_01_2025;

/*
 * Q1. WAP to create class name as RevString with two functions
   void setString(String data): this function can accept string as parameter
   String getRevString(): this function can reverse the string and return it.
 */

import java.util.*;

class RevString
{
	String str;
	
	void setString(String data)
	{
		str=data;
	}
	
	String getRevString()
	{
		StringBuffer s = new StringBuffer(str);
		s.reverse();
		return s.toString();
	}
}

public class Q1_Reverse_String 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		
		RevString rev = new RevString();
		rev.setString(str);
		
		System.out.println("Reverce String:-\t" + rev.getRevString());
	}

}
