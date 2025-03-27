package Day_09_02_2025;

/*
 * Q4. WAP to  create two vectors and merge in the third vector and display it?
 */

import java.util.*;

public class Q4_Merge_Vector 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of first vector");
		int size1 = sc.nextInt();
		
		Vector vec1 = new Vector();
		
		for(int i=0 ; i<size1 ; i++)
		{
			vec1.add(sc.nextInt());
		}
		
		System.out.println("Enter the size of Secound vector");
		int size2 = sc.nextInt();
		
		Vector vec2 = new Vector();
		
		for(int i=0 ; i<size2 ; i++)
		{
			vec2.add(sc.nextInt());
		}
		
		// new vector		
		Vector vec3 = new Vector();
		
		for(int j=0 ; j<size1 ; j++)
		{
			vec3.add(vec1.get(j));
		}
			
		for(int m=0 ; m<size2; m++)
		{
			vec3.add(vec2.get(m));
		}
		
		System.out.println("Marge Vector");
		for(int i=0 ; i<vec3.size(); i++)
		{
			System.out.println(vec3.get(i));
		}
	}
}
