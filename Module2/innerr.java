package Module2;

public class innerr {
    int a = 10;
    class inner {
        void display() {
            System.out.println("value of a is " + a);
        }

        void test() {
            inner obj = new inner();
            obj.display();
        }
    }

    public static void main(String args[]) {
        innerr obj1 = new innerr();
        innerr.inner obj2 = obj1.new inner();
        obj2.test();
    }
}