package hybridinheritance.restaurantmanagementsystem;

class Chef extends Person implements Worker {
    String specialty;

    // Constructor for Chef
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }


    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
    }


    public void performDuties() {
        System.out.println(name + " is preparing dishes specializing in " + specialty + ".");
    }
}