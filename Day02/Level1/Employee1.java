class Employee {
    // Attributes
    public int employeeID;         
    protected String department;  
    private double salary;         

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount. Salary must be positive.");
        }
    }

    // Public method to get the current salary
    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass Manager
class Manager extends Employee {
    private int teamSize; 

    // Constructor
    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary); // Call the parent class constructor
        this.teamSize = teamSize;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);   
        System.out.println("Department: " + department);    
        System.out.println("Team Size: " + teamSize);
    }
}

// Main class for testing
public class Employee1 {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee(101, "HR", 50000);
        System.out.println("Employee Details:");
        employee.displayEmployeeDetails();

        // Modify and access the salary
        employee.setSalary(55000);
        System.out.println("\nUpdated Salary: " + employee.getSalary());

        // Create a Manager object
        Manager manager = new Manager(102, "IT", 75000, 10);
        System.out.println("\nManager Details:");
        manager.displayManagerDetails();
    }
}
