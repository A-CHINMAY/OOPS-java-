package Module5;

enum Value {
    A(10), B(20), C(30); // Enum constants
    private int a; // Instance variable
    // Constructor
    private Value(int value) {
        this.a = value;
    }
    // Getter method
    public int getValue() {
        return a;
    }
}
public class enumerations {
    public static void main(String args[]) {
        System.out.println("Value of A is = " + Value.A.getValue());
    }
}
