package multilevelinheritance.educationalcoursehierarchy;

public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        // Creating a base Course object
        Course course = new Course("Introduction to Programming", 6);
        System.out.println("Course Details:");
        course.displayCourseDetails();
        System.out.println();

        // Creating an OnlineCourse object
        OnlineCourse onlineCourse = new OnlineCourse("Java Fundamentals", 8, "Coursera", true);
        System.out.println("Online Course Details:");
        onlineCourse.displayCourseDetails();
        System.out.println();

        // Creating a PaidOnlineCourse object
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Advanced Java", 12, "Udemy", true, 199.99, 20);
        System.out.println("Paid Online Course Details:");
        paidOnlineCourse.displayCourseDetails();
    }
}
