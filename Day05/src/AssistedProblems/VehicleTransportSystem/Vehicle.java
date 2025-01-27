package AssistedProblems.VehicleTransportSystem;

class Vehicle{
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo(){
        System.out.println("MaxSpeed is : " + maxSpeed);
        System.out.println("Fuel type " + fuelType);
    }

}

