package problemstatements.ecommerceplatform;
import java.util.*;
public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        // Adding products
        Electronics electronics = new Electronics(1, "Laptop", 50000, 10);
        Clothing clothing = new Clothing(2, "T-Shirt", 1000, 20);
        Groceries groceries = new Groceries(3, "Apple", 200, 5);

        products.add(electronics);
        products.add(clothing);
        products.add(groceries);

        // Display final price for each product
        calculateAndDisplayFinalPrice(products);
    }

    public static void calculateAndDisplayFinalPrice(List<Product> products) {
        for (Product product : products) {
            double price = product.getPrice();
            double discount = product.calculateDiscount();
            double tax = 0;

            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax();
            }

            double finalPrice = price + tax - discount;

            System.out.println("Product: " + product.getName());
            System.out.println("Base Price: " + price);
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println();
        }
    }
}

