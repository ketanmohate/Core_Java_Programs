package oop.org;

/*
 * Q11. WAP Voting application using method with variable argos concept
Voter: id name and age mark as POJO class 
VotingMachine: void acceptWord(Voter …v): accept the infinite voter if voter age is
 greater than 18 then display its data otherwise not
VotingMachineApp: this method cantais voter details and pass to VotingMachine class 
 */

import java.util.*;

class Voter
{
	private int id;
	private String name;
	private int age;
	
	Voter()
	{
		
	}
	
	Voter(int id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

class VotingMachine
{
	VotingMachine(Voter ...voter)
	{
		System.out.println("======================================================================");
		System.out.println("Id\t" + "Name\t" + "Age");
		System.out.println("----------------------------------------------------------------------");
		for (int i = 0; i < voter.length; i++) 
		{
			if(voter[i].getAge()>18)
			{
				System.out.println(voter[i].getId() + "\t" + voter[i].getName() + "\t" + voter[i].getAge());
			}
//			else {
//				System.out.println("eeee");
//			}
		}
		System.out.println("======================================================================");
	}
}

public class Q11_Voting_Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("how many voter Add");
		int nVoters = sc.nextInt();
		
		Voter[] voter = new Voter[nVoters] ;
		
		for (int i = 0; i < nVoters; i++) 
		{
			System.out.println("Enter the Id");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the Name");
			String name = sc.nextLine();
			
			System.out.println("Enter the Age");
			int age = sc.nextInt();
			sc.nextLine();
			
			voter[i] = new Voter(id,name,age);
			
		}

		VotingMachine votingMachine = new VotingMachine(voter);
	}

}
