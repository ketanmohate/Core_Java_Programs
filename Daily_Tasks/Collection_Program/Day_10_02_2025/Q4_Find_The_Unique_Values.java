package Day_10_02_2025;

/*
 * Q4. WAP to store 10 values in Vector and find the unique values from vector?
 */

import java.util.*;

public class Q4_Find_The_Unique_Values 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Vector v = new Vector();
		
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		System.out.println("Enter the Value");
		for(int i=0 ; i<size ; i++)
		{
			v.add(sc.nextInt());
		}
		
		int count = 0;
		
		System.out.println("Unic values");
		for(int i=0 ; i<v.size() ; i++)
		{
			count=0;
			for(int j = 0 ; j<v.size() ; j++)
			{
				if(v.get(i) == v.get(j))
				{
					count++;
				}
			}
			if(count == 1)
			{
				System.out.println(v.get(i));
			}
		}
		
		if(count != 1)
		{
			System.out.println("Dublicate value not present");
		}
	}

}
