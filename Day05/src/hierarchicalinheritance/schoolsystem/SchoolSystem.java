package hierarchicalinheritance.schoolsystem;

public class SchoolSystem {
    public static void main(String[] args) {
        // Creating a Teacher object
        Teacher teacher = new Teacher("Kuldeep", 30, "Mathematics");
        System.out.println("Teacher Details:");
        teacher.displayDetails();
        System.out.println();

        // Creating a Student object
        Student student = new Student("Aman", 16, "10th Grade");
        System.out.println("Student Details:");
        student.displayDetails();
        System.out.println();

        // Creating a Staff object
        Staff staff = new Staff("ram", 40, "Administration");
        System.out.println("Staff Details:");
        staff.displayDetails();
    }
}

