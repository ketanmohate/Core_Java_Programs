package com.java;

/*Chef is watching TV. The current volume of the TV is XX. Pressing the volume up button of the TV remote increases the volume by 1 while pressing the volume down button decreases the volume by 1. Chef wants to change the volume from XX to YY. Find the minimum number of button presses required to do so.*/

import java.util.*;
public class TvValumAPP
{
	public static void main(String args[])
	{
		int x ,y;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the current valume:");
		x = scan.nextInt();
		System.out.println("Enter the target valume:");
		y = scan.nextInt();
		if(x<y) //50 - 55
		{
			int result = y-x;
			System.out.println("valume increases by :" + result);
		}
		else
		{
			int reslut1 = x - y;
			System.out.println("valume decreases  by :" + reslut1);
		}
	}
}