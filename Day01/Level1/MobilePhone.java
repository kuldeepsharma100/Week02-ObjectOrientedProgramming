public class MobilePhone {
    //Instance Variable
    String brand;
    String model;
    int price;

    public MobilePhone(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    
    // method to display the details
    public void displayDetails(){
        System.out.println("The brand of the Mobile phone is " + brand);
        System.out.println("The model of the phone is "+ model);
        System.out.println("The price of the mobile phone is "+ price);
        System.out.println();
    }
    public static void main(String[] args) {

        MobilePhone m1 = new MobilePhone("redmi", "v2", 20000);
        MobilePhone m2 = new MobilePhone("Apple", "iPhone 14", 119999);
        m1.displayDetails();
        m2.displayDetails();
        
    }
}
