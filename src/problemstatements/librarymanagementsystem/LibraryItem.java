package problemstatements.librarymanagementsystem;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Concrete method
    public String getItemDetails() {
        String res = "Item ID: " + itemId + ", Title: " + title + ", Author: " + author;
        return res;
    }

    // Abstract method
    public abstract int getLoanDuration();
}

