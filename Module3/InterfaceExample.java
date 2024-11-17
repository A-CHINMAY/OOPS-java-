package Module3;

interface MyInterface {
    // Default method
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Private method
    private void privateHelperMethod() {
        System.out.println("This is a private helper method.");
    }

    // Default method using private helper
    default void usePrivateMethod() {
        System.out.println("Default method calling a private method:");
        privateHelperMethod();
    }
}

class MyClass implements MyInterface {
    // Override the default method (optional)
    public void defaultMethod() {
        System.out.println("Overridden default method in the implementing class.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        MyInterface myObj = new MyClass();

        // Calling default method
        myObj.defaultMethod();

        // Calling static method (via interface name)
        MyInterface.staticMethod();

        // Calling a default method that uses a private method
        myObj.usePrivateMethod();
    }
}
