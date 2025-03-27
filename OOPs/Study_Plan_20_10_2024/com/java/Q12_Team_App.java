package com.java;

/*
 12).WAP to create the class name as Player with a setter and getter method with a Player 
details. 
class Player 
{  private int id; 
private String name; 
private int runs; 
public void setId(int id) 
{ this.id=id; 
} 
public int getId() 
{ return id; 
} 
public void setName(String name) 
{ this.name=name; 
} 
public String getName() 
{ return name; 
} 
public void setRuns(int runs) 
{ this.runs=runs; 
} 
public int getRuns() 
{ return runs; 
} 
} 
Create the one more class name as Team and pass Player objects in Team class using a var-args 
concept and show the Player details in Team class. 
Then we need to create the class with a main method and write the code with a following logics 
 */

import java.util.*;

class Player
{
	private int id; 
	private String name; 
	private int runs; 
	
	public void setId(int id) 
	{ 
		this.id=id; 
	} 
	public int getId() 
	{ 
		return id; 
	} 
	
	public void setName(String name) 
	{ 
		this.name=name; 
	} 
	public String getName() 
	{ 
		return name; 
	} 
	
	public void setRuns(int runs) 
	{ 
		this.runs=runs; 
	} 
	public int getRuns() 
	{ 
		return runs; 
	} 
}

class Team
{	
	Scanner sc = new Scanner(System.in);
	
	void addPlayers(Player...arrPlayer)
	{
		for(int i=0;i<arrPlayer.length;i++)
		{
			System.out.println("Enter the Id");
			int id=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the Name");
			String name=sc.nextLine();
			
			System.out.println("Enter the Runs");
			int runs=sc.nextInt();
			System.out.println("---------------------------------------");
			
			Player objPlayer = new Player();
			
			objPlayer.setId(id);
			objPlayer.setName(name);
			objPlayer.setRuns(runs);
			
			arrPlayer[i] = objPlayer;
			
		}
		
		for(int i=0;i<arrPlayer.length;i++)
		{
			System.out.println("Id:\t\t"+arrPlayer[i].getId());
			System.out.println("Name:\t\t"+arrPlayer[i].getName());
			System.out.println("Runs:\t\t"+arrPlayer[i].getRuns());
			System.out.println("---------------------------------------");
		}
	}
}

public class Q12_Team_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		Player[] arrPlayer = null;
		
		System.out.println("Enter the No of Player Add");
		int nPlayer=sc.nextInt();
		
		arrPlayer = new Player[nPlayer];
		
		Team objTeam = new Team();
		objTeam.addPlayers(arrPlayer);
		
	}

}
