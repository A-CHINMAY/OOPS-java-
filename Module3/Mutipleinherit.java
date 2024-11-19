package Module3;

interface A {
    void display();
}

interface B {
    void show();
}

public class Mutipleinherit implements A, B {
    public void display() {
        System.out.println("abstract method of interface  A  is implemented in child class");
    }

    public void show() {
            System.out.println("abstract method of interface  B  is implemented in child class");
        }

    public static void main(String[] args) {
        Mutipleinherit obj = new Mutipleinherit();
        obj.display();
        obj.show();
    }
}