package AssistedProblems.VehicleTransportSystem;

public class VehicleTransportMain{
    public static void main (String []args){

        // Creating objects for different vehicle types
        Vehicle car = new Car(200, "Petrol", 5);
        Vehicle truck = new Truck(120, "Diesel", 10);
        Vehicle motorcycle = new MotorCycle(180, "Petrol", "Sports");

        // Polymorphism: Array of Vehicle type
        Vehicle[] vehicles = { car, truck, motorcycle };

        // Calling displayInfo() on each vehicle
        System.out.println("Vehicle Information:");
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println("-------------------------");
        }

    }
}
