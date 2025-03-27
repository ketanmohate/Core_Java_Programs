package Assignment_08_10_2024;

/*
 Q1. Write a Java program to create an abstract class Animal with an abstract method called sound(). 
	      Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make 
	      a specific sound for each animal.
 */

abstract class Animal
{
	abstract void sound();
}

class Lion extends Animal
{
	void sound()
	{
		System.out.println("grunt");
	}
}

class Tiger extends Animal
{
	void sound()
	{
		System.out.println("growl");
	}
}
public class Q1_Animal_App {

	public static void main(String[] args) 
	{
		Animal ani = new Lion();
		
		ani.sound();
		
		ani = new Tiger();
		
		ani.sound();
	}

}
