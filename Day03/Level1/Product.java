import java.util.function.ObjIntConsumer;

public class Product {
    // Instance variables
    private String productName;
    private double price;
    private int quantity;
    private static double discount = 0.0;

    public static void updateDiscount(Double discount){
        discount = discount;
    }

    // Class variable
    private static int totalProducts = 0;

    // Default constructor
    public Product() {
        this.productName = "Unknown Product";
        this.price = 0.0;
        this.quantity = 0;
        totalProducts++; // Increment total products count
    }

    // Parameterized constructor
    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        totalProducts++;
    }

    // Instance method to display product details
    public void displayProductDetails(Object obj) {
        if(obj instanceof Product){
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity : " + quantity);
        }else{
            System.out.println("This is not the object of the product class ");
        }

    }

    // Class method to display total products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create products using constructors
        Product product1 = new Product("Laptop", 899.99, 3);
        Product product2 = new Product("Smartphone", 599.99, 4);
        Product product3 = new Product();

        // Display product details
        System.out.println("Product 1 Details:");
        product1.displayProductDetails(product1);
        System.out.println();

        System.out.println("Product 2 Details:");
        product2.displayProductDetails(product2);
        System.out.println();

        System.out.println("Product 3 Details:");
        product3.displayProductDetails(product3);
        System.out.println();

        // Display total products
        Product.displayTotalProducts();
    }
}
