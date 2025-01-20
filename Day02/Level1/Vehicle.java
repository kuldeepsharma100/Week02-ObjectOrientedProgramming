public class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable (shared among all instances)
    private static int registrationFee = 500; 

    // Default constructor
    public Vehicle() {
        this.ownerName = "Unknown Owner";
        this.vehicleType = "Unknown Vehicle Type";
    }

    // Parameterized constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class method to update the registration fee
    public static void updateRegistrationFee(int newFee) {
        if (newFee > 0) {
            registrationFee = newFee;
            System.out.println("Registration fee updated to: " + registrationFee);
        } else {
            System.out.println("Registration fee must be a positive value.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create vehicles using constructors
        Vehicle vehicle1 = new Vehicle("Alice", "Car");
        Vehicle vehicle2 = new Vehicle("Bob", "Motorcycle");

        // Display vehicle details
        System.out.println("Vehicle 1 Details:");
        vehicle1.displayVehicleDetails();
        System.out.println();

        System.out.println("Vehicle 2 Details:");
        vehicle2.displayVehicleDetails();
        System.out.println();

        // Update the registration fee using the class method
        Vehicle.updateRegistrationFee(600);
        System.out.println();

        // Display vehicle details again to see the updated registration fee
        System.out.println("After Updating Registration Fee:");
        System.out.println("Vehicle 1 Details:");
        vehicle1.displayVehicleDetails();
        System.out.println();

        System.out.println("Vehicle 2 Details:");
        vehicle2.displayVehicleDetails();
    }
}
