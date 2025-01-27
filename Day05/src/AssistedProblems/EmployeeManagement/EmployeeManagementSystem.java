package AssistedProblems.EmployeeManagement;

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        //  objects of each subclass
        Employee manager = new Manager("Kuldeep", 101, 75000, 10);
        Employee developer = new Developer("Om", 102, 60000, "Java");
        Employee intern = new Intern("Harsh", 103, 20000, "ABC University");

        System.out.println("Manager Details:");
        manager.displayDetails();

        System.out.println("Developer Details:");
        developer.displayDetails();

        System.out.println("Intern Details:");
        intern.displayDetails();
    }
}
