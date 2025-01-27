package hierarchicalinheritance.schoolsystem;

class Teacher extends Person {
    String subject;

    // Constructor for Teacher
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }


    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}
