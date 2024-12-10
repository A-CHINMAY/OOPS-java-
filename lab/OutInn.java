package lab;

class Outer {
    public void display() {
        System.out.println("This is the outer class display method.");
    }

    void test() {
        Inner Inobj = new Inner();
        Inobj.display();
    }

    class Inner {
        public void display() {
            System.out.println("This is the inner class display method.");
        }
    }
}

public class OutInn {
    public static void main(String[] args) {
        Outer obj1 = new Outer();
        obj1.display();
        obj1.test();
    }
}
