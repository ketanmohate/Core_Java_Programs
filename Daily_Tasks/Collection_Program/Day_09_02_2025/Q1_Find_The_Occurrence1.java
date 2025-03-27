package Day_09_02_2025;

/*
 * Q1. WAP to create Vector and find the occurrence of elements in Vector?
 */

import java.util.*;

public class Q1_Find_The_Occurrence1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Vector v = new Vector();
		
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		for(int i=0 ; i<size ; i++)
		{
			v.add(sc.nextInt());
		}
		
		// logic
		
		int count=0;
		
		for(int i=0 ; i<v.size() ; i++)
		{
			
			count = 0;
				
			for(int j=0 ; j<v.size() ; j++)
			{
				if(v.get(i) == v.get(j))
				{
					count++;
				}
			}
			
			boolean flag = false;
			
			for(int k=0 ; k<i ; k++)
			{
				if(v.get(k) == v.get(i))
				{
					flag = true;
					break;
				}
			}
			if(flag)
			{
				System.out.println(v.get(i) +"--------->" + count);
			}
		}
	}

}
