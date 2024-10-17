package Module2;

class Test {
    final int value = 10;
    final void display() {
        System.out.println("Final value: " + value);
    }
}

public class Final{
    public static void main(String[] args) {
        Test obj = new Test();
        obj.display();
    }
}