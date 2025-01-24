import java.util.ArrayList;

class Order {

    String orderName;
    ArrayList<Product> products;

    Order(String orderName) {
        this.orderName = orderName;
        this.products = new ArrayList<>();
    }

    public void addProducts(Product... product) {
        for (Product p : product) {
            products.add(p);
        }
    }

    public void displayOrderDetails() {
        System.out.print("Order Name: " + orderName + ", Products: [");
        for (int i = 0; i < products.size(); i++) {
            System.out.print(products.get(i).productName);
            if (i < products.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

class Customer1 {

    String customerName;
    ArrayList<Order> orders;

    Customer1(String customerName) {
        this.customerName = customerName;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Orders:");
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }
}

class Product {

    String productName;

    Product(String productName) {
        this.productName = productName;
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
    }
}

public class ECommerce {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop");
        Product product2 = new Product("Smartphone");
        Product product3 = new Product("Headphones");
        Product product4 = new Product("Monitor");

        // Create a customer
        Customer1 customer = new Customer1("John Doe");

        // Create orders
        Order order1 = new Order("Order1");
        order1.addProducts(product1, product3);

        Order order2 = new Order("Order2");
        order2.addProducts(product2, product4);

        // Customer places orders
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // Display customer details and orders
        customer.displayCustomerDetails();
    }
}
