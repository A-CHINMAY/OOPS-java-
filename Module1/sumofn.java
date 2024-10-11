package Module1;

import java.util.Scanner;

public class sumofn {
    public static void main(String[] args) {
        int n, sum, i;
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        sum = 0;
        i = 1;
        do {
            sum = sum + i;
            i++;
        } while (i <= n);
        System.out.println("sum=" + sum);
    }
}
