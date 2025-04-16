package Operation.org;

import java.util.Iterator;
import java.util.Vector;

/*
 * Example: WAP to store 5 values in Vector and perform sorting on it without using sort() method
 */

public class Q4_Sort_Vector {
	public static void main(String[] args) 
	{
		Vector vector = new Vector();
		
		vector.add(3);
		vector.add(1);
		vector.add(5);
		vector.add(2);
		vector.add(4);
		
		Iterator iterator = vector.iterator();
		
		int len = vector.size();
		
		for (int i = 0; i < len; i++) 
		{
			for (int j = i + 1 ; j < len; j++) 
			{
				Object prev = vector.get(i);
				Object next = vector.get(j);
				
				if ((int) prev > (int) next) 
				{
					vector.set(i, next);
					vector.set(j, prev);
				}
			}
		}
		System.out.println(vector);
	}
	
}
