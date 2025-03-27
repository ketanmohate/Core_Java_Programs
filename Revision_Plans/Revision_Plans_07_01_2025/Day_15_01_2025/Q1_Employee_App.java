package Day_15_01_2025;

/*
 * Q1. WAP to create class name as Employee with field id,name and salary and create array of object of size 5 
 	and perform following operation on it.
Case 1: Add New Employee details 
Case 2: View all employee details
Case 3: Sort All employee records by using its id.
Case 4: Search employee by using name means you have to input the name of employee and search employee present in array or not
 */

import java.util.*;

class Employee
{
	private int id;
	private String name;
	private float salary;
	
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
	
	public void setSalary(float salary)
	{
		this.salary=salary;
	}
	public float getSalary()
	{
		return salary;
	}
	
}

public class Q1_Employee_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		boolean flag=true;
		
		Employee[] arrEmp = null;
		
		do
		{
			
			System.out.println("==========================================================================");
			System.out.println("Oprations");
			System.out.println("==========================================================================");
			
			System.out.println("Case 1: Add New Employee details");
			System.out.println("Case 2: View all employee details");
			System.out.println("Case 3: Sort All employee records by using its id.");
			System.out.println("Case 4: Search employee by using name");
			System.out.println("Case 5: Exit...");
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("Enter your Choise");
			System.out.println("-------------------------------------------------------------------------");
			int choise = sc.nextInt();
			
			switch(choise)
			{
				case 1:
					
					System.out.println("Enter how many Records Enter:");
					int nEmployee=sc.nextInt();
					System.out.println("-----------------------------------------------------------------");
					
					arrEmp = new Employee[nEmployee];
					
					System.out.println("-----------------------------------------------------------------");
					
					for(int i=0 ; i<arrEmp.length ; i++)
					{
						System.out.println("==============================================================");
						System.out.println("Enter the " + (i+1) + " Employee Details");
						System.out.println("==============================================================");
						
						System.out.println("Enter the ID");
						int id = sc.nextInt();
						sc.nextLine();
						
						System.out.println("Enter the name");
						String name = sc.nextLine();
						
						System.out.println("Enter the Salary");
						float salary = sc.nextFloat();
						sc.nextLine();
						
						Employee emp = new Employee();
						
						emp.setId(id);
						emp.setName(name);
						emp.setSalary(salary);
						
						arrEmp[i] = emp;
					}
					break;
					
				case 2:
					
					System.out.println("========================================================================");
					System.out.println("Diplay All Emplyee Details");
					System.out.println("========================================================================");
					
					for(int i=0 ; i<arrEmp.length ; i++)
					{
						System.out.println("Id:\t" + arrEmp[i].getId());
						System.out.println("Name:\t" + arrEmp[i].getName());
						System.out.println("Salary:\t" + arrEmp[i].getSalary());
						System.out.println("--------------------------------------------");
					}
					break;
					
				case 3:
					
					System.out.println("========================================================================");
					System.out.println("Sorted All employee records");
					System.out.println("========================================================================");
					
					for(int i=0 ; i<arrEmp.length ;i++)
					{
						for(int j=i+1 ; j<arrEmp.length ; j++)
						{
							if(arrEmp[i].getId() > arrEmp[j].getId())
							{
								Employee temp = arrEmp[i];
								arrEmp[i] = arrEmp[j];
								arrEmp[j] = temp;
							}
						}
					}
					for(int i=0 ; i<arrEmp.length ; i++)
					{
						System.out.println("Id:\t" + arrEmp[i].getId());
						System.out.println("Name:\t" + arrEmp[i].getName());
						System.out.println("Salary:\t" + arrEmp[i].getSalary());
						System.out.println("--------------------------------------------");
					}
					break;
					
				case 4:
					
					sc.nextLine();
					System.out.println("Enter the Employe Name:");
					String name = sc.nextLine();
					System.out.println("-------------------------------------------");
					
					for(int i=0 ; i<arrEmp.length ;i++)
					{
						if(name.equals(arrEmp[i].getName()))
						{
							System.out.println("Employee details");
							
							System.out.println("Id:\t" + arrEmp[i].getId());
							System.out.println("Name:\t" + arrEmp[i].getName());
							System.out.println("Salary:\t" + arrEmp[i].getSalary());
							System.out.println("--------------------------------------------");
						}
					}
					break;
					
				case 5:
					flag=false;
					break;
					
				default:
						System.out.println("Plz... Enter Valid Input");
			}
		}while(true);
	}

}
