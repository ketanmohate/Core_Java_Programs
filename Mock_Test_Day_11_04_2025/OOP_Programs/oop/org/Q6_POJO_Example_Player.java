package oop.org;

/*
 * Q6. WAP to create POJO class name as Player with id, 
 * name and run and input the data from keyboard and display it.
 */

import java.util.*;

class Player
{
	private int id;
	private String name;
	private int runs;
	
	Player()
	{
		
	}
	
	Player(int id, String name, int runs)
	{
		this.id = id;
		this.name = name;
		this.runs = runs;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setRuns(int runs)
	{
		this.runs = runs;
	}
	public int getRuns()
	{
		return runs;
	}
		
	public void Display()
	{	
		System.out.println("Id\t" + this.getId());
		System.out.println("Name\t" + this.getName());
		System.out.println("Runs\t" + this.getRuns());
	}
}

public class Q6_POJO_Example_Player {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the ID");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Name");
		String name = sc.nextLine();
		
		System.out.println("Enter the Runs");
		int runs = sc.nextInt();
		sc.nextLine();
		
		Player pl = new Player(id,name,runs);
		pl.Display();
	}

}
