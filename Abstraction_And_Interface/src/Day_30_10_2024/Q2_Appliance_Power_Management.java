package Day_30_10_2024;

import java.util.*;

abstract class Appliance
{
	void turnOn()
	{
		
	}
	abstract void getPowerConsumption();
}

class WashingMachine extends Appliance
{
	int watts;
	WashingMachine(int watts)
	{
		this.watts = watts;
	}
	public void turnOn()
	{
		System.out.println("Washing Machine is now running");
	}
	public void getPowerConsumption()
	{
		System.out.println("Power Consumption: " +watts);
	}
}

class Refrigerator extends Appliance
{
	int watts;
	Refrigerator(int watts)
	{
		this.watts = watts;
	}

	public void turnOn()
	{
		System.out.println("Refrigerator is now cooling");
	}
	public void getPowerConsumption()
	{
		System.out.println("Power Consumption: " + watts);
	}
}


public class Q2_Appliance_Power_Management 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Appliance[] arrA = new Appliance[2];
		
//		for(int i=0 ; i<arrA.length ; i++)
//		{
//			System.out.println("Enter the WashingMachine watts");
//			int wWatts = sc.nextInt();
//			sc.nextLine();
//			
//			System.out.println("Enter the Refrigerator watts");
//			int rWatts = sc.nextInt();
//			sc.nextLine();
//			
//			arrA[i]=new WashingMachine(wWatts);
//			arrA[i]=new Refrigerator(rWatts);
//		}
		
		System.out.println("Enter the Washing Machine watts:");
        int washingMachineWatts = sc.nextInt();
        arrA[0] = new WashingMachine(washingMachineWatts);

        System.out.println("Enter the Refrigerator watts:");
        int refrigeratorWatts = sc.nextInt();
        arrA[1] = new Refrigerator(refrigeratorWatts);
		
		for(Appliance a : arrA)
		{
			a.turnOn();
			a.getPowerConsumption();
		}
	}

}
