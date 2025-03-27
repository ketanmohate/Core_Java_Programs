package com.java;

/* Q. WAP to create class name as Table with two methods 
void setNum(int no): this method can accept number as parameter 
void showTable(): this method can calculate table of number and display it
*/

import java.util.*;

class MulTable
{
	Scanner sc = new Scanner(System.in);
	
	int num;
	int table;
	
	void setNum()
	{
		System.out.println("Enter the table num:");
		num = sc.nextInt();
	}
	
	void showTable()
	{
		System.out.println("Table");
		for(int i = 1 ; i <= 10 ; i++)
		{
			table = num * i;
			System.out.println(table);
		}
	}
}

public class OOps2_MulTable 
{
	public static void main(String [] x)
	{
		MulTable obj = new MulTable();
		obj.setNum();
		obj.showTable();
	}

}
