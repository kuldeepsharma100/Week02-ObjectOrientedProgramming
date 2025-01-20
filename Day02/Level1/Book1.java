class Book {
    // Attributes
    public String ISBN;           
    protected String title;      
    private String author;        

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to set the author's name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public method to get the author's name
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass EBook
class EBook extends Book {
    private String fileFormat; 

    // Constructor
    public EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author); // Call parent class constructor
        this.fileFormat = fileFormat;
    }

    // Method to display ebook details
    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN);          // Public member from parent class
        System.out.println("Title: " + title);       // Protected member from parent class
        System.out.println("File Format: " + fileFormat);
    }
}

// Main class for testing
public class Book1 {
    public static void main(String[] args) {
        // Create a Book object
        Book book = new Book("978-3-16-148410-0", "Java Programming", "Alice");
        System.out.println("Book Details:");
        book.displayBookDetails();

        // Modify and access the author name
        book.setAuthor("Bob");
        System.out.println("\nUpdated Author: " + book.getAuthor());

        // Create an EBook object
        EBook ebook = new EBook("978-1-23-456789-7", "Advanced Java", "Carol", "PDF");
        System.out.println("\nEBook Details:");
        ebook.displayEBookDetails();
    }
}
