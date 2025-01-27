package AssistedProblems.AnimalHierarchy;

public class AnimalMain {
    public static void main(String[] args) {

        // Creating objects for each subclass
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        // Demonstrating polymorphism

        dog.makeSound();
        dog.displayInfo();

        cat.makeSound();
        bird.makeSound();
    }
}

