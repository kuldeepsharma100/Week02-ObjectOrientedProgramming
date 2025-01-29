package problemstatements.fooddeliverysystem;

class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge;
    private double discount;

    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        return ((getPrice() * getQuantity()) + additionalCharge) - discount;
    }

    @Override
    public void applyDiscount(double percentage) {
        discount = (getPrice() * getQuantity()) * (percentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        String res = "Discount applied: " + discount + ", Additional charge: " + additionalCharge;
        return res;
    }
}