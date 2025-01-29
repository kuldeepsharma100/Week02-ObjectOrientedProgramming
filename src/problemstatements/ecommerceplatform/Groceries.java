package problemstatements.ecommerceplatform;

class Groceries extends Product {
    private static final double TAX_RATE = 0.05;
    private double discountRate;

    public Groceries(int productId, String name, double price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    // Override
    public double calculateDiscount() {
        return getPrice() * discountRate / 100;
    }
}
