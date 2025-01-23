public class Patient {
    private static String hospitalName = "Your hospital";
    private String name ;
    private int age ;
    private String ailment ;
    private final int patientID ;
    private static int totalPatient = 0;

    public Patient(String name , int age, String ailment, int patientID){
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatient++;
    }


    public void displayDetails(Object obj){
        if(obj instanceof Patient){
            System.out.println("Name : " + name);
            System.out.println("age : "+ age);
            System.out.println("ailment : "+ailment);
            System.out.println("Patient id " + patientID);
            System.out.println("The total number of patient is : "+ totalPatient);
            System.out.println();
        }else{
            System.out.println("This is not the object of the Patient Class ");
        }
    }



    public static void main(String[] args) {

        Patient p1 = new Patient("Harsh", 22, "Cold", 123);
        p1.displayDetails(p1);
        Patient p2 = new Patient("om", 21, "Cold", 124);

      
        p2.displayDetails(p2);


        
    }
    
}
