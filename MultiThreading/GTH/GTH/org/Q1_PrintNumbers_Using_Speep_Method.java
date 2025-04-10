package GTH.org;

import java.util.*;

class PrintOdd extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1; i<=50 ; i++)
			{
				if(i%2 != 0)
				{
					System.out.println(i);
					sleep(1000);
				}
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

class PrintEven extends Thread
{
	public void run()
	{
		try {
			for (int i = 1; i <=50; i++) 
			{
				if(i%2 == 0)
				{
					System.out.println(i);
					sleep(1000);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

public class Q1_PrintNumbers_Using_Speep_Method {

	public static void main(String[] args) {

		PrintOdd po = new PrintOdd();
		PrintEven pe = new PrintEven();
		po.start();
		pe.start();
	}

}
