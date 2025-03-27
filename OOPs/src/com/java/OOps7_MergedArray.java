package com.java;

/* Q2. WAP to create class name as MergeArray with two functions 
void acceptArray(int a[],int b[]): this function accept two array as parameter and merge them and store in third array
void showArray(): this function can show the merged array
*/

class MergedArray
{
	int x[];
	int y[];
	
	void acceptArray(int a[],int b[])
	{
		x=a;
		y=b;
	}
	
	void showArray()
	{
		int z[] = new int[10];
		
		for(int i=0 ; i<z.length ;i++)
		{
			int k = 0;
			for(int j = 0 ; j < x.length ; j++)
			{
				z[k] = x[j];
				k++;
			}
			
			for(int m = 0 ; m <y.length ;m++)
			{
				z[k] = y[m];
				k++;
			}
		}
		for(int i = 0 ; i<z.length ; i++)
		{
			System.out.println(z[i]);
		}
	}
}

public class OOps7_MergedArray {

	public static void main(String[] args) 
	{
		int a[]=new int[]{10,20,30,40,50};
		int b[]=new int[]{60,70,80,90,100};
		
		MergedArray obj = new MergedArray();
		obj.acceptArray(a, b);
		obj.showArray();
	}

}
