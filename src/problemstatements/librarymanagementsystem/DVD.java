package problemstatements.librarymanagementsystem;

class DVD extends LibraryItem implements Reservable {
    private boolean isReserved;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 5; // Loan duration for DVDs: 5 days
    }

    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("DVD reserved: " + getTitle());
        } else {
            System.out.println("DVD is already reserved: " + getTitle());
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

