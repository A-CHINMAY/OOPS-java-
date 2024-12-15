package Module4.exception;

public class ThrowDemo {
    public static void main(String[] args) {
        try {
            validateNumber(-5); // Passing a negative number
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    // Method to validate a number
    public static void validateNumber(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be non-negative"); // Throwing an exception
        }
        System.out.println("Valid number: " + num);
    }
}
