package problemstatements.fooddeliverysystem;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Concrete method
    public String getItemDetails() {
        String res = "Item Name: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
        return res;
    }

    // Abstract method
    public abstract double calculateTotalPrice();
}

