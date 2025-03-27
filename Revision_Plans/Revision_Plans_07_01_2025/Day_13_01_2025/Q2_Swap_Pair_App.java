package Day_13_01_2025;

/*
 Q2. Java String Program to Swapping Pair of Characters
Input: str = “ G I R I T E C H H U B ”
Output: I G I R E T H C U H B
Your Task:
You have to create class name as SwapPair with two methods 
void setString(String data): this function can accept string type of data
String getRevPairData(): this function can get the reverse pair data.
 */

import java.util.*;

class SwapPair 
{
	String str;
	
	void setString(String data)
	{
		str=data;
	}
	
	String getRevPairData()
	{
		
		char ch[] = str.toCharArray();
		
		
		//Method 1
		
//		for(int i=0 ; i<ch.length-1 ; i++)
//		{
//			if(i%2 ==0)
//			{
//				char temp = ch[i];
//				ch[i] = ch[i+1];
//				ch[i+1] = temp;
//			}
//		}
		
//		Method 2
		
		for(int i=0 ; i<ch.length-1 ; i+=2)
		{
			if(ch[i] != ch[i+1])
			{
				char temp = ch[i];
				ch[i] = ch[i+1];
				ch[i+1] = temp;
			}
		}
		
		return new String(ch);
	 
	}
}

public class Q2_Swap_Pair_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:-");
		String str = sc.nextLine();
		
		SwapPair swap = new SwapPair();
		
		swap.setString(str);
		
		System.out.println("---------------------");
		System.out.println(swap.getRevPairData());
		
	}

}
