package SingleInheritance.LibraryMangementSystem;

class Author extends Book {
    String name;
    String bio;

    // Constructor for Author
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Call to superclass constructor
        this.name = name;
        this.bio = bio;
    }

    // Overriding displayInfo() to include author details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Display book details
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}
