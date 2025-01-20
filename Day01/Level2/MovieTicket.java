class MovieTicket {
    // Attributes of the MovieTicket class
     String movieName;
     String seatNumber;
     int price;
     boolean isBooked;

    // Constructor to initialize the ticket
    public MovieTicket(String movieName, String seatNumber, int price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false; // Ticket starts as unbooked
    }

    // Method to book the ticket
    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket successfully booked!");
        } else {
            System.out.println("Sorry, this ticket is already booked.");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("=== Ticket Details ===");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: Rs" + price);
        System.out.println("Booking Status: " + (isBooked ? "Booked" : "Available"));
    }

    public static void main(String[] args) {
        // Create tickets for a movie
        MovieTicket ticket1 = new MovieTicket("Salar", "A1", 230);
        MovieTicket ticket2 = new MovieTicket("badal", "A2", 239098);

        // Display ticket details before booking
        ticket1.displayTicketDetails();
        ticket2.displayTicketDetails();

        System.out.println();

        // Book a ticket
        ticket1.bookTicket();

        System.out.println();

        // Try booking the same ticket again
        ticket1.bookTicket();

        System.out.println();

        // Display ticket details after booking
        ticket1.displayTicketDetails();
        ticket2.displayTicketDetails();
    }
}
