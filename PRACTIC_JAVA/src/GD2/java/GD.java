package GD2.java;

class emp
{
	// declare variable in private 
	private int empId;
	private String empName;
	private float empSalary;
	
	// public getter setter
	public void setEmpId(int empId)
	{
		this.empId=empId;
	}
	
	public int getEmpId()
	{
		return empId;
	}
	
	public void setEmpName(String empName)
	{
		this.empName=empName;
	}
	
	public String getEmpName()
	{
		return empName;
	}
	
	public void setEmpSalary(float empSalary)
	{
		this.empSalary=empSalary;
	}
	
	public float getEmpSalary()
	{
		return empSalary;
	}
	
}
public class GD 
{
	public static void main(String[] args) 
	{
//		Create an instance of Employee
		emp objemp = new emp();
		
//		Set employee details using direct set it is not possible becouse varibale is private
		objemp.setEmpId(101);
		objemp.setEmpName("ketan");
		objemp.setEmpSalary(20000);
		
		// Get employee details using direct access it is not possible
//		System.out.println("Employe id:" + );
		
		
	}

}
