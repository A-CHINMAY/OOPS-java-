package Module2;

class Test {
    // Final variable
    final int value = 10;
    // Final method
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