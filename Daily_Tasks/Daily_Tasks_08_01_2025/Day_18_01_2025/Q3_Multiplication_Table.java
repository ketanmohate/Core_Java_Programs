package Day_18_01_2025;

/*
 * Q3. Create a thread that prints the multiplication table of a given number. 
 * The thread should print one line at a time with a 1-second delay between lines. 
 * Use join() in the main thread to wait for the multiplication table thread to finish.
 */

import java.util.*;

class MulTable extends Thread 
{
	int num;
	
	MulTable(int num)
	{
		this.num=num;
	}
	
	public void run()
	{
		for(int i=1 ; i<=10 ; i++)
		{
			System.out.println(num + " x " + i + " = " + (num * i));
			try 
			{
				sleep(1000);
			}
			catch (InterruptedException e) 
			{
				System.out.println("Error is:" + e);
			}
		}
	}
}

public class Q3_Multiplication_Table 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		MulTable mt = new MulTable(num);
		
		mt.start();
		
		try 
		{
            mt.join(); 
//            System.out.println("Multiplication table thread has finished.");
        } 
		catch (InterruptedException e) 
		{
            System.out.println("Main thread was interrupted.");
        }
	}

}
