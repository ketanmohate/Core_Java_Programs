package Day_02_02_2025;

import java.util.*;

interface StringTemplate
{
	void setString(String str);
	int getResult();
}

class ExtractDigit implements StringTemplate
{
	String str;
	public void setString(String str)
	{
		this.str = str;
	}
	
	public int getResult()
	{
		char[] charArray = str.toCharArray(); 
		int sum=0;
		for(int i=0 ; i<charArray.length ; i++)
		{
			if(charArray[i] >= 48 && charArray[i] <= 57)
			{
				sum = sum + charArray[i] - 48;
			}
		}
		return sum;
	}
}

class CountVowel implements StringTemplate
{
	String str;
	public void setString(String str)
	{
		this.str = str;
	}
	
	public int getResult()
	{
		char[] charArray = str.toCharArray();
		int count = 0;
		
		for(int i=0 ; i<charArray.length ; i++)
		{
			if(charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u'
				|| charArray[i] == 'A' || charArray[i] == 'E' || charArray[i] == 'I' || charArray[i] == 'O' || charArray[i] == 'U')
			{
				count++;
			}
		}
		return count;
	}
}

class StringHelper
{
	public void performOperation(StringTemplate template)
	{
		System.out.println("Result\t"+template.getResult());
	}
}

class Q1_StringWithDynamicPolyApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		StringHelper sh = new StringHelper();
		
		System.out.println("Enter the Case");
		System.out.println("Case 1:Extract Digit Sum");
		System.out.println("Case 2:Count Vowels");
		int choise = sc.nextInt();
		sc.nextLine();
		
		switch(choise)
		{
			case 1:
				ExtractDigit ed = new ExtractDigit();
				ed.setString(str);
				sh.performOperation(ed);
				break;
				
			case 2:
				CountVowel cv =new CountVowel();
				cv.setString(str);
				sh.performOperation(cv);
				break;
				
			default:
				System.out.println("Plz enter valid input");
		}
	}
}