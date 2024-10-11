package Module1;
import java.util.Scanner;

public class sqofnum {
    public static void main(String[] args) {
        int n, sum, i;
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        sum = 0;
        for (i = 1; i <= n; i++) {
            sum = sum + i * i;
        }
        System.out.println("sum=" + sum);
    }
}