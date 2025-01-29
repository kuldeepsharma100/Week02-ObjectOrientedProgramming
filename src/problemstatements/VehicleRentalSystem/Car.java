package problemstatements.VehicleRentalSystem;

class Car extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.1;
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return calculateRentalCost(365) * INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        String res = "Insurance Policy: " + insurancePolicyNumber + " (Rate: " + INSURANCE_RATE * 100 + "%)";
        return res;
    }
}
