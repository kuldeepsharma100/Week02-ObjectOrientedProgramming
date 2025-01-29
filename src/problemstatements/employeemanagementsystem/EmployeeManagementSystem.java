package problemstatements.employeemanagementsystem;
import java.util.*;
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Creating FullTimeEmployee and PartTimeEmployee objects
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1, "Alice", 797679, 87869);
        fullTimeEmployee.assignDepartment("IT");

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2, "Bob", 8798, 20, 100);
        partTimeEmployee.assignDepartment("HR");

        // Adding employees to the list
        employees.add(fullTimeEmployee);
        employees.add(partTimeEmployee);

        // Displaying details using polymorphism
        for (Employee employee : employees) {
            employee.displayDetails();
            if (employee instanceof Department) {
                System.out.println(((Department) employee).getDepartmentDetails());
            }
            System.out.println();
        }
    }
}

