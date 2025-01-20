public class Book {
    // Attributes
    private String title;
    private String author;
    private int price;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0;
    }

    // Parameterized constructor
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // Setter methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Using default constructor
        Book b1 = new Book();
        b1.displayDetails();

        System.out.println();

        // Using parameterized constructor
        Book b2 = new Book("God", "arnold", 100);
        b2.displayDetails();
    }
}
