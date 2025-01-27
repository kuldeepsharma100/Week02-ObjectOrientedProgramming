package hybridinheritance.vehiclemanagementsystem;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Creating an ElectricVehicle object
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200, 75);
        System.out.println("Electric Vehicle Details:");
        ev.displayDetails();
        ev.charge();
        System.out.println();

        // Creating a PetrolVehicle object
        PetrolVehicle pv = new PetrolVehicle("Ford Mustang", 250, 60);
        System.out.println("Petrol Vehicle Details:");
        pv.displayDetails();
        pv.refuel();
    }
}

