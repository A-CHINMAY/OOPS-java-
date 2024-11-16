package Module3;

class One {
    int a = 10; 
}
public class SuperV extends One {
    int a = 20; // child class variable name a=20
    void display() { 
        System.out.println("child class variable a=" + a); 
        System.out.println("parent class variable a=" + super.a); 
    }
    public static void main(String[] args) {
        SuperV obj = new SuperV();
        obj.display();

    }
}