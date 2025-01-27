package hierarchicalinheritance.schoolsystem;

class Student extends Person {
    String grade;

    // Constructor for Student
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

