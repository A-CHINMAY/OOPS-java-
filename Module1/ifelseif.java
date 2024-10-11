package Module1;

class ifelse {
    public static void main(String args[]) {
        int a = 13, b = 12, c = 11;
        if (a > b) {
            if (a > c) {
                System.out.println("a is big");
            }
        } else if (b > c) {
            System.out.println("b is big");
        } else {
            System.out.println("c is big");
        }
    }
}
