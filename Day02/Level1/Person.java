public class Person {
    // Attributes
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) { // Ensure age is non-negative
            this.age = age;
        } else {
            System.out.println("Age must be non-negative.");
        }
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a person using parameterized constructor
        Person p1 = new Person("Alice", 25);
        System.out.println("Original Person:");
        p1.displayDetails();

        System.out.println();

        // Create a person using the copy constructor
        Person p2 = new Person(p1);
        System.out.println("Cloned Person:");
        p2.displayDetails();

        System.out.println();

        // Modify the cloned person's attributes
        p2.setName("Bob");
        p2.setAge(30);

        // Display both persons after modification
        System.out.println("After Modifying Cloned Person:");
        System.out.println("Original Person:");
        p1.displayDetails();
        System.out.println("Cloned Person:");
        p2.displayDetails();
    }
}
