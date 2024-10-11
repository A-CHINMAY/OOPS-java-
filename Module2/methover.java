package Module2;

public class methover {
    public void Addition(int a, int b) {
        System.out.println(a + b);
    }
    public void Addition(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    public static void main(String[] args) {
        methover obj = new methover();
        obj.Addition(10, 20);
        obj.Addition(10, 20, 30);
    }
}