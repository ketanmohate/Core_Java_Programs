package Day_15_01_2025;

import java.util.*;

/*
 * Q3. Java String Program to Remove Leading Zeros
Input: 000012356098
Output: 12356098
Your Task is you have to create class ame as RemoveLeadingZero with two methods 
void  setString(String str): this method can accept string as parameter 
void removeLeadingZero(): this function can remove the learning zero from string  
 */

class Ame
{
	String str;
	
	void setString(String str)
	{
		this.str=str;
	}
	
	void removeLeadingZero()
	{
		char[] ch = str.toCharArray();
		
		int count=0;
		
		for(int i=0 ; i<ch.length ; i++)
		{
			if(ch[i] == '0')
			{
				count++;
			}
			else
			{
				break;
			}
		}
		
		
//		System.out.println(count);
		
		int nSize = ch.length - count;
		
//		System.out.println(nSize);
		
		char[] chh = new char[nSize];
		
		int k=0;
		
		for(int i=count ; i<ch.length ; i++)
		{
			chh[k] = ch[i];
			k++;
		}
		
		System.out.println(new String(chh));
		
	}
}

public class Q3_Remove_Leading_Zeros 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		
		Ame a = new Ame();
		
		a.setString(str);
		
		a.removeLeadingZero();
	}

}
