package com.java;
/* Q.4. A Ramu has instant noodals Shop, daily making 500 of noodles & serves to customers.
Instant noodles need 1 minute to Ready and Ramu has 2 stores to Cook noodles, 
Writer a java program to calculate how many Customers ramu serve noodles in 3 Hrs.*/
	
public class CustomersServeNoodles
{
	public static void main(String args[])
	{
		int noodlesPerDay = 500;
    		int cookingTimePerNoodle = 1; // in minutes
    		int numStores = 2;
    		int hours = 3;			
		
		int noodlesPerhour = noodlesPerDay / hours;
		int noodlesPerStorePerHour = noodlesPerhour / numStores;
		int customersPerStorePerHour = noodlesPerStorePerHour / cookingTimePerNoodle;
		int totalCustomersPerHour = customersPerStorePerHour * numStores;
		int totalCustomersInThreeHours = totalCustomersPerHour * hours;

		System.out.println("Ramu can serve " + totalCustomersInThreeHours + " customers in 3 hours.");
	}
}