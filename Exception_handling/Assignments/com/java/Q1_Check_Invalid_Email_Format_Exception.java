package com.java;

/*
Q1. Check InvalidEmailFormatException 
Description: you have created an application for checking if an email entered by a user is proper or not 
means email must contain @ and . (dot operator) and after dot operator there must 2 or 3 characters and dot 
may be repeat  and @ must be only once in email and if this criteria is not  match then system should generate 
exception at run time InvalidEmailFormatException
 */

import java.util.*;

class NotValidEmail extends RuntimeException
{
	String inValidEmail()
	{
		return "Invalid Email Format";
	}
}

class Operations
{
	String str;
	void setEmail(String str)
	{
		this.str = str;
	}
	
	void validEmail()
	{
		char[] chArr = str.toCharArray();
		
		int countAt = 0;
		boolean dotFound = false;
		int dotAfterChar = 0;
		
		for (int i = 0; i < chArr.length; i++) 
		{
			if(chArr[i] == '@')
			{
				countAt++;
			}
			if(chArr[i] == '.')
			{
				for(int j=i ; j<chArr.length-1 ; j++)
				{
					dotAfterChar++;
					if(dotAfterChar >= 2 || dotAfterChar >= 3)
					{
						dotFound = true;
					}
				}
			}
		}
		
//		System.out.println("countAt"+countAt);
//		System.out.println("dotFound" +dotFound);
//		System.out.println("dotAfterChar" + dotAfterChar);
		
		if(countAt == 1 && dotFound == true && chArr[chArr.length-1] != '.')
		{
			System.out.println("Valid Email");
		}
		else
		{
//			System.out.println("Invalid Email");
			throw new NotValidEmail();
		}
	}
}


public class Q1_Check_Invalid_Email_Format_Exception 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Email");
		String str = sc.nextLine();
		
		Operations op = new Operations();
		op.setEmail(str);
	
		try
		{
			op.validEmail();
		}
		catch(NotValidEmail e)
		{
			System.out.println(e.inValidEmail());
		}
	}

}
