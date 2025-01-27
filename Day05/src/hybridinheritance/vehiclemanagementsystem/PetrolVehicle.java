package hybridinheritance.vehiclemanagementsystem;

class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelCapacity;

    // Constructor for PetrolVehicle
    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Vehicle Type: Petrol Vehicle");
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }


    public void refuel() {
        System.out.println(model + " is refueling with a capacity of " + fuelCapacity + " liters.");
    }
}

