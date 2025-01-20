public class Student {
    // Attributes of the Student class
     String name;
     int rollNumber;
     double marks;

    // Constructor to initialize the attributes
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    public String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 33) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student details and grade
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println();
    }



    public static void main(String[] args) {
        // Create student objects
        Student student1 = new Student("Alice", 101, 95.5);
        Student student2 = new Student("Bob", 102, 76.0);
        Student student3 = new Student("Charlie", 103, 42.0);

        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}
