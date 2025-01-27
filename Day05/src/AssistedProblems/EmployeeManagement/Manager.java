package AssistedProblems.EmployeeManagement;

class Manager extends Employee {
    int teamSize;

    // Constructor
    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // Overriding displayDetails to include teamSize

    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
