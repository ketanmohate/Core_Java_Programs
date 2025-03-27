package Day_09_02_2025;

/*
 * Q5. WAP to create Vector and reverse all elements of Vector without using the inbuilt method?
 */

import java.util.*;

public class Q5_Reverse_All_Elements 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		Vector vec = new Vector();
		
		for(int i=0 ; i<size ; i++)
		{
			vec.add(sc.nextInt());
		}
		
		for(int i=0 ; i<size/2 ; i++)
		{
			int temp = (int) vec.get(i);
			vec.set(i, vec.get(i));
		}
	}

}
