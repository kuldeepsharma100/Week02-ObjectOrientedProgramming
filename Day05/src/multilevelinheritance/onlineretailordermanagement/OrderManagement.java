package multilevelinheritance.onlineretailordermanagement;

// Main class to demonstrate the functionality
public class OrderManagement {
    public static void main(String[] args) {
        // Creating an order
        Order order = new Order("ORD123", "2025-01-20");
        System.out.println("Order Details:");
        order.displayOrderDetails();
        System.out.println();

        // Creating a shipped order
        ShippedOrder shippedOrder = new ShippedOrder("ORD123", "2025-01-20", "TRK987654");
        System.out.println("Shipped Order Details:");
        shippedOrder.displayOrderDetails();
        System.out.println();

        // Creating a delivered order
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD123", "2025-01-20", "TRK987654", "2025-01-23");
        System.out.println("Delivered Order Details:");
        deliveredOrder.displayOrderDetails();
    }
}

