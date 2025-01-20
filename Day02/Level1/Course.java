public class Course {
    // Instance variables
    private String courseName;
    private int duration; // Duration in weeks
    private int fee;

    // Class variable (shared among all instances)
    private static String instituteName = "Default Institute";

    // Default constructor
    public Course() {
        this.courseName = "Unknown Course";
        this.duration = 0;
        this.fee = 0;
    }

    // Parameterized constructor
    public Course(String courseName, int duration, int fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: " + fee);
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create courses using constructors
        Course course1 = new Course("Java Programming", 12, 500898);
        Course course2 = new Course("Web Development", 10, 400879);

        // Display course details
        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();
        System.out.println();

        System.out.println("Course 2 Details:");
        course2.displayCourseDetails();
        System.out.println();

        // Update the institute name using the class method
        Course.updateInstituteName("Tech Academy");

        // Display course details again to see the updated institute name
        System.out.println("After Updating Institute Name:");
        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();
        System.out.println();

        System.out.println("Course 2 Details:");
        course2.displayCourseDetails();
    }
}
