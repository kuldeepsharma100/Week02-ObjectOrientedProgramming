package problemstatements.VehicleRentalSystem;

class Truck extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.2; // 20% of rental cost
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return calculateRentalCost(178) * INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        String res = "Insurance Policy: " + insurancePolicyNumber + " (Rate: " + INSURANCE_RATE * 100 + "%)";
        return res;
    }
}
