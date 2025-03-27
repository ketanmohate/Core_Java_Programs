package Day_13_01_2025;

/*
 * Q3. Java String Program to Replace a Character at a Specific Index
Input: str = "JAVA IS FOOD Programming " , index = 8 , ch = 'G'
Output: "JAVA IS GOOD Programming"
Your Task
You have to create class name as ReplaceChar with two methods 
  void setString(String data): this method can accept string type of data
  void insertCharIndex(int index,char ch): this function can insert character on specified data
 */

import java.util.*;

class ReplaceChar 
{
	String str;
	
	void setString(String data)
	{
		this.str=data;
	}
	
	void insertCharIndex(int index, char ch)
	{
		char[] chArr = str.toCharArray();
		
		for(int i=0 ; i<chArr.length ;i++)
		{
			if(i==index)
			{
				chArr[i]=ch;
			}
		}
		
		new String(chArr);
		System.out.println("------------------");
		System.out.println(chArr);
	}
}

public class Q3_Replace_Char_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		
		ReplaceChar replace = new ReplaceChar();
		
		System.out.println("Enter the Indext to insert charactor:");
		int indext = sc.nextInt();
		
		System.out.println("Enter the Charactor:");
		char ch = sc.next().charAt(0);
		
		replace.setString(str);
		replace.insertCharIndex(indext, ch);
		
	}

}
