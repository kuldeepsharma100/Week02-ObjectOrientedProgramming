public class VehicleRegistration {
    private String ownerName;
    private String vehicleTpye;
    private  final int registrationNumber;
    private static int registrationFee = 500;

   public VehicleRegistration(String ownerName, String vehicleTpye, int registrationNumber){
            this.ownerName = ownerName;
            this.vehicleTpye =vehicleTpye;
            this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(int fee){
      
        registrationFee = fee;
        
    }


    public void displayDetails(Object obj){
        if(obj instanceof VehicleRegistration){
            System.out.println("Owner name "+ownerName);
            System.out.println("Vehicle Type : "+ vehicleTpye);
            System.out.println("Registration Number : " + registrationNumber);
            System.out.println("Registration Fee "+registrationFee);
            System.out.println();

        }else{
            System.out.println("This is not the object the VehicleRegistration class ");
        }
    }


    public static void main(String[] args) {

        VehicleRegistration v1 = new VehicleRegistration("rohit", "SUV", 12344);
        v1.displayDetails(v1);

        updateRegistrationFee(700);
        System.out.println(" The update fee is " + registrationFee);
        v1.displayDetails(v1);
        
    }
    
}
