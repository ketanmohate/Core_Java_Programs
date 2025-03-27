package Secound_Section;

import java.util.*;

class TrafficLight
{
	private String color ;
	private int duration ;
	
	TrafficLight(String color , int duration)
	{
		this.color=color;
		this.duration=duration;
	}
	
	String getColor()
	{
		return color;
	}
	int getDuration()
	{
		return duration;
	}
	
	public void changeColor(String newColor, int newDuration)
	{
		this.color=newColor;
		this.duration=newDuration;
	}
	
	public boolean isRed()
	{
		if(this.color.equals("red"))
		{
			return true;
		}
		return false;
	}
	
	public boolean isGreen()
	{
		if(this.color.equals("green"))
		{
			return true;
		}
		return false;
	}
	
	public void displayStatus() 
	{
		System.out.println("==============================================");
		 System.out.println("Traffic light is " + this.color + " for " + this.duration + " seconds.");
	}
}

public class Q4_Traffic_lights_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------------------------");
		System.out.println("Enter the Current Color");
		String currentColor = sc.nextLine();
		
		System.out.println("---------------------------");
		System.out.println("Enter the Duration (in seconds)for which the light will stay in the current color");
		int duration = sc.nextInt();
		sc.nextLine();
		
		TrafficLight objTraffic = new TrafficLight(currentColor , duration);
		
		objTraffic.displayStatus();
		
		if (objTraffic.isRed()) 
		{
            System.out.println("The light is currently red.");
        }

		System.out.println("===========================================================");
		
		System.out.println("----------------------------");
		System.out.println("Enter the new Color");
		String newColor = sc.nextLine();

		System.out.println("----------------------------");
		System.out.println("Enter the new Color Duration Time");
		int newDuration=sc.nextInt();
		sc.nextLine();
		
		objTraffic.changeColor(newColor, newDuration);
		
		objTraffic.displayStatus();
		
		if (objTraffic.isGreen()) 
		{
            System.out.println("The light is now green.");
        }
	}

}