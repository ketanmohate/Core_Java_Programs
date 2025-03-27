package Assignment_18_09_2024;

/*
 Q.2 WAP to Create a class name as Power with a parameterised constructor and one function int getPower( ).
Power(int , int)
{
// this constructor can accept the base and index.
}
int getPower()
{
//this function can return power of numbers.
}
 */

import java.util.*;

class Power
{
	int base;
	int index;
	
	public Power(int base , int index)
	{
		this.base=base;
		this.index=index;
	}
	
	public int getPower()
	{
		int power=1;
		for(int i=1;i<=index;i++)
		{
			power = power*base;
		}
		return power;
	}
}

public class Q2_Power_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base");
		int base=sc.nextInt();
		
		System.out.println("Enter the Index");
		int index=sc.nextInt();
		
		Power obj = new Power(base,index);
		int power = obj.getPower();
		System.out.println("Power is:\t"+ power);
	}

}
