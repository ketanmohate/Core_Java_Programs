package Day_02_02_2025;

import java.util.*;

class StringData
{
	String str;
	
	StringData(String data)
	{
		this.str=data;
	}
	
	int getLength()
	{
		char[] charArray = str.toCharArray();
		int length = 0;
		for(int i=0 ;i<charArray.length; i++)
		{
			length++;
		}
		return length;
	}
	
	StringBuffer getToUppercase()
	{
		
		char[] charArray = str.toCharArray();
		
		for(int i=0 ; i<charArray.length; i++)
		{
			charArray[i] = (char) (charArray[i]-32);
		}
		
		String nString = new String(charArray);
		
		StringBuffer sb = new StringBuffer(nString);	
		return sb;
	}
	
	StringBuffer getRev()
	{		
		char[] charArray = str.toCharArray();
		
		int n = charArray.length;
		
		for(int i=0 ; i < n/2 ; i++)
		{
			char temp= charArray[i];
			charArray[i] = charArray[n - i -1];
			charArray[n - i - 1] = temp;
		}
		StringBuffer sb = new StringBuffer(new String(charArray));
		return sb; 
	}
}

public class Q2_StringOpApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:-");
		String str = sc.nextLine();
		
		StringData sd = new StringData(str);
		System.out.println("Lenth is:-" + sd.getLength());
		System.out.println("Upper Case String:-" + sd.getToUppercase());
		System.out.println("Reverse String:-" + sd.getRev());
	}
}