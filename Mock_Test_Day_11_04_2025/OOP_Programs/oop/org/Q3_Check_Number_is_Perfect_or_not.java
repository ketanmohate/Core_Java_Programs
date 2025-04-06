package oop.org;

/*
 * Q3. WAP to create class name as Perfect with two functions 
void setValue(): this function can accept number as parameter 
void checkPerfect(): this function can check number is perfect or
not if perfect the show message number is perfect if not then 
show message number is not perfect
 */

import java.util.*;

class Perfect
{
	int num;
	void setValue(int num)
	{
		this.num = num;
	}
	
	void checkPerfect()
	{
		int sum = 0;
		
		for(int i=1 ; i<=num/2 ; i++)
		{
			if (num % i == 0) 
			{
                sum = sum + i;
            }
		}
		
		if(sum == num)
		{
			System.out.println("Number is Perfect");
		}
		else
		{
			System.out.println("Number is Not Perfect");
		}
	}
}

public class Q3_Check_Number_is_Perfect_or_not {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		Perfect per = new Perfect();
		
		per.setValue(num);
		per.checkPerfect();
	}

}
