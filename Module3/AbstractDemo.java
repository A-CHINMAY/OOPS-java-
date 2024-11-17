package Module3;

// Abstract class
abstract class Animal {
    // Abstract method (no implementation)
    abstract void makeSound();

    // Regular method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass inheriting the abstract class
class Dog extends Animal {
    // Providing implementation for the abstract method
    void makeSound() {
        System.out.println("Bark! Bark!");
    }
}
// Main class
public class AbstractDemo {
    public static void main(String[] args) {
        // Creating an object of the subclass
        Animal myDog = new Dog();
        myDog.makeSound(); // Calls the overridden method
        myDog.sleep(); // Calls the regular method
    }
}
