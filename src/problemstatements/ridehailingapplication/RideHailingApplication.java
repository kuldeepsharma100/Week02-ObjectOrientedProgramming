package problemstatements.ridehailingapplication;
import java.util.*;
public class RideHailingApplication {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        // Adding vehicles
        Car car = new Car("V001", "Kuldeep", 15);
        Bike bike = new Bike("V002", "Rahul", 8);
        Auto auto = new Auto("V003", "raj", 10);

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        // Processing rides
        double distance = 10.5; // Example distance

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));

            if (vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                gps.updateLocation("Downtown");
                System.out.println("Current Location: " + gps.getCurrentLocation());
            }

            System.out.println();
        }
    }
}
