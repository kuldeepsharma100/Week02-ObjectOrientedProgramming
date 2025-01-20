public class CarRental {
    // Attributes
    private String customerName;
    private String carModel;
    private int rentalDays;
    private int dailyRate;

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Unknown Model";
        this.rentalDays = 0;
        this.dailyRate = 0;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays, int dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    // Copy constructor
    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
        this.dailyRate = other.dailyRate;
    }

    

    // Method to calculate total rental cost
    public int calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Method to display rental details
    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: $" + dailyRate);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    // Main method for testing
    public static void main(String[] args) {
        // Using default constructor
        CarRental defaultRental = new CarRental();
        System.out.println("Default Rental:");
        defaultRental.displayDetails();

        System.out.println();

        // Using parameterized constructor
        CarRental customRental = new CarRental("Alice Johnson", "Toyota Camry", 5, 50);
        System.out.println("Custom Rental:");
        customRental.displayDetails();

        System.out.println();

        // Using copy constructor
        CarRental copyRental = new CarRental(customRental);
        System.out.println("Copy of Custom Rental:");
        copyRental.displayDetails();

    }
}
