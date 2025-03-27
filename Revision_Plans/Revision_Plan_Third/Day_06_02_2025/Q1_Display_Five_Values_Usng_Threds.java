package Day_06_02_2025;

/*
 * Q1. WAP to create thread using Thread class and display five values with a difference of 10000 
		milliseconds time slot?
 */

class DisplayVal extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1 ; i<=5 ; i++)
			{
				System.out.println(i);
				sleep(10000);
			}
		}
		catch(Exception e)
		{
			System.out.println("error is:" + e);
		}
	}
}

public class Q1_Display_Five_Values_Usng_Threds 
{
	public static void main(String[] args) 
	{
		
		DisplayVal dv = new DisplayVal();
		dv.start();
		
	}

}
