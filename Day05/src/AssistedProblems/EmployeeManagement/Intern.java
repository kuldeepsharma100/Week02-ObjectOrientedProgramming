package AssistedProblems.EmployeeManagement;

class Intern extends Employee {
    String collegeName;

    // Constructor
    Intern(String name, int id, double salary, String collegeName) {
        super(name, id, salary);
        this.collegeName = collegeName;
    }

    // Overriding displayDetails to include schoolName
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("College Name: " + collegeName);
    }
}

