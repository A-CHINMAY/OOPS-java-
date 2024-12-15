package Module4.exception;

public class NestedTryDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block started.");
            int a = 42 / args.length; // May throw ArithmeticException
            System.out.println("Result: " + a);

            try {
                System.out.println("Inner try block started.");
                int[] arr = new int[1];
                arr[5] = 10; // Will throw ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught in inner catch: " + e);
            }

        } catch (ArithmeticException e) {
            System.out.println("Caught in outer catch: " + e);
        }

        System.out.println("After try/catch blocks.");
    }
}
