package com.java;

/*
 7.WAP to create the class name as InsertArrayEle with a following methods  
class InsertArrEle 
{  int c[]; 
void setIntArray(int ch[]) 
{ //here accept the integer array and store in instance variable in integer array 
c=ch; 
} 
void insertValueOnIndex() 
{ //here we need to write the manual logics for  inserting value on specified index in arr 
} 
} 
public class ConvertToUpperApp 
{ 
} 
public static void main(String x[]) 
{  //here create the array with 6 six size and store only five value in it using scanner 
// create the object of InsertArrEle class 
//call the setIntArray function 
//call the insertValueOnIndex() and write the manual logics 
}
 */

import java.util.*;

class InsertArrEle
{
	int c[];
	Scanner sc = new Scanner(System.in);
	void setIntArray(int ch[])
	{
		c=ch;
	}
	void insertValueOnIndex()
	{
		System.out.println("Enter the Array Element");
		for(int i=0;i<c.length-1;i++)
		{
			c[i] = sc.nextInt();
		}
		System.out.println("Display Array Element");
		for(int i=0;i<c.length-1;i++)
		{
			System.out.println(c[i]);
		}
			
	}
}
public class Q7_Insert_Array_Element_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the how many Element Insent");
		int size=sc.nextInt();
		
		int arrInsertArrEle[] = new int[size];
		
		InsertArrEle obj = new InsertArrEle();
		obj.setIntArray(arrInsertArrEle);
		obj.insertValueOnIndex();
		;lhugkjghyjfuj
	}

}
