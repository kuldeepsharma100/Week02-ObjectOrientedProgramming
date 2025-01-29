package problemstatements.librarymanagementsystem;
import java.util.*;
public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> libraryItems = new ArrayList<>();

        // Adding items to the library
        Book book = new Book("ggg2", "The Great Gatsby", "F. Scott Fitzgerald");
        Magazine magazine = new Magazine("m1", "National", "Various");
        DVD dvd = new DVD("d1", "Inception", "Christopher Nolan");

        libraryItems.add(book);
        libraryItems.add(magazine);
        libraryItems.add(dvd);

        // Processing items
        for (LibraryItem item : libraryItems) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                reservable.reserveItem();
                System.out.println("Availability: " + (reservable.checkAvailability() ? "Available" : "Not Available"));
            }

            System.out.println();
        }
    }
}

