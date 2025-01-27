package hybridinheritance.restaurantmanagementsystem;

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        // Creating a Chef object
        Chef chef = new Chef("Gordon", 101, "Italian Cuisine");
        System.out.println("Chef Details:");
        chef.displayDetails();
        chef.performDuties();
        System.out.println();

        // Creating a Waiter object
        Waiter waiter = new Waiter("James", 102, "A1");
        System.out.println("Waiter Details:");
        waiter.displayDetails();
        waiter.performDuties();
    }
}



