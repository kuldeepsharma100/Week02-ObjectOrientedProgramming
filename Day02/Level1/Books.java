public class Books {
    // Attributes
    private String title;
    private String author;
    private int price;
    private boolean isAvailable;

    // Default constructor
    public Books() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0;
        this.isAvailable = true; 
    }

    // Parameterized constructor
    public Books(String title, String author, int price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be positive.");
        }
    }

    // Getter and Setter for availability
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false; // Mark the book as borrowed
            System.out.println("You have successfully borrowed \"" + title + "\" by " + author + ".");
            return true;
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently unavailable.");
            return false;
        }
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create books using the parameterized constructor
        Books book1 = new Books("1984", "George Orwell", 123, true);
        Books book2 = new Books("To Kill a Mockingbird", "Harper Lee", 104, false);

        // Display book details
        System.out.println("Book 1 Details:");
        book1.displayDetails();
        System.out.println();

        System.out.println("Book 2 Details:");
        book2.displayDetails();
        System.out.println();

        // Borrow books
        System.out.println("Attempting to borrow Book 1:");
        book1.borrowBook();
        System.out.println();

        System.out.println("Attempting to borrow Book 2:");
        book2.borrowBook();
        System.out.println();

        // Display book details after borrowing
        System.out.println("Updated Book 1 Details:");
        book1.displayDetails();
        System.out.println();

        System.out.println("Updated Book 2 Details:");
        book2.displayDetails();
    }
}
