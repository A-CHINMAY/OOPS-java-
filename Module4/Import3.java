package Module4;

//package mypack1; //save One.java in the package mypack1 
class One {
    public void display() {
        System.out.println("Hello Java  from mypack1");
    }
}
// package mypack2; //save Two.java in the package mypack2
public class Import3 {
    public static void main(String[] args) {
        mypack1.One obj = new mypack1.One(); // using name of the package followed by class name
        obj.display();
    }
}
