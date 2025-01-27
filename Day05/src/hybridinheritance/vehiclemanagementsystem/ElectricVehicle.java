package hybridinheritance.vehiclemanagementsystem;

class ElectricVehicle extends Vehicle {
    int batteryCapacity;

    // Constructor for ElectricVehicle
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Vehicle Type: Electric Vehicle");
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    // Method to charge the vehicle
    public void charge() {
        System.out.println(model + " is charging with a battery capacity of " + batteryCapacity + " kWh.");
    }
}
