package Day_09_02_2025;

/*
 * Q2. WAP to find the duplicate values from Vector?
 */

import java.util.*;

public class Q2_Find_The_Duplicate_Values 
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
		
		// logic 
		
		 for (int i = 0; i < vec.size(); i++) 
		 {
			 boolean isDuplicate = false;

			 // Check if this element appeared before
			 for (int k = 0; k < i; k++) 
			 {
				 if (vec.get(i).equals(vec.get(k))) 
				 {
					 isDuplicate = true;
					 break;
	             }
			 }

			 // If it's already counted, skip it
			 if (isDuplicate)	 
			 {
				 continue;
			 }

			 // Check for duplicates ahead
			 for (int j = i + 1; j < vec.size(); j++)
			 {
				 if (vec.get(i).equals(vec.get(j)))
				 {
					 System.out.println(vec.get(i));
					 break; // Avoid printing same duplicate multiple times
				 }
			 }
		 }
	}
}
