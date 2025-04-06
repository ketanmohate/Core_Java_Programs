package oop.org;

/*
 * Q17. Write Program to create abstract class name as Value with one abstract and one non abstract method
void setValue(int ,int): this is non abstract method with two parameter abstract
 int getResult(): this is abstract method and you have two child class name as Power and you have to 
 override getResult() method in Power class and calculate power of two values and return it as well as 
 SearchDigit and you have to override getResult() consider first parameter of setValue() is number and 
 second parameter is digit and you have to search digit in number and return it and if digit not found return -1.
 */

import java.util.*;

abstract class Value
{
	int val1, val2;
	void setValue(int val1,int val2)
	{
		this.val1 = val1;
		this.val2 = val2;
	}
	
	abstract int getResult();
}

class Power extends Value
{
	public int getResult()
	{
		int pow = 1;
		
		for (int i = 1; i <=val2; i++) 
		{
			pow = pow * val1;
		}
		return pow;
	}
}

class SearchDigit extends Value
{
	public int getResult()
	{
		while(val1 != 0)
		{
			int digit = val1 % 10;
			
			if(digit == val2)
			{
				return val2;
			}
			val1 = val1 / 10;
		}
		return -1;
	}
}

public class Q17_Abstract_Class_Example {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value first");
		int val1 = sc.nextInt();
		
		System.out.println("Enter the Value second");
		int val2 = sc.nextInt();
		
		Value value;
		
		value = new Power();
		value.setValue(val1, val2);
		System.out.println(value.getResult());
		
		value = new SearchDigit();
		value.setValue(val1, val2);
		System.out.println(value.getResult());
	}

}
