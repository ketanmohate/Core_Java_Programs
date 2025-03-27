package Assignment_08_10_2024;

/*
Q3. Write a Java program to create an abstract class Animal with abstract methods eat() and sleep(). Create subclasses Lion, 
	      Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods differently based on their specific 
		  behavior.
*/

abstract class Animall
{
	abstract void eat();
	abstract void sleep();
}

class Lionn
{
	void eat()
	{
		System.out.println("primarily rely on meat for their sustenance.");
	}
	void sleep()
	{
		System.out.println("five (5) hr");
	}
}

class Tigerr
{

	void eat()
	{
		System.out.println("Tigers mainly rely on their sense of sight and hearing rather than on smell when hunting prey");
	}
	void sleep()
	{
		System.out.println("four (4) hr");
	}
}

public class Q3_Animal_App_2 
{
	public static void main(String args[])
	{
		Lionn L = new Lionn();
		
		L.eat();
		L.sleep();
		
		Tigerr T = new Tigerr();
		
		T.eat();
		T.sleep();
	}
}