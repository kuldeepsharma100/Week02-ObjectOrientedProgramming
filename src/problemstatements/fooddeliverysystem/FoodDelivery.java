package problemstatements.fooddeliverysystem;
import java.util.*;
public class FoodDelivery {
    public static void main(String[] args) {
        List<FoodItem> foodOrder = new ArrayList<>();

        // Adding food items
        VegItem vegItem = new VegItem("Paneer Butter Masala", 250, 2);
        NonVegItem nonVegItem = new NonVegItem("Chicken Biryani", 300, 1, 50);

        foodOrder.add(vegItem);
        foodOrder.add(nonVegItem);

        // Processing the order
        for (FoodItem item : foodOrder) {
            System.out.println(item.getItemDetails());

            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                discountable.applyDiscount(10); // Applying 10% discount
                System.out.println(discountable.getDiscountDetails());
            }

            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println();
        }
    }
}



