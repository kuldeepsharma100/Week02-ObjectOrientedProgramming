package hybridinheritance.restaurantmanagementsystem;

class Person {
    String name;
    int id;

    // Constructor for Person
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

