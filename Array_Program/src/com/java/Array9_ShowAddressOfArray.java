package com.java;
/* Q. Can we see the address present in reference variable or array variable? */

public class Array9_ShowAddressOfArray
{
	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5};
		
		System.out.println("base address of array is : \t" + System.identityHashCode(a));
	}
}
		