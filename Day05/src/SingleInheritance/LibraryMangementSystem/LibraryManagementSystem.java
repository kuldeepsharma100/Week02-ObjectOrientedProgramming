package SingleInheritance.LibraryMangementSystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Creating an object of Author (which includes Book details)
        Author bookWithAuthor = new Author(
                "Rich",
                2000,
                "robert",
                "Rich man."
        );

        // Display book and author details
        System.out.println("Book and Author Information:");
        bookWithAuthor.displayInfo();
    }
}
