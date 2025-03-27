package Day_09_02_2025;

/*
 * Q1. WAP to create Vector and find the occurrence of elements in Vector?
 */

import java.util.*;

public class Q1_Find_The_Occurrence 
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
		
		boolean[] counted = new boolean[size];
		
		int count=0;
		
		for(int i=0 ; i<v.size() ; i++)
		{
			if (counted[i] == false)
			{
				count = 0;
			
				for(int j=0 ; j<v.size() ; j++)
				{
					if(v.get(i) == v.get(j))
					{
						count++;
						counted[j] = true;
					}
				}
				System.out.println(v.get(i) +"--------->" + count);
			}
		}
	}

}
