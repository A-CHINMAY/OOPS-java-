package Module1;
import java.util.Scanner;

public class switchi {

    public static void main(String[] args) {
        float a, b;
        String ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b values");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter choice");
        ch = sc.next();
        switch (ch) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println( a / b);
                break;
            case "%":
                System.out.println(a % b);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}