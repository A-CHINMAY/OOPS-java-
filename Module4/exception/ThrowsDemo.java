package Module4.exception;

public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            riskyMethod(-1); // Passing a negative number
        } catch (IllegalAccessException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    // Method that declares it may throw an exception
    public static void riskyMethod(int num) throws IllegalAccessException {
        if (num < 0) {
            throw new IllegalAccessException("Negative number not allowed");
        }
        System.out.println("Valid number: " + num);
    }
}
