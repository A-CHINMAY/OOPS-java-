package Module3;

class One {
    void display() {
        System.out.println("computer science");
    }
}

public class Override extends One {
    void display() {
        System.out.println("computer science and design");
    }
    public static void main(String[] args) {
        Override obj = new Override();
        obj.display();
    }
}
