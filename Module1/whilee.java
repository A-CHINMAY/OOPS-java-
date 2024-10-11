package Module1;
import java.util.Scanner;

public class whilee {
    public static void main(String[] args) {
        int n, i;
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}
