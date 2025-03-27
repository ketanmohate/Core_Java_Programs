package com.java;

/* Q4. WAP to create class name as FindUnion with functions 
void setArray(int a[],int b[]): this function accept two array as parameter
void findUnion(): this function can find the union of two array and store in third array
*/

class indUnionOfTowArray
{
	int x[];
	int y[];
	int z[] = new int[10];
	
	void setArray(int a[], int b[])
	{
		x=a;
		y=b;
	}
	
	void findUnic()
	{	
		int k=0;
		
		// first array copy in unic array
		
		for(int i = 0 ; i < z.length ;i++)
		{
			 k = 0;
			for(int j = 0 ; j < x.length ; j++)
			{
				z[k] = x[j];
				k++;
			}
		}
		
		// main logic of unic array
		
		for(int i=0 ; i<y.length ;i++)
		{
			int flag=0;
			for(int j=0 ; j<x.length ;j++)
			{	
				if(y[i] == x[j])
				{
					flag=1;// element is found that flag is 1
					break;
				}
			}
			if(flag==0)
			{
	            z[k] = y[i];
	            k++;
			}
		}
		
		//print unic array
		
		System.out.println("Unic Arry:");
		
		for(int i=0 ; i<k ;i++)
		{
			System.out.println(z[i]); 
		}
	}
}

public class OOps9_FindUnionOfTowArray 
{
	public static void main(String[] args)
	{
		int a[]=new int[]{1, 2, 3, 4, 5};
		int b[]=new int[]{4, 5, 6, 7, 8};
		
		indUnionOfTowArray obj = new indUnionOfTowArray();
		obj.setArray(a,b);
		obj.findUnic();
	}
}
