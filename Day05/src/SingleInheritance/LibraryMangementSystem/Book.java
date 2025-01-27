package SingleInheritance.LibraryMangementSystem;

class Book {
    String title;
    int publicationYear;

    // Constructor for Book
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book information
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}
