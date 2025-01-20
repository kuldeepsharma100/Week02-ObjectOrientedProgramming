public class HotelBooking {
    // Attributes
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard Room";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Getter and Setter for guestName
    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    // Getter and Setter for roomType
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    // Getter and Setter for nights
    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        if (nights > 0) { 
            this.nights = nights;
        } else {
            System.out.println("Nights must be greater than zero.");
        }
    }

    // Method to display booking details
    public void displayDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Using default constructor
        HotelBooking h1 = new HotelBooking();
        System.out.println("Default Booking:");
        h1.displayDetails();

        System.out.println();

        // Using parameterized constructor
        HotelBooking h2 = new HotelBooking("John Doe", "Deluxe Room", 3);
        System.out.println("Parameterized Booking:");
        h2.displayDetails();

        System.out.println();

        // Using copy constructor
        HotelBooking h3 = new HotelBooking(h2);
        System.out.println("Copied Booking:");
        h3.displayDetails();

        System.out.println();

        // Modifying copied booking
        h3.setGuestName("Jane Doe");
        h3.setRoomType("Suite");
        h3.setNights(5);

        // Display modified copied booking and original
        System.out.println("After Modifying Copied Booking:");
        System.out.println("Original Booking:");
        h2.displayDetails();
        System.out.println("Copied Booking:");
        h3.displayDetails();
    }
}
