import java.util.Scanner;

public class Item {
    //Instance Variables
    int itemCode;
    String itemName;
    int price;

    public Item(int itemCode, String itemName , int price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
   
    public int totalCost(int quantity){
        return quantity*price;
    }
      // method to display the detail
    public void displayDetails(){
        System.out.println("The item code is : " + itemCode);
        System.out.println("the item name is : "+ itemName);
  
    }
    public static void main(String[] args) {
    Item i1 = new Item(123, "sugar", 42);  
    Scanner sc = new Scanner(System.in) ;
    System.out.println("Enter the quantity");
    int quantity = sc.nextInt();
    i1.displayDetails();
    int cost = i1.totalCost(quantity);
    System.out.println("The totol cost is : " + cost);
    

    }
}
