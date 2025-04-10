package ObjectOutputStreamClass;

import java.io.*;
import java.util.*;

class Employee implements Serializable
{
	private int id;
	private String name;
	transient private double salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}

public class Q1_SerializeApp 
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		
		FileOutputStream fout = new FileOutputStream("C:\\Users\\ketan\\OneDrive\\Desktop\\Java_All_Programs\\File_Handling\\Written_Files\\serialize.txt",true);
		
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		
		
		Employee[] employee = new Employee[2];
		
		for (int i = 0; i < employee.length; i++) 
		{
		    Employee emp = new Employee(); 

		    System.out.println("Enter the id");
		    int id = sc.nextInt();
		    sc.nextLine();

		    System.out.println("Enter the name");
		    String name = sc.nextLine();

		    System.out.println("Enter the salary");
		    double salary = sc.nextDouble();
		    sc.nextLine();

		    emp.setId(id);
		    emp.setName(name);
		    emp.setSalary(salary);

		    employee[i] = emp;

		    oout.writeObject(emp);
		}

		oout.close();
		fout.close();
		System.out.println("Employee data save in file");

		
	}
}
