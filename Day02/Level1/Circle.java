public class Circle {
    // Attribute
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); 
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius; 
    }


    // Method to calculate area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Display circle details
    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    // Main method for testing
    public static void main(String[] args) {
        // Using default constructor
        Circle c1 = new Circle();
        c1.displayDetails();

        System.out.println();

        // Using parameterized constructor
        Circle c2 = new Circle(5.0);
        c2.displayDetails();
    }
}
