package Test;

import java.util.*;
public class Second_high
{
 public static void main(String args[])
 {
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter The Size of Array");
   int size=sc.nextInt();
   int a[]=new int[size];
   System.out.println("Enter The Array Element");
   for(int i=0;i<a.length;i++)
   {
      a[i]=sc.nextInt();
   }
   int large=a[0];
   int secondL=0;
   
   for(int i=0;i<a.length;i++)
   {
      if(large<a[i])
	  {
	     secondL=large;
		 large=a[i];
	  }
	  else if(a[i]>secondL&&large!=a[i])
	  {
		  secondL=a[i];
	  }
   }
	System.out.println("The Second LArgest Element in Array is.."+secondL);
 }
}