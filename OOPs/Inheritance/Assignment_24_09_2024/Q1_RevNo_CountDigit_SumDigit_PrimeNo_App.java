package Assignment_24_09_2024;

import java.util.*;

class Number
{
	int no;
	void seNumber(int no)
	{
		this.no=no;
	}
}

class Reverse extends Number
{
    int getRev() 
    {
    	System.out.println("nio"+no);
        int rev = 0;
        int temp = no; 
        while (temp != 0) 
        {
            rev = rev * 10 + (temp % 10);
            temp = temp / 10;
        }
        return rev;
    }
}

public class Q1_RevNo_CountDigit_SumDigit_PrimeNo_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		Number objNumber = new Number();
		objNumber.seNumber(num);
		
		Reverse objReverse = new Reverse();
		System.out.println("Revers Number:");
		System.out.println(objReverse.getRev());
		
	}

}
