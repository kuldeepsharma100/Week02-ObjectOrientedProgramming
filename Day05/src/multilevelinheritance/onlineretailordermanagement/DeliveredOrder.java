package multilevelinheritance.onlineretailordermanagement;

// Subclass DeliveredOrder
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    // Constructor for DeliveredOrder
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate + ".";
    }


    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}


