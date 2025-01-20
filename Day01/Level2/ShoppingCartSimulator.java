import java.util.ArrayList;
import java.util.Scanner;

class CartItem {
    // Attributes of CartItem
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize a cart item
    public CartItem(String itemName, double price, int quantity) {
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

    // Method to calculate total cost of the item
    public double getTotalCost() {
        return price * quantity;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println(itemName + " | Price: $" + price + " | Quantity: " + quantity + " | Total: $" + getTotalCost());
    }
}

class ShoppingCart {
    // List to store items in the cart
    private ArrayList<CartItem> cart;

    // Constructor to initialize the shopping cart
    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        cart.add(new CartItem(itemName, price, quantity));
        System.out.println("Item added to the cart: " + itemName);
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        boolean itemRemoved = false;
        for (CartItem item : cart) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                cart.remove(item);
                System.out.println("Item removed from the cart: " + itemName);
                itemRemoved = true;
                break;
            }
        }
        if (!itemRemoved) {
            System.out.println("Item not found in the cart: " + itemName);
        }
    }

    // Method to display all items in the cart
    public void displayCartItems() {
        if (cart.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("\n=== Shopping Cart ===");
            for (CartItem item : cart) {
                item.displayItemDetails();
            }
        }
    }

    // Method to calculate and display the total cost
    public void displayTotalCost() {
        double totalCost = 0;
        for (CartItem item : cart) {
            totalCost += item.getTotalCost();
        }
        System.out.println("\nTotal Cost: $" + totalCost);
    }
}

public class ShoppingCartSimulator {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Shopping Cart Menu ===");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Cart Items");
            System.out.println("4. Display Total Cost");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    cart.addItem(itemName, price, quantity);
                    break;

                case 2:
                    System.out.print("Enter item name to remove: ");
                    sc.nextLine(); // Consume newline
                    String itemToRemove = sc.nextLine();
                    cart.removeItem(itemToRemove);
                    break;

                case 3:
                    cart.displayCartItems();
                    break;

                case 4:
                    cart.displayTotalCost();
                    break;

                case 5:
                    System.out.println("Exiting Shopping Cart. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
