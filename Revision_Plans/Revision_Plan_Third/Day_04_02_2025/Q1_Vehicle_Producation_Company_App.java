package Day_04_02_2025;

/*
 * Q1. We want to design Application for VehicleProduction Company and company produces 
 * Two Wheeler as well as Four Wheeler and Company has two production houses like as 
 * BikeProductionHouse and CarProductionHouse so BikeProductionHouse produces the bike 
 * and CarProductionHouse produces the Car so when user  provide
Case1: then produce the Bike 
Case 2: then produce the Car

Note: when we override engine() method in Car then show message Hey I am Car and when engine()
 method override in Bike then show message I am Bike 

Note: Goal of Assignment is achieve loose coupling and abstraction so use the following 
class diagram and up casting concept 
 */
import java.util.Scanner;

abstract class Vehicle 
{
    public abstract void engine();
}

class Bike extends Vehicle 
{
    public void engine() 
    {
        System.out.println("I am Bike");
    }
}

class Car extends Vehicle 
{
    public void engine() 
    {
        System.out.println("I am Car");
    }
}

abstract class Production 
{
    abstract Vehicle getProduction();
}


class BikeProductionPlant extends Production 
{
    public Vehicle getProduction() 
    {
        return new Bike();
    }
}

class CarProductionPlant extends Production
{
    public Vehicle getProduction() 
    {
        return new Car();
    }
}

public class Q1_Vehicle_Producation_Company_App 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        do 
        {
            System.out.println("==============================");
            System.out.println("Menu");
            System.out.println("==============================");
            System.out.println("1: Produce the Bike");
            System.out.println("2: Produce the Car");
            System.out.println("3: Exit");
            System.out.println("-----------------------------");

            int choice = sc.nextInt();
            System.out.println("-----------------------------");

            switch (choice) 
            {
                case 1:
                    BikeProductionPlant bp = new BikeProductionPlant();
                    Vehicle bike = bp.getProduction();
                    bike.engine();
                    break;

                case 2:
                    CarProductionPlant cp = new CarProductionPlant();
                    Vehicle car = cp.getProduction();
                    car.engine();
                    break;

                case 3:
                    flag = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Enter a valid input.");
            }
        } while (flag);

        sc.close();
    }
}
