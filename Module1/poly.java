package Module1;

class One {
    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    public void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String args[]) {
        One obj = new One();
        obj.sum(10, 20);
        obj.sum(10, 20, 30);
    }
}