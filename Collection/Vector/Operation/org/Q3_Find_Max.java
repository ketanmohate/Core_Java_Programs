package Operation.org;

/*
 * Example: WAP to store 5 values in Vector and find the max value from Vector
 */

import java.util.*;

public class Q3_Find_Max {
	public static void main(String[] args) 
	{
		Vector vector = new Vector();
		
		vector.add(100);
		vector.add(200);
		vector.add(500);
		vector.add(400);
		vector.add(300);
		
		Iterator iterator = vector.iterator();
		
		int max = vector.indexOf(0);
		
		while(iterator.hasNext())
		{
			Object obj = iterator.next();
			
			if((int) obj > max)
			{
				max = (int) obj;
			}
		}
		
		System.out.println("Max is:\t" + max);
	}

}
