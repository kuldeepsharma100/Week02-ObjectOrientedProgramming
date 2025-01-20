
public class Book {
    //Instance Variables
    String title;
    String author;
    int price;
    
    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    // method to display the details
    public void displayDetails(){
        System.out.println("The tile of the book is : "+ title);
        System.out.println("The author of the book is : "+ author);
        System.out.println("The price of the book is : "+ price);
        System.out.println();
    }
    public static void main(String[] args) {
     
        Book b1 = new Book("rich", "robert", 220);
        Book b2 = new Book("eatthatfrog", "berlin", 880);
        b1.displayDetails();
        b2.displayDetails();
      
    }
    
}
