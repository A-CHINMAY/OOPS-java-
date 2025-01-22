package Module4.exception;

public class ChainedExp {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {

            NullPointerException ex = new NullPointerException("NullPointerException");
            ex.initCause(e);
            throw ex;
        }
    }
}