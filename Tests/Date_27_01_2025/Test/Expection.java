package Test;

import java.util.*;
 public class Expection
  {
    public static void main(String args[])
	{
	 Scanner sc= new Scanner(System.in);
	 int ch;
	 do{
	    System.out.println("1 :Airthmatic E");
		System.out.println("2 :null pointer");
		System.out.println("3 :number Format");
		System.out.println("4 :Array Index Out of bound");
		System.out.println("5 :Class Not Found");
		System.out.println("6 : Exit");
		
		System.out.println("Enter Your Choise..");
		ch=sc.nextInt();
		
		switch(ch)
		 {
		   case 1:
			  try{
				int a=0;
					int b=2;
					 System.out.println(b/a);
				  
			  }catch(Exception e)
			  {
				  System.out.println("The Error is.."+e);
			  }
			break;
			
			 case 2:
				try{
					
					String str=null;
			       System.out.println(str.length());
				 	
				  
			  }catch(Exception e)
			  {
				  System.out.println("The Error is.."+e);
			  }
			break;
			
			 case 3:
			 
			 String numberStr="abc";
				try{
					
				int number=Integer.parseInt(numberStr);	
				  
			  }catch(Exception e)
			  {
				  System.out.println("The Error is.."+e);
			  }
			break;
			
			 case 4:
				 try{
				   
	
				int a[]=new int[5];
				for(int i=0;i<a.length+1;i++)
				{
					a[i]=sc.nextInt();
				}
				  
			  }catch(Exception e)
			  {
				  System.out.println("The Error is.."+e);
			  }
			break;
				
			 case 5:
				try{
			   Class.forName("hgj");									
			  }catch(Exception e)
			  {
				  System.out.println("The Error is.."+e);
			  }
			break;
			
			 case 6:
				  try{
				  
				  
			  }catch(Exception e)
			  {
				  System.out.println("The Error is.."+e);
			  }
			break;
			default :
			System.out.println("Enter The VAlid Input");
		   
		 }
		
	 }  while(ch!=6);
	 
	}
  }