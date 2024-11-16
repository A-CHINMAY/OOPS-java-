package Module3;

public class FinalV {
    final int MAX = 10;
    final int a = 20; // a is final so we can’t change later
    void display() {
        a = 10;
        System.out.println(a);
    }
    public static void main(String[] args) {
        FinalV obj = new FinalV();
        obj.display();
    }
}
