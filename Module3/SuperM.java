package Module3;

class One {
    void display() {
        System.out.println("hello");
    }
}

public class SuperM extends One {
    void display() {
        super.display();
        System.out.println("Computer Science and Design");
    }

    public static void main(String[] args) {
        SuperM obj = new SuperM();
        obj.display();
    }
}