package multilevelinheritance.educationalcoursehierarchy;

class Course {
    String courseName;
    int duration;

    // Constructor for Course
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}



