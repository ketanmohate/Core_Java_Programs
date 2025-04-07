package com.java;

/*
 * Q3. InvalidPasswordException
Description: Suppose consider we are working on Login Application and we have one class name 
as PasswordChecker and this class check the password enter by user and password checking rules given below

Password length must be minimum 8 char 
Password must be contain at  least on capital letter
Password must be contain at least on digit 
Password must be contained at one special symbol

Note: if any one of above criteria not match in user password then system should 
generate exception InvalidPasswordException 
 */

import java.util.*;

class PassExceptions extends RuntimeException
{	
	String inValidPass()
	{
		return "Invalid Password";
	}
}

class CheckPass
{
	boolean isValidPass(String str)
	{
		char[] chArr = str.toCharArray();
		
		if(str.length() <8)
		{
			throw new PassExceptions();
		}
		
		boolean capLater = false;
		boolean digit = false;
		boolean symbol = false;
		
		for (int i = 0; i < chArr.length; i++) 
		{
			if(chArr[i]>=65 && chArr[i]<=90)
			{
				capLater = true;
			}
			if(chArr[i]>=48 && chArr[i]<=57)
			{
				digit = true;
			}
			if(chArr[i] == 35 || chArr[i] == 36	|| chArr[i] == 38 || chArr[i] == 64)
			{
				symbol = true;
			}
		}
		
		if(capLater && digit && symbol)
		{
			return true;
		}
		else
		{
			throw new PassExceptions();
		}
	}
}

public class Q3_Invalid_Password_Exception {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Password");
		
		String pass = sc.nextLine();
		
		CheckPass ck = new CheckPass();
		
		try {
			if(ck.isValidPass(pass))
			{
				System.out.println("Your Password Is Strong");
			}
		}
		catch(PassExceptions e){
			System.out.println(e.inValidPass());
		}

	}

}
