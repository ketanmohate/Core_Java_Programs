package oop.org;

/*
 * 
Q1. WAP to create class name as Table with two functions 
void setValue(): this function is used for accept number from keyboard 
void showTable(): this function can display the table of number 
 */

import java.util.*;

class Table
{
	int num ;
	void setValue(int num)
	{
		this.num = num;
	}
	
	void showTable()
	{
		for (int i = 1; i <=10; i++) 
		{

			System.out.println(i + " * " + num + " = " + (i*num));
		}
	}
}

public class Q1_Display_the_table_of_number {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();

		Table tb = new Table();
		tb.setValue(num);
		tb.showTable();
	}

}
