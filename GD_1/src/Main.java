class Employee {
    // Private data members
    private int empId;
    private String empName;
    private double empSalary;

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

public class Main {
    public static void main(String[] args) {
        // Create an instance of Employee
        Employee emp = new Employee();

        // Set employee details using setter methods
        emp.setEmpId(101);
        emp.setEmpName("John Doe");
        emp.setEmpSalary(50000);

        // Get employee details using getter methods
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getEmpName());
        System.out.println("Employee Salary: " + emp.getEmpSalary());
    }
}
