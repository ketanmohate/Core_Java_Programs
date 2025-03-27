package Secound_Section;

import java.util.*;

class Airplane
{
	private String flightNumber;
	private String destination;
	private String departureTime;
	
	Airplane(String flightNumber, String destination, String departureTime)
	{
		this.flightNumber=flightNumber;
		this.destination=destination;
		this.departureTime=departureTime;
	}
	
	String getflightNumber()
	{
		return flightNumber;
	}
	
	String getdestination()
	{
		return destination;
	}
	
	String getdepartureTime()
	{
		return departureTime;
	}
	
	void checkFlightStatus(String LocalTimecurrentTime)
	{
		
	}
			
	void isDelayed(String LocalTimecurrentTime)
	{
		
	}
	
	void displayFlightInfo()
	{
		
	}
}

public class Q5_Travel_Reservations_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the how many flight Add");
		int nflight=sc.nextInt();
		sc.nextLine();
		System.out.println("----------------------------------------");
		
		Airplane[] airplane = new Airplane[nflight];
		
		for(int i=0; i<airplane.length;i++)
		{
			System.out.println("Enter the flight Number");
			String flightNumber=sc.nextLine();
			
			System.out.println("Enter the destination");
			String destination=sc.nextLine();
			
			System.out.println("Enter the departure Time");
			String departureTime=sc.nextLine();
			
			airplane[i] = new Airplane(flightNumber, destination, departureTime);
			
			System.out.println("----------------------------------------");
		}
		
	}

}
