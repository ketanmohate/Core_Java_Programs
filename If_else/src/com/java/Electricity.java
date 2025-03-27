package com.java;
import java.util.*;
public class Electricity
{
	public static void main(String args[])
 	{
   		int unit, x;
      		float sum=0,fbill,addcharge;
     		Scanner sc=new Scanner(System.in);
       		System.out.println(" ENter unit");
       		unit=sc.nextInt();
      		if(unit>250)
         	{
            		x=unit-250;
            		sum=sum+x*1.5f;
            		unit=unit-x;
           	}
      		if(unit>150)
         	{
              		x=unit-150;
               		sum=sum+x*1.2f;
              		unit=unit-x;
           	}
       		if(unit>50)
           	{
              		x=unit-50;
              		sum=sum+x*0.75f;
              		unit=unit-x;
            	}
      		sum=sum+unit*0.5f;
           	System.out.println("bill="+sum);
       		addcharge=sum*0.2f;
           	System.out.println("Additional charge="+addcharge);
       		fbill=sum+addcharge;
           	System.out.println("Final Bill="+fbill);  
   	}
}  
