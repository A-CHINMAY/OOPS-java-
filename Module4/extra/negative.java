package Module4.extra;

// Custom exception class
class NegativeOddNumberException extends Exception {
    public NegativeOddNumberException(int number) {
        super("Negative odd number detected: " + number);
    }
}

public class Negative {
    // Method that can throw the exception
    public static void checkNumber(int number) throws NegativeOddNumberException {
        if (number < 0 && number % 2 != 0) {
            throw new NegativeOddNumberException(number);
        }
        System.out.println("Number is valid: " + number);
    }

    public static void main(String[] args) {
        int number = -3; // Test number

        try {
            checkNumber(number); // Call the method that can throw the exception
        } catch (NegativeOddNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}