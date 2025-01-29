package problemstatements.VehicleRentalSystem;
import java.util.*;
public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        // Adding vehicles
        Car car = new Car("cdgf344", "Sedan", 1000, "POLICYCAR123");
        Bike bike = new Bike("gvg355", "Sports", 500, 15);
        Truck truck = new Truck("3dvd35", "Heavy Duty", 3000, "POLICYTRUCK789");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        // Displaying rental and insurance details for each vehicle
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Type: " + vehicle.getType());
            System.out.println("Rental Cost for 5 days: " + vehicle.calculateRentalCost(5));

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println(insurable.getInsuranceDetails());
                System.out.println("Insurance Cost: " + insurable.calculateInsurance());
            }

            System.out.println();
        }
    }
}



