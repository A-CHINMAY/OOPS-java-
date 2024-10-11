package Module1;

class ForDemo {
    public static void main(String args[]) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int a = 1, b = 4; a < b; a++, b--) {
            System.out.println("a=" + a);
            System.out.println("b=" + b);
        }

    /* for (;;) {
            System.out.println(" hello ");
        } */

        int i = 1;
        for (;i <= 5;) {
            System.out.println("i=" + i);
            i++;
        }

    }
}