package Module3;

class Add {
    int sum(int a, int b) {
        return a + b;
    }
    int sum(int a) {
        return a + 10;
    }
}

public class Overload {
    public static void main(String args[]) {
        Add a = new Add();
        int res1 = a.sum(10, 20);
        System.out.println("Sum=" + res1);
        int res2 = a.sum(10);
        System.out.println("Sum=" + res2);
    }
}