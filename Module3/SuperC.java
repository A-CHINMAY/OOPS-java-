package Module3;

class One {
    One() {
        System.out.println("Class one is created ");
    }
}

public class SuperC extends One {
    SuperC() {
        super(); // access parent class constructor
        System.out.println("Class two is created");
    }

    public static void main(String[] args) {
        SuperC obj = new SuperC();
    }
}
