package AssistedProblems.AnimalHierarchy;

class Animal {
    String name;
    int age;



    // Constructor
    Animal() {
        this.name = "unknown";
        this.age = 1;
    }
    // Constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("animal sound");
    }

    // Display animal details
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

