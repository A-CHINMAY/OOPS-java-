package Module2;

class factorial {
    int fact(int n) {
        int result;
        if (n == 1)
            return 1;
        else
            result = n * fact(n - 1);
        return result;
    }
}

public class recursion {
    public static void main(String[] args) {
        factorial f = new factorial();
        System.out.println("Factorial of 5 is: " + f.fact(5));
        System.out.println("Factorial of 4 is: " + f.fact(4));
        System.out.println("Factorial of 3 is: " + f.fact(3));
    }
}