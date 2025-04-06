package oop.org;

/*
 Q23. WAP to perform following operation on string 
Java String Program to Remove Leading Zeros
Input: 000012356098
Output: 12356098
Explanation: Removing all the elements from the beginning of String which doesn't add any value to the number. 

Your Task is:  you have to create class name as RemoveLeaningZero with two methods 

void setString(String s): this method accept string as parameter 
String getStringWithoutZero(): this method can remove zero and return string after removing leading zero.
 */

import java.util.*;

class RemoveLeaningZero 
{
	String str;
	void setString(String str)
	{
		this.str = str;
	}
	
	String getStringWithoutZero() 
	{
		String newStr = "";
		
		char[] chArr = str.toCharArray();
		
		for (int i = 0; i < chArr.length; i++) 
		{	
			if(chArr[i] != '0')
			{
				for (int j = i; j < chArr.length; j++)
				{
					newStr = newStr + chArr[j];
				}
				break;
			}
		}
		return newStr;
	}
}

public class Q23_Remove_Leading_Zeros_String_Using_OOP {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();

		RemoveLeaningZero rZero = new RemoveLeaningZero();
		
		rZero.setString(str);
		
		System.out.println(rZero.getStringWithoutZero());
	}

}
