public class Student {
    private String name;
    private final int rollNumber;
    private String grade;

    private static String universityName = "ABC university";
    private static int totalStudent = 0;

    public Student(String name, int rollNumber, String grade){
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudent++;
    }



    public static void displayTotalStudents(){
        System.out.println("The total student is : "+ totalStudent);
    }

    public  void displayDetails(Object obj){
        if(obj instanceof Student){  
            System.out.println("The university name is : "+ universityName);
            System.out.println("Name of the student is : "+ name);
            System.out.println("Roll number of the student is : "+ rollNumber);
            System.out.println("Grade of the student is : "+ grade);

        }
    }
    public static void main(String[] args) {

        Student s1 = new Student("Rahul", 1234, "A");
        s1.displayDetails(s1);

        s1.displayTotalStudents();
        
    }
    
}
