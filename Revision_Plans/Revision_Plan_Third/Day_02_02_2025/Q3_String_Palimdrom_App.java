package Day_02_02_2025;

import java.util.*;

class StringPalim
{
	String str;
	StringPalim(String str)
	{
		this.str = str;
	}
	
	String getRevString()
	{
		char[] charArray = str.toCharArray();
		
		int n = charArray.length;
		
		for(int i=0 ; i< n/2 ; i++)
		{
			char temp = charArray[i];
			charArray[i] = charArray[n - i -1];
			charArray[n - i -1] = temp;
		}
		
		String rev = new String(charArray);
		
		return rev;
	}		
	
	boolean isPalim()
	{
		if(str.equals(getRevString()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

public class Q3_String_Palimdrom_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:-");
		String str =sc.nextLine();
		
		StringPalim sp = new StringPalim(str);
		
		sp.getRevString();
		
		if(sp.isPalim() == true)
		{
			System.out.println("String is Palindrom");
		}
		else
		{
			System.out.println("String is not Palindrom");
		}
	}

}
