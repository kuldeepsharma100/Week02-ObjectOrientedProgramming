package hierarchicalinheritance.schoolsystem;

class Staff extends Person {
    String department;

    // Constructor for Staff
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }


    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}


