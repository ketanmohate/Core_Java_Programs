package Assignment_21_08_2024.java;

/*
 Q4. WAP to create class name as Rev with two functions 
void setValue(int x): this function can accept number as parameter
int getRev(): this function can reverse the number and return it.
 */

import java.util.*;

class Rev
{
	int no;
	void setValue(int x)
	{
		no = x;
	}
	 
	void getRev()
	{
		int rem; 
		int rev=0;
		
		while(no != 0)
		{
			rem = no % 10;
			rev = (rev*10)+rem;
			no = no / 10;
		}
	 	System.out.println("Reverse Number is : " + rev);
	}
	 
}

public class Q4_Reverse_No 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int no = sc.nextInt();
		
		Rev  obj = new Rev();
		
		obj.setValue(no);
		obj.getRev();
		
	}

}
