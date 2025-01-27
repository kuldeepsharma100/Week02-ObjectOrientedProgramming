package AssistedProblems.VehicleTransportSystem;

class Truck extends Vehicle {
    int loadCapacity;
    Truck(int maxSpeed, String fuelType, int loadCapacity){
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Load Capacity is : " + loadCapacity);
    }
}

