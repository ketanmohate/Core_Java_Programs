package Day_03_02_2025;
/*
Q4. Program to Add Binary Strings
 Input : str1 = "1001"
             str2 = "11"

Output : "1100"

Explanation : "1001" represents 9 and "11" represents 3 then the result should be 12 which means result = "1100".

Goal of this assignment : we want to cover the super() constructor concept in this assignment so you can follow the following class diagram
*/

import java.util.*;
class BinaryString
{
	 String str;
	
	public BinaryString(String str)
	{
		this.str=str;
	}
}

class BinaryAdd extends BinaryString
{
	
	private String str1;
	
	public BinaryAdd(String str,String str1)
	{
		super(str);
		this.str1=str1;
	}
	
	public String getBinaryAdd()
	{
		char ch[]=str.toCharArray();
		char ch1[]=str1.toCharArray();
		
		//StringBuilder sb = new StringBuilder();
		
		int dec=0;
		int base=1;
		for(int i=ch.length-1;i>=0;i--)
		{
			if(ch[i]=='1')
			{
				dec=dec+base;
			}
			base=base*2;
		}
		
		int dec1=0;
		int base1=1;
		for(int i=ch1.length-1;i>=0;i--)
		{
			if(ch1[i]=='1')
			{
				dec1=dec1+base1;
			}
			base1=base1*2;
		}
		
		int sum=dec+dec1;
		String s=" ";
		
		while(sum!=0)
		{
			int rem=sum%2;
			s=rem+s;
			sum=sum/2;
			
		}
		
		
		return s;
	}

}

public class Q4
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		String str1,str2;
		
		System.out.println("Enter String1");
		str1=xyz.nextLine();
		
		System.out.println("Enter String2");
		str2=xyz.nextLine();
		
		BinaryAdd ab = new BinaryAdd(str1,str2);
		String result=ab.getBinaryAdd();
		System.out.println("Sum is:"+result);
		//ab.getBinaryAdd();
	}
}