package Day_10_02_2025;

/*
 * Q3. WAP to store 10 string values in Vector and count the total number voles in 
 * all strings of Vector?
 */

import java.util.*;

public class Q3_Count_Total_Vowels 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Vector v = new Vector();
		
		System.out.println("Enter the size");
		int size = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter ths Strigs");
		for(int i=0 ; i<size ; i++)
		{
			v.add(sc.nextLine());
		}
		
		int count = 0;
		
		for(int i=0 ; i<size ; i++)
		{
			String str = (String) v.get(i);
			
			for(int j=0 ; j<str.length(); j++)
			{
				if(str.charAt(j) == 'a'  || str.charAt(j) == 'e' || str.charAt(j) == 'i' || str.charAt(j) == 'o' || str.charAt(j) == 'u'
				|| str.charAt(j) == 'A'  || str.charAt(j) == 'E' || str.charAt(j) == 'I' || str.charAt(j) == 'O' || str.charAt(j) == 'U')
				{
					count++;
				}
			}
		}
		System.out.println("Count:-" + count);
	}

}
