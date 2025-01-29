package problemstatements.librarymanagementsystem;

class Book extends LibraryItem implements Reservable {
    private boolean isReserved;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 14; // Loan duration for books: 14 days
    }

    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Book reserved: " + getTitle());
        } else {
            System.out.println("Book is already reserved: " + getTitle());
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
