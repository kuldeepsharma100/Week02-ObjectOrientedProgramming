class Employee {
    // Attributes
    public final int employeeID;        
    protected String department;  
    private double salary;  
    private static int totalEmployee = 0; 
    private static String companyName = "XYZ company";   
    private String name;
    private String designation  ;

    // Constructor
    public Employee(int employeeID, String department, double salary, String name, String designation) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
        this.name = name;
        this.designation = designation;
        totalEmployee++;
    }

    static void displayTotalEmployees(){
        System.out.println("The total Employee is " + totalEmployee);
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
    public void displayEmployeeDetails(Object obj) {
        if(obj instanceof Employee){
        System.out.println("Name is : "+ name);
        System.out.println("Designation " + designation);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
        }else{
            System.out.println("The object is not the instance of the class");
        }
    }
}

// Subclass Manager
class Manager extends Employee {
    private int teamSize;

    // Constructor
    public Manager(int employeeID, String department, double salary,  String name, String designation,int teamSize) {
        super(employeeID, department, salary, name, designation); // Call the parent class constructor
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
        Employee employee = new Employee(101, "HR", 50000, "Bob", "Assistant");
        System.out.println("Employee Details:");
        employee.displayEmployeeDetails(employee);

        employee.displayTotalEmployees();


    }
}



