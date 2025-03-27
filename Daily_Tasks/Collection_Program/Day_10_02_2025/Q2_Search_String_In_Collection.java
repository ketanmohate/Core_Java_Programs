package Day_10_02_2025;

/*
 * Q2. WAP to store 10 string values in Vector and search string whose length is 
 * more than three and ends with sh 
 */

import java.util.*;

public class Q2_Search_String_In_Collection 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size");
		int size = sc.nextInt();
		
		Vector v = new Vector();
		
		System.out.println("Enter the vavlue");
		for(int i=0 ; i<size ; i++)
		{
			v.add(sc.nextLine());
		}
		
		System.out.println("Search String:-");
		for(int i=0 ; i<size ; i++)
		{
			String str = (String)v.get(i);
			
			if(str.length()>3 && str.endsWith("sh"))
			{
				System.out.println(v.get(i));
			}
		}
	}
}
