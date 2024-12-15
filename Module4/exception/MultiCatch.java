package Module4.exception;

class MultiCatch {
    public static void main(String args[]) {
        try {
            int a = args.length;
            System.out.println("a = " + a);

            int b = 42 / a; // May throw ArithmeticException
            int[] c = new int[1];
            c[42] = 99; // May throw ArrayIndexOutOfBoundsException

            throw new IllegalAccessException(); // Explicitly throwing exception
        } catch (ArithmeticException e) {
            System.out.println("Divide by 0: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e);
        } catch (IllegalAccessException e) {
            System.out.println("IllegalAccessException: " + e);
        } finally {
            System.out.println("After try/catch blocks.");
        }
    }
}
