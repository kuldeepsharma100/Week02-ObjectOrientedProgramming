package AssistedProblems.VehicleTransportSystem;

 class MotorCycle extends Vehicle{
     String MotorCycleType;
     MotorCycle(int maxSpeed, String fuelType, String MotorCycleType){
         super(maxSpeed, fuelType);
         this.MotorCycleType = MotorCycleType;
     }

     public void displayInfo(){
        super.displayInfo();
         System.out.println("Motor Cycle type is : " + MotorCycleType);
     }
}
