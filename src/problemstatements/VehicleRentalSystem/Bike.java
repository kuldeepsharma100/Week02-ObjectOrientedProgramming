package problemstatements.VehicleRentalSystem;

class Bike extends Vehicle {
    private double discountRate;

    public Bike(String vehicleNumber, String type, double rentalRate, double discountRate) {
        super(vehicleNumber, type, rentalRate);
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = getRentalRate() * days;
        return cost - (cost * discountRate / 100);
    }
}
