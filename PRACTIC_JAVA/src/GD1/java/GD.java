package GD1.java;
class Employees {
    // Private data members
	 int empId;
     String empName;
     double empSalary;

    // Public getter and setter methods for empId
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // Public getter and setter methods for empName
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    // Public getter and setter methods for empSalary
    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        if (empSalary > 0) { // Validation to ensure salary is positive
            this.empSalary = empSalary;
        } else {
            System.out.println("Invalid salary amount!");
        }
    }
}

public class GD {
    public static void main(String[] args) {
        // Create an instance of Employee
        Employees emp = new Employees();

        // Set employee details using direct set it is not possible becouse varibale is private
        emp.empId=101;
        emp.empName="ketan";
        emp.empSalary=50000;

        // Get employee details using direct access it is not possible
        System.out.println("Employee ID: " + emp.empId);
        System.out.println("Employee Name: " + emp.empName);
        System.out.println("Employee Salary: " + emp.empSalary);
    }
}
