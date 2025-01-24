import java.util.ArrayList;

class Book {
     String title;
     String author;

    Book(String title , String author){
        this.title = title;
        this.author = author;
    }

}

class Library {

    String libraryName;
    ArrayList<Book> books;

    Library(String libraryName){
        this.libraryName=libraryName;
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public void showBooks() {
        for(Book b:books){
            System.out.println("Title "+b.title+" & Author "+b.author);
        }
    }
}


public class LibraryandBook{
    public static void main(String [] args){
        // Books exists independently
        Book book1 = new Book("Maths","RD Sharma");
        Book book2 = new Book("Physics","HC Verma");
        Book book3 = new Book("Chemistry","Sam kean");

        Library library1 = new Library("TIT Library");
        Library library2 = new Library("Excellence Library");

        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book3);

        System.out.println("library1 has");
        library1.showBooks();
        System.out.println("library2 has");
        library2.showBooks();

    }
}