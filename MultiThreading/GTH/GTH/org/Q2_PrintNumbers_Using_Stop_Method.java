package GTH.org;

class OddPrint extends Thread
{
	public void run() 
	{
		try{
			for(int i=1 ; i<=50 ; i++)
			{
				if(i%2 != 0)
				{
					System.out.println(i);
				}
				if(i==10)
				{
					System.out.println("Stop Thread");
					stop();
				}
			}
		}
		catch(Exception e)
		{
			
		}
	}	
}

class EvenPrint extends Thread
{
	public void run()
	{
		try{
			for(int i=1 ; i<=50 ; i++)
			{
				if(i%2 == 0)
				{
					System.out.println(i);
				}
				if(i==10)
				{
					System.out.println("Stop Thread");
					stop();
				}
			}
		}
		catch(Exception e)
		{
			
		}
	}
}

public class Q2_PrintNumbers_Using_Stop_Method 
{
	public static void main(String[] args) 
	{
		OddPrint op = new OddPrint();
		EvenPrint ep = new EvenPrint();
		
		op.start();
		ep.start();
	}
}
