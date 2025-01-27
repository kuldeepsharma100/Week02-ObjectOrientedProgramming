package hybridinheritance.restaurantmanagementsystem;

class Waiter extends Person implements Worker {
    String section;

    // Constructor for Waiter
    public Waiter(String name, int id, String section) {
        super(name, id);
        this.section = section;
    }


    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Waiter");
        System.out.println("Section: " + section);
    }


    public void performDuties() {
        System.out.println(name + " is serving customers in section " + section + ".");
    }
}

