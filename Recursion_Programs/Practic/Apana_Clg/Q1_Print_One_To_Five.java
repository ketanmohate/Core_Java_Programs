package Apana_Clg;

public class Q1_Print_One_To_Five 
{
	public static void print(int num)
	{
		if(num ==6)
		{
			return ;
		}
		System.out.println(num);
		print(num+1);
	}
	
	public static void main(String[] args) 
	{
		int num=1;
		
		print(num);
	}

}
